import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import traltb.fuda.AccountService;

public class AccountServiceTest {
    //Test phương thức register của lớp AccountService
   @Test
    public void testRegister() {
        AccountService accountService = new AccountService();
        String result1 = accountService.register("user", "pass", "abc@gmail.com");
        Assertions.assertEquals("Đăng ký thành công", result1);

    }
    @Test
    public void testRegister2() {
        AccountService accountService = new AccountService();
        String result1 = accountService.register("user", "pass", "abc@gmail");
        Assertions.assertEquals("Đăng ký thất bại", result1);

    }
}
