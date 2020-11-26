public class ImageViewer {
    public static void main(String[] args) {
        // assuming that the user selects a folder that has 3 images
        // consider using the high resolution image object directly
        Image highResolutionImage1 = new HighResolutionImage("sample/veryHighResPhoto1.jpeg");
        Image highResolutionImage2 = new HighResolutionImage("sample/veryHighResPhoto2.jpeg");
        Image highResolutionImage3 = new HighResolutionImage("sample/veryHighResPhoto3.jpeg");

        // assume that the user clicks on Image one item in a list
        // this would cause the program to call showImage() for that image only
        highResolutionImage1.showImage();

        // Problem : only one image was displayed, thus needed total loading,
        // however the expensive loading operation (that displays on the console
        // "This operation is very expensive") was done 3 times.
        //
        // How do you use the Proxy design pattern to ensure the costly operation is
        // only performed once in this scenario ?

    }
}
