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
 * Functional tests for versioning support in Gson.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10 extends junit.framework.TestCase {
    private static final int A = 0;

    private static final int B = 1;

    private static final int C = 2;

    private static final int D = 3;

    private com.google.gson.GsonBuilder builder;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        builder = new com.google.gson.GsonBuilder();
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_9() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_8() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_7() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_6() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_5() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_4() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_3() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_2() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_1() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_0() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B));
    }

    private static class Version1 {
        @com.google.gson.annotations.Until(1.3)
        int a = com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.A;

        @com.google.gson.annotations.Since(1.0)
        int b = com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B;
    }

    private static class Version1_1 extends com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.Version1 {
        @com.google.gson.annotations.Since(1.1)
        int c = com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.C;
    }

    @com.google.gson.annotations.Since(1.2)
    private static class Version1_2 extends com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.Version1_1 {
        int d = com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.D;
    }

    private static class SinceUntilMixing {
        int a = com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.A;

        @com.google.gson.annotations.Since(1.1)
        @com.google.gson.annotations.Until(1.3)
        int b = com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.B;
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_10.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.VersioningTest", "testVersionedGsonMixingSinceAndUntilSerialization");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}