package Kap11Exercise14;

import java.util.HashMap;
import java.util.Map;

public class Opgave14
{
    /*
    Write a method intersect that accepts two maps whose keys are strings
    and whose values are integers as parameters and returns a new map containing
    only the key/value pairs that exist in both of the parameter maps.
    In order for a key/value pair to be included in your result, not only do both
    maps need to contain a mapping for that key, but they need to map it to the same value.
    For example, if the two maps passed are
    {Janet=87, Logan=62, Whitaker=46, Alyssa=100, Stefanie=80, Jeff=88, Kim=52, Sylvia=95} and
    {Logan=62, Kim=52, Whitaker=52, Jeff=88, Stefanie=80, Brian=60, Lisa=83, Sylvia=87},
    your method would return the following new map (the order of the key/value pairs does not matter):
    {Logan=62, Stefanie=80, Jeff=88, Kim=52}.
    */

    public static void main(String[] args)
    {
        Map<String, Integer> theFirstMap = new HashMap<>();
        theFirstMap.put("Janet", 87);
        theFirstMap.put("Logan", 62);
        theFirstMap.put("Whitaker", 46);
        theFirstMap.put("Alyssa", 100);
        theFirstMap.put("Stefanie", 80);
        theFirstMap.put("Jeff", 88);
        theFirstMap.put("Kim", 52);
        theFirstMap.put("Sylvia", 95);

        Map<String, Integer> theSecondMap = new HashMap<>();
        theSecondMap.put("Logan", 62);
        theSecondMap.put("Kim", 52);
        theSecondMap.put("Withalker", 52);
        theSecondMap.put("Jeff", 88);
        theSecondMap.put("Stefanie", 80);
        theSecondMap.put("Brian", 60);
        theSecondMap.put("Lisa", 83);
        theSecondMap.put("Sylvia", 87);

        System.out.println(intersect(theFirstMap, theSecondMap));

    }

    public static Map<String, Integer> intersect(Map<String, Integer> mapOne, Map<String, Integer> mapTwo)
    {
        Map<String, Integer> intersectMap = new HashMap<>();

        for (String key : mapOne.keySet())
        {
            if (mapTwo.containsKey(key) && mapOne.get(key).equals(mapTwo.get(key)))
            {
                intersectMap.put(key, mapOne.get(key));
            }
        }

        return intersectMap;
    }
}
