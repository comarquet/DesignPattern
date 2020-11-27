public class OctObserver extends  AbstractObserver {
    public void update(int val) {
        System.out.println("oct:   " + Integer.toOctalString(val));
    }
}
