package basics.bits.packed;

public class PackedFlagArray {
    private long[] data;
    private final int size;

    public PackedFlagArray(int size) {
        if (size < 1) {
            throw new IllegalArgumentException();
        }
        this.data = new long[size / 64 + (size % 64 > 0 ? 1 : 0)];
        this.size = size;
    }

    public void setFlag(int index, boolean value) {
        // тут тело метода setFlag

    }
    public boolean getFlag(int index) {
        // тут тело метода getFlag
        return true;
    }
}
