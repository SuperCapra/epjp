package s069;

public abstract class Mammal {
    protected int gestation;

    public Mammal(int gestation) {
        this.gestation = gestation;
    }

    @Override
    public String toString() {
        return "Mammal [gestation=" + gestation + "]";
    }
    
    class X extends Object {
    	
    }
}
