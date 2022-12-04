public class HighResolutionImageProxy implements Image {
    private HighResolutionImage proxiedImage;
    private String imageFilePathCache;

    public HighResolutionImageProxy(String imageFilePath) {
        this.imageFilePathCache = imageFilePath;
    }

    @Override
    public void showImage() {
        if (this.proxiedImage == null) {
            this.proxiedImage = new HighResolutionImage(this.imageFilePathCache);
        }
        this.proxiedImage.showImage();
    }
}
