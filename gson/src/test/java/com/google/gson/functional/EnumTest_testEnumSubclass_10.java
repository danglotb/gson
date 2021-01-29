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
 * Functional tests for Java 5.0 enums.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class EnumTest_testEnumSubclass_10 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.Gson();
    }

    private static enum MyEnum {

        VALUE1,
        VALUE2;}

    private static class ClassWithEnumFields {
        private final com.google.gson.functional.EnumTest_testEnumSubclass_10.MyEnum value1 = com.google.gson.functional.EnumTest_testEnumSubclass_10.MyEnum.VALUE1;

        private final com.google.gson.functional.EnumTest_testEnumSubclass_10.MyEnum value2 = com.google.gson.functional.EnumTest_testEnumSubclass_10.MyEnum.VALUE2;

        public java.lang.String getExpectedJson() {
            return ((("{\"value1\":\"" + value1) + "\",\"value2\":\"") + value2) + "\"}";
        }
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_9() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_8() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_7() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_6() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_5() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_4() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_3() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_2() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_1() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_0() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo>>() {}.getType()));
    }

    public enum Roshambo {

        ROCK() {
            @java.lang.Override
            com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo defeats() {
                return com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.SCISSORS;
            }
        },
        PAPER() {
            @java.lang.Override
            com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo defeats() {
                return com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.ROCK;
            }
        },
        SCISSORS() {
            @java.lang.Override
            com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo defeats() {
                return com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.PAPER;
            }
        };
        abstract com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo defeats();
    }

    private static class MyEnumTypeAdapter implements com.google.gson.JsonSerializer<com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo> , com.google.gson.JsonDeserializer<com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo> {
        public com.google.gson.JsonElement serialize(com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
            return new com.google.gson.JsonPrimitive("123" + src.name());
        }

        public com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type classOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
            return com.google.gson.functional.EnumTest_testEnumSubclass_10.Roshambo.valueOf(json.getAsString().substring(3));
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.EnumTest_testEnumSubclass_10.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.EnumTest", "testEnumSubclass");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}