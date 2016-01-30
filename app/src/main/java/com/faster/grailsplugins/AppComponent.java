package com.faster.grailsplugins;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by kevintan on 28/01/2016.
 */
@Component
@Singleton
public interface AppComponent {
    void inject(MainActivity activity);
    void inject(DetailsActivity activity);
}
