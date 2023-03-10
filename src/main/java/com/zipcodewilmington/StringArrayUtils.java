package com.zipcodewilmington;

import org.codehaus.plexus.util.StringUtils;

import javax.print.DocFlavor;
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.*;

import static javax.management.Query.value;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String s : array) {
            if (s.equals(value)) ;
            return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        ;
        Collections.reverse(Arrays.asList(array));
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        ArrayList<String> arr = new ArrayList<>();

        Collections.addAll(arr, array);

        reverse(array);

        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(arr.get(i))) {
                return false;
            }

        }

        return true;

    }


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {


        String phrase = Arrays.toString(array).toLowerCase();
        for (char i = 'a'; i <= 'z'; i++) {
            if (phrase.indexOf(i) == -1) {
                return false;
            }
        }
        return true;

    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(value))
                count++;
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> list = new ArrayList<>();

        for (String s : array) {
            list.add(s);
        }
        list.remove(valueToRemove);
        return list.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> list = new ArrayList<>();
        list.add(array[0]);

        for (int i = 1; i < array.length; i++) {
            if (!Objects.equals(array[i], array[i - 1])) {
                list.add(array[i]);
            }
        }
        return list.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

            ArrayList<String> duplicateArrayList = new ArrayList<>();
            String temp = array[0];

            for(int i = 1; i < array.length; i++) {
                if(array[i-1] == array[i]) {
                    temp = temp + array[i];
                } else {
                    duplicateArrayList.add(temp);
                    temp = array[i];
                }
            }
            duplicateArrayList.add(temp);
            return duplicateArrayList.toArray(new String[0]);
        }
    }


