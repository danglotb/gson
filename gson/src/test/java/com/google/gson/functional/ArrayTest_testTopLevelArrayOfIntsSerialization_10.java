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
 * Functional tests for Json serialization and deserialization of arrays.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ArrayTest_testTopLevelArrayOfIntsSerialization_10 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.Gson();
    }

    public void testTopLevelArrayOfIntsSerialization_9() {
        int[] target = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        junit.framework.Assert.assertEquals("[1,2,3,4,5,6,7,8,9]", gson.toJson(target));
    }

    public void testTopLevelArrayOfIntsSerialization_8() {
        int[] target = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        junit.framework.Assert.assertEquals("[1,2,3,4,5,6,7,8,9]", gson.toJson(target));
    }

    public void testTopLevelArrayOfIntsSerialization_7() {
        int[] target = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        junit.framework.Assert.assertEquals("[1,2,3,4,5,6,7,8,9]", gson.toJson(target));
    }

    public void testTopLevelArrayOfIntsSerialization_6() {
        int[] target = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        junit.framework.Assert.assertEquals("[1,2,3,4,5,6,7,8,9]", gson.toJson(target));
    }

    public void testTopLevelArrayOfIntsSerialization_5() {
        int[] target = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        junit.framework.Assert.assertEquals("[1,2,3,4,5,6,7,8,9]", gson.toJson(target));
    }

    public void testTopLevelArrayOfIntsSerialization_4() {
        int[] target = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        junit.framework.Assert.assertEquals("[1,2,3,4,5,6,7,8,9]", gson.toJson(target));
    }

    public void testTopLevelArrayOfIntsSerialization_3() {
        int[] target = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        junit.framework.Assert.assertEquals("[1,2,3,4,5,6,7,8,9]", gson.toJson(target));
    }

    public void testTopLevelArrayOfIntsSerialization_2() {
        int[] target = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        junit.framework.Assert.assertEquals("[1,2,3,4,5,6,7,8,9]", gson.toJson(target));
    }

    public void testTopLevelArrayOfIntsSerialization_1() {
        int[] target = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        junit.framework.Assert.assertEquals("[1,2,3,4,5,6,7,8,9]", gson.toJson(target));
    }

    public void testTopLevelArrayOfIntsSerialization_0() {
        int[] target = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        junit.framework.Assert.assertEquals("[1,2,3,4,5,6,7,8,9]", gson.toJson(target));
    }

    public void testTopLevelArrayOfIntsSerialization() {
        int[] target = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        junit.framework.Assert.assertEquals("[1,2,3,4,5,6,7,8,9]", gson.toJson(target));
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.ArrayTest_testTopLevelArrayOfIntsSerialization_10.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.ArrayTest", "testTopLevelArrayOfIntsSerialization");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}