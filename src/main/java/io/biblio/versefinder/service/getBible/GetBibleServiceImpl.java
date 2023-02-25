package io.biblio.versefinder.service.getBible;

import com.biblio.finder.api.model.Verse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.reactive.function.client.WebClient;

public class GetBibleServiceImpl implements GetBibleService {

    @Value("${getBible-url-v2}")
    String getBibleUrl;

    @Override
    public Verse getVerse(String verseNumber) {


        
       String uri = getBibleUrl + "/" + verseNumber;

        WebClient webClient = WebClient.builder()
                .build();

        webClient
                .get()
                .uri(uri)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        return new Verse().verseMessage("Shit");
    }
}
