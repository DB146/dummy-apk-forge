package com.google.android.gms.internal.p001authapiphone;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.InterfaceC0966g;
import com.google.android.gms.common.api.internal.InterfaceC0976q;
import com.google.android.gms.common.internal.C0992h;

/* loaded from: classes.dex */
final class zzt extends a {
    @Override // com.google.android.gms.common.api.a
    public final /* synthetic */ g buildClient(Context context, Looper looper, C0992h c0992h, Object obj, InterfaceC0966g interfaceC0966g, InterfaceC0976q interfaceC0976q) {
        return new zzw(context, looper, c0992h, interfaceC0966g, interfaceC0976q);
    }
}
