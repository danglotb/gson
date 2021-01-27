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
public final class MixedStreamTest_testWriteLenient_100 extends junit.framework.TestCase {
    private static final com.google.gson.MixedStreamTest_testWriteLenient_100.Car BLUE_MUSTANG = new com.google.gson.MixedStreamTest_testWriteLenient_100.Car("mustang", 0xff);

    private static final com.google.gson.MixedStreamTest_testWriteLenient_100.Car BLACK_BMW = new com.google.gson.MixedStreamTest_testWriteLenient_100.Car("bmw", 0x0);

    private static final com.google.gson.MixedStreamTest_testWriteLenient_100.Car RED_MIATA = new com.google.gson.MixedStreamTest_testWriteLenient_100.Car("miata", 0xff0000);

    private static final java.lang.String CARS_JSON = "[\n" + (((((((((((("  {\n" + "    \"name\": \"mustang\",\n") + "    \"color\": 255\n") + "  },\n") + "  {\n") + "    \"name\": \"bmw\",\n") + "    \"color\": 0\n") + "  },\n") + "  {\n") + "    \"name\": \"miata\",\n") + "    \"color\": 16711680\n") + "  }\n") + "]");

    public void testWriteLenient_99() {
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

    public void testWriteLenient_98() {
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

    public void testWriteLenient_97() {
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

    public void testWriteLenient_96() {
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

    public void testWriteLenient_95() {
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

    public void testWriteLenient_94() {
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

    public void testWriteLenient_93() {
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

    public void testWriteLenient_92() {
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

    public void testWriteLenient_91() {
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

    public void testWriteLenient_90() {
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

    public void testWriteLenient_89() {
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

    public void testWriteLenient_88() {
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

    public void testWriteLenient_87() {
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

    public void testWriteLenient_86() {
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

    public void testWriteLenient_85() {
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

    public void testWriteLenient_84() {
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

    public void testWriteLenient_83() {
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

    public void testWriteLenient_82() {
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

    public void testWriteLenient_81() {
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

    public void testWriteLenient_80() {
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

    public void testWriteLenient_79() {
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

    public void testWriteLenient_78() {
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

    public void testWriteLenient_77() {
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

    public void testWriteLenient_76() {
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

    public void testWriteLenient_75() {
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

    public void testWriteLenient_74() {
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

    public void testWriteLenient_73() {
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

    public void testWriteLenient_72() {
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

    public void testWriteLenient_71() {
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

    public void testWriteLenient_70() {
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

    public void testWriteLenient_69() {
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

    public void testWriteLenient_68() {
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

    public void testWriteLenient_67() {
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

    public void testWriteLenient_66() {
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

    public void testWriteLenient_65() {
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

    public void testWriteLenient_64() {
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

    public void testWriteLenient_63() {
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

    public void testWriteLenient_62() {
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

    public void testWriteLenient_61() {
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

    public void testWriteLenient_60() {
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

    public void testWriteLenient_59() {
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

    public void testWriteLenient_58() {
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

    public void testWriteLenient_57() {
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

    public void testWriteLenient_56() {
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

    public void testWriteLenient_55() {
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

    public void testWriteLenient_54() {
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

    public void testWriteLenient_53() {
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

    public void testWriteLenient_52() {
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

    public void testWriteLenient_51() {
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

    public void testWriteLenient_50() {
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

    public void testWriteLenient_49() {
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

    public void testWriteLenient_48() {
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

    public void testWriteLenient_47() {
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

    public void testWriteLenient_46() {
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

    public void testWriteLenient_45() {
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

    public void testWriteLenient_44() {
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

    public void testWriteLenient_43() {
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

    public void testWriteLenient_42() {
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

    public void testWriteLenient_41() {
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

    public void testWriteLenient_40() {
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

    public void testWriteLenient_39() {
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

    public void testWriteLenient_38() {
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

    public void testWriteLenient_37() {
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

    public void testWriteLenient_36() {
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

    public void testWriteLenient_35() {
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

    public void testWriteLenient_34() {
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

    public void testWriteLenient_33() {
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

    public void testWriteLenient_32() {
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

    public void testWriteLenient_31() {
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

    public void testWriteLenient_30() {
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

    public void testWriteLenient_29() {
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

    public void testWriteLenient_28() {
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

    public void testWriteLenient_27() {
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

    public void testWriteLenient_26() {
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

    public void testWriteLenient_25() {
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

    public void testWriteLenient_24() {
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

    public void testWriteLenient_23() {
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

    public void testWriteLenient_22() {
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

    public void testWriteLenient_21() {
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

    public void testWriteLenient_20() {
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

    public void testWriteLenient_19() {
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

    public void testWriteLenient_18() {
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

    public void testWriteLenient_17() {
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

    public void testWriteLenient_16() {
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

    public void testWriteLenient_15() {
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

    public void testWriteLenient_14() {
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

    public void testWriteLenient_13() {
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

    public void testWriteLenient_12() {
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

    public void testWriteLenient_11() {
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

    public void testWriteLenient_10() {
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
            return ((o instanceof com.google.gson.MixedStreamTest_testWriteLenient_100.Car) && ((com.google.gson.MixedStreamTest_testWriteLenient_100.Car) (o)).name.equals(name)) && (((com.google.gson.MixedStreamTest_testWriteLenient_100.Car) (o)).color == color);
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.MixedStreamTest_testWriteLenient_100.class) {}) {
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