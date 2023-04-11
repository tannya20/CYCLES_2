import org.junit.Test;
import ru.netology.CYCLES_2.services.Calculate;


public class CalculateTest {

    @Test
    public void testUser1() {
        int count;
        Calculate calc = new Calculate();
        count = calc.calculate(10000, 3000, 20_000);
            System.out.println("Мы отдыхали " + count + " раз");
        }

        @Test
        public  void testUser2() {
            int count;
            Calculate calc = new Calculate();
            count = calc.calculate(100_000, 60_000, 150_000);
            System.out.println("Мы отдыхали " + count + " раз");
        }
}

