import java.net.URI;
import java.util.List;

public interface Api {
    List<Cat> queryCats(String query, CatsQueryCallback catsQueryCallback);

    URI store(Cat cat, StoreCallback storeCallback);

    interface CatsQueryCallback {
        void onCatListReceived(List<Cat> cats);

        void onQueryFailed(Exception e);
    }

    interface StoreCallback {
        void onCatStored(URI uri);

        void onStoreFailed(Exception e);
    }
}