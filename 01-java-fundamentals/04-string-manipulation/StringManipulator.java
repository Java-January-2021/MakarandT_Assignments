public class StringManipulator {

    // String trimAndConcat(String, String): Trim both input strings and then
    // concatenate them. Return the new string. Feel free to use the trim method of
    // the String class.
    public String trimAndConcat(String s1, String s2) {
        s1 = s1.trim();
        s2 = s2.trim();
        String s3 = s1.concat(s2);
        return s3;
    }

    // Integer getIndexOrNull(String, char): Get the index of the character and
    // return either the index or null. If the character appears multiple times,
    // return the first index. Feel free to use the indexOf method of the String
    // class.
    public Integer getIndexOrNull(String str1, char char1) {
        if (str1.indexOf(char1) == -1) {
            return null;
        } else {
            return str1.indexOf(char1);
            // System.out.println(str1.indexf(char1));
        }
    }

    // Integer getIndexOrNull(String, String): Get the index of the start of the
    // substring and return either the index or null. Feel free to use the indexOf
    // method of the String class.
    public Integer getIndexOrNull (String str3, String str4){
            if (str3.indexOf(str4) == -1) {
                return null;
            } else {
                return str3.indexOf(str4);
                // System.out.println(str1.indexf(char1));
            }

        }
    //

    public String concatSubstring(String str5, int int2, int int3, String str6){
        
        return str5.substring(1 ,2).concat(str6); //eworld 
    }


}



