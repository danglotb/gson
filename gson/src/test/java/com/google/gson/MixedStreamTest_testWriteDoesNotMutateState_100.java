/* Copyright (C) 2010 Google Inc.

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
public final class MixedStreamTest_testWriteDoesNotMutateState_100 extends junit.framework.TestCase {
    private static final com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car BLUE_MUSTANG = new com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car("mustang", 0xff);

    private static final com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car BLACK_BMW = new com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car("bmw", 0x0);

    private static final com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car RED_MIATA = new com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car("miata", 0xff0000);

    private static final java.lang.String CARS_JSON = "[\n" + (((((((((((("  {\n" + "    \"name\": \"mustang\",\n") + "    \"color\": 255\n") + "  },\n") + "  {\n") + "    \"name\": \"bmw\",\n") + "    \"color\": 0\n") + "  },\n") + "  {\n") + "    \"name\": \"miata\",\n") + "    \"color\": 16711680\n") + "  }\n") + "]");

    public void testWriteDoesNotMutateState_99() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_98() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_97() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_96() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_95() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_94() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_93() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_92() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_91() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_90() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_89() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_88() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_87() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_86() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_85() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_84() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_83() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_82() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_81() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_80() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_79() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_78() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_77() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_76() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_75() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_74() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_73() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_72() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_71() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_70() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_69() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_68() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_67() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_66() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_65() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_64() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_63() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_62() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_61() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_60() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_59() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_58() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_57() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_56() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_55() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_54() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_53() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_52() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_51() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_50() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_49() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_48() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_47() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_46() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_45() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_44() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_43() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_42() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_41() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_40() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_39() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_38() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_37() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_36() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_35() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_34() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_33() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_32() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_31() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_30() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_29() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_28() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_27() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_26() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_25() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_24() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_23() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_22() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_21() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_20() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_19() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_18() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_17() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_16() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_15() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_14() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_13() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_12() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_11() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_10() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_9() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_8() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_7() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_6() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_5() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_4() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_3() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_2() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_1() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_0() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    static final class Car {
        java.lang.String name;

        int color;

        Car(java.lang.String name, int color) {
            this.name = name;
            this.color = color;
        }

        // used by Gson
        Car() {
        }

        @java.lang.Override
        public int hashCode() {
            return name.hashCode() ^ color;
        }

        @java.lang.Override
        public boolean equals(java.lang.Object o) {
            return ((o instanceof com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car) && ((com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car) (o)).name.equals(name)) && (((com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.Car) (o)).color == color);
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_100.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.MixedStreamTest", "testWriteDoesNotMutateState");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}