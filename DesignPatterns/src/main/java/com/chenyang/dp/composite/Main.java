package com.chenyang.dp.composite;

import java.util.ArrayList;
import java.util.List;

abstract class Node {
    public abstract void print();
}

class BranchNode extends Node {

    String name;
    List<Node> nodes = new ArrayList<>();

    public BranchNode(String name) {
        this.name = name;
    }

    public void add(Node node) {
        nodes.add(node);
    }

    @Override
    public void print() {
        System.out.print("--");
        System.out.println(name);
    }
}

class LeafNode extends Node {
    String content;

    public LeafNode(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(content);
    }
}

public class Main {
    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode branch1 = new BranchNode("branch1");
        BranchNode branch2 = new BranchNode("branch2");
        root.add(branch1);
        root.add(branch2);

        LeafNode leaf1 = new LeafNode("leaf1");
        LeafNode leaf2 = new LeafNode("leaf2");
        branch1.add(leaf1);
        branch1.add(leaf2);

        LeafNode leaf3 = new LeafNode("leaf3");
        LeafNode leaf4 = new LeafNode("leaf4");
        LeafNode leaf5 = new LeafNode("leaf5");
        branch2.add(leaf3);
        branch2.add(leaf4);
        branch2.add(leaf5);

        print(root);
    }

    public static void print(Node node) {
        node.print();
        if (node instanceof BranchNode) {
            for (Node node1 : ((BranchNode) node).nodes) {
                print(node1);
            }
        }
    }
}
