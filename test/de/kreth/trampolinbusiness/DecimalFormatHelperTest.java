package de.kreth.trampolinbusiness;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Before;
import org.junit.Test;

import de.kreth.trampolinbusiness.DecimalFormatHelper;

public class DecimalFormatHelperTest {

   @Before
   public void setUp() throws Exception {
      DecimalFormatHelper.cache.clear();
   }

   @Test
   public void testFormatterPrecision1ValZero() {
      DecimalFormat formatter = DecimalFormatHelper.getFormatter(1);
      String expected = "0,0";

      String actual = formatter.format(0.0001);
      assertEquals(expected, actual);

      actual = formatter.format(.0);
      assertEquals(expected, actual);

      actual = formatter.format(0.0);
      assertEquals(expected, actual);

      actual = formatter.format(0);
      assertEquals(expected, actual);
   }

   @Test
   public void testFormatterPrecision1DiffValues() {

      DecimalFormat formatter = DecimalFormatHelper.getFormatter(1);
      String expected = "8,1";

      String actual = formatter.format(8.1);
      assertEquals(expected, actual);

      actual = formatter.format(8.10);
      assertEquals(expected, actual);

      expected = "10,4";
      actual = formatter.format(10.4);
      assertEquals(expected, actual);

      expected = "17,4";
      actual = formatter.format(17.4);
      assertEquals(expected, actual);

      expected = "123456,4";
      actual = formatter.format(123456.4);
      assertEquals(expected, actual);
   }

   @Test
   public void testFormatterPrecision2DiffValues() {

      DecimalFormat formatter = DecimalFormatHelper.getFormatter(2);
      String expected = "8,10";

      String actual = formatter.format(8.1);
      assertEquals(expected, actual);

      actual = formatter.format(8.10);
      assertEquals(expected, actual);

      expected = "10,40";
      actual = formatter.format(10.4);
      assertEquals(expected, actual);

      expected = "17,43";
      actual = formatter.format(17.430);
      assertEquals(expected, actual);

      expected = "123456,46";
      actual = formatter.format(123456.46213);
      assertEquals(expected, actual);
   }

}
