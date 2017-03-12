package mx.develop.orp.myapplicationexample.main.data.restservice.endpoint;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by oscar on 9/03/17.
 */

public interface MainEndPointService {
    String SERVICE_ENDPOINT = "https://microsoft-apiapp0657f11529ce429db758b812793ba9d1.azurewebsites.net";

    @POST("login")
    Observable<Boolean> doStuff(@Body Boolean request);
}
