package io.biblio.versefinder.service.getBible;

import com.biblio.finder.api.model.Verse;
import org.springframework.stereotype.Service;

@Service
public interface GetBibleService {
    public Verse getVerse(String number);
}
