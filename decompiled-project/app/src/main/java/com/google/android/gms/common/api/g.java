package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.InterfaceC0988d;
import com.google.android.gms.common.internal.InterfaceC0989e;
import com.google.android.gms.common.internal.InterfaceC0997m;
import java.util.Set;

/* loaded from: classes.dex */
public interface g extends b {
    void connect(InterfaceC0988d interfaceC0988d);

    void disconnect();

    void disconnect(String str);

    F5.d[] getAvailableFeatures();

    String getEndpointPackageName();

    String getLastDisconnectMessage();

    int getMinApkVersion();

    void getRemoteService(InterfaceC0997m interfaceC0997m, Set set);

    Set getScopesForConnectionlessNonSignIn();

    boolean isConnected();

    boolean isConnecting();

    void onUserSignOut(InterfaceC0989e interfaceC0989e);

    boolean requiresGooglePlayServices();

    boolean requiresSignIn();
}
