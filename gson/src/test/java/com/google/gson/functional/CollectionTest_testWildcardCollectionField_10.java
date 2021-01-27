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
 * Functional tests for Json serialization and deserialization of collections.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class CollectionTest_testWildcardCollectionField_10 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.Gson();
    }

    public void testWildcardCollectionField_9() throws java.lang.Exception {
        java.util.Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new java.util.ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        com.google.gson.common.TestTypes.BagOfPrimitives objA = new com.google.gson.common.TestTypes.BagOfPrimitives(3L, 1, true, "blah");
        com.google.gson.common.TestTypes.BagOfPrimitives objB = new com.google.gson.common.TestTypes.BagOfPrimitives(2L, 6, false, "blahB");
        collection.add(objA);
        collection.add(objB);
        com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection target = new com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection(collection);
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains(objA.getExpectedJson()));
        junit.framework.Assert.assertTrue(json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection.class);
        java.util.Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        junit.framework.Assert.assertEquals(2, deserializedCollection.size());
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objA));
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objB));
    }

    public void testWildcardCollectionField_8() throws java.lang.Exception {
        java.util.Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new java.util.ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        com.google.gson.common.TestTypes.BagOfPrimitives objA = new com.google.gson.common.TestTypes.BagOfPrimitives(3L, 1, true, "blah");
        com.google.gson.common.TestTypes.BagOfPrimitives objB = new com.google.gson.common.TestTypes.BagOfPrimitives(2L, 6, false, "blahB");
        collection.add(objA);
        collection.add(objB);
        com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection target = new com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection(collection);
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains(objA.getExpectedJson()));
        junit.framework.Assert.assertTrue(json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection.class);
        java.util.Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        junit.framework.Assert.assertEquals(2, deserializedCollection.size());
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objA));
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objB));
    }

    public void testWildcardCollectionField_7() throws java.lang.Exception {
        java.util.Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new java.util.ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        com.google.gson.common.TestTypes.BagOfPrimitives objA = new com.google.gson.common.TestTypes.BagOfPrimitives(3L, 1, true, "blah");
        com.google.gson.common.TestTypes.BagOfPrimitives objB = new com.google.gson.common.TestTypes.BagOfPrimitives(2L, 6, false, "blahB");
        collection.add(objA);
        collection.add(objB);
        com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection target = new com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection(collection);
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains(objA.getExpectedJson()));
        junit.framework.Assert.assertTrue(json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection.class);
        java.util.Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        junit.framework.Assert.assertEquals(2, deserializedCollection.size());
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objA));
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objB));
    }

    public void testWildcardCollectionField_6() throws java.lang.Exception {
        java.util.Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new java.util.ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        com.google.gson.common.TestTypes.BagOfPrimitives objA = new com.google.gson.common.TestTypes.BagOfPrimitives(3L, 1, true, "blah");
        com.google.gson.common.TestTypes.BagOfPrimitives objB = new com.google.gson.common.TestTypes.BagOfPrimitives(2L, 6, false, "blahB");
        collection.add(objA);
        collection.add(objB);
        com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection target = new com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection(collection);
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains(objA.getExpectedJson()));
        junit.framework.Assert.assertTrue(json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection.class);
        java.util.Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        junit.framework.Assert.assertEquals(2, deserializedCollection.size());
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objA));
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objB));
    }

    public void testWildcardCollectionField_5() throws java.lang.Exception {
        java.util.Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new java.util.ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        com.google.gson.common.TestTypes.BagOfPrimitives objA = new com.google.gson.common.TestTypes.BagOfPrimitives(3L, 1, true, "blah");
        com.google.gson.common.TestTypes.BagOfPrimitives objB = new com.google.gson.common.TestTypes.BagOfPrimitives(2L, 6, false, "blahB");
        collection.add(objA);
        collection.add(objB);
        com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection target = new com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection(collection);
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains(objA.getExpectedJson()));
        junit.framework.Assert.assertTrue(json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection.class);
        java.util.Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        junit.framework.Assert.assertEquals(2, deserializedCollection.size());
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objA));
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objB));
    }

    public void testWildcardCollectionField_4() throws java.lang.Exception {
        java.util.Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new java.util.ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        com.google.gson.common.TestTypes.BagOfPrimitives objA = new com.google.gson.common.TestTypes.BagOfPrimitives(3L, 1, true, "blah");
        com.google.gson.common.TestTypes.BagOfPrimitives objB = new com.google.gson.common.TestTypes.BagOfPrimitives(2L, 6, false, "blahB");
        collection.add(objA);
        collection.add(objB);
        com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection target = new com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection(collection);
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains(objA.getExpectedJson()));
        junit.framework.Assert.assertTrue(json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection.class);
        java.util.Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        junit.framework.Assert.assertEquals(2, deserializedCollection.size());
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objA));
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objB));
    }

    public void testWildcardCollectionField_3() throws java.lang.Exception {
        java.util.Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new java.util.ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        com.google.gson.common.TestTypes.BagOfPrimitives objA = new com.google.gson.common.TestTypes.BagOfPrimitives(3L, 1, true, "blah");
        com.google.gson.common.TestTypes.BagOfPrimitives objB = new com.google.gson.common.TestTypes.BagOfPrimitives(2L, 6, false, "blahB");
        collection.add(objA);
        collection.add(objB);
        com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection target = new com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection(collection);
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains(objA.getExpectedJson()));
        junit.framework.Assert.assertTrue(json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection.class);
        java.util.Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        junit.framework.Assert.assertEquals(2, deserializedCollection.size());
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objA));
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objB));
    }

    public void testWildcardCollectionField_2() throws java.lang.Exception {
        java.util.Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new java.util.ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        com.google.gson.common.TestTypes.BagOfPrimitives objA = new com.google.gson.common.TestTypes.BagOfPrimitives(3L, 1, true, "blah");
        com.google.gson.common.TestTypes.BagOfPrimitives objB = new com.google.gson.common.TestTypes.BagOfPrimitives(2L, 6, false, "blahB");
        collection.add(objA);
        collection.add(objB);
        com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection target = new com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection(collection);
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains(objA.getExpectedJson()));
        junit.framework.Assert.assertTrue(json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection.class);
        java.util.Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        junit.framework.Assert.assertEquals(2, deserializedCollection.size());
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objA));
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objB));
    }

    public void testWildcardCollectionField_1() throws java.lang.Exception {
        java.util.Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new java.util.ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        com.google.gson.common.TestTypes.BagOfPrimitives objA = new com.google.gson.common.TestTypes.BagOfPrimitives(3L, 1, true, "blah");
        com.google.gson.common.TestTypes.BagOfPrimitives objB = new com.google.gson.common.TestTypes.BagOfPrimitives(2L, 6, false, "blahB");
        collection.add(objA);
        collection.add(objB);
        com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection target = new com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection(collection);
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains(objA.getExpectedJson()));
        junit.framework.Assert.assertTrue(json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection.class);
        java.util.Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        junit.framework.Assert.assertEquals(2, deserializedCollection.size());
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objA));
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objB));
    }

    public void testWildcardCollectionField_0() throws java.lang.Exception {
        java.util.Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new java.util.ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        com.google.gson.common.TestTypes.BagOfPrimitives objA = new com.google.gson.common.TestTypes.BagOfPrimitives(3L, 1, true, "blah");
        com.google.gson.common.TestTypes.BagOfPrimitives objB = new com.google.gson.common.TestTypes.BagOfPrimitives(2L, 6, false, "blahB");
        collection.add(objA);
        collection.add(objB);
        com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection target = new com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection(collection);
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains(objA.getExpectedJson()));
        junit.framework.Assert.assertTrue(json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection.class);
        java.util.Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        junit.framework.Assert.assertEquals(2, deserializedCollection.size());
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objA));
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objB));
    }

    public void testWildcardCollectionField() throws java.lang.Exception {
        java.util.Collection<com.google.gson.common.TestTypes.BagOfPrimitives> collection = new java.util.ArrayList<com.google.gson.common.TestTypes.BagOfPrimitives>();
        com.google.gson.common.TestTypes.BagOfPrimitives objA = new com.google.gson.common.TestTypes.BagOfPrimitives(3L, 1, true, "blah");
        com.google.gson.common.TestTypes.BagOfPrimitives objB = new com.google.gson.common.TestTypes.BagOfPrimitives(2L, 6, false, "blahB");
        collection.add(objA);
        collection.add(objB);
        com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection target = new com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection(collection);
        java.lang.String json = gson.toJson(target);
        junit.framework.Assert.assertTrue(json.contains(objA.getExpectedJson()));
        junit.framework.Assert.assertTrue(json.contains(objB.getExpectedJson()));
        target = gson.fromJson(json, com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.ObjectWithWildcardCollection.class);
        java.util.Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> deserializedCollection = target.getCollection();
        junit.framework.Assert.assertEquals(2, deserializedCollection.size());
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objA));
        junit.framework.Assert.assertTrue(deserializedCollection.contains(objB));
    }

    static class HasArrayListField {
        java.util.ArrayList<java.lang.Long> longs = new java.util.ArrayList<java.lang.Long>();
    }

    @java.lang.SuppressWarnings("unchecked")
    private static int[] toIntArray(java.util.Collection collection) {
        int[] ints = new int[collection.size()];
        int i = 0;
        for (java.util.Iterator iterator = collection.iterator(); iterator.hasNext(); ++i) {
            java.lang.Object obj = iterator.next();
            if (obj instanceof java.lang.Integer) {
                ints[i] = ((java.lang.Integer) (obj)).intValue();
            } else if (obj instanceof java.lang.Long) {
                ints[i] = ((java.lang.Long) (obj)).intValue();
            }
        }
        return ints;
    }

    private static class ObjectWithWildcardCollection {
        private final java.util.Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> collection;

        public ObjectWithWildcardCollection(java.util.Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> collection) {
            this.collection = collection;
        }

        public java.util.Collection<? extends com.google.gson.common.TestTypes.BagOfPrimitives> getCollection() {
            return collection;
        }
    }

    private static class Entry {
        int value;

        Entry(int value) {
            this.value = value;
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.CollectionTest_testWildcardCollectionField_10.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.CollectionTest", "testWildcardCollectionField");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}