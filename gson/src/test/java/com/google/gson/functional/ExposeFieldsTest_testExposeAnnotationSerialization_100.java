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
public class ExposeFieldsTest_testExposeAnnotationSerialization_100 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.GsonBuilder().excludeFieldsWithoutExposeAnnotation().registerTypeAdapter(com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.SomeInterface.class, new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.SomeInterfaceInstanceCreator()).create();
    }

    public void testExposeAnnotationSerialization_99() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_98() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_97() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_96() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_95() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_94() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_93() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_92() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_91() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_90() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_89() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_88() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_87() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_86() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_85() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_84() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_83() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_82() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_81() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_80() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_79() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_78() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_77() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_76() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_75() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_74() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_73() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_72() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_71() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_70() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_69() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_68() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_67() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_66() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_65() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_64() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_63() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_62() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_61() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_60() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_59() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_58() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_57() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_56() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_55() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_54() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_53() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_52() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_51() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_50() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_49() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_48() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_47() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_46() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_45() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_44() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_43() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_42() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_41() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_40() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_39() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_38() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_37() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_36() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_35() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_34() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_33() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_32() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_31() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_30() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_29() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_28() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_27() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_26() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_25() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_24() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_23() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_22() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_21() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_20() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_19() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_18() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_17() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_16() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_15() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_14() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_13() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_12() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_11() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_10() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_9() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_8() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_7() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_6() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_5() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_4() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_3() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_2() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_0() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.ClassWithExposedFields(1, 2);
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
    private static class SomeObject implements com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.SomeInterface {}

    private static class SomeInterfaceInstanceCreator implements com.google.gson.InstanceCreator<com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.SomeInterface> {
        public com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.SomeInterface createInstance(java.lang.reflect.Type type) {
            return new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.SomeObject();
        }
    }

    private static class ClassWithInterfaceField {
        @com.google.gson.annotations.Expose
        private final com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.SomeInterface interfaceField;

        public ClassWithInterfaceField(com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.SomeInterface interfaceField) {
            this.interfaceField = interfaceField;
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_100.class) {}) {
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