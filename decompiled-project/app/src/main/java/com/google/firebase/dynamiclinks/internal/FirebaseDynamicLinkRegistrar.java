package com.google.firebase.dynamiclinks.internal;

import X7.a;
import Y6.b;
import Y6.i;
import android.util.Log;
import androidx.annotation.Keep;
import c7.InterfaceC0913b;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.firebase.components.ComponentRegistrar;
import j8.InterfaceC1387b;
import java.util.Arrays;
import java.util.List;
import m4.Y;
import p7.C1857a;
import p7.InterfaceC1858b;
import p7.h;

@Keep
/* loaded from: classes.dex */
public final class FirebaseDynamicLinkRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-dl";

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X7.a] */
    public static a lambda$getComponents$0(InterfaceC1858b interfaceC1858b) {
        i iVar = (i) interfaceC1858b.a(i.class);
        InterfaceC1387b d10 = interfaceC1858b.d(InterfaceC0913b.class);
        iVar.b();
        d dVar = e.f14901q;
        k kVar = k.f15009c;
        new l(iVar.f12041a, null, Y7.a.f12060a, dVar, kVar);
        ?? obj = new Object();
        if (d10.get() == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
        return obj;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C1857a> getComponents() {
        Y a9 = C1857a.a(a.class);
        a9.f20191a = LIBRARY_NAME;
        a9.a(h.c(i.class));
        a9.a(h.b(InterfaceC0913b.class));
        a9.f20196f = new P4.Y(16);
        return Arrays.asList(a9.b(), b.j(LIBRARY_NAME, "22.1.0"));
    }
}
