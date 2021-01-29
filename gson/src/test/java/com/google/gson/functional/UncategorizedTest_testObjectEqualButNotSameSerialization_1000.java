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
public class UncategorizedTest_testObjectEqualButNotSameSerialization_1000 extends junit.framework.TestCase {
    private com.google.gson.Gson gson = null;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.Gson();
    }

    public void testObjectEqualButNotSameSerialization_999() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_998() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_997() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_996() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_995() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_994() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_993() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_992() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_991() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_990() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_989() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_988() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_987() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_986() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_985() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_984() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_983() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_982() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_981() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_980() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_979() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_978() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_977() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_976() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_975() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_974() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_973() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_972() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_971() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_970() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_969() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_968() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_967() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_966() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_965() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_964() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_963() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_962() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_961() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_960() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_959() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_958() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_957() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_956() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_955() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_954() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_953() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_952() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_951() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_950() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_949() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_948() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_947() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_946() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_945() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_944() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_943() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_942() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_941() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_940() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_939() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_938() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_937() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_936() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_935() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_934() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_933() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_932() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_931() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_930() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_929() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_928() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_927() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_926() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_925() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_924() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_923() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_922() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_921() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_920() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_919() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_918() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_917() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_916() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_915() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_914() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_913() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_912() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_911() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_910() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_909() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_908() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_907() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_906() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_905() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_904() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_903() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_902() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_901() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_900() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_899() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_898() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_897() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_896() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_895() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_894() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_893() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_892() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_891() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_890() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_889() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_888() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_887() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_886() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_885() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_884() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_883() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_882() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_881() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_880() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_879() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_878() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_877() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_876() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_875() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_874() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_873() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_872() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_871() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_870() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_869() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_868() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_867() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_866() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_865() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_864() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_863() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_862() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_861() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_860() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_859() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_858() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_857() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_856() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_855() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_854() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_853() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_852() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_851() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_850() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_849() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_848() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_847() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_846() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_845() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_844() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_843() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_842() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_841() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_840() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_839() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_838() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_837() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_836() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_835() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_834() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_833() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_832() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_831() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_830() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_829() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_828() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_827() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_826() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_825() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_824() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_823() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_822() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_821() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_820() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_819() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_818() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_817() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_816() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_815() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_814() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_813() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_812() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_811() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_810() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_809() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_808() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_807() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_806() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_805() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_804() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_803() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_802() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_801() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_800() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_799() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_798() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_797() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_796() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_795() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_794() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_793() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_792() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_791() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_790() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_789() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_788() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_787() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_786() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_785() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_784() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_783() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_782() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_781() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_780() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_779() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_778() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_777() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_776() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_775() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_774() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_773() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_772() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_771() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_770() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_769() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_768() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_767() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_766() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_765() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_764() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_763() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_762() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_761() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_760() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_759() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_758() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_757() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_756() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_755() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_754() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_753() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_752() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_751() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_750() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_749() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_748() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_747() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_746() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_745() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_744() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_743() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_742() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_741() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_740() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_739() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_738() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_737() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_736() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_735() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_734() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_733() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_732() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_731() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_730() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_729() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_728() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_727() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_726() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_725() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_724() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_723() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_722() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_721() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_720() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_719() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_718() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_717() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_716() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_715() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_714() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_713() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_712() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_711() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_710() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_709() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_708() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_707() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_706() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_705() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_704() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_703() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_702() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_701() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_700() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_699() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_698() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_697() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_696() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_695() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_694() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_693() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_692() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_691() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_690() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_689() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_688() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_687() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_686() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_685() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_684() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_683() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_682() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_681() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_680() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_679() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_678() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_677() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_676() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_675() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_674() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_673() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_672() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_671() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_670() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_669() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_668() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_667() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_666() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_665() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_664() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_663() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_662() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_661() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_660() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_659() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_658() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_657() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_656() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_655() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_654() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_653() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_652() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_651() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_650() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_649() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_648() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_647() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_646() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_645() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_644() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_643() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_642() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_641() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_640() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_639() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_638() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_637() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_636() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_635() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_634() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_633() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_632() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_631() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_630() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_629() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_628() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_627() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_626() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_625() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_624() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_623() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_622() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_621() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_620() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_619() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_618() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_617() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_616() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_615() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_614() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_613() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_612() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_611() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_610() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_609() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_608() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_607() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_606() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_605() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_604() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_603() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_602() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_601() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_600() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_599() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_598() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_597() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_596() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_595() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_594() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_593() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_592() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_591() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_590() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_589() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_588() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_587() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_586() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_585() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_584() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_583() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_582() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_581() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_580() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_579() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_578() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_577() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_576() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_575() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_574() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_573() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_572() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_571() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_570() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_569() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_568() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_567() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_566() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_565() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_564() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_563() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_562() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_561() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_560() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_559() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_558() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_557() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_556() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_555() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_554() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_553() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_552() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_551() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_550() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_549() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_548() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_547() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_546() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_545() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_544() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_543() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_542() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_541() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_540() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_539() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_538() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_537() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_536() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_535() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_534() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_533() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_532() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_531() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_530() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_529() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_528() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_527() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_526() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_525() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_524() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_523() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_522() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_521() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_520() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_519() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_518() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_517() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_516() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_515() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_514() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_513() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_512() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_511() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_510() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_509() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_508() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_507() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_506() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_505() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_504() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_503() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_502() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_501() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_500() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_499() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_498() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_497() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_496() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_495() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_494() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_493() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_492() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_491() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_490() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_489() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_488() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_487() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_486() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_485() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_484() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_483() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_482() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_481() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_480() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_479() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_478() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_477() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_476() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_475() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_474() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_473() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_472() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_471() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_470() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_469() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_468() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_467() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_466() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_465() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_464() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_463() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_462() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_461() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_460() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_459() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_458() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_457() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_456() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_455() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_454() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_453() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_452() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_451() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_450() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_449() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_448() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_447() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_446() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_445() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_444() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_443() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_442() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_441() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_440() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_439() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_438() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_437() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_436() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_435() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_434() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_433() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_432() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_431() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_430() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_429() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_428() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_427() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_426() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_425() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_424() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_423() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_422() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_421() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_420() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_419() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_418() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_417() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_416() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_415() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_414() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_413() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_412() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_411() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_410() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_409() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_408() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_407() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_406() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_405() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_404() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_403() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_402() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_401() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_400() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_399() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_398() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_397() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_396() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_395() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_394() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_393() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_392() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_391() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_390() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_389() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_388() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_387() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_386() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_385() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_384() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_383() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_382() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_381() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_380() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_379() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_378() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_377() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_376() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_375() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_374() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_373() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_372() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_371() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_370() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_369() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_368() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_367() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_366() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_365() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_364() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_363() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_362() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_361() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_360() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_359() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_358() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_357() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_356() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_355() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_354() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_353() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_352() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_351() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_350() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_349() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_348() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_347() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_346() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_345() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_344() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_343() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_342() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_341() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_340() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_339() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_338() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_337() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_336() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_335() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_334() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_333() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_332() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_331() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_330() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_329() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_328() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_327() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_326() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_325() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_324() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_323() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_322() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_321() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_320() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_319() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_318() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_317() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_316() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_315() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_314() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_313() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_312() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_311() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_310() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_309() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_308() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_307() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_306() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_305() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_304() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_303() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_302() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_301() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_300() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_299() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_298() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_297() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_296() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_295() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_294() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_293() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_292() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_291() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_290() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_289() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_288() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_287() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_286() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_285() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_284() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_283() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_282() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_281() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_280() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_279() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_278() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_277() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_276() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_275() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_274() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_273() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_272() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_271() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_270() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_269() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_268() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_267() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_266() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_265() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_264() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_263() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_262() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_261() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_260() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_259() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_258() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_257() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_256() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_255() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_254() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_253() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_252() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_251() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_250() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_249() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_248() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_247() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_246() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_245() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_244() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_243() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_242() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_241() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_240() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_239() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_238() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_237() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_236() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_235() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_234() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_233() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_232() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_231() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_230() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_229() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_228() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_227() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_226() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_225() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_224() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_223() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_222() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_221() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_220() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_219() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_218() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_217() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_216() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_215() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_214() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_213() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_212() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_211() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_210() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_209() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_208() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_207() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_206() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_205() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_204() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_203() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_202() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_201() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_200() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_199() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_198() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_197() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_196() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_195() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_194() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_193() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_192() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_191() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_190() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_189() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_188() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_187() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_186() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_185() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_184() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_183() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_182() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_181() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_180() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_179() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_178() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_177() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_176() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_175() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_174() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_173() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_172() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_171() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_170() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_169() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_168() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_167() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_166() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_165() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_164() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_163() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_162() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_161() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_160() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_159() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_158() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_157() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_156() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_155() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_154() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_153() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_152() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_151() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_150() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_149() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_148() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_147() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_146() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_145() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_144() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_143() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_142() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_141() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_140() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_139() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_138() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_137() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_136() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_135() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_134() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_133() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_132() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_131() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_130() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_129() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_128() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_127() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_126() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_125() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_124() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_123() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_122() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_121() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_120() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_119() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_118() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_117() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_116() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_115() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_114() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_113() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_112() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_111() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_110() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_109() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_108() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_107() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_106() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_105() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_104() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_103() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_102() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_101() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_100() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
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
        com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_1000.OperationType opType;
    }

    private static class Derived1 extends com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_1000.Base {
        Derived1() {
            opType = com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_1000.OperationType.OP1;
        }
    }

    private static class Derived2 extends com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_1000.Base {
        Derived2() {
            opType = com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_1000.OperationType.OP2;
        }
    }

    private static class BaseTypeAdapter implements com.google.gson.JsonDeserializer<com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_1000.Base> {
        public com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_1000.Base deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
            java.lang.String opTypeStr = json.getAsJsonObject().get("opType").getAsString();
            com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_1000.OperationType opType = com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_1000.OperationType.valueOf(opTypeStr);
            switch (opType) {
                case OP1 :
                    return new com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_1000.Derived1();
                case OP2 :
                    return new com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_1000.Derived2();
            }
            throw new com.google.gson.JsonParseException("unknown type: " + json);
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_1000.class) {}) {
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