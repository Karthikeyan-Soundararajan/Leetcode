package Sep_2023.sep14;

import java.util.*;

public class FlightItinerary {
    public List<String> findItinerary(List<List<String>> tickets) {
        LinkedList<String> itineraryPath = new LinkedList<String>();
        Map<String, PriorityQueue<String>> flightsBasedOnOrigin = new HashMap<>();
        for (List<String> currentTicket : tickets) {
            flightsBasedOnOrigin.putIfAbsent(currentTicket.get(0), new PriorityQueue<>());
            flightsBasedOnOrigin.get(currentTicket.get(0)).add(currentTicket.get(1));
        }
        LinkedList<String> stack = new LinkedList<String>();
        stack.add("JFK");
        while (!stack.isEmpty()){
            while (flightsBasedOnOrigin.getOrDefault(stack.peekLast(), new PriorityQueue<>()).size() > 0) {
                stack.add(flightsBasedOnOrigin.get(stack.peekLast()).poll());
            }
            itineraryPath.addFirst(stack.pollLast());
        }
        return  itineraryPath;
    }

    public static void main(String[] args) {
        FlightItinerary flightItinerary = new FlightItinerary();
        List<String> flightPath1 = new ArrayList<>(){
            {
                add("JFK");
                add("SFO");
            }
        };
        List<String> flightPath2 = new ArrayList<>(){
            {
                add("JFK");
                add("ATL");
            }
        };
        List<String> flightPath3 = new ArrayList<>(){
            {
                add("SFO");
                add("ATL");
            }
        };
        List<String> flightPath4 = new ArrayList<>(){
            {
                add("ATL");
                add("JFK");
            }
        };
        List<String> flightPath5 = new ArrayList<>(){
            {
                add("ATL");
                add("SFO");
            }
        };
        List<List<String>> availableFlights = new ArrayList<>(){
            {
                add(flightPath1);
                add(flightPath2);
                add(flightPath3);
                add(flightPath4);
                add(flightPath5);
            }
        };
        System.out.println(flightItinerary.findItinerary(availableFlights));
    }
}
