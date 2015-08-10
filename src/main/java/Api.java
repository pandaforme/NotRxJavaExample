import java.net.URI;
import java.util.List;

public interface Api {
    List<Cat> queryCats(String query);

    URI store(Cat cat);
}