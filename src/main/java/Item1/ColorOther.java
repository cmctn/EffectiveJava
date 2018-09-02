package Item1;


// use polymorphism and encapsulation

interface ColorOther {

}


class HexColorOther implements ColorOther {
    private final int hex;

    HexColorOther(int h) {
        this.hex = h;
    }

    // cem - getter
    public int getHex() {
        return hex;
    }
}


class RGBColorOther implements ColorOther {
    private final ColorOther origin;

    RGBColorOther(int red, int green, int blue) {
        this.origin = new HexColorOther(
                red << 16 + green << 8 + blue
        );
    }

    // cem - getter
    public ColorOther getOrigin() {
        return origin;
    }

}
