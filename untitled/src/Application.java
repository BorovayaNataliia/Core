public class Application {

    public static void main(String[] args) {
        Api api = new Api();
        UI ui = new UI();
        api.sendGetRequest("");
        ui.openPage("");
    }

}
