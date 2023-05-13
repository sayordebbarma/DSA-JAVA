import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, String> table =  new Hashtable<>(25);

        table.put("100", "Evy");
        table.put("252", "Daniel");
        table.put("311", "Rica");
        table.put("454", "Autumn");
        table.put("559", "evilly");

        for (String key : table.keySet())
            System.out.println(key.hashCode() % 25 + "\t" + key + "\t" + table.get(key));
    }
}