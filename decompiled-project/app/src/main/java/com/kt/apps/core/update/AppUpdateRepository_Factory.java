package com.kt.apps.core.update;

import G8.m;
import android.content.Context;
import android.content.SharedPreferences;
import db.InterfaceC1070c;
import u8.c;

/* loaded from: classes2.dex */
public final class AppUpdateRepository_Factory implements InterfaceC1070c {
    private final InterfaceC1070c configLoaderProvider;
    private final InterfaceC1070c contextProvider;
    private final InterfaceC1070c gsonProvider;
    private final InterfaceC1070c sharedPrefProvider;
    private final InterfaceC1070c updateConfigKeyProvider;

    public AppUpdateRepository_Factory(InterfaceC1070c interfaceC1070c, InterfaceC1070c interfaceC1070c2, InterfaceC1070c interfaceC1070c3, InterfaceC1070c interfaceC1070c4, InterfaceC1070c interfaceC1070c5) {
        this.contextProvider = interfaceC1070c;
        this.gsonProvider = interfaceC1070c2;
        this.sharedPrefProvider = interfaceC1070c3;
        this.configLoaderProvider = interfaceC1070c4;
        this.updateConfigKeyProvider = interfaceC1070c5;
    }

    public static AppUpdateRepository_Factory create(InterfaceC1070c interfaceC1070c, InterfaceC1070c interfaceC1070c2, InterfaceC1070c interfaceC1070c3, InterfaceC1070c interfaceC1070c4, InterfaceC1070c interfaceC1070c5) {
        return new AppUpdateRepository_Factory(interfaceC1070c, interfaceC1070c2, interfaceC1070c3, interfaceC1070c4, interfaceC1070c5);
    }

    public static AppUpdateRepository newInstance(Context context, m mVar, SharedPreferences sharedPreferences, c cVar, String str) {
        return new AppUpdateRepository(context, mVar, sharedPreferences, cVar, str);
    }

    @Override // Cb.a
    public AppUpdateRepository get() {
        return newInstance((Context) this.contextProvider.get(), (m) this.gsonProvider.get(), (SharedPreferences) this.sharedPrefProvider.get(), (c) this.configLoaderProvider.get(), (String) this.updateConfigKeyProvider.get());
    }
}
