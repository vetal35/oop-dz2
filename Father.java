
    

public interface Father extends Male{
    
    String nose = "с горбинкой";

    public void getPower();
    
    default public String getNose() {
        return nose;
    }
}