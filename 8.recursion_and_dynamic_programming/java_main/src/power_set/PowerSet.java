package power_set;

import java.util.ArrayList;


public class PowerSet {
    //n*2^n
    ArrayList<ArrayList<Integer>> getSubset(ArrayList<Integer> set, int num) {
        ArrayList<ArrayList<Integer>> allSubset = new ArrayList<>();
        if (set.size() == num) {
            ArrayList<Integer> emptySubset = new ArrayList<>();
            allSubset.add(emptySubset);
        } else {
            allSubset = getSubset(set, num + 1);
            ArrayList<ArrayList<Integer>> more = new ArrayList<>();
            int num_from_set = set.get(num);
            for (ArrayList<Integer> sub : allSubset) {
                ArrayList<Integer> newSubset = new ArrayList<>();
                newSubset.add(num_from_set);
                newSubset.addAll(sub);
                more.add(newSubset);
            }
            allSubset.addAll(more);
        }
        return allSubset;
    }

    //logn * 2^n

    ArrayList<Integer> convertIntToSet(int sub_set_ind, ArrayList<Integer> set) {
        ArrayList<Integer> targetSubset = new ArrayList<>();
        int index = 0;
        for (int k = sub_set_ind; k > 0; k>>=1) {
            if ((k & 1) == 1) { //check odd number
                int value = set.get(index);
                targetSubset.add(value);
            }
            index++;
        }
        return targetSubset;
    }
    ArrayList<ArrayList<Integer>> getSubset2(ArrayList<Integer> set) {
        ArrayList<ArrayList<Integer>> allSubset = new ArrayList<>();
        int max = 1 << set.size();
        for (int index = 0; index < max; index++) {
            ArrayList<Integer> newSubset = convertIntToSet(index, set);
            allSubset.add(newSubset);
        }
        return allSubset;
    }
}
