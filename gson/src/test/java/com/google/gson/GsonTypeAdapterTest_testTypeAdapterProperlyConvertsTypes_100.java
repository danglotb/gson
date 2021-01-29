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
package com.google.gson;
/**
 * Contains numerous tests involving registered type converters with a Gson instance.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class GsonTypeAdapterTest_testTypeAdapterProperlyConvertsTypes_100 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.GsonBuilder().registerTypeAdapter(java.util.concurrent.atomic.AtomicLong.class, new com.google.gson.GsonTypeAdapterTest_testTypeAdapterProperlyConvertsTypes_100.ExceptionTypeAdapter()).registerTypeAdapter(java.util.concurrent.atomic.AtomicInteger.class, new com.google.gson.GsonTypeAdapterTest_testTypeAdapterProperlyConvertsTypes_100.AtomicIntegerTypeAdapter()).create();
    }

    public void testTypeAdapterProperlyConvertsTypes_99() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_98() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_97() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_96() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_95() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_94() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_93() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_92() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_91() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_90() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_89() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_88() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_87() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_86() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_85() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_84() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_83() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_82() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_81() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_80() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_79() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_78() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_77() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_76() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_75() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_74() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_73() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_72() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_71() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_70() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_69() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_68() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_67() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_66() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_65() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_64() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_63() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_62() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_61() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_60() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_59() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_58() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_57() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_56() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_55() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_54() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_53() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_52() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_51() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_50() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_49() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_48() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_47() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_46() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_45() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_44() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_43() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_42() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_41() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_40() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_39() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_38() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_37() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_36() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_35() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_34() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_33() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_32() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_31() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_30() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_29() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_28() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_27() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_26() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_25() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_24() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_23() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_22() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_21() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_20() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_19() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_18() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_17() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_16() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_15() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_14() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_13() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_12() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_11() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_10() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_9() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_8() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_7() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_6() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_5() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_4() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_3() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_2() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_1() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_0() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    private static class ExceptionTypeAdapter implements com.google.gson.JsonSerializer<java.util.concurrent.atomic.AtomicLong> , com.google.gson.JsonDeserializer<java.util.concurrent.atomic.AtomicLong> {
        public com.google.gson.JsonElement serialize(java.util.concurrent.atomic.AtomicLong src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
            throw new java.lang.IllegalStateException();
        }

        public java.util.concurrent.atomic.AtomicLong deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
            throw new java.lang.IllegalStateException();
        }
    }

    private static class AtomicIntegerTypeAdapter implements com.google.gson.JsonSerializer<java.util.concurrent.atomic.AtomicInteger> , com.google.gson.JsonDeserializer<java.util.concurrent.atomic.AtomicInteger> {
        public com.google.gson.JsonElement serialize(java.util.concurrent.atomic.AtomicInteger src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
            return new com.google.gson.JsonPrimitive(src.incrementAndGet());
        }

        public java.util.concurrent.atomic.AtomicInteger deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
            int intValue = json.getAsInt();
            return new java.util.concurrent.atomic.AtomicInteger(--intValue);
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.GsonTypeAdapterTest_testTypeAdapterProperlyConvertsTypes_100.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.GsonTypeAdapterTest", "testTypeAdapterProperlyConvertsTypes");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}