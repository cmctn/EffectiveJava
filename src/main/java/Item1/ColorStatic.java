package Item1;

public class ColorStatic {

    private final int hex;

    static ColorStatic makeFromRGB(String rgb) {
        return new ColorStatic(Integer.parseInt(rgb, 16));
    }
    static ColorStatic makeFromPalette(int red, int green, int blue) {
        return new ColorStatic(red << 16 + green << 8 + blue);
    }
    static ColorStatic makeFromHex(int h) {
        return new ColorStatic(h);
    }
    private ColorStatic(int h) {
        this.hex = h;
    }



    // cem - getter
    public int getHex() {
        return hex;
    }

}



