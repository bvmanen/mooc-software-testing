package tudelft.sum;

public class TwoNumbersSumTest {
    
  @Test
    public void simpleTest(/*ArrayList<Integer> first, ArrayList<Integer> second, ArrayList<Integer> expectedResult*/) {
        TwoNumbersSum tns = new TwoNumbersSum();
        ArrayList<Integer> result = tns.addTwoNumbers(new ArrayList<>(Arrays.asList(1,2)), new ArrayList<>(Arrays.asList(1,3)));
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(2,5)), result);
    }

    @Test
    public void simpleTest2(/*ArrayList<Integer> first, ArrayList<Integer> second, ArrayList<Integer> expectedResult*/) {
        TwoNumbersSum tns = new TwoNumbersSum();
        ArrayList<Integer> result = tns.addTwoNumbers(new ArrayList<>(Arrays.asList(1,0,2)), new ArrayList<>(Arrays.asList(1,2,5)));
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(2,2,7)), result);
    }

    @Test
    public void simpleTest3(/*ArrayList<Integer> first, ArrayList<Integer> second, ArrayList<Integer> expectedResult*/) {
        TwoNumbersSum tns = new TwoNumbersSum();
        ArrayList<Integer> result = tns.addTwoNumbers(new ArrayList<>(Arrays.asList(1,0,2)), new ArrayList<>(Arrays.asList(5)));
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(1,0,7)), result);
    }

    @Test
    public void simpleTest4(/*ArrayList<Integer> first, ArrayList<Integer> second, ArrayList<Integer> expectedResult*/) {
        TwoNumbersSum tns = new TwoNumbersSum();
        ArrayList<Integer> result = tns.addTwoNumbers(new ArrayList<>(Arrays.asList(9,5)), new ArrayList<>(Arrays.asList(3,4)));
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(1,2,9)), result);
    }
}
