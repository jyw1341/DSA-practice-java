package org.dsa.list;

public class BrowserHistory2 {
    private HistoryNode head;
    private HistoryNode current;

    BrowserHistory2(String url) {
        HistoryNode historyNode = new HistoryNode(null, url, null);
        this.head = historyNode;
        this.current = historyNode;
    }

    public void visit(String url) {
        HistoryNode historyNode = new HistoryNode(this.current, url, null);
        this.current.next = historyNode;
        this.current = historyNode;
    }

    public String back(int steps) {
        while (current.previous != null && steps != 0) {
            steps--;
            current = current.previous;
        }
        return current.element;
    }

    public String forward(int steps) {
        while (current.next != null && steps != 0) {
            steps--;
            current = current.next;
        }
        return current.element;
    }

    private static class HistoryNode {
        HistoryNode previous;
        HistoryNode next;
        String element;

        HistoryNode(HistoryNode previous, String element, HistoryNode next) {
            this.previous = previous;
            this.element = element;
            this.next = next;
        }
    }
}
