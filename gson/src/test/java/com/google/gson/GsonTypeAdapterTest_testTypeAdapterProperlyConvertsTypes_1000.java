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
public class GsonTypeAdapterTest_testTypeAdapterProperlyConvertsTypes_1000 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.GsonBuilder().registerTypeAdapter(java.util.concurrent.atomic.AtomicLong.class, new com.google.gson.GsonTypeAdapterTest_testTypeAdapterProperlyConvertsTypes_1000.ExceptionTypeAdapter()).registerTypeAdapter(java.util.concurrent.atomic.AtomicInteger.class, new com.google.gson.GsonTypeAdapterTest_testTypeAdapterProperlyConvertsTypes_1000.AtomicIntegerTypeAdapter()).create();
    }

    public void testTypeAdapterProperlyConvertsTypes_999() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_998() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_997() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_996() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_995() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_994() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_993() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_992() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_991() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_990() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_989() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_988() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_987() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_986() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_985() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_984() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_983() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_982() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_981() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_980() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_979() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_978() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_977() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_976() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_975() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_974() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_973() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_972() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_971() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_970() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_969() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_968() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_967() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_966() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_965() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_964() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_963() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_962() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_961() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_960() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_959() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_958() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_957() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_956() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_955() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_954() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_953() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_952() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_951() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_950() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_949() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_948() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_947() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_946() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_945() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_944() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_943() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_942() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_941() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_940() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_939() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_938() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_937() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_936() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_935() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_934() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_933() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_932() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_931() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_930() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_929() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_928() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_927() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_926() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_925() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_924() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_923() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_922() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_921() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_920() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_919() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_918() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_917() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_916() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_915() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_914() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_913() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_912() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_911() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_910() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_909() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_908() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_907() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_906() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_905() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_904() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_903() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_902() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_901() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_900() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_899() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_898() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_897() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_896() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_895() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_894() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_893() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_892() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_891() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_890() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_889() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_888() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_887() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_886() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_885() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_884() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_883() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_882() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_881() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_880() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_879() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_878() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_877() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_876() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_875() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_874() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_873() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_872() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_871() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_870() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_869() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_868() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_867() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_866() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_865() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_864() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_863() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_862() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_861() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_860() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_859() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_858() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_857() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_856() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_855() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_854() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_853() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_852() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_851() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_850() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_849() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_848() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_847() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_846() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_845() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_844() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_843() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_842() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_841() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_840() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_839() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_838() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_837() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_836() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_835() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_834() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_833() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_832() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_831() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_830() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_829() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_828() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_827() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_826() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_825() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_824() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_823() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_822() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_821() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_820() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_819() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_818() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_817() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_816() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_815() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_814() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_813() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_812() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_811() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_810() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_809() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_808() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_807() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_806() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_805() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_804() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_803() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_802() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_801() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_800() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_799() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_798() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_797() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_796() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_795() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_794() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_793() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_792() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_791() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_790() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_789() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_788() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_787() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_786() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_785() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_784() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_783() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_782() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_781() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_780() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_779() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_778() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_777() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_776() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_775() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_774() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_773() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_772() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_771() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_770() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_769() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_768() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_767() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_766() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_765() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_764() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_763() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_762() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_761() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_760() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_759() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_758() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_757() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_756() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_755() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_754() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_753() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_752() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_751() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_750() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_749() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_748() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_747() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_746() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_745() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_744() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_743() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_742() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_741() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_740() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_739() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_738() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_737() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_736() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_735() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_734() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_733() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_732() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_731() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_730() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_729() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_728() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_727() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_726() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_725() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_724() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_723() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_722() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_721() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_720() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_719() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_718() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_717() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_716() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_715() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_714() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_713() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_712() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_711() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_710() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_709() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_708() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_707() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_706() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_705() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_704() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_703() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_702() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_701() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_700() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_699() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_698() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_697() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_696() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_695() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_694() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_693() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_692() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_691() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_690() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_689() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_688() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_687() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_686() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_685() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_684() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_683() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_682() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_681() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_680() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_679() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_678() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_677() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_676() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_675() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_674() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_673() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_672() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_671() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_670() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_669() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_668() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_667() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_666() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_665() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_664() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_663() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_662() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_661() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_660() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_659() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_658() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_657() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_656() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_655() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_654() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_653() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_652() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_651() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_650() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_649() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_648() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_647() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_646() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_645() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_644() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_643() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_642() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_641() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_640() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_639() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_638() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_637() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_636() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_635() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_634() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_633() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_632() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_631() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_630() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_629() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_628() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_627() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_626() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_625() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_624() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_623() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_622() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_621() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_620() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_619() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_618() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_617() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_616() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_615() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_614() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_613() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_612() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_611() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_610() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_609() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_608() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_607() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_606() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_605() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_604() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_603() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_602() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_601() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_600() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_599() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_598() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_597() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_596() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_595() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_594() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_593() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_592() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_591() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_590() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_589() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_588() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_587() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_586() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_585() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_584() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_583() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_582() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_581() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_580() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_579() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_578() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_577() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_576() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_575() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_574() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_573() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_572() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_571() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_570() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_569() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_568() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_567() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_566() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_565() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_564() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_563() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_562() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_561() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_560() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_559() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_558() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_557() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_556() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_555() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_554() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_553() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_552() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_551() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_550() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_549() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_548() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_547() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_546() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_545() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_544() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_543() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_542() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_541() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_540() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_539() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_538() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_537() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_536() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_535() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_534() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_533() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_532() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_531() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_530() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_529() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_528() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_527() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_526() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_525() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_524() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_523() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_522() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_521() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_520() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_519() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_518() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_517() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_516() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_515() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_514() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_513() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_512() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_511() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_510() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_509() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_508() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_507() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_506() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_505() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_504() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_503() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_502() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_501() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_500() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_499() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_498() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_497() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_496() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_495() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_494() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_493() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_492() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_491() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_490() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_489() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_488() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_487() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_486() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_485() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_484() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_483() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_482() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_481() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_480() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_479() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_478() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_477() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_476() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_475() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_474() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_473() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_472() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_471() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_470() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_469() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_468() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_467() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_466() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_465() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_464() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_463() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_462() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_461() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_460() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_459() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_458() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_457() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_456() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_455() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_454() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_453() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_452() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_451() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_450() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_449() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_448() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_447() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_446() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_445() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_444() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_443() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_442() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_441() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_440() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_439() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_438() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_437() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_436() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_435() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_434() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_433() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_432() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_431() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_430() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_429() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_428() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_427() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_426() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_425() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_424() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_423() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_422() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_421() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_420() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_419() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_418() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_417() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_416() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_415() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_414() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_413() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_412() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_411() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_410() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_409() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_408() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_407() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_406() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_405() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_404() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_403() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_402() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_401() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_400() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_399() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_398() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_397() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_396() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_395() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_394() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_393() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_392() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_391() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_390() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_389() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_388() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_387() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_386() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_385() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_384() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_383() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_382() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_381() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_380() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_379() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_378() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_377() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_376() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_375() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_374() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_373() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_372() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_371() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_370() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_369() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_368() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_367() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_366() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_365() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_364() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_363() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_362() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_361() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_360() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_359() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_358() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_357() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_356() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_355() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_354() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_353() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_352() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_351() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_350() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_349() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_348() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_347() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_346() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_345() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_344() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_343() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_342() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_341() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_340() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_339() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_338() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_337() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_336() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_335() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_334() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_333() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_332() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_331() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_330() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_329() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_328() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_327() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_326() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_325() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_324() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_323() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_322() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_321() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_320() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_319() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_318() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_317() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_316() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_315() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_314() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_313() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_312() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_311() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_310() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_309() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_308() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_307() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_306() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_305() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_304() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_303() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_302() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_301() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_300() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_299() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_298() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_297() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_296() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_295() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_294() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_293() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_292() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_291() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_290() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_289() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_288() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_287() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_286() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_285() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_284() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_283() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_282() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_281() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_280() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_279() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_278() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_277() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_276() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_275() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_274() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_273() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_272() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_271() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_270() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_269() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_268() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_267() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_266() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_265() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_264() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_263() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_262() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_261() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_260() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_259() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_258() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_257() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_256() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_255() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_254() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_253() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_252() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_251() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_250() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_249() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_248() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_247() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_246() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_245() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_244() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_243() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_242() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_241() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_240() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_239() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_238() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_237() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_236() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_235() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_234() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_233() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_232() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_231() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_230() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_229() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_228() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_227() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_226() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_225() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_224() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_223() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_222() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_221() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_220() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_219() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_218() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_217() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_216() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_215() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_214() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_213() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_212() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_211() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_210() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_209() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_208() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_207() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_206() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_205() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_204() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_203() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_202() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_201() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_200() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_199() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_198() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_197() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_196() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_195() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_194() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_193() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_192() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_191() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_190() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_189() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_188() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_187() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_186() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_185() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_184() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_183() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_182() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_181() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_180() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_179() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_178() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_177() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_176() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_175() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_174() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_173() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_172() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_171() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_170() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_169() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_168() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_167() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_166() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_165() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_164() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_163() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_162() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_161() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_160() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_159() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_158() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_157() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_156() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_155() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_154() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_153() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_152() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_151() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_150() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_149() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_148() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_147() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_146() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_145() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_144() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_143() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_142() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_141() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_140() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_139() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_138() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_137() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_136() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_135() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_134() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_133() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_132() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_131() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_130() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_129() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_128() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_127() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_126() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_125() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_124() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_123() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_122() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_121() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_120() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_119() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_118() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_117() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_116() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_115() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_114() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_113() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_112() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_111() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_110() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_109() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_108() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_107() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_106() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_105() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_104() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_103() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_102() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_101() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_100() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.GsonTypeAdapterTest_testTypeAdapterProperlyConvertsTypes_1000.class) {}) {
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