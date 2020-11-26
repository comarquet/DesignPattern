
/**
 * RealSubject
 */
public class HighResolutionImage implements Image {
    private String loadedImage;

    public HighResolutionImage(String imageFilePath) {
        loadImage(imageFilePath);
    }

    private void loadImage(String imageFilePath) {
        System.out.println("Load image " + imageFilePath);
        System.out.println("This operation is very expensive");
        this.loadedImage = imageFilePath + " is loaded";
    }

    @Override
    public void showImage() {
        System.out.println("Show image : " + this.loadedImage);
    }

}