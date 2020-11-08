package Collections;

import java.util.*;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {

        Set<Map.Entry<String, String>> entries = map.entrySet();

        List<String> result = new ArrayList<String>();
        for( Map.Entry<String, String> entry : entries ){
            if(entry.getValue().equals(value)){
                result.add(entry.getKey());
            }
        }
        return result.toArray();
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer, Integer> result = new TreeMap<Integer, Integer>();
        switch (size){
            case 0:
                return result;
            case 1:
                result.put(1,1);
                return result;
            case 2:
                result.put(1,1);
                result.put(2,1);
                return result;
            default:
                result.put(1,1);
                result.put(2,1);
                for (int i = 3; i <= size; i++){
                    result.put(i,result.get(i-1)+result.get(i-2));
                }
                return result;
        }
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer, Integer> result = new TreeMap<Integer, Integer>();
        switch (size){
            case 0:
                return result;
            case 1:
                result.put(1,first);
                return result;
            case 2:
                result.put(1,first);
                result.put(2,second);
                return result;
            default:
                result.put(1,first);
                result.put(2,second);
                for (int i = 3; i <= size; i++){
                    result.put(i,result.get(i-1)+result.get(i-2));
                }
                return result;
        }
    }
}
