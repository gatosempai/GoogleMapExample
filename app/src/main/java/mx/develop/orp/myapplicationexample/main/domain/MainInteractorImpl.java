package mx.develop.orp.myapplicationexample.main.domain;

import mx.develop.orp.myapplicationexample.main.data.repository.MainRepository;
import mx.develop.orp.myapplicationexample.main.data.repository.MainRepositoryImpl;
import rx.Observable;
import rx.functions.Func1;

/**
 * Created by oscar on 9/03/17.
 */

public class MainInteractorImpl implements MainInteractor {
    @Override
    public Observable<Boolean> getStuff(String user, String password) {
        MainRepository repository = new MainRepositoryImpl();
        //LoginRequest logIn = new LoginRequest();
        //logIn.setUser(user);
        //logIn.setUser(password);
        return repository.mainStuff(true)
                .flatMap(new Func1<Boolean, Observable<Boolean>>() {
                    @Override
                    public Observable<Boolean> call(Boolean loginResponse) {
                        return Observable.just(loginResponse);
                    }
                });
    }
}
