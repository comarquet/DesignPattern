
/**
 * RealSubject
 */
public class HighResolutionImage extends AbstractImage {
    private String loadedImage = "Nothing to display :(";

    public HighResolutionImage(String imageFilePath) {
        loadImage(imageFilePath);
    }

    private void loadImage(String imageFilePath) {
        System.out.print("Load image " + imageFilePath + "  |=");
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print("=");
        }
        System.out.println("| Done !");

        int imgWidth = imageFilePath.length() + 2;
        this.loadedImage =
                "+" + "=".repeat(imgWidth) + "+\n" +
                        "|" + " ".repeat(imgWidth) + "|\n" +
                        "|" + " ".repeat(imgWidth) + "|\n" +
                        "| " + imageFilePath + " |\n" +
                        "|" + " ".repeat(imgWidth) + "|\n" +
                        "|" + " ".repeat(imgWidth) + "|\n" +
                        "+" + "=".repeat(imgWidth) + "+\n";


    }

    @Override
    public void showImage() {
        System.out.println(this.loadedImage);
    }

}