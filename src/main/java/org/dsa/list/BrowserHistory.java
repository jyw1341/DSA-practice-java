package org.dsa.list;

import java.util.LinkedList;

public class BrowserHistory {

    private LinkedList<String> browserHistory;
    private int currentIndex;

    BrowserHistory(String homepage) {
        browserHistory = new LinkedList<>();
        browserHistory.add(homepage);
    }

    public void visit(String url) {
        while (currentIndex < browserHistory.size() - 1) {
            browserHistory.removeLast();
        }
        browserHistory.add(url);
        currentIndex++;

    }

    public String back(int steps) {
        int maxSteps = currentIndex;
        if (steps > maxSteps) {
            currentIndex -= maxSteps;
            return browserHistory.get(currentIndex);
        }
        String result = browserHistory.get(currentIndex - steps);
        currentIndex -= steps;
        return result;
    }

    public String forward(int steps) {
        int maxSteps = browserHistory.size() - 1 - currentIndex;
        if (steps > maxSteps) {
            currentIndex += maxSteps;
            return browserHistory.get(currentIndex);
        }
        String result = browserHistory.get(currentIndex + steps);
        currentIndex += steps;
        return result;

    }
}


