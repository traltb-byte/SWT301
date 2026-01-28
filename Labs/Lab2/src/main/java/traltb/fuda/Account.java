package traltb.fuda;

public class Account {
    //Có 2 thuộc tính username và password
    private String username;
    private String password;
    private String  email;

    //Hàm khởi tạo
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }
    //Getter và Setter
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    //Getter và Setter cho email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    //Constructors with all parameters
    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    //Phương thức test userName isValid: length>=4 and length<=32
    public boolean isUserNameValid() {
        int length = username.length();
        return length >= 4 && length <= 32;
    }
    //Phương thức đăng nhập thành công với username "admin" và password "123456"
    //Trả về chuỗi: "Đăng nhập thành công" nếu đúng, ngược lại trả về "Đăng nhập thất bại"
    public boolean login() {
        if (this.username.equals("admin") && this.password.equals("123456")) {
            return true;
        } else {
            return false;
        }
    }
    //phương thức đăng ký tài khoản
    //Using regex to validate email format
    public boolean register() {
        if (isUserNameValid() && isEmailValid()) {
            return true;
        } else {
            return false;
        }
    }
    //Using regex to validate email format
    public boolean isEmailValid() {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return this.email.matches(emailRegex);
    }
}
