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
public class ReadersWritersTest_testReadWriteTwoObjects_100 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.Gson();
    }

    public void testReadWriteTwoObjects_99() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_98() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_97() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_96() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_95() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_94() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_93() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_92() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_91() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_90() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_89() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_88() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_87() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_86() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_85() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_84() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_83() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_82() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_81() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_80() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_79() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_78() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_77() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_76() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_75() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_74() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_73() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_72() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_71() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_70() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_69() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_68() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_67() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_66() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_65() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_64() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_63() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_62() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_61() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_60() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_59() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_58() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_57() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_56() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_55() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_54() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_53() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_52() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_51() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_50() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_49() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_48() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_47() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_46() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_45() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_44() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_43() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_42() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_41() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_40() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_39() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_38() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_37() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_36() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_35() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_34() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_33() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_32() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_31() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_30() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_29() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_28() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_27() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_26() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_25() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_24() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_23() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_22() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_21() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_20() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_19() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_18() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_17() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_16() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_15() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_14() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_13() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_12() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_11() throws java.io.IOException {
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

    public void testReadWriteTwoObjects_10() throws java.io.IOException {
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.ReadersWritersTest_testReadWriteTwoObjects_100.class) {}) {
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