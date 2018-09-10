package Item1;

public class ColorDefault {

    private final int hex;

    ColorDefault(String rgb) {
        this(Integer.parseInt(rgb, 16));
    }

    ColorDefault(int red, int green, int blue) {
        //	<<  :  shift bits left
        this(red << 16 + green << 8 + blue);
    }

    ColorDefault(int h) {
        this.hex = h;
    }







    // subtype kiyaslamasi icin
    public ColorDefault lighter() {
        return new ColorDefault(hex + 0x111);
    }



    // cem - getter
    public int getHex() {
        return hex;
    }
}
