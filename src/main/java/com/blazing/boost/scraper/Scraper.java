package com.blazing.boost.scraper;

import org.springframework.http.HttpHeaders;

public interface Scraper {
    HttpHeaders getRequestHeaders(String cookie);
}
