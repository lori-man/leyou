package org.Mercury.search.controller;

import org.Mercury.search.entity.SearchRequest;
import org.Mercury.search.entity.SearchResult;
import org.Mercury.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class SearchController {

    @Autowired
    private SearchService searchService;

    @PostMapping("page")
    public ResponseEntity<SearchResult> search(@RequestBody SearchRequest request) {
        SearchResult result = this.searchService.search(request);
        if (result == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(result);
    }
}
