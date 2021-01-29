package com.google.gson.functional;
/**
 * Functional tests for Json serialization and deserialization of strings.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class StringTest_testEscapingQuotesInStringSerialization_10 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.Gson();
    }

    public void testEscapingQuotesInStringSerialization_9() throws java.lang.Exception {
        java.lang.String valueWithQuotes = "beforeQuote\"afterQuote";
        java.lang.String jsonRepresentation = gson.toJson(valueWithQuotes);
        java.lang.String target = gson.fromJson(jsonRepresentation, java.lang.String.class);
        junit.framework.Assert.assertEquals(valueWithQuotes, target);
    }

    public void testEscapingQuotesInStringSerialization_8() throws java.lang.Exception {
        java.lang.String valueWithQuotes = "beforeQuote\"afterQuote";
        java.lang.String jsonRepresentation = gson.toJson(valueWithQuotes);
        java.lang.String target = gson.fromJson(jsonRepresentation, java.lang.String.class);
        junit.framework.Assert.assertEquals(valueWithQuotes, target);
    }

    public void testEscapingQuotesInStringSerialization_7() throws java.lang.Exception {
        java.lang.String valueWithQuotes = "beforeQuote\"afterQuote";
        java.lang.String jsonRepresentation = gson.toJson(valueWithQuotes);
        java.lang.String target = gson.fromJson(jsonRepresentation, java.lang.String.class);
        junit.framework.Assert.assertEquals(valueWithQuotes, target);
    }

    public void testEscapingQuotesInStringSerialization_6() throws java.lang.Exception {
        java.lang.String valueWithQuotes = "beforeQuote\"afterQuote";
        java.lang.String jsonRepresentation = gson.toJson(valueWithQuotes);
        java.lang.String target = gson.fromJson(jsonRepresentation, java.lang.String.class);
        junit.framework.Assert.assertEquals(valueWithQuotes, target);
    }

    public void testEscapingQuotesInStringSerialization_5() throws java.lang.Exception {
        java.lang.String valueWithQuotes = "beforeQuote\"afterQuote";
        java.lang.String jsonRepresentation = gson.toJson(valueWithQuotes);
        java.lang.String target = gson.fromJson(jsonRepresentation, java.lang.String.class);
        junit.framework.Assert.assertEquals(valueWithQuotes, target);
    }

    public void testEscapingQuotesInStringSerialization_4() throws java.lang.Exception {
        java.lang.String valueWithQuotes = "beforeQuote\"afterQuote";
        java.lang.String jsonRepresentation = gson.toJson(valueWithQuotes);
        java.lang.String target = gson.fromJson(jsonRepresentation, java.lang.String.class);
        junit.framework.Assert.assertEquals(valueWithQuotes, target);
    }

    public void testEscapingQuotesInStringSerialization_3() throws java.lang.Exception {
        java.lang.String valueWithQuotes = "beforeQuote\"afterQuote";
        java.lang.String jsonRepresentation = gson.toJson(valueWithQuotes);
        java.lang.String target = gson.fromJson(jsonRepresentation, java.lang.String.class);
        junit.framework.Assert.assertEquals(valueWithQuotes, target);
    }

    public void testEscapingQuotesInStringSerialization_2() throws java.lang.Exception {
        java.lang.String valueWithQuotes = "beforeQuote\"afterQuote";
        java.lang.String jsonRepresentation = gson.toJson(valueWithQuotes);
        java.lang.String target = gson.fromJson(jsonRepresentation, java.lang.String.class);
        junit.framework.Assert.assertEquals(valueWithQuotes, target);
    }

    public void testEscapingQuotesInStringSerialization_1() throws java.lang.Exception {
        java.lang.String valueWithQuotes = "beforeQuote\"afterQuote";
        java.lang.String jsonRepresentation = gson.toJson(valueWithQuotes);
        java.lang.String target = gson.fromJson(jsonRepresentation, java.lang.String.class);
        junit.framework.Assert.assertEquals(valueWithQuotes, target);
    }

    public void testEscapingQuotesInStringSerialization_0() throws java.lang.Exception {
        java.lang.String valueWithQuotes = "beforeQuote\"afterQuote";
        java.lang.String jsonRepresentation = gson.toJson(valueWithQuotes);
        java.lang.String target = gson.fromJson(jsonRepresentation, java.lang.String.class);
        junit.framework.Assert.assertEquals(valueWithQuotes, target);
    }

    public void testEscapingQuotesInStringSerialization() throws java.lang.Exception {
        java.lang.String valueWithQuotes = "beforeQuote\"afterQuote";
        java.lang.String jsonRepresentation = gson.toJson(valueWithQuotes);
        java.lang.String target = gson.fromJson(jsonRepresentation, java.lang.String.class);
        junit.framework.Assert.assertEquals(valueWithQuotes, target);
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.StringTest_testEscapingQuotesInStringSerialization_10.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.StringTest", "testEscapingQuotesInStringSerialization");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}