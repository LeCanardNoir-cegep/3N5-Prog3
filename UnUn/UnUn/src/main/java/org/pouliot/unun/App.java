package org.pouliot.unun;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(UnUn(args[0]));
    }
    public static String UnUn(String source)
    {
        char[] scrArr = source.toCharArray();
        char currentChar = scrArr[0];
        int count = 0;
        String result= "";
        for (int i = 0; i < scrArr.length; i++) {
            if( scrArr[i] == currentChar ){
                count ++;
                result += i == scrArr.length -1 ? String.valueOf(count) + currentChar: "";
            }else{
                result += String.valueOf(count) + currentChar;
                count = 0;
                currentChar = scrArr[i];
                i --;
            }
        }
        return result;
    }
}
