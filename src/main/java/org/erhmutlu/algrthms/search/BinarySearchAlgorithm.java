package org.erhmutlu.algrthms.search;

import java.util.List;

public class BinarySearchAlgorithm{

    public static int apply(List<Integer> list, int term){
        int lower = 0;
        int upper = list.size();

        return apply(list, lower, upper, term);
    }

    private static int apply(List<Integer> list, int lower, int upper, int term){
        int mid = calculateMid(lower, upper);

        if (list.get(mid) == term){
            return mid;
        }

        if (mid == lower || mid == upper){
            return -1;
        }

        if (list.get(mid) < term){
            return apply(list, mid, upper, term);
        }else {
            return apply(list, lower, mid, term);
        }
    }

    private static int calculateMid(int lower, int upper){
        return lower + ((upper - lower) / 2);
    }
}
