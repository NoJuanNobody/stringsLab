package driverslicense;

/**
 * Created by alejandrolondono on 5/30/16.
 */
public class MyStringUtils {

    /**
     * Combine an array of characters or Strings into one String, separated by commas
     * @return
     */
    public static String arrayToString(String[] stringArray){
        return String.join("", stringArray);

    }

    /**
     * Break a String up into an array of Strings, one for each line in the original String
     * @return
     */
    public static String[] splitByLines(String paragraph){

        return paragraph.split("\\n");
    }

    /**
     * Given a string, rEVERSE-cAPITALIZE eVERY wORD iN tHE sTRING aND rETURN tHE rESULT.
     * @return
     */
    public static String reverseCaps(String string){
        String[] wordsArray = string.split(" ");
        StringBuilder returnedString = new StringBuilder();
        for(String word : wordsArray){
            returnedString.append(word.substring(0,1).toLowerCase()+word.substring(1).toUpperCase()+" ");
        }
        return returnedString.toString();
    }

    /**
     * Given a String, reverse each word in the string and return the result.
     * @return
     */
    public static String reverseWords(String string){
        String[] stringArray = string.split(" ");
        StringBuilder reverse= new StringBuilder();
        for(String word : stringArray){
            reverse.append(new StringBuffer(word).reverse().toString());
            if(reverse.toString().split(" ").length == stringArray.length){
                reverse.append(".");
            }else{
                reverse.append(" ");
            }
        }
        return reverse.toString();
    }


}
