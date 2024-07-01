package practice.kyu_4.binaryTree_sort_levels;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static List<Integer> treeByLevels(Node node)
    {
        // result list
        List<Integer> treeSortedByLevels = new ArrayList<>();

        // null check
        if (node == null) return treeSortedByLevels;

        // queue for level search
        List<Node> queue = new ArrayList<>();

        // add root
        queue.add(node);

        while (!queue.isEmpty()) {
            // get first node in queue
            Node firstNodeInQueue = queue.get(0);
            // add value to result list
            treeSortedByLevels.add(firstNodeInQueue.value);
            // add left child node to queue if exists
            if (firstNodeInQueue.left != null) queue.add(firstNodeInQueue.left);
            // add right child node to queue if exists
            if (firstNodeInQueue.right != null) queue.add(firstNodeInQueue.right);
            // remove first node from queue
            queue.remove(0);
        }
        return treeSortedByLevels;
    }
}
