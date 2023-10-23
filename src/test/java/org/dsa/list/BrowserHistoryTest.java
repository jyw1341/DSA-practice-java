package org.dsa.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BrowserHistoryTest {

    @Test
    @DisplayName("")
    void testBrowserHistory() {
        //given
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        //when
        browserHistory.visit("google.com");
        browserHistory.visit("facebook.com");
        browserHistory.visit("youtube.com");
        //then
        Assertions.assertEquals(browserHistory.back(1), "facebook.com");
        Assertions.assertEquals(browserHistory.back(1), "google.com");
        Assertions.assertEquals(browserHistory.forward(1), "facebook.com");
        browserHistory.visit("linkedin.com");
        Assertions.assertEquals(browserHistory.forward(2), "linkedin.com");
        Assertions.assertEquals(browserHistory.back(2), "google.com");
    }

    @Test
    @DisplayName("")
    void testBrowserHistory2() {
        //given
        BrowserHistory2 browserHistory = new BrowserHistory2("leetcode.com");
        //when
        browserHistory.visit("google.com");
        browserHistory.visit("facebook.com");
        browserHistory.visit("youtube.com");
        //then
        Assertions.assertEquals(browserHistory.back(1), "facebook.com");
        Assertions.assertEquals(browserHistory.back(1), "google.com");
        Assertions.assertEquals(browserHistory.forward(1), "facebook.com");
        browserHistory.visit("linkedin.com");
        Assertions.assertEquals(browserHistory.forward(2), "linkedin.com");
        Assertions.assertEquals(browserHistory.back(2), "google.com");
    }


}