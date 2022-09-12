package io.biblio.versefinder.controller;

import com.biblio.finder.api.FinderApi;
import com.biblio.finder.api.model.Verse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class FinderController implements FinderApi {
    
    @Override
    public ResponseEntity<Verse> getVerse() {
        return null;
    }
}
