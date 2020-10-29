package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArryListExample {
    public static void main(String[] args) {
        List<String> topCOmpanies = new ArrayList<>();
        System.out.println("is the topCompanies list empty: " + topCOmpanies.isEmpty());

        topCOmpanies.add("Google");
        topCOmpanies.add("Apple");
        topCOmpanies.add("Microsoft");
        topCOmpanies.add("Amazon");
        topCOmpanies.add("Facebook");

        System.out.println("here are the top " + topCOmpanies.size() + " companies in the world");
        System.out.println(topCOmpanies);

        String bestCompany = topCOmpanies.get(0);
        String secondBestCOmpany = topCOmpanies.get(1);
        String lastCompany = topCOmpanies.get(topCOmpanies.size() -1 );

        System.out.println("best company: " + bestCompany);
        System.out.println("Second Best Company: " + secondBestCOmpany);
        System.out.println("Last COmpany in the List: " + lastCompany);

        topCOmpanies.set(4, "walmart");
        System.out.println("Modified top companies list: " + topCOmpanies);
    }
}
