class ImageLibrary {
    private Image[] images;
    private int count;
    public ImageLibrary(int size) {
        super();
        this.images = new Image[size];
        this.count=0;
    }
    public void insertImage(Image image) {
        if(this.count< images.length){
            this.images[this.count++]=image;
            System.out.println("Image Added !");
        }else {
            System.out.println("Out Of Bound !");
        }
    }
    public Image searchImage(int width, int height, String colorCode) {
        for (Image image : images) {
            if (image.getImageWidth() == width && image.getImageHeight() == height && image.getColorCode().equals(colorCode)) {
                System.out.println("Found Image: " + image.toString());
                return image;
            }
        }
        System.out.println("Image not found.");
        return null;
    }
    public Image getImage(int index) {
        for (Image image : images) {
            if (index >= 0 && index < count) {
                System.out.println(image);
                return image;
            }
        }
        System.out.println("No image at the specified index.");
        return null;
    }
    public void display() {
        for (Image image : images) {
            System.out.println(image);
        }
    }
}
public class ImageController {
    public static void main(String[] args) {
        ImageLibrary library = new ImageLibrary(3);
        Image img1 = new Image(800, 600, "#FF5733");
        Image img2 = new Image(1024, 768, "#33FF57");
        library.insertImage(img1);
        library.insertImage(img2);
        System.out.println("All Images in the Library:");
        library.display();
        library.searchImage(800, 600, "#FF5733");
        library.getImage(1);
    }
}
