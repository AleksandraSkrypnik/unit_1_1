import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void IfAmountMoreThenBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 43500;

        int actual = service.remain(amount);
        int expected = 500;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void IfAmountLessThenBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void IfAmountSameBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }




}
