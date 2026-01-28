package traltb.fuda;

public class AccountService {

    //Phương thức đăng ký tài khoản
    //Nếu username hợp lệ (gọi phương thức isValid của lớp Account) và email chứa ký tự '@'
    //Trả về chuỗi: "Đăng ký thành công"
    //Ngược lại trả về "Đăng ký thất bại"
    public String register(String username, String password, String email) {
        Account account = new Account(username, password, email);
        if (account.isUserNameValid() && account.isEmailValid()) {
            return "Đăng ký thành công";
        } else {
            return "Đăng ký thất bại";
        }
    }
}
