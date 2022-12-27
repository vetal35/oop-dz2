//public class Daughter2 {
    
//}
import java.util.Random;

public class Daughter2 extends Man implements Mother, Father {
    
    public Daughter2(Integer id, String name, String dateBirth) {
        super(id, name, dateBirth);
    }

    @Override
    public void getHug() {
        System.out.println("крепкие объятия");
    }

    @Override
    public void getPower() {
        Random rand = new Random();
        System.out.println("Дочь получила силу: " + rand.nextInt(201));
    }

    @Override
    public void Hello() {
        System.out.println("Привет, я дочка. Чуть-чуть похожа на маму, чуть-чуть на папу :)");
    }
    
}