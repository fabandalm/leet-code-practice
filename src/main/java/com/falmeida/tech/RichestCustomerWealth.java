package com.falmeida.tech;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RichestCustomerWealth {

    public static void main(String[] args) {

        int[][] accounts = {{1,2},{3,4}};

        for(int i = 0; i < accounts.length; i++){
            List<Integer> you  = Arrays.stream( accounts[i] ).boxed().collect( Collectors.toList() );
            System.out.println(you.stream().mapToInt(a -> a).sum());
        }
    }

}
