package edu.qc.seclass;

public class MyCustomString implements MyCustomStringInterface {

    private String data;
    /**
     * Returns the current string. If the string is null, it should return null.
     *
     * @return Current string
     */
    @Override
    public String getString() {
        return data;
    }

    /**
     * Sets the value of the current string.
     *
     * @param string The value to be set
     */
    @Override
    public void setString(String string) {
        data=string;
    }

    /**
     * Returns the number of numbers in the current string, where a number is defined as a
     * contiguous sequence of digits.
     * <p>
     * If the current string is empty, the method should return 0.
     * <p>
     * Examples:
     * - countNumbers would return 2 for string "My numbers are 11 and 96".
     *
     * @return Number of numbers in the current string
     * @throws NullPointerException If the current string is null
     */
    @Override
    public int countNumbers() {
        if (data == null) {
            throw new NullPointerException("The string is null");
        }
        int nums= 0;
        boolean isNum = false;
        for (char c : data.toCharArray()) {
            if (c>='0'&&c<='9') {
                if (!isNum) {
                    isNum = true;
                    nums++;
                }
            } else {
                isNum = false;
            }
        }
        return nums;
    }

    /**
     * Returns a string that consists of all and only the characters in positions n, 2n, 3n, and
     * so on in the current string, starting either from the beginning or from the end of the
     * string. The characters in the resulting string should be in the same order and with the
     * same case as in the current string.
     * <p>
     * If the current string is empty or has less than n characters, the method should return an
     * empty string.
     * <p>
     * Examples:
     * - For n=2 and a string of one character, the method would return an empty string.
     * - For n=2 and startFromEnd=false, the method would return the 2nd, 4th, 6th, and so on
     * characters in the string.
     * - For n=3 and startFromEnd=true, the method would return the 3rd from the last character
     * in the string, 6th from the last character in the string, and so on (in the order in
     * which they appear in the string).
     * <p>
     * Values n and startFromEnd are passed as parameters. The starting character, whether it is
     * the first one or the last one in the string, is considered to be in Position 1.
     *
     * @param n            Determines the positions of the characters to be returned
     * @param startFromEnd Determines whether to start counting from the end or from the
     *                     beginning when identifying the characters in position n, 2n, 3n, and so
     *                     on. Please note that the characters are always returned in the order in
     *                     which they appear in the string.
     * @return String made of characters at positions n, 2n, and so on in the current string
     * @throws IllegalArgumentException If "n" less than or equal to zero
     * @throws NullPointerException     If the current string is null and "n" is greater than zero
     */
    @Override
    public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd) {
        if (this.data == null && n > 0) {
            throw new NullPointerException();
        }
        if (n <= 0) {
            throw new IllegalArgumentException("the first argument must be greater than zero");
        }
        int i=n;
        String chars="";
        while(i<=data.length()){
            char c=data.charAt((startFromEnd?data.length()-i:i-1));

            if(startFromEnd)
                chars=c+chars;
            else
            chars=chars+c;
            i+=n;
        }
        return chars;
    }

    /**
     * Replace the individual digits in the current string, between startPosition and endPosition
     * (included), with the corresponding English names of those digits, with the first letter
     * capitalized. The first character in the string is considered to be in Position 1.
     * Unlike for the previous method, digits are converted individually, even if contiguous.
     * <p>
     * Examples:
     * - String 460 would be converted to FourSixZero
     * - String 416 would be converted to FourOneSix
     *
     * @param startPosition Position of the first character to consider
     * @param endPosition   Position of the last character to consider
     * @throws IllegalArgumentException    If "startPosition" > "endPosition"
     * @throws MyIndexOutOfBoundsException If "startPosition" <= "endPosition", but either
     *                                     "startPosition" or "endPosition" are out of
     *                                     bounds (i.e., either less than 1 or greater than the
     *                                     length of the string)
     * @throws NullPointerException        If "startPosition" <= "endPosition", "startPosition" and
     *                                     "endPosition" are greater than 0, and the current
     *                                     string is null
     */
    @Override
    public void convertDigitsToNamesInSubstring(int startPosition, int endPosition) {
        String news="";
        if(data==null)
            news=null;
        if (startPosition > endPosition) {
            throw new IllegalArgumentException();
        }
        else if (startPosition <= 0 || endPosition <= 0 || startPosition > this.data.length() || endPosition > this.data.length()) {
            throw new MyIndexOutOfBoundsException();
        }
        if (this.data == null) {
            throw new NullPointerException();
        }
        if(data!=null)
        for (int i=0;i<data.length();i++) {

            char c=data.charAt(i);
            if (c>='0'&&c<='9' && i>=startPosition-1 && i<endPosition){
                String digit="";
                switch (Integer.parseInt(c+"")) {
                    case 0:
                        digit= "Zero";
                        break;
                    case 1:
                        digit= "One";
                        break;
                    case 2:
                        digit= "Two";
                        break;
                    case 3:
                        digit= "Three";
                        break;
                    case 4:
                        digit= "Four";
                        break;
                    case 5:
                        digit= "Five";
                        break;
                    case 6:
                        digit= "Six";
                        break;
                    case 7:
                        digit= "Seven";
                        break;
                    case 8:
                        digit= "Eight";
                        break;
                    case 9:
                        digit= "Nine";
                        break;
                }
             news+=digit;
            }
            else {
                news += c;
            }
        }
        data=news;
    }
}
