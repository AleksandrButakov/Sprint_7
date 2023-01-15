public class Courier {

    private String login;
    private String password;
    private String firstTime;

    public Courier() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(String firstTime) {
        this.firstTime = firstTime;
    }

    public Courier(String login, String password, String firstTime) {
        this.login = login;
        this.password = password;
        this.firstTime = firstTime;
    }


}
