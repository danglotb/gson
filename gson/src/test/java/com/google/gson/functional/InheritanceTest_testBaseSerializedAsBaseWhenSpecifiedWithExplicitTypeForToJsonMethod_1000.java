/* Copyright (C) 2009 Google Inc.

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
 * Functional tests for Json serialization and deserialization of classes with
 * inheritance hierarchies.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class InheritanceTest_testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_1000 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.Gson();
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_999() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_998() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_997() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_996() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_995() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_994() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_993() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_992() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_991() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_990() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_989() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_988() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_987() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_986() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_985() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_984() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_983() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_982() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_981() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_980() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_979() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_978() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_977() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_976() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_975() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_974() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_973() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_972() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_971() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_970() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_969() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_968() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_967() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_966() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_965() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_964() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_963() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_962() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_961() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_960() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_959() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_958() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_957() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_956() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_955() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_954() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_953() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_952() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_951() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_950() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_949() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_948() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_947() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_946() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_945() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_944() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_943() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_942() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_941() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_940() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_939() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_938() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_937() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_936() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_935() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_934() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_933() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_932() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_931() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_930() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_929() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_928() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_927() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_926() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_925() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_924() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_923() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_922() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_921() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_920() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_919() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_918() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_917() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_916() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_915() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_914() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_913() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_912() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_911() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_910() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_909() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_908() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_907() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_906() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_905() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_904() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_903() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_902() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_901() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_900() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_899() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_898() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_897() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_896() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_895() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_894() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_893() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_892() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_891() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_890() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_889() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_888() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_887() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_886() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_885() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_884() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_883() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_882() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_881() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_880() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_879() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_878() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_877() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_876() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_875() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_874() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_873() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_872() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_871() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_870() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_869() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_868() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_867() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_866() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_865() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_864() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_863() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_862() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_861() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_860() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_859() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_858() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_857() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_856() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_855() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_854() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_853() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_852() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_851() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_850() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_849() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_848() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_847() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_846() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_845() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_844() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_843() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_842() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_841() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_840() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_839() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_838() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_837() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_836() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_835() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_834() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_833() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_832() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_831() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_830() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_829() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_828() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_827() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_826() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_825() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_824() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_823() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_822() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_821() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_820() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_819() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_818() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_817() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_816() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_815() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_814() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_813() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_812() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_811() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_810() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_809() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_808() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_807() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_806() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_805() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_804() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_803() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_802() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_801() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_800() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_799() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_798() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_797() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_796() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_795() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_794() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_793() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_792() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_791() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_790() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_789() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_788() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_787() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_786() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_785() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_784() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_783() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_782() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_781() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_780() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_779() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_778() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_777() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_776() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_775() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_774() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_773() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_772() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_771() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_770() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_769() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_768() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_767() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_766() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_765() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_764() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_763() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_762() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_761() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_760() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_759() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_758() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_757() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_756() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_755() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_754() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_753() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_752() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_751() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_750() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_749() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_748() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_747() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_746() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_745() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_744() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_743() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_742() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_741() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_740() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_739() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_738() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_737() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_736() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_735() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_734() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_733() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_732() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_731() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_730() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_729() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_728() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_727() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_726() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_725() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_724() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_723() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_722() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_721() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_720() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_719() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_718() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_717() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_716() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_715() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_714() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_713() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_712() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_711() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_710() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_709() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_708() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_707() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_706() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_705() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_704() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_703() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_702() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_701() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_700() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_699() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_698() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_697() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_696() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_695() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_694() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_693() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_692() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_691() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_690() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_689() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_688() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_687() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_686() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_685() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_684() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_683() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_682() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_681() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_680() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_679() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_678() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_677() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_676() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_675() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_674() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_673() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_672() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_671() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_670() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_669() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_668() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_667() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_666() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_665() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_664() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_663() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_662() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_661() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_660() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_659() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_658() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_657() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_656() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_655() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_654() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_653() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_652() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_651() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_650() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_649() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_648() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_647() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_646() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_645() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_644() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_643() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_642() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_641() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_640() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_639() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_638() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_637() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_636() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_635() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_634() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_633() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_632() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_631() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_630() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_629() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_628() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_627() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_626() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_625() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_624() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_623() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_622() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_621() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_620() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_619() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_618() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_617() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_616() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_615() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_614() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_613() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_612() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_611() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_610() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_609() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_608() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_607() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_606() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_605() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_604() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_603() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_602() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_601() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_600() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_599() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_598() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_597() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_596() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_595() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_594() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_593() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_592() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_591() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_590() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_589() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_588() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_587() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_586() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_585() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_584() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_583() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_582() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_581() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_580() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_579() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_578() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_577() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_576() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_575() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_574() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_573() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_572() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_571() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_570() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_569() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_568() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_567() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_566() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_565() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_564() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_563() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_562() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_561() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_560() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_559() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_558() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_557() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_556() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_555() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_554() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_553() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_552() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_551() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_550() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_549() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_548() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_547() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_546() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_545() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_544() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_543() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_542() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_541() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_540() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_539() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_538() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_537() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_536() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_535() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_534() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_533() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_532() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_531() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_530() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_529() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_528() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_527() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_526() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_525() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_524() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_523() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_522() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_521() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_520() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_519() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_518() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_517() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_516() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_515() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_514() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_513() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_512() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_511() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_510() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_509() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_508() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_507() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_506() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_505() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_504() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_503() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_502() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_501() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_500() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_499() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_498() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_497() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_496() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_495() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_494() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_493() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_492() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_491() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_490() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_489() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_488() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_487() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_486() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_485() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_484() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_483() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_482() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_481() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_480() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_479() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_478() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_477() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_476() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_475() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_474() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_473() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_472() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_471() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_470() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_469() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_468() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_467() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_466() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_465() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_464() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_463() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_462() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_461() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_460() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_459() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_458() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_457() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_456() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_455() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_454() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_453() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_452() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_451() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_450() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_449() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_448() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_447() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_446() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_445() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_444() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_443() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_442() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_441() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_440() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_439() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_438() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_437() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_436() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_435() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_434() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_433() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_432() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_431() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_430() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_429() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_428() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_427() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_426() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_425() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_424() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_423() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_422() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_421() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_420() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_419() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_418() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_417() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_416() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_415() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_414() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_413() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_412() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_411() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_410() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_409() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_408() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_407() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_406() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_405() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_404() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_403() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_402() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_401() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_400() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_399() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_398() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_397() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_396() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_395() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_394() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_393() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_392() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_391() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_390() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_389() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_388() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_387() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_386() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_385() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_384() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_383() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_382() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_381() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_380() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_379() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_378() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_377() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_376() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_375() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_374() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_373() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_372() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_371() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_370() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_369() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_368() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_367() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_366() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_365() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_364() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_363() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_362() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_361() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_360() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_359() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_358() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_357() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_356() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_355() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_354() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_353() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_352() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_351() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_350() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_349() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_348() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_347() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_346() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_345() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_344() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_343() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_342() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_341() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_340() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_339() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_338() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_337() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_336() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_335() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_334() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_333() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_332() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_331() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_330() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_329() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_328() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_327() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_326() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_325() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_324() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_323() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_322() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_321() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_320() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_319() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_318() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_317() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_316() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_315() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_314() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_313() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_312() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_311() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_310() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_309() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_308() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_307() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_306() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_305() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_304() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_303() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_302() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_301() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_300() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_299() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_298() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_297() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_296() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_295() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_294() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_293() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_292() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_291() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_290() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_289() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_288() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_287() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_286() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_285() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_284() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_283() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_282() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_281() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_280() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_279() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_278() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_277() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_276() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_275() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_274() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_273() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_272() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_271() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_270() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_269() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_268() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_267() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_266() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_265() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_264() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_263() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_262() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_261() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_260() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_259() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_258() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_257() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_256() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_255() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_254() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_253() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_252() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_251() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_250() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_249() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_248() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_247() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_246() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_245() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_244() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_243() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_242() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_241() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_240() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_239() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_238() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_237() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_236() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_235() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_234() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_233() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_232() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_231() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_230() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_229() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_228() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_227() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_226() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_225() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_224() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_223() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_222() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_221() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_220() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_219() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_218() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_217() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_216() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_215() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_214() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_213() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_212() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_211() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_210() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_209() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_208() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_207() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_206() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_205() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_204() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_203() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_202() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_201() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_200() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_199() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_198() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_197() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_196() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_195() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_194() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_193() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_192() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_191() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_190() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_189() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_188() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_187() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_186() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_185() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_184() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_183() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_182() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_181() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_180() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_179() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_178() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_177() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_176() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_175() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_174() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_173() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_172() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_171() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_170() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_169() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_168() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_167() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_166() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_165() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_164() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_163() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_162() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_161() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_160() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_159() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_158() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_157() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_156() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_155() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_154() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_153() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_152() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_151() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_150() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_149() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_148() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_147() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_146() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_145() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_144() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_143() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_142() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_141() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_140() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_139() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_138() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_137() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_136() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_135() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_134() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_133() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_132() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_131() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_130() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_129() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_128() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_127() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_126() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_125() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_124() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_123() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_122() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_121() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_120() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_119() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_118() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_117() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_116() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_115() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_114() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_113() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_112() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_111() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_110() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_109() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_108() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_107() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_106() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_105() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_104() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_103() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_102() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_101() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_100() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_99() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_98() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_97() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_96() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_95() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_94() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_93() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_92() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_91() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_90() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_89() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_88() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_87() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_86() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_85() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_84() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_83() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_82() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_81() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_80() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_79() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_78() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_77() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_76() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_75() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_74() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_73() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_72() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_71() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_70() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_69() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_68() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_67() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_66() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_65() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_64() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_63() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_62() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_61() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_60() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_59() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_58() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_57() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_56() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_55() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_54() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_53() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_52() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_51() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_50() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_49() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_48() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_47() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_46() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_45() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_44() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_43() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_42() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_41() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_40() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_39() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_38() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_37() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_36() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_35() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_34() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_33() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_32() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_31() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_30() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_29() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_28() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_27() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_26() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_25() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_24() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_23() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_22() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_21() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_20() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_19() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_18() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_17() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_16() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_15() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_14() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_13() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_12() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_11() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_10() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_9() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_8() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_7() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_6() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_5() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_4() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_3() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_2() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_1() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_0() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod() {
        com.google.gson.common.TestTypes.Base base = new com.google.gson.common.TestTypes.Sub();
        java.lang.String json = gson.toJson(base, com.google.gson.common.TestTypes.Base.class);
        junit.framework.Assert.assertTrue(json.contains(com.google.gson.common.TestTypes.Base.BASE_NAME));
        junit.framework.Assert.assertFalse(json.contains(com.google.gson.common.TestTypes.Sub.SUB_FIELD_KEY));
    }

    private static class SubTypeOfNested extends com.google.gson.common.TestTypes.Nested {
        private final long value = 5;

        public SubTypeOfNested(com.google.gson.common.TestTypes.BagOfPrimitives primitive1, com.google.gson.common.TestTypes.BagOfPrimitives primitive2) {
            super(primitive1, primitive2);
        }

        @java.lang.Override
        public void appendFields(java.lang.StringBuilder sb) {
            sb.append("\"value\":").append(value).append(",");
            super.appendFields(sb);
        }
    }

    private static class ClassWithSubInterfacesOfCollection {
        private java.util.List<java.lang.Integer> list;

        private java.util.Queue<java.lang.Long> queue;

        private java.util.Set<java.lang.Float> set;

        private java.util.SortedSet<java.lang.Character> sortedSet;

        public ClassWithSubInterfacesOfCollection(java.util.List<java.lang.Integer> list, java.util.Queue<java.lang.Long> queue, java.util.Set<java.lang.Float> set, java.util.SortedSet<java.lang.Character> sortedSet) {
            this.list = list;
            this.queue = queue;
            this.set = set;
            this.sortedSet = sortedSet;
        }

        boolean listContains(int... values) {
            for (int value : values) {
                if (!list.contains(value)) {
                    return false;
                }
            }
            return true;
        }

        boolean queueContains(long... values) {
            for (long value : values) {
                if (!queue.contains(value)) {
                    return false;
                }
            }
            return true;
        }

        boolean setContains(float... values) {
            for (float value : values) {
                if (!set.contains(value)) {
                    return false;
                }
            }
            return true;
        }

        boolean sortedSetContains(char... values) {
            for (char value : values) {
                if (!sortedSet.contains(value)) {
                    return false;
                }
            }
            return true;
        }

        public java.lang.String getExpectedJson() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("{");
            sb.append("\"list\":");
            append(sb, list).append(",");
            sb.append("\"queue\":");
            append(sb, queue).append(",");
            sb.append("\"set\":");
            append(sb, set).append(",");
            sb.append("\"sortedSet\":");
            append(sb, sortedSet);
            sb.append("}");
            return sb.toString();
        }

        private java.lang.StringBuilder append(java.lang.StringBuilder sb, java.util.Collection<?> c) {
            sb.append("[");
            boolean first = true;
            for (java.lang.Object o : c) {
                if (!first) {
                    sb.append(",");
                } else {
                    first = false;
                }
                if ((o instanceof java.lang.String) || (o instanceof java.lang.Character)) {
                    sb.append('\"');
                }
                sb.append(o.toString());
                if ((o instanceof java.lang.String) || (o instanceof java.lang.Character)) {
                    sb.append('\"');
                }
            }
            sb.append("]");
            return sb;
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.InheritanceTest_testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_1000.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.InheritanceTest", "testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}