package tudelft.ghappy;

public class GHappyTest {

      @ParameterizedTest(name = "input={0}, output={1}")
    @CsvSource({ "xxggxx,true", "ggxxx,true", "xxxxgg,true" })
    public void onlyHappyGs(String input, boolean output) {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy(input);
        Assertions.assertEquals(output, result);
    }

    @ParameterizedTest(name = "input={0}, output={1}")
    @CsvSource({ "xxgxx,false", "gxxx,false", "xxxxg,false" })
    public void onlyUnhappyGs(String input, boolean output) {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy(input);
        Assertions.assertEquals(output, result);
    }

    @ParameterizedTest(name = "input={0}, output={1}")
    @CsvSource({ "ggxxgxx,false", "gxggxx,false", "xxggxxg,false", "xxgxxgg,false" })
    public void happyAndUnhappyGs(String input, boolean output) {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy(input);
        Assertions.assertEquals(output, result);
    }
}
