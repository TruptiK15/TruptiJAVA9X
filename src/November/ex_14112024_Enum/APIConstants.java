package November.ex_14112024_Enum;

public enum APIConstants {

    BASE_URL("https://app.vwo.com"),
    LOGIN_PAGE("https://app.vwo.com/login"),
    DASHBOARD_PAGE("https://app.vwo.com/dashboard"),
    CHATBOT_PAGE("https://app.vwo.com/chat");

    private String name;

    //parameterized constructor
    APIConstants(String name){
        this.name = name;
    }

    String getValue(){
        return name;
    }
}
