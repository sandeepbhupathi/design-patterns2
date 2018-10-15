package test;

import java.util.*;
import java.util.stream.Collectors;

public class TestMain {
    public static void main(String[] args) {

        Map<Integer,SampleTest> sampleTestMap = new HashMap<>();
        sampleTestMap.put(1,new SampleTest(1,"test"));
        sampleTestMap.put(6,new SampleTest(6,"test6"));
        sampleTestMap.put(3,new SampleTest(3,"test3"));
        sampleTestMap.put(4,new SampleTest(4,"test4"));
        sampleTestMap.put(2,new SampleTest(2,"test2"));
        sampleTestMap.put(5,new SampleTest(5,"test5"));

        //TreeMap<Integer,SampleTest> sampleTestTreeMap = new TreeMap<>(sampleTestMap);

        sampleTestMap.entrySet().stream()
                .sorted((map1,map2)->{ int mapKey1 = map1.getKey();
                    int mapKey2 = map2.getKey();

                    if (mapKey1 > mapKey2) {
                        return 1;
                    } else if (mapKey1 < mapKey2) {
                        return -1;
                    } else {
                        return 0;
                    }})
                .collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));


      /*  Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "C"); // "duplicate" value*/

        System.out.print(sampleTestMap);
        //System.out.println(entriesSortedByValues(map));
    }

   /* static <K,V extends Comparable<? super V>>
    List<Map.Entry<K, V>> entriesSortedByValues(Map<K,V> map) {

        List<Map.Entry<K,V>> sortedEntries = new ArrayList<Map.Entry<K,V>>(map.entrySet());

        Collections.sort(sortedEntries,
                new Comparator<Map.Entry<K,V>>() {
                    @Override
                    public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
                        return e2.getKey().
                    }
                }
        );

        return sortedEntries;
    }*/
}
