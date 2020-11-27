public class HexObserver extends AbstractObserver {
    public void update(int val) {
        System.out.println("hex:   " + Integer.toHexString(val));
    }
}
