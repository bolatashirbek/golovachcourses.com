package basics.bits.swap;

public class BitUtils {

   /**
    *
    * Using bitwise operators to swap individual bits
    *
    * @param b income byte
    * @param i first bit
    * @param j second bit
    * @return new byte
    * {@link https://community.oracle.com/thread/1215896}
    *
    */

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
