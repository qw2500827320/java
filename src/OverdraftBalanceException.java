public class OverdraftBalanceException extends RuntimeException
{
    double num;

    public OverdraftBalanceException(double num) {
        this.num=num;
    }

    public String toString() {
        return
                "" + num ;
    }
}
