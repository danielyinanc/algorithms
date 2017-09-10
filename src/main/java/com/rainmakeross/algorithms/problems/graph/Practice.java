package com.rainmakeross.algorithms.problems.graph;

import com.rainmakeross.algorithms.datastructures.edge.Edge;
import com.rainmakeross.algorithms.datastructures.graph.Graph;
import com.rainmakeross.algorithms.datastructures.node.Node;

import java.util.Stack;

public class Practice {
    public static void main(String[] args) {
        Stack<Node> nodeStack = new Stack<>();

    }

    static Graph createGraph() {
        Graph graph = new Graph();
        Node zero = new Node();
        zero.name = "0";
        Node one = new Node();
        one.name = "1";
        Node two = new Node();
        two.name = "2";
        Node three = new Node();
        three.name = "3";
        Node four = new Node();
        four.name = "4";

        Edge zeroToThree = new Edge();
        zeroToThree.start = zero;
        zeroToThree.end = three;

        Edge threeToFour = new Edge();
        threeToFour.start = three;
        threeToFour.end = four;

        Edge fourToZero = new Edge();
        fourToZero.start = four;
        fourToZero.end = zero;

        Edge zeroToTwo = new Edge();
        zeroToTwo.start = zero;
        zeroToTwo.end = two;

        Edge twoToOne = new Edge();
        twoToOne.start = two;
        twoToOne.end = one;

        graph.addNode(zero);
        graph.addNode(one);
        graph.addNode(two);
        graph.addNode(three);
        graph.addNode(four);

        return graph;
    }
}
