package controle;

public class DesafioFor {
    public static void main(String[] args) {
        for (String cerquilha = "#"; cerquilha.length() < "######".length(); cerquilha += "#") {
            System.out.println(cerquilha);
        }
    }
}
