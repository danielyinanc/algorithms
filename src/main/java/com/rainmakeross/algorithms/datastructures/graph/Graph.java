package com.rainmakeross.algorithms.datastructures.graph;

import com.rainmakeross.algorithms.datastructures.node.Node;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    List<Node> nodes;
    public Graph() {
        nodes = new ArrayList<>();
    }

    public void addNode(Node node) {
        nodes.add(node);
    }
}
