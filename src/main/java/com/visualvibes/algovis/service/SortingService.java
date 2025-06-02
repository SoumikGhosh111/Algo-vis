package com.visualvibes.algovis.service;



import com.visualvibes.algovis.model.AlgorithmStep;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SortingService {
    public List<AlgorithmStep> bubbleSort(List<Integer> input){
        List<AlgorithmStep> step = new ArrayList<>();
        List<Integer> arr = new ArrayList<>(input);

        int n = arr.size() ;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j< n - i- 1; j ++) {
                List<Integer> compared = List.of(j, j + 1);
                List<Integer> swapped = new ArrayList<>();

                 if( arr.get(j) > arr.get(j + 1) ) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                    swapped = List.of(j, j + 1);
                }

                 List<Integer >sorted = new ArrayList<>();
                 for(int k = n - i; k < n; k++){
                     sorted.add(k);
                 }

                step.add(new AlgorithmStep(
                        new ArrayList<>(arr),
                        swapped.isEmpty() ? "Compared" : "Swapped " + arr.get(j) + " and " + arr.get(j + 1),
                        compared,
                        swapped,
                        sorted
                ));

            }
        }
        return step;
    }
}
