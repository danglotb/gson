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
 * Functional Test exercising custom deserialization only.  When test applies to both
 * serialization and deserialization then add it to CustomTypeAdapterTest.
 *
 * @author Joel Leitch
 */
public class CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100 extends junit.framework.TestCase {
    private static final java.lang.String DEFAULT_VALUE = "test123";

    private static final java.lang.String SUFFIX = "blah";

    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder.class, new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderDeserializer()).create();
    }

    public void testDefaultConstructorNotCalledOnField_99() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_98() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_97() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_96() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_95() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_94() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_93() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_92() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_91() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_90() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_89() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_88() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_87() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_86() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_85() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_84() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_83() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_82() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_81() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_80() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_79() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_78() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_77() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_76() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_75() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_74() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_73() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_72() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_71() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_70() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_69() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_68() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_67() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_66() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_65() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_64() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_63() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_62() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_61() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_60() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_59() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_58() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_57() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_56() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_55() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_54() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_53() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_52() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_51() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_50() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_49() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_48() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_47() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_46() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_45() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_44() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_43() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_42() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_41() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_40() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_39() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_38() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_37() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_36() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_35() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_34() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_33() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_32() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_31() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_30() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_29() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_28() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_27() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_26() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_25() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_24() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_23() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_22() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_21() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_20() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_19() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_18() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_17() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_16() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_15() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_14() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_13() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_12() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_11() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_10() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_9() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_8() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_7() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_6() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_5() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_4() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_3() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_2() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_1() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_0() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX, actual.getWrappedData().getData());
    }

    private static class DataHolder {
        private final java.lang.String data;

        // For use by Gson
        @java.lang.SuppressWarnings("unused")
        private DataHolder() {
            throw new java.lang.IllegalStateException();
        }

        public DataHolder(java.lang.String data) {
            this.data = data;
        }

        public java.lang.String getData() {
            return data;
        }
    }

    private static class DataHolderWrapper {
        private final com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder wrappedData;

        // For use by Gson
        @java.lang.SuppressWarnings("unused")
        private DataHolderWrapper() {
            this(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DEFAULT_VALUE));
        }

        public DataHolderWrapper(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder data) {
            this.wrappedData = data;
        }

        public com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder getWrappedData() {
            return wrappedData;
        }
    }

    private static class DataHolderDeserializer implements com.google.gson.JsonDeserializer<com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder> {
        public com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
            com.google.gson.JsonObject jsonObj = json.getAsJsonObject();
            java.lang.String dataString = jsonObj.get("data").getAsString();
            return new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.DataHolder(dataString + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SUFFIX);
        }
    }

    private static class MyBase {
        static final java.lang.String TYPE_ACCESS = "__type__";
    }

    private enum SubTypes {

        SUB_TYPE1(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SubType1.class),
        SUB_TYPE2(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.SubType2.class);
        private final java.lang.reflect.Type subClass;

        private SubTypes(java.lang.reflect.Type subClass) {
            this.subClass = subClass;
        }

        public java.lang.reflect.Type getSubclass() {
            return subClass;
        }
    }

    private static class SubType1 extends com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.MyBase {
        java.lang.String field1;
    }

    private static class SubType2 extends com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.MyBase {
        @java.lang.SuppressWarnings("unused")
        java.lang.String field2;
    }

    private static class ClassWithBaseArray {
        com.google.gson.common.TestTypes.Base[] bases;
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_100.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.CustomDeserializerTest", "testDefaultConstructorNotCalledOnField");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}