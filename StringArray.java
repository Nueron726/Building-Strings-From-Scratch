
import java.awt.BorderLayout;
import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

public class StringArray {

    private char[] cArray;

    //constructor 1
    public StringArray() {
        //cArray;

    }

    public StringArray(char[] inArray) {
        cArray = inArray;
    }
    /**
     * Returns the char value at as specified index
     * @param index
     * @return
     * @throws IndexOutOfBoundsException 
     */
    public char charAt(int index) throws IndexOutOfBoundsException {
        if (index > cArray.length) {
            System.out.println("Index out of bounds");
        } else {
            char x = cArray[index];
            return x;
        }
        return 'x';
    }
    /**
     * Concatenates the specified string to the end of this string
     * @param str
     * @return 
     */
    public String concat(StringArray str) {
        String x = "";
        cArray.toString();
        String concat = cArray.toString();
        
        concat = concat + str;
        
        return concat;
        
    }

    public int compareTo(StringArray anotherString) //double check 1 vs -1 //length is a tie breaker -- if another string id bigger return -1
    {
        int largeLength = 0;

        
        int givenL = anotherString.cArray.length;
        int ourL = cArray.length;
        int result = -7;
        
        
      //  System.out.println("Test 1: " + givenL);
       // System.out.println("Test 2: " + ourL);

        //if anotherString is smaller
        if (givenL < ourL) {
            largeLength = givenL;
            
            //////////////////////////////////////////////////////////////////////
                              //  System.out.println("Test 5: " + givenL);

            //Iterates through the anotherString v 
            for (int i = 0; i < largeLength; i++)//anotherString
            {
                                 //   System.out.println("Test 6: " );


                if (result == 1 || result == -1) {
                                     //   System.out.println("Test 7: " );

                    return result;
                }
                if (anotherString.charAt(i) < cArray[i]) {
                                     //   System.out.println("Test 8: " );

                    result = -1;
                }

                if (anotherString.charAt(i) > cArray[i]) {
                                  //      System.out.println("Test 9: " );

                    result = 1;
                }

                if (anotherString.charAt(i) == cArray[i]) {
                                    //    System.out.println("Test 10: " );

                    result = 0;

                    if (givenL == ourL) {
                        result = 0;
                    }

                    if (givenL != ourL) {
                        if (givenL < ourL) {
                            result = -1;
                        }

                        if (givenL > ourL) {
                            result = 1;
                        }

                    }

                }

            }
            //////////////////////////////////////////////////////////////////////
                  //  System.out.println("Test 3: " );

            //result = -1;
        }

        //if cArray is smaller
        if (givenL >= ourL) {
            largeLength = ourL;
            
            //////////////////////////////////////////////////////////////
                              //  System.out.println("Test 5: " + givenL);

            //Iterates through the anotherString v 
            for (int i = 0; i < largeLength; i++)//anotherString
            {
                                 //   System.out.println("Test 6: " );


                if (result == 1 || result == -1) {
                                     //   System.out.println("Test 7: " );

                    return result;
                }
                if (anotherString.charAt(i) < cArray[i]) {
                                     //   System.out.println("Test 8: " );

                    result = -1;
                }

                if (anotherString.charAt(i) > cArray[i]) {
                                  //      System.out.println("Test 9: " );

                    result = 1;
                }

                if (anotherString.charAt(i) == cArray[i]) {
                                    //    System.out.println("Test 10: " );

                    result = 0;

                    if (givenL == ourL) {
                        result = 0;
                    }

                    if (givenL != ourL) {
                        if (givenL < ourL) {
                            result = -1;
                        }

                        if (givenL > ourL) {
                            result = 1;
                        }

                    }

                }

            }
            //////////////////////////////////////////////////////////////
              //      System.out.println("Test 4: " );

            //result = 1;
        }
                   // System.out.println("Test length: " + largeLength );

        //equal!!
        if (givenL == ourL) {
                  //  System.out.println("Test 5: " + givenL);

            //Iterates through the anotherString v 
            for (int i = 0; i < largeLength; i++)//anotherString
            {
                                 //   System.out.println("Test 6: " );


                if (result == 1 || result == -1) {
                                     //   System.out.println("Test 7: " );

                    return result;
                }
                if (anotherString.charAt(i) < cArray[i]) {
                                     //   System.out.println("Test 8: " );

                    result = -1;
                }

                if (anotherString.charAt(i) > cArray[i]) {
                                  //      System.out.println("Test 9: " );

                    result = 1;
                }

                if (anotherString.charAt(i) == cArray[i]) {
                                    //    System.out.println("Test 10: " );

                    result = 0;

                    if (givenL == ourL) {
                        result = 0;
                    }

                    if (givenL != ourL) {
                        if (givenL < ourL) {
                            result = -1;
                        }

                        if (givenL > ourL) {
                            result = 1;
                        }

                    }

                }

            }
        }
        return result;
    }

    /**
     * Works
     *
     * @param main
     * @param Substring
     * @return
     */
    public boolean contains(String main, String Substring) {
        boolean flag = false;
        if (main == null && main.trim().equals("")) {
            return flag;
        }
        if (Substring == null) {
            return flag;
        }

        char fullstring[] = main.toCharArray();
        char sub[] = Substring.toCharArray();
        int counter = 0;
        if (sub.length == 0) {
            flag = true;
            return flag;
        }

        for (int i = 0; i < fullstring.length; i++) {

            if (fullstring[i] == sub[counter]) {
                counter++;
            } else {
                counter = 0;
            }

            if (counter == sub.length) {
                flag = true;
                return flag;
            }

        }
        return flag;

    }

    /**
     * Works
     *
     * @param str
     * @param suffix
     * @return
     */
    public static boolean endsWith(String str, String suffix) {
        int n = suffix.length();
        int nn = str.length() - n;
        if (suffix.length() <= str.length() && str.substring(nn, str.length()).equals(suffix)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Works
     *
     * @param anObject
     * @return
     */
    public boolean equals(Object anObject) {

        if (anObject == this) {
            return true;
        } else {
            return true;
        }
    }

    /**
     * Unsure
     *
     * @param anotherString
     * @return
     */
    public boolean equalsIgnoreCase(StringArray anotherString) {
        
        String output = "";
        String utput = "";
        boolean result = true;
//        char[] temp = new char[anotherString.cArray.length];

       for(int i = 0; i < anotherString.cArray.length; i++)
       {
//           char k = anotherString(i);
           output = output + anotherString.cArray[i];
         //  char k = anotherString.toLowerCase(cArray[i]);
//           temp[i] = output.toLowerCase(cArray[i]);
//           char k = anotherString.toLowerString(cArray[i]);
          // output = output + anotherString.cArray[i].toLowerString();
       }
       
        System.out.println("OUTPUT: " + output.toLowerCase());
       
       for(int i = 0; i < cArray.length; i++)
       {
           utput +=  cArray[i];  
       }
                System.out.println("UTPUT: " + utput.toLowerCase());

        
       int k = output.compareTo(utput);
        
        if (k == 0){
            result = true;
        } 
        else
        {
            result = false;
        }
        return result;
    }

    /**
     * Works
     *
     * @param string
     * @param count
     * @return
     */
    public String indexOf(StringArray string, int count) {
        String result = "";
        int givenL = string.length();

        for (int i = 0; i < count; i++) {
            result = result + string.charAt(i);
            //result = result + i;
        }

        return Character.toString(result.charAt(result.length() - 1));
    }

    public boolean isEmpty() {
        return cArray.length == 0;
    }

    /**
     * Works
     *
     * @param ch
     * @param str
     * @return
     */
    public int lastIndexOf(char ch, String str) {
        if (str.charAt(str.length() - 1) == ch) {
            return str.length() - 1;
        }
        if (str.length() <= 1) {
            return -1;
        }
        return lastIndexOf(ch, str.substring(0, str.length() - 1));
    }

    public int length() {
        String x = "";
        int count = 0;
        for (char c : x.toCharArray()) {
            count++;
        }
        return count;
    }

    /**
     * works
     *
     * @param prefix
     * @param toffset
     * @return
     */
    public boolean startsWith(StringArray prefix) {
        int toffset = 0;
        char ta[] = cArray;
        int to = toffset;
        char pa[] = prefix.cArray;
        int po = 0;
        int pc = prefix.cArray.length;
        // Note: toffset might be near -1>>>1.
        if ((toffset < 0) || (toffset > cArray.length - pc)) {
            return false;
        }
        while (--pc >= 0) {
            if (ta[to++] != pa[po++]) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param beginIndex
     * @return
     */
    public String substring(int beginIndex) {
        String c = "";

        char[] temp = new char[cArray.length];
        if (beginIndex > cArray.length) {
            return "";
        } else {
            for (int i = beginIndex; i < cArray.length; i++) {
                c = c + cArray[i];
            }
        }
        return c;
    }

    /**
     *
     * @param beginINdex beginning of substring
     * @param endIndex Extend to the character at index
     * @return a new string that is a substring
     */
    public String substring(int beginIndex, int endIndex) {
        String c = "";

        char[] temp = new char[cArray.length];
        if (beginIndex > cArray.length) {
            return "";
        } else {
            for (int i = beginIndex; i < cArray.length && i <= endIndex; i++) {
                c = c + cArray[i];
//				
            }
        }
        return c;
        //return temp.toString();
    }


    /**
     * works
     * @return 
     */
   public String toooString() //NOTE
    {

        System.out.println("This Array contains ");
        String output = "";

        for (int i = 0; i < cArray.length; i++) {

            output += cArray[i];
            if (cArray[i] == ' ') {
                output += ' ';
            }

        }

        return output;

    }


}
