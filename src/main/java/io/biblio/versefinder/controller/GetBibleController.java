package io.biblio.versefinder.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetBibleController {

    @GetMapping("/getChapter/{chapter}/{version}")
    public ResponseEntity getChapter(@PathVariable String chapter, @PathVariable String version){


        return new ResponseEntity(HttpStatus.OK);
    }
}
