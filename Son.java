
    

import java.util.Random;

public class Son extends Man implements Father {

    private String colorHair;

    
    public Son(Integer id, String name, String dateBirth, String colorHair) {
        super(id, name, dateBirth);
        this.colorHair = colorHair;
    }

    @Override
    public void getPower() {
        Random rand = new Random();
        System.out.println("Сын получил силу: " + rand.nextInt(501));
    }    

    @Override
    public void Hello() {
        System.out.println("Привет, я сын, похож на папу");
    }

    public String getColorHair() {
        return colorHair;
    }

    @Override
    public String toString() {
        return String.format("Меня зовут %s %s. Я родился %s, цвет волос %s", getName(), getsName(), getDateBirth(), getColorHair());
    }

}