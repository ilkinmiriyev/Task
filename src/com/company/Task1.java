package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static int carParkingRoof(int[] cars, int k ){
        if (cars.length == 0 || k < 0) {
            return 0;
        }
        List<Integer> list = Arrays.stream(cars).sorted().boxed().collect(Collectors.toList());
        long minDist = Long.MAX_VALUE;
        for (int i = 0; i <= cars.length - k; i++) {
            minDist = Math.min(minDist, list.get(i + k - 1) - list.get(i));
        }
        return (int) (minDist + 1);
    }
}
