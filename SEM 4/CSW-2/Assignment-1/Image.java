public class Image {
    private int imageWidth;
    private int imageHeight;
    private String colorCode;

    public Image() {
        super();
    }

    public Image(int imageWidth, int imageHeight, String colorCode) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.colorCode = colorCode;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }
    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }
    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public int getImageWidth() {
        return imageWidth;
    }
    public int getImageHeight() {
        return imageHeight;
    }
    public String getColorCode() {
        return colorCode;
    }

    @Override
    public String toString() {
        return "Image [Width=" + imageWidth + ", Height=" + imageHeight + ", Color Code=" + colorCode + "]";
    }

    public static void main(String[] args) {
        Image i = new Image();
        System.out.println("Default Image: " + i);

        Image pi = new Image(800, 600, "#FF5733"); // Example color code
        System.out.println("Parameterized Image: " + pi);

        i.setImageWidth(1024);
        i.setImageHeight(768);
        i.setColorCode("#33FF57");

        System.out.println("Modified Image: " +i);
    }
}
