package tudelft.caesarshift;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "input={0}, shift={1}, output={2}")
    @CsvSource({ "abc, 1, bcd", "abc, 28, cde", "xyz, 1, yza" })
    public void shiftNormal(String input, int shift, String output) {
        CaesarShiftCipher cs = new CaesarShiftCipher();
        String result = cs.CaesarShiftCipher(input, shift);
        Assertions.assertEquals(output, result);
    }

    @ParameterizedTest(name = "input={0}, shift={1}, output={2}")
    @CsvSource({ "abc, -1, zab", "xyz, -28, vwx", "xyz, -2, vwx" })
    public void shiftBackwards(String input, int shift, String output) {
        CaesarShiftCipher cs = new CaesarShiftCipher();
        String result = cs.CaesarShiftCipher(input, shift);
        Assertions.assertEquals(output, result);
    }

    @ParameterizedTest(name = "input={0}, shift={1}, output={2}")
    @CsvSource({ "789, -1, invalid", "{|}, -28, invalid", "x@z, -2, invalid" })
    public void impossibleCharacters(String input, int shift, String output) {
        CaesarShiftCipher cs = new CaesarShiftCipher();
        String result = cs.CaesarShiftCipher(input, shift);
        Assertions.assertEquals(output, result);
    }
}
