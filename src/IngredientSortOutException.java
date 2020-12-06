public class IngredientSortOutException extends RuntimeException {

    public IngredientSortOutException(String message) {
        super("");
        System.out.println("很抱歉"+message+"已售完");
    }
}
