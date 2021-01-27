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
public class EnumTest_testEnumSubclass_100 extends junit.framework.TestCase {
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
        private final com.google.gson.functional.EnumTest_testEnumSubclass_100.MyEnum value1 = com.google.gson.functional.EnumTest_testEnumSubclass_100.MyEnum.VALUE1;

        private final com.google.gson.functional.EnumTest_testEnumSubclass_100.MyEnum value2 = com.google.gson.functional.EnumTest_testEnumSubclass_100.MyEnum.VALUE2;

        public java.lang.String getExpectedJson() {
            return ((("{\"value1\":\"" + value1) + "\",\"value2\":\"") + value2) + "\"}";
        }
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_99() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_98() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_97() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_96() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_95() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_94() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_93() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_92() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_91() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_90() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_89() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_88() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_87() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_86() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_85() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_84() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_83() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_82() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_81() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_80() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_79() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_78() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_77() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_76() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_75() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_74() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_73() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_72() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_71() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_70() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_69() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_68() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_67() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_66() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_65() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_64() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_63() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_62() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_61() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_60() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_59() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_58() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_57() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_56() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_55() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_54() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_53() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_52() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_51() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_50() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_49() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_48() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_47() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_46() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_45() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_44() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_43() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_42() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_41() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_40() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_39() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_38() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_37() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_36() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_35() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_34() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_33() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_32() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_31() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_30() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_29() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_28() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_27() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_26() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_25() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_24() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_23() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_22() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_21() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_20() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_19() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_18() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_17() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_16() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_15() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_14() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_13() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_12() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_11() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_10() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_9() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_8() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_7() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_6() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_5() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_4() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_3() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_2() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_1() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass_0() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    /**
     * Test for issue 226.
     */
    public void testEnumSubclass() {
        junit.framework.Assert.assertFalse(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class == com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK.getClass());
        junit.framework.Assert.assertEquals("\"ROCK\"", gson.toJson(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK));
        junit.framework.Assert.assertEquals("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", gson.toJson(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class)));
        junit.framework.Assert.assertEquals(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK, gson.fromJson("\"ROCK\"", com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class));
        junit.framework.Assert.assertEquals(java.util.EnumSet.allOf(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.class), gson.fromJson("[\"ROCK\",\"PAPER\",\"SCISSORS\"]", new com.google.gson.reflect.TypeToken<java.util.Set<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo>>() {}.getType()));
    }

    public enum Roshambo {

        ROCK() {
            @java.lang.Override
            com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo defeats() {
                return com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.SCISSORS;
            }
        },
        PAPER() {
            @java.lang.Override
            com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo defeats() {
                return com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.ROCK;
            }
        },
        SCISSORS() {
            @java.lang.Override
            com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo defeats() {
                return com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.PAPER;
            }
        };
        abstract com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo defeats();
    }

    private static class MyEnumTypeAdapter implements com.google.gson.JsonSerializer<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo> , com.google.gson.JsonDeserializer<com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo> {
        public com.google.gson.JsonElement serialize(com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
            return new com.google.gson.JsonPrimitive("123" + src.name());
        }

        public com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type classOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
            return com.google.gson.functional.EnumTest_testEnumSubclass_100.Roshambo.valueOf(json.getAsString().substring(3));
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.EnumTest_testEnumSubclass_100.class) {}) {
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