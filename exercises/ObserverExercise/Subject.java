public class Subject {
    private int subjectState;
    private HexObserver hexObserver = new HexObserver();
    private OctObserver octObserver = new OctObserver();
    private RomanObserver romanObserver = new RomanObserver();

    public void setState(int val) {
        subjectState = val;
        hexObserver.update(subjectState);
        octObserver.update(subjectState);
        romanObserver.update(subjectState);
    }
}
