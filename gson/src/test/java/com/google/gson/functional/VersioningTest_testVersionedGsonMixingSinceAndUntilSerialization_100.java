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
public class VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100 extends junit.framework.TestCase {
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

    public void testVersionedGsonMixingSinceAndUntilSerialization_99() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_98() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_97() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_96() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_95() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_94() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_93() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_92() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_91() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_90() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_89() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_88() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_87() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_86() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_85() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_84() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_83() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_82() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_81() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_80() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_79() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_78() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_77() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_76() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_75() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_74() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_73() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_72() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_71() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_70() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_69() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_68() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_67() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_66() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_65() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_64() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_63() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_62() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_61() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_60() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_59() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_58() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_57() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_56() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_55() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_54() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_53() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_52() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_51() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_50() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_49() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_48() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_47() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_46() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_45() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_44() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_43() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_42() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_41() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_40() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_39() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_38() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_37() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_36() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_35() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_34() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_33() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_32() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_31() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_30() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_29() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_28() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_27() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_26() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_25() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_24() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_23() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_22() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_21() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_20() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_19() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_18() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_17() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_16() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_15() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_14() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_13() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_12() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_11() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_10() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_9() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_8() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_7() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_6() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_5() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_4() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_3() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_2() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_1() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization_0() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    public void testVersionedGsonMixingSinceAndUntilSerialization() {
        com.google.gson.Gson gson = builder.setVersion(1.0).create();
        com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing target = new com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.SinceUntilMixing();
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.2).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
        gson = builder.setVersion(1.3).create();
        json = gson.toJson(target);
        junit.framework.Assert.assertFalse(json.contains("\"b\":" + com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B));
    }

    private static class Version1 {
        @com.google.gson.annotations.Until(1.3)
        int a = com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.A;

        @com.google.gson.annotations.Since(1.0)
        int b = com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B;
    }

    private static class Version1_1 extends com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.Version1 {
        @com.google.gson.annotations.Since(1.1)
        int c = com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.C;
    }

    @com.google.gson.annotations.Since(1.2)
    private static class Version1_2 extends com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.Version1_1 {
        int d = com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.D;
    }

    private static class SinceUntilMixing {
        int a = com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.A;

        @com.google.gson.annotations.Since(1.1)
        @com.google.gson.annotations.Until(1.3)
        int b = com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.B;
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.VersioningTest_testVersionedGsonMixingSinceAndUntilSerialization_100.class) {}) {
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