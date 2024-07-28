import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void IfAmountMoreThenBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 43500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test
    void IfAmountLessThenBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    void IfAmountSameBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }




}
