
    

public interface Person {
    
    String sName = "Кузнецов(а)";

    default public String getsName() {
        return sName;
    }
    
    default void Hello(){
        System.out.println("Привет, я человек.");
    }
    
}

