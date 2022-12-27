public class Daughter1 extends Man implements Mother {
    
    public Daughter1(Integer id, String name, String dateBirth) {
        super(id, name, dateBirth);
    }
    
    @Override
    public void Hello() {
        System.out.println("Привет, я дочка, похожа на маму");
    }
}