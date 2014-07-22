package de.kreth.trampolinbusiness;


public interface JudgeInputBuilder {
   
   TextAndValue parse(char nextLetter);
   
   public class TextAndValue {
      private double value;
      private String text;
      
      TextAndValue(double value, String text) {
         super();
         this.value = value;
         this.text = text;
      }

      public double getValue() {
         return value;
      }
      
      public String getText() {
         return text;
      }
      
   }
}
