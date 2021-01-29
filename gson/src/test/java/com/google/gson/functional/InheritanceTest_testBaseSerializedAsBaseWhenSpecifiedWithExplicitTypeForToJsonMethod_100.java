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
public class InheritanceTest_testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_100 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.Gson();
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.InheritanceTest_testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod_100.class) {}) {
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