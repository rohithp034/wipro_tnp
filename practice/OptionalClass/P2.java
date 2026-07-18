import java.util.Optional;

public class P2 {

    public static void main(String[] args) {

        String address = null;

        Optional<String> optional = Optional.ofNullable(address);

        System.out.println(optional.orElse("India"));
    }
}