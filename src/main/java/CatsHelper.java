import java.net.URI;
import java.util.Collections;
import java.util.List;

public class CatsHelper {

    Api api;

    public URI saveTheCutestCat(String query) {
        List<Cat> cats = api.queryCats(query);
        Cat cutest = findCutest(cats);
        URI savedUri = api.store(cutest);
        return savedUri;
    }

    private Cat findCutest(List<Cat> cats) {
        return Collections.max(cats);
    }
}