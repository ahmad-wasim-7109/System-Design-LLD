package src.main.java.com.lld.MovieTicketBookingApplication.src.main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TheatreController {
    Map<City, List<Theatre>> theatureMap;
    List<Theatre> allTheatres;

    public TheatreController() {
        theatureMap = new HashMap<>();
        allTheatres = new ArrayList<>();
    }

    public void addTheature(City city, Theatre theatre) {
        theatureMap.computeIfAbsent(city, v -> new ArrayList<>());
        theatureMap.get(city).add(theatre);
        allTheatres.add(theatre);
    }

    public Map<Theatre,List<Show>> getAllShows(City city, Movie movieByCityName) {
        Map<Theatre, List<Show>> map = new HashMap<>();
        List<Theatre> theatres = theatureMap.get(city);
        if(theatres.isEmpty()) return map;
        for(Theatre theatre : theatres) {
            if(!theatre.getShows().isEmpty()) {

                List<Show> list = theatre.getShows().stream()
                        .filter(show -> show.getMovie() == movieByCityName)
                        .toList();
                map.put(theatre, list);
            }
        }
        return map;
    }
}
