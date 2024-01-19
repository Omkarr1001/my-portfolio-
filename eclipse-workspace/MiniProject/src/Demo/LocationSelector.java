package Demo;

import java.util.*;

public class LocationSelector {
    public static void main(String[] args) {
       
        Map<String, List<String>> country = new HashMap<>();

        	
        country.put("USA", Arrays.asList("New York", "California", "Texas"));
        
        country.put("India", Arrays.asList("Maharashtra", "Tamil Nadu", "Karnataka"));

        
        Map<String, List<String>> ToCities = new HashMap<>();
        ToCities.put("New York", Arrays.asList("New York Ci es", "San Francisco"));
       ToCities.put("Texas", Arrays.asList("Houston", "Austin"));

  

       ToCities.put("Maharashtra", Arrays.asList("Mumbai", "Pune"));
       ToCities.put("Tamil Nadu", Arrays.asList("Chennai", "Coimbatore"));
       ToCities.put("Karnataka", Arrays.asList("Bangalore", "Mysore"));
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("Select a country from the following options: USA, Canada, India");
       String selectedCountry = scanner.nextLine();

       
       if (country.containsKey(selectedCountry)) {
           
           List<String> states =country.get(selectedCountry);

           
           System.out.println("Select a state from the following options: " + states);
           String selectedState = scanner.nextLine();

           
           if (ToCities.containsKey(selectedState)) {
              
               List<String> cities = ToCities.get(selectedState);

               
               System.out.println("Cities in " + selectedState + ": " + cities);
           } else {
               System.out.println("Invalid state selection.");
           }
       } else {
           System.out.println("Invalid country selection.");
       }
   }

        
      
}
