package Chapter6.Item31;

public enum EnsembleOrdinal {
    SOLO,   DUET,   TRIO, QUARTET, QUINTET,
    SEXTET, SEPTET, OCTET, NONET,  DECTET;

    // DON'T DO THIS - It's a maintenance nightmare.
    // If the constants are reordered, the numberOfMusicians method will break.
    public int numberOfMusicians() {
        return ordinal() + 1; }
}
