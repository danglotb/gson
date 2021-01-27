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
import java.io.Reader;
import java.io.Writer;
/**
 * Functional tests for the support of {@link Reader}s and {@link Writer}s.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ReadersWritersTest_testReadWriteTwoObjects_10 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.Gson();
    }

    public void testReadWriteTwoObjects_9() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.io.CharArrayWriter writer = new java.io.CharArrayWriter();
        com.google.gson.common.TestTypes.BagOfPrimitives expectedOne = new com.google.gson.common.TestTypes.BagOfPrimitives(1, 1, true, "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        com.google.gson.common.TestTypes.BagOfPrimitives expectedTwo = new com.google.gson.common.TestTypes.BagOfPrimitives(2, 2, false, "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        java.io.CharArrayReader reader = new java.io.CharArrayReader(writer.toCharArray());
        com.google.gson.JsonStreamParser parser = new com.google.gson.JsonStreamParser(reader);
        com.google.gson.common.TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), com.google.gson.common.TestTypes.BagOfPrimitives.class);
        junit.framework.Assert.assertEquals("one", actualOne.stringValue);
        com.google.gson.common.TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), com.google.gson.common.TestTypes.BagOfPrimitives.class);
        junit.framework.Assert.assertEquals("two", actualTwo.stringValue);
        junit.framework.Assert.assertFalse(parser.hasNext());
    }

    public void testReadWriteTwoObjects_8() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.io.CharArrayWriter writer = new java.io.CharArrayWriter();
        com.google.gson.common.TestTypes.BagOfPrimitives expectedOne = new com.google.gson.common.TestTypes.BagOfPrimitives(1, 1, true, "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        com.google.gson.common.TestTypes.BagOfPrimitives expectedTwo = new com.google.gson.common.TestTypes.BagOfPrimitives(2, 2, false, "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        java.io.CharArrayReader reader = new java.io.CharArrayReader(writer.toCharArray());
        com.google.gson.JsonStreamParser parser = new com.google.gson.JsonStreamParser(reader);
        com.google.gson.common.TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), com.google.gson.common.TestTypes.BagOfPrimitives.class);
        junit.framework.Assert.assertEquals("one", actualOne.stringValue);
        com.google.gson.common.TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), com.google.gson.common.TestTypes.BagOfPrimitives.class);
        junit.framework.Assert.assertEquals("two", actualTwo.stringValue);
        junit.framework.Assert.assertFalse(parser.hasNext());
    }

    public void testReadWriteTwoObjects_7() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.io.CharArrayWriter writer = new java.io.CharArrayWriter();
        com.google.gson.common.TestTypes.BagOfPrimitives expectedOne = new com.google.gson.common.TestTypes.BagOfPrimitives(1, 1, true, "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        com.google.gson.common.TestTypes.BagOfPrimitives expectedTwo = new com.google.gson.common.TestTypes.BagOfPrimitives(2, 2, false, "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        java.io.CharArrayReader reader = new java.io.CharArrayReader(writer.toCharArray());
        com.google.gson.JsonStreamParser parser = new com.google.gson.JsonStreamParser(reader);
        com.google.gson.common.TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), com.google.gson.common.TestTypes.BagOfPrimitives.class);
        junit.framework.Assert.assertEquals("one", actualOne.stringValue);
        com.google.gson.common.TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), com.google.gson.common.TestTypes.BagOfPrimitives.class);
        junit.framework.Assert.assertEquals("two", actualTwo.stringValue);
        junit.framework.Assert.assertFalse(parser.hasNext());
    }

    public void testReadWriteTwoObjects_6() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.io.CharArrayWriter writer = new java.io.CharArrayWriter();
        com.google.gson.common.TestTypes.BagOfPrimitives expectedOne = new com.google.gson.common.TestTypes.BagOfPrimitives(1, 1, true, "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        com.google.gson.common.TestTypes.BagOfPrimitives expectedTwo = new com.google.gson.common.TestTypes.BagOfPrimitives(2, 2, false, "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        java.io.CharArrayReader reader = new java.io.CharArrayReader(writer.toCharArray());
        com.google.gson.JsonStreamParser parser = new com.google.gson.JsonStreamParser(reader);
        com.google.gson.common.TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), com.google.gson.common.TestTypes.BagOfPrimitives.class);
        junit.framework.Assert.assertEquals("one", actualOne.stringValue);
        com.google.gson.common.TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), com.google.gson.common.TestTypes.BagOfPrimitives.class);
        junit.framework.Assert.assertEquals("two", actualTwo.stringValue);
        junit.framework.Assert.assertFalse(parser.hasNext());
    }

    public void testReadWriteTwoObjects_5() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.io.CharArrayWriter writer = new java.io.CharArrayWriter();
        com.google.gson.common.TestTypes.BagOfPrimitives expectedOne = new com.google.gson.common.TestTypes.BagOfPrimitives(1, 1, true, "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        com.google.gson.common.TestTypes.BagOfPrimitives expectedTwo = new com.google.gson.common.TestTypes.BagOfPrimitives(2, 2, false, "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        java.io.CharArrayReader reader = new java.io.CharArrayReader(writer.toCharArray());
        com.google.gson.JsonStreamParser parser = new com.google.gson.JsonStreamParser(reader);
        com.google.gson.common.TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), com.google.gson.common.TestTypes.BagOfPrimitives.class);
        junit.framework.Assert.assertEquals("one", actualOne.stringValue);
        com.google.gson.common.TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), com.google.gson.common.TestTypes.BagOfPrimitives.class);
        junit.framework.Assert.assertEquals("two", actualTwo.stringValue);
        junit.framework.Assert.assertFalse(parser.hasNext());
    }

    public void testReadWriteTwoObjects_4() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.io.CharArrayWriter writer = new java.io.CharArrayWriter();
        com.google.gson.common.TestTypes.BagOfPrimitives expectedOne = new com.google.gson.common.TestTypes.BagOfPrimitives(1, 1, true, "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        com.google.gson.common.TestTypes.BagOfPrimitives expectedTwo = new com.google.gson.common.TestTypes.BagOfPrimitives(2, 2, false, "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        java.io.CharArrayReader reader = new java.io.CharArrayReader(writer.toCharArray());
        com.google.gson.JsonStreamParser parser = new com.google.gson.JsonStreamParser(reader);
        com.google.gson.common.TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), com.google.gson.common.TestTypes.BagOfPrimitives.class);
        junit.framework.Assert.assertEquals("one", actualOne.stringValue);
        com.google.gson.common.TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), com.google.gson.common.TestTypes.BagOfPrimitives.class);
        junit.framework.Assert.assertEquals("two", actualTwo.stringValue);
        junit.framework.Assert.assertFalse(parser.hasNext());
    }

    public void testReadWriteTwoObjects_3() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.io.CharArrayWriter writer = new java.io.CharArrayWriter();
        com.google.gson.common.TestTypes.BagOfPrimitives expectedOne = new com.google.gson.common.TestTypes.BagOfPrimitives(1, 1, true, "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        com.google.gson.common.TestTypes.BagOfPrimitives expectedTwo = new com.google.gson.common.TestTypes.BagOfPrimitives(2, 2, false, "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        java.io.CharArrayReader reader = new java.io.CharArrayReader(writer.toCharArray());
        com.google.gson.JsonStreamParser parser = new com.google.gson.JsonStreamParser(reader);
        com.google.gson.common.TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), com.google.gson.common.TestTypes.BagOfPrimitives.class);
        junit.framework.Assert.assertEquals("one", actualOne.stringValue);
        com.google.gson.common.TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), com.google.gson.common.TestTypes.BagOfPrimitives.class);
        junit.framework.Assert.assertEquals("two", actualTwo.stringValue);
        junit.framework.Assert.assertFalse(parser.hasNext());
    }

    public void testReadWriteTwoObjects_2() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.io.CharArrayWriter writer = new java.io.CharArrayWriter();
        com.google.gson.common.TestTypes.BagOfPrimitives expectedOne = new com.google.gson.common.TestTypes.BagOfPrimitives(1, 1, true, "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        com.google.gson.common.TestTypes.BagOfPrimitives expectedTwo = new com.google.gson.common.TestTypes.BagOfPrimitives(2, 2, false, "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        java.io.CharArrayReader reader = new java.io.CharArrayReader(writer.toCharArray());
        com.google.gson.JsonStreamParser parser = new com.google.gson.JsonStreamParser(reader);
        com.google.gson.common.TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), com.google.gson.common.TestTypes.BagOfPrimitives.class);
        junit.framework.Assert.assertEquals("one", actualOne.stringValue);
        com.google.gson.common.TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), com.google.gson.common.TestTypes.BagOfPrimitives.class);
        junit.framework.Assert.assertEquals("two", actualTwo.stringValue);
        junit.framework.Assert.assertFalse(parser.hasNext());
    }

    public void testReadWriteTwoObjects_1() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.io.CharArrayWriter writer = new java.io.CharArrayWriter();
        com.google.gson.common.TestTypes.BagOfPrimitives expectedOne = new com.google.gson.common.TestTypes.BagOfPrimitives(1, 1, true, "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        com.google.gson.common.TestTypes.BagOfPrimitives expectedTwo = new com.google.gson.common.TestTypes.BagOfPrimitives(2, 2, false, "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        java.io.CharArrayReader reader = new java.io.CharArrayReader(writer.toCharArray());
        com.google.gson.JsonStreamParser parser = new com.google.gson.JsonStreamParser(reader);
        com.google.gson.common.TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), com.google.gson.common.TestTypes.BagOfPrimitives.class);
        junit.framework.Assert.assertEquals("one", actualOne.stringValue);
        com.google.gson.common.TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), com.google.gson.common.TestTypes.BagOfPrimitives.class);
        junit.framework.Assert.assertEquals("two", actualTwo.stringValue);
        junit.framework.Assert.assertFalse(parser.hasNext());
    }

    public void testReadWriteTwoObjects_0() throws java.io.IOException {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.io.CharArrayWriter writer = new java.io.CharArrayWriter();
        com.google.gson.common.TestTypes.BagOfPrimitives expectedOne = new com.google.gson.common.TestTypes.BagOfPrimitives(1, 1, true, "one");
        writer.write(gson.toJson(expectedOne).toCharArray());
        com.google.gson.common.TestTypes.BagOfPrimitives expectedTwo = new com.google.gson.common.TestTypes.BagOfPrimitives(2, 2, false, "two");
        writer.write(gson.toJson(expectedTwo).toCharArray());
        java.io.CharArrayReader reader = new java.io.CharArrayReader(writer.toCharArray());
        com.google.gson.JsonStreamParser parser = new com.google.gson.JsonStreamParser(reader);
        com.google.gson.common.TestTypes.BagOfPrimitives actualOne = gson.fromJson(parser.next(), com.google.gson.common.TestTypes.BagOfPrimitives.class);
        junit.framework.Assert.assertEquals("one", actualOne.stringValue);
        com.google.gson.common.TestTypes.BagOfPrimitives actualTwo = gson.fromJson(parser.next(), com.google.gson.common.TestTypes.BagOfPrimitives.class);
        junit.framework.Assert.assertEquals("two", actualTwo.stringValue);
        junit.framework.Assert.assertFalse(parser.hasNext());
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.ReadersWritersTest_testReadWriteTwoObjects_10.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.ReadersWritersTest", "testReadWriteTwoObjects");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}