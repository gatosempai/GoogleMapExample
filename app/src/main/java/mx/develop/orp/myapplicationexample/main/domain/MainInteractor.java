package mx.develop.orp.myapplicationexample.main.domain;

import rx.Observable;

/**
 * Created by oscar on 9/03/17.
 */

public interface MainInteractor {
    Observable<Boolean> getStuff(String user,
                                 String password);
}
