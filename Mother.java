

public interface Mother extends Female {
   
    String momСharacter = "сенситивный";
    String colorEyes = "карие";
    
    default String getColorEyes() {
        return colorEyes;
    }

    default public String getMomСharacter() {
        return momСharacter;
    }
}