package year2023.week5.lectures.polymorphism.classes;

public class Tiger extends Animal{
    private int numOfTeeth;

    // This method is overridden, so it means we are providing the different implementation
    // of the method we have inherited from the parent Animal class.
    // Because of this, we are doing the same thing (eating) in a different form and
    // that is actually a polymorphism. Our Tiger class eats in a DIFFERENT FORM than
    // our Animal class do.
    @Override
    public void eat(){
        System.out.println("TIGER MLJAC MLJAC");
    }

    public void sayTigerHello(){
        System.out.println("HELLO FROM TIGER");
    }

    public int getNumOfTeeth() {
        return numOfTeeth;
    }

    public void setNumOfTeeth(int numOfTeeth) {
        this.numOfTeeth = numOfTeeth;
    }
}
