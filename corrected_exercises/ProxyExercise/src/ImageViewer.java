public class ImageViewer {
    public static void main(String[] args) {
        // assuming that the user selects a folder that has 3 images
        // consider using the high resolution image object directly
        AbstractImage highResolutionImage1 = new HighResolutionImageProxy("sample/veryHighResPhoto1.jpeg");
        AbstractImage highResolutionImage2 = new HighResolutionImageProxy("sample/veryHighResPhoto2.jpeg");
        AbstractImage highResolutionImage3 = new HighResolutionImageProxy("sample/veryHighResPhoto3.jpeg");

        // assume that the user clicks on Image one item in a list
        // this would cause the program to call showImage() for that image only
        highResolutionImage1.showImage();


    }
}
