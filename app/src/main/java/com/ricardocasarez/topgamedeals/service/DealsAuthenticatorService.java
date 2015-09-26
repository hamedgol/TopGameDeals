package com.ricardocasarez.topgamedeals.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by ricardo.casarez on 9/23/2015.
 */
public class DealsAuthenticatorService extends Service {

    private DealsAuthenticator mDealsAuthenticator;

    @Override
    public void onCreate() {
        // Create a new authenticator object
        mDealsAuthenticator = new DealsAuthenticator(this);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mDealsAuthenticator.getIBinder();
    }
}
