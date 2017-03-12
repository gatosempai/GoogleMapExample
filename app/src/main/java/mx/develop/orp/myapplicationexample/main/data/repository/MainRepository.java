package mx.develop.orp.myapplicationexample.main.data.repository;

import rx.Observable;

/**
 * Created by oscar on 9/03/17.
 */

public interface MainRepository {
    Observable<Boolean> mainStuff(Boolean request);
}
