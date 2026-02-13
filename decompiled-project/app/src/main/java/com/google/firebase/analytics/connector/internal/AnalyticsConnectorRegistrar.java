package com.google.firebase.analytics.connector.internal;

import W3.f;
import Y5.B;
import Y6.b;
import Y6.i;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import c7.C0914c;
import c7.InterfaceC0913b;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.firebase.components.ComponentRegistrar;
import e8.InterfaceC1100c;
import java.util.Arrays;
import java.util.List;
import m4.Y;
import p7.C1857a;
import p7.InterfaceC1858b;
import p7.h;
import p7.j;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static InterfaceC0913b lambda$getComponents$0(InterfaceC1858b interfaceC1858b) {
        i iVar = (i) interfaceC1858b.a(i.class);
        Context context = (Context) interfaceC1858b.a(Context.class);
        InterfaceC1100c interfaceC1100c = (InterfaceC1100c) interfaceC1858b.a(InterfaceC1100c.class);
        G.g(iVar);
        G.g(context);
        G.g(interfaceC1100c);
        G.g(context.getApplicationContext());
        if (C0914c.f14437c == null) {
            synchronized (C0914c.class) {
                try {
                    if (C0914c.f14437c == null) {
                        Bundle bundle = new Bundle(1);
                        iVar.b();
                        if ("[DEFAULT]".equals(iVar.f12042b)) {
                            ((j) interfaceC1100c).a(f.f10603b, B.f11219w);
                            bundle.putBoolean("dataCollectionDefaultEnabled", iVar.k());
                        }
                        C0914c.f14437c = new C0914c(zzfb.zza(context, bundle).zzb());
                    }
                } finally {
                }
            }
        }
        return C0914c.f14437c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C1857a> getComponents() {
        Y a9 = C1857a.a(InterfaceC0913b.class);
        a9.a(h.c(i.class));
        a9.a(h.c(Context.class));
        a9.a(h.c(InterfaceC1100c.class));
        a9.f20196f = B.f11220x;
        a9.c(2);
        return Arrays.asList(a9.b(), b.j("fire-analytics", "22.5.0"));
    }
}
