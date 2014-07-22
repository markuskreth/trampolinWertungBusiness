package de.kreth.trampolinbusiness;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;


public class DecimalFormatHelper {
   static Map<Integer, String> cache = new HashMap<>();
   
   public static DecimalFormat getFormatter(int precision) {
      String cacheFormat = cache.get(Integer.valueOf(precision));
      
      if(cacheFormat != null)
         return new DecimalFormat(cacheFormat);
      
      StringBuilder format = new StringBuilder("##0.");
      
      for (int i=0; i<precision; i++)
         format.append(0);
      
      DecimalFormat df = new DecimalFormat(format.toString());
      cache.put(Integer.valueOf(precision), format.toString());
      return df;
   }

}
