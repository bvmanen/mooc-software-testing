package tudelft.discount;

public class DiscountApplierTest {

    @Test
    void discountApplier() {

        Product one = new Product("Shoe", 20.0, "BUSINESS");
        Product two = new Product("Plate", 300.0, "HOME");

        ProductDao dao = Mockito.mock(ProductDao.class);

        List<Product> results = Arrays.asList(one, two);
        Mockito.when(dao.all()).thenReturn(results);

        DiscountApplier da = new DiscountApplier(dao);
        da.setNewPrices();

        Assertions.assertEquals(22, results.get(0).getPrice());
        Assertions.assertEquals(270, results.get(1).getPrice());
    }
}
