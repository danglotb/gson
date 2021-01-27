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
public final class MixedStreamTest_testWriteDoesNotMutateState_10 extends junit.framework.TestCase {
    private static final com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car BLUE_MUSTANG = new com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car("mustang", 0xff);

    private static final com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car BLACK_BMW = new com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car("bmw", 0x0);

    private static final com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car RED_MIATA = new com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car("miata", 0xff0000);

    private static final java.lang.String CARS_JSON = "[\n" + (((((((((((("  {\n" + "    \"name\": \"mustang\",\n") + "    \"color\": 255\n") + "  },\n") + "  {\n") + "    \"name\": \"bmw\",\n") + "    \"color\": 0\n") + "  },\n") + "  {\n") + "    \"name\": \"miata\",\n") + "    \"color\": 16711680\n") + "  }\n") + "]");

    public void testWriteDoesNotMutateState_9() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_8() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_7() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_6() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_5() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_4() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_3() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_2() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_1() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState_0() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertFalse(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertFalse(jsonWriter.isLenient());
    }

    public void testWriteDoesNotMutateState() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(new java.io.StringWriter());
        jsonWriter.beginArray();
        jsonWriter.setHtmlSafe(true);
        jsonWriter.setLenient(true);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
        junit.framework.Assert.assertTrue(jsonWriter.isHtmlSafe());
        junit.framework.Assert.assertTrue(jsonWriter.isLenient());
        jsonWriter.setHtmlSafe(false);
        jsonWriter.setLenient(false);
        gson.toJson(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.BLUE_MUSTANG, com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car.class, jsonWriter);
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
            return ((o instanceof com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car) && ((com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car) (o)).name.equals(name)) && (((com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.Car) (o)).color == color);
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.MixedStreamTest_testWriteDoesNotMutateState_10.class) {}) {
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