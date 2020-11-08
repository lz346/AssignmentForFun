package Collections;

import java.util.*;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        result.addAll(list1);
        result.addAll(list2);

        return result;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Integer sum = 0;
        for(Integer i : list1){
            sum += i;
        }
        for(Integer i : list2){
            sum += i;
        }
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        if (toRemove == null)
            return original;
        ArrayList<Integer> result = new ArrayList<Integer>();

        Iterator itr = original.iterator();
        while (itr.hasNext())
        {
            int x = (Integer)itr.next();
            if (x != toRemove)
                result.add(x);
        }
        return result;
    }

    public boolean happyList(ArrayList<String> original) {

        if (original.size() <= 1){
            return true;
        }
        else {
            for (int i = 1; i < original.size() ; i++){
                if (!checkHappy(original.get(i-1),original.get(i))){
                    return false;
                }
            }
        }

        return true;
    }

    private boolean checkHappy(String firstS, String secondS){
        Set<String> hashSet = new HashSet<String>(Arrays.asList(firstS.split("")));
        String[] stringList = secondS.split("");
        for (String chara:stringList){
            if (hashSet.contains(chara))
                return true;
        }
        return false;
    }
}
