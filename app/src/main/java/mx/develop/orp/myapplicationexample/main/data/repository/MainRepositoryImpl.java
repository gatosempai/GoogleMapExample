package mx.develop.orp.myapplicationexample.main.data.repository;

import mx.develop.orp.myapplicationexample.comm.restservice.RestServiceFactory;
import mx.develop.orp.myapplicationexample.main.data.restservice.endpoint.MainEndPointService;
import rx.Observable;

/**
 * Created by oscar on 9/03/17.
 */

public class MainRepositoryImpl implements MainRepository {

    @Override
    public Observable<Boolean> mainStuff(Boolean request) {
        MainEndPointService restService = RestServiceFactory
                .createRetrofitService(MainEndPointService.class, MainEndPointService.SERVICE_ENDPOINT);
        return restService.doStuff(request);
    }
}
