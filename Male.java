
    


public interface Male extends Person {

    default void handshake(Object o, Object b){
        System.out.println(o + "и" + b + "пожали руки.");
    }

}