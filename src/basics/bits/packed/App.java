package basics.bits.packed;

/**
 *
 * Спецификация Java оставляет за разработчиком JVM право определить размер boolean.
 * Таким образом в массиве boolean[] каждый элемент занимает не меньше одного бита
 * (а возможно и один байт или даже машинное слово (32 или 64 бита)).
 * Предлагается вместо boolean[] использовать биты long. Тогда мы гарантированно тратим по одному биту на boolean
 *
 * Однако такое решение не подходит для случая, если мы хотим хранить более 64 флагов.
 * Необходимо перейти от long к long[]. Сделайте это - реализуйте методы setFlag(int, boolean) и getFlag(int).
 * P.S. Обратите внимание, что хотя окно для ввода ОДНО, Вы тем не менее можете реализовать ДВА метода следующим образом
 */

public class App {

    public static void main(String[] args) {

        int LEN = 10;
        PackedFlagArray64 mask = new PackedFlagArray64(LEN);
        mask.setFlag(3, true);
        mask.setFlag(7, true);

        for (int k = 0; k < LEN; k++) {
            System.out.println("mask[" + k + "]: " + mask.getFlag(k));
        }

        System.out.println("mask: " + mask);
    }

}
