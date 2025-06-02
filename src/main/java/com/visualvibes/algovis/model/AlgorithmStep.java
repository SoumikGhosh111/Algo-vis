package com.visualvibes.algovis.model;
import java.util.List;
public class AlgorithmStep {
    private List<Integer> state;
    private String description;



//    tracers
    private List<Integer> comparedIndices;
    private List<Integer> swappedIndices;
    private List<Integer> sortedIndices;

    public AlgorithmStep(List<Integer> state, String description, List<Integer> comparedIndices, List<Integer> swappedIndices, List<Integer> sortedIndices) {
        this.state = state;
        this.description = description;
        this.comparedIndices = comparedIndices;
        this.swappedIndices = swappedIndices;
        this.sortedIndices = sortedIndices;
    }

    public List<Integer> getState() {
        return state;
    }

    public String getDescription() {
        return description;
    }

    public List<Integer> getComparedIndices() {
        return comparedIndices;
    }

    public List<Integer> getSwappedIndices() {
        return swappedIndices;
    }

    public List<Integer> getSortedIndices() {
        return sortedIndices;
    }
}
