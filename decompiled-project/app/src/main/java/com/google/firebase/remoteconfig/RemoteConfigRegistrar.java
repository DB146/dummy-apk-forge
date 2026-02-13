package com.google.firebase.remoteconfig;

import Y6.i;
import Z6.c;
import a7.C0783a;
import android.content.Context;
import androidx.annotation.Keep;
import c7.InterfaceC0913b;
import com.google.firebase.components.ComponentRegistrar;
import f7.b;
import h8.C1262b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import k8.e;
import m4.Y;
import p7.C1857a;
import p7.InterfaceC1858b;
import p7.h;
import p7.p;
import u8.j;
import x8.InterfaceC2270a;

@Keep
/* loaded from: classes.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static j lambda$getComponents$0(p pVar, InterfaceC1858b interfaceC1858b) {
        c cVar;
        Context context = (Context) interfaceC1858b.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) interfaceC1858b.g(pVar);
        i iVar = (i) interfaceC1858b.a(i.class);
        e eVar = (e) interfaceC1858b.a(e.class);
        C0783a c0783a = (C0783a) interfaceC1858b.a(C0783a.class);
        synchronized (c0783a) {
            try {
                if (!c0783a.f12796a.containsKey("frc")) {
                    c0783a.f12796a.put("frc", new c(c0783a.f12797b));
                }
                cVar = (c) c0783a.f12796a.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new j(context, scheduledExecutorService, iVar, eVar, cVar, interfaceC1858b.d(InterfaceC0913b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1857a> getComponents() {
        p pVar = new p(b.class, ScheduledExecutorService.class);
        Y y10 = new Y(j.class, new Class[]{InterfaceC2270a.class});
        y10.f20191a = LIBRARY_NAME;
        y10.a(h.c(Context.class));
        y10.a(new h(pVar, 1, 0));
        y10.a(h.c(i.class));
        y10.a(h.c(e.class));
        y10.a(h.c(C0783a.class));
        y10.a(h.b(InterfaceC0913b.class));
        y10.f20196f = new C1262b(pVar, 2);
        y10.c(2);
        return Arrays.asList(y10.b(), Y6.b.j(LIBRARY_NAME, "22.1.2"));
    }
}
