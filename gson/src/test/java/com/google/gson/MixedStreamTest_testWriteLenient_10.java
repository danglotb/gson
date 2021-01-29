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
public final class MixedStreamTest_testWriteLenient_10 extends junit.framework.TestCase {
    private static final com.google.gson.MixedStreamTest_testWriteLenient_10.Car BLUE_MUSTANG = new com.google.gson.MixedStreamTest_testWriteLenient_10.Car("mustang", 0xff);

    private static final com.google.gson.MixedStreamTest_testWriteLenient_10.Car BLACK_BMW = new com.google.gson.MixedStreamTest_testWriteLenient_10.Car("bmw", 0x0);

    private static final com.google.gson.MixedStreamTest_testWriteLenient_10.Car RED_MIATA = new com.google.gson.MixedStreamTest_testWriteLenient_10.Car("miata", 0xff0000);

    private static final java.lang.String CARS_JSON = "[\n" + (((((((((((("  {\n" + "    \"name\": \"mustang\",\n") + "    \"color\": 255\n") + "  },\n") + "  {\n") + "    \"name\": \"bmw\",\n") + "    \"color\": 0\n") + "  },\n") + "  {\n") + "    \"name\": \"miata\",\n") + "    \"color\": 16711680\n") + "  }\n") + "]");

    public void testWriteLenient_9() {
        java.util.List<java.lang.Double> doubles = java.util.Arrays.asList(java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, -0.0, 0.5, 0.0);
        java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.Double>>() {}.getType();
        java.io.StringWriter writer = new java.io.StringWriter();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(writer);
        new com.google.gson.GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(doubles, type, jsonWriter);
        junit.framework.Assert.assertEquals("[NaN,-Infinity,Infinity,-0.0,0.5,0.0]", writer.toString());
        try {
            new com.google.gson.Gson().toJson(doubles, type, new com.google.gson.stream.JsonWriter(new java.io.StringWriter()));
            junit.framework.Assert.fail();
        } catch (java.lang.IllegalArgumentException expected) {
        }
    }

    public void testWriteLenient_8() {
        java.util.List<java.lang.Double> doubles = java.util.Arrays.asList(java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, -0.0, 0.5, 0.0);
        java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.Double>>() {}.getType();
        java.io.StringWriter writer = new java.io.StringWriter();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(writer);
        new com.google.gson.GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(doubles, type, jsonWriter);
        junit.framework.Assert.assertEquals("[NaN,-Infinity,Infinity,-0.0,0.5,0.0]", writer.toString());
        try {
            new com.google.gson.Gson().toJson(doubles, type, new com.google.gson.stream.JsonWriter(new java.io.StringWriter()));
            junit.framework.Assert.fail();
        } catch (java.lang.IllegalArgumentException expected) {
        }
    }

    public void testWriteLenient_7() {
        java.util.List<java.lang.Double> doubles = java.util.Arrays.asList(java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, -0.0, 0.5, 0.0);
        java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.Double>>() {}.getType();
        java.io.StringWriter writer = new java.io.StringWriter();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(writer);
        new com.google.gson.GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(doubles, type, jsonWriter);
        junit.framework.Assert.assertEquals("[NaN,-Infinity,Infinity,-0.0,0.5,0.0]", writer.toString());
        try {
            new com.google.gson.Gson().toJson(doubles, type, new com.google.gson.stream.JsonWriter(new java.io.StringWriter()));
            junit.framework.Assert.fail();
        } catch (java.lang.IllegalArgumentException expected) {
        }
    }

    public void testWriteLenient_6() {
        java.util.List<java.lang.Double> doubles = java.util.Arrays.asList(java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, -0.0, 0.5, 0.0);
        java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.Double>>() {}.getType();
        java.io.StringWriter writer = new java.io.StringWriter();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(writer);
        new com.google.gson.GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(doubles, type, jsonWriter);
        junit.framework.Assert.assertEquals("[NaN,-Infinity,Infinity,-0.0,0.5,0.0]", writer.toString());
        try {
            new com.google.gson.Gson().toJson(doubles, type, new com.google.gson.stream.JsonWriter(new java.io.StringWriter()));
            junit.framework.Assert.fail();
        } catch (java.lang.IllegalArgumentException expected) {
        }
    }

    public void testWriteLenient_5() {
        java.util.List<java.lang.Double> doubles = java.util.Arrays.asList(java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, -0.0, 0.5, 0.0);
        java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.Double>>() {}.getType();
        java.io.StringWriter writer = new java.io.StringWriter();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(writer);
        new com.google.gson.GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(doubles, type, jsonWriter);
        junit.framework.Assert.assertEquals("[NaN,-Infinity,Infinity,-0.0,0.5,0.0]", writer.toString());
        try {
            new com.google.gson.Gson().toJson(doubles, type, new com.google.gson.stream.JsonWriter(new java.io.StringWriter()));
            junit.framework.Assert.fail();
        } catch (java.lang.IllegalArgumentException expected) {
        }
    }

    public void testWriteLenient_4() {
        java.util.List<java.lang.Double> doubles = java.util.Arrays.asList(java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, -0.0, 0.5, 0.0);
        java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.Double>>() {}.getType();
        java.io.StringWriter writer = new java.io.StringWriter();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(writer);
        new com.google.gson.GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(doubles, type, jsonWriter);
        junit.framework.Assert.assertEquals("[NaN,-Infinity,Infinity,-0.0,0.5,0.0]", writer.toString());
        try {
            new com.google.gson.Gson().toJson(doubles, type, new com.google.gson.stream.JsonWriter(new java.io.StringWriter()));
            junit.framework.Assert.fail();
        } catch (java.lang.IllegalArgumentException expected) {
        }
    }

    public void testWriteLenient_3() {
        java.util.List<java.lang.Double> doubles = java.util.Arrays.asList(java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, -0.0, 0.5, 0.0);
        java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.Double>>() {}.getType();
        java.io.StringWriter writer = new java.io.StringWriter();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(writer);
        new com.google.gson.GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(doubles, type, jsonWriter);
        junit.framework.Assert.assertEquals("[NaN,-Infinity,Infinity,-0.0,0.5,0.0]", writer.toString());
        try {
            new com.google.gson.Gson().toJson(doubles, type, new com.google.gson.stream.JsonWriter(new java.io.StringWriter()));
            junit.framework.Assert.fail();
        } catch (java.lang.IllegalArgumentException expected) {
        }
    }

    public void testWriteLenient_2() {
        java.util.List<java.lang.Double> doubles = java.util.Arrays.asList(java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, -0.0, 0.5, 0.0);
        java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.Double>>() {}.getType();
        java.io.StringWriter writer = new java.io.StringWriter();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(writer);
        new com.google.gson.GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(doubles, type, jsonWriter);
        junit.framework.Assert.assertEquals("[NaN,-Infinity,Infinity,-0.0,0.5,0.0]", writer.toString());
        try {
            new com.google.gson.Gson().toJson(doubles, type, new com.google.gson.stream.JsonWriter(new java.io.StringWriter()));
            junit.framework.Assert.fail();
        } catch (java.lang.IllegalArgumentException expected) {
        }
    }

    public void testWriteLenient_1() {
        java.util.List<java.lang.Double> doubles = java.util.Arrays.asList(java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, -0.0, 0.5, 0.0);
        java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.Double>>() {}.getType();
        java.io.StringWriter writer = new java.io.StringWriter();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(writer);
        new com.google.gson.GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(doubles, type, jsonWriter);
        junit.framework.Assert.assertEquals("[NaN,-Infinity,Infinity,-0.0,0.5,0.0]", writer.toString());
        try {
            new com.google.gson.Gson().toJson(doubles, type, new com.google.gson.stream.JsonWriter(new java.io.StringWriter()));
            junit.framework.Assert.fail();
        } catch (java.lang.IllegalArgumentException expected) {
        }
    }

    public void testWriteLenient_0() {
        java.util.List<java.lang.Double> doubles = java.util.Arrays.asList(java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, -0.0, 0.5, 0.0);
        java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.Double>>() {}.getType();
        java.io.StringWriter writer = new java.io.StringWriter();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(writer);
        new com.google.gson.GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(doubles, type, jsonWriter);
        junit.framework.Assert.assertEquals("[NaN,-Infinity,Infinity,-0.0,0.5,0.0]", writer.toString());
        try {
            new com.google.gson.Gson().toJson(doubles, type, new com.google.gson.stream.JsonWriter(new java.io.StringWriter()));
            junit.framework.Assert.fail();
        } catch (java.lang.IllegalArgumentException expected) {
        }
    }

    public void testWriteLenient() {
        java.util.List<java.lang.Double> doubles = java.util.Arrays.asList(java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, -0.0, 0.5, 0.0);
        java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.List<java.lang.Double>>() {}.getType();
        java.io.StringWriter writer = new java.io.StringWriter();
        com.google.gson.stream.JsonWriter jsonWriter = new com.google.gson.stream.JsonWriter(writer);
        new com.google.gson.GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(doubles, type, jsonWriter);
        junit.framework.Assert.assertEquals("[NaN,-Infinity,Infinity,-0.0,0.5,0.0]", writer.toString());
        try {
            new com.google.gson.Gson().toJson(doubles, type, new com.google.gson.stream.JsonWriter(new java.io.StringWriter()));
            junit.framework.Assert.fail();
        } catch (java.lang.IllegalArgumentException expected) {
        }
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
            return ((o instanceof com.google.gson.MixedStreamTest_testWriteLenient_10.Car) && ((com.google.gson.MixedStreamTest_testWriteLenient_10.Car) (o)).name.equals(name)) && (((com.google.gson.MixedStreamTest_testWriteLenient_10.Car) (o)).color == color);
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.MixedStreamTest_testWriteLenient_10.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.MixedStreamTest", "testWriteLenient");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}