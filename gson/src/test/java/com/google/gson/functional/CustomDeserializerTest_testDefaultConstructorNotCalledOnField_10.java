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
public class CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10 extends junit.framework.TestCase {
    private static final java.lang.String DEFAULT_VALUE = "test123";

    private static final java.lang.String SUFFIX = "blah";

    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolder.class, new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderDeserializer()).create();
    }

    public void testDefaultConstructorNotCalledOnField_9() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_8() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_7() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_6() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_5() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_4() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_3() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_2() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_1() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField_0() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.SUFFIX, actual.getWrappedData().getData());
    }

    public void testDefaultConstructorNotCalledOnField() throws java.lang.Exception {
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper dataWrapper = new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE));
        java.lang.String json = gson.toJson(dataWrapper);
        com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper actual = gson.fromJson(json, com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolderWrapper.class);
        junit.framework.Assert.assertEquals(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.SUFFIX, actual.getWrappedData().getData());
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
        private final com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolder wrappedData;

        // For use by Gson
        @java.lang.SuppressWarnings("unused")
        private DataHolderWrapper() {
            this(new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolder(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DEFAULT_VALUE));
        }

        public DataHolderWrapper(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolder data) {
            this.wrappedData = data;
        }

        public com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolder getWrappedData() {
            return wrappedData;
        }
    }

    private static class DataHolderDeserializer implements com.google.gson.JsonDeserializer<com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolder> {
        public com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolder deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
            com.google.gson.JsonObject jsonObj = json.getAsJsonObject();
            java.lang.String dataString = jsonObj.get("data").getAsString();
            return new com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.DataHolder(dataString + com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.SUFFIX);
        }
    }

    private static class MyBase {
        static final java.lang.String TYPE_ACCESS = "__type__";
    }

    private enum SubTypes {

        SUB_TYPE1(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.SubType1.class),
        SUB_TYPE2(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.SubType2.class);
        private final java.lang.reflect.Type subClass;

        private SubTypes(java.lang.reflect.Type subClass) {
            this.subClass = subClass;
        }

        public java.lang.reflect.Type getSubclass() {
            return subClass;
        }
    }

    private static class SubType1 extends com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.MyBase {
        java.lang.String field1;
    }

    private static class SubType2 extends com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.MyBase {
        @java.lang.SuppressWarnings("unused")
        java.lang.String field2;
    }

    private static class ClassWithBaseArray {
        com.google.gson.common.TestTypes.Base[] bases;
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.CustomDeserializerTest_testDefaultConstructorNotCalledOnField_10.class) {}) {
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