package basics.bits.swap;

/**
 * basics.bits.swap

 Реализуйте метод swapBits(b, i, j), который производит "рокировку" битов с номерами i и j, то есть
 swapBits(0b1111_0000, 0, 6) = 0b1011_0001
 swapBits(0b0000_1000, 3, 1) = 0b0000_0010

solution: https://community.oracle.com/thread/1215896
 */
public class BitUtils {
    public static byte swapBits(byte b, int i, int j) { // Bit positions are from 7 (MSB) to 0 (LSB)
        byte mask1 = (byte) (1 << i);
        byte mask2 = (byte) (1 << j);

        byte result = b;

        if ((b & mask1) != 0) {
            result |= mask2;
        } else {
            result &= ~mask2;
        }

        if ((b & mask2) != 0) {
            result |= mask1;
        } else  {
            result &= ~mask1;
        }

        return result;
    }
}
