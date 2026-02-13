package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC0966g;
import com.google.android.gms.common.api.internal.InterfaceC0976q;
import com.google.android.gms.common.internal.C0992h;

/* loaded from: classes.dex */
public abstract class a extends f {
    public g buildClient(Context context, Looper looper, C0992h c0992h, Object obj, InterfaceC0966g interfaceC0966g, InterfaceC0976q interfaceC0976q) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    @Deprecated
    public g buildClient(Context context, Looper looper, C0992h c0992h, Object obj, m mVar, n nVar) {
        return buildClient(context, looper, c0992h, obj, (InterfaceC0966g) mVar, (InterfaceC0976q) nVar);
    }
}
