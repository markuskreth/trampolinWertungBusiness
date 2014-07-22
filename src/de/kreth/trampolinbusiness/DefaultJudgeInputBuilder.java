package de.kreth.trampolinbusiness;

import java.text.DecimalFormat;

public class DefaultJudgeInputBuilder implements JudgeInputBuilder {

   private DecimalFormat nf;
//   private char decimalSeparator;
//   private int precision;
   @SuppressWarnings("unused")
   private double currentValue = 0;
//   private double teiler;
   
   
   public DefaultJudgeInputBuilder(int precision) {
//      teiler = Math.pow(10, precision);
//      this.precision = precision;
      nf = DecimalFormatHelper.getFormatter(precision);
//      decimalSeparator = nf.getDecimalFormatSymbols().getDecimalSeparator();
   }

   /**
    * 
    *     0, 1     ==> 0,1
    *     1        ==> 0,1
    *     1,2      ==> 1,2
    *     1,2,3    ==> 12,3
    *     1, ','   ==> 1,0
    */
   @Override
   public TextAndValue parse(char nextLetter) {
      
      double resultValue = 0;
      
      return buildResult(resultValue);
   }
   
   private TextAndValue buildResult(double value){      
      return new TextAndValue(value, nf.format(value) );
   }
   
//   private boolean isNumeric(String s) {
//      return s.matches("([-+]?\\d*)?" + (decimalSeparator=='.'?"\\.":decimalSeparator) + "?\\d+");
//   }

}
