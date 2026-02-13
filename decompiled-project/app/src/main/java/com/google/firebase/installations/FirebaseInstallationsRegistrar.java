package com.google.firebase.installations;

import Y6.i;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import f7.InterfaceC1142a;
import f7.b;
import h8.f;
import ha.C1265a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k8.d;
import k8.e;
import m4.Y;
import p7.C1857a;
import p7.InterfaceC1858b;
import p7.h;
import p7.p;
import q7.j;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static e lambda$getComponents$0(InterfaceC1858b interfaceC1858b) {
        return new d((i) interfaceC1858b.a(i.class), interfaceC1858b.d(f.class), (ExecutorService) interfaceC1858b.g(new p(InterfaceC1142a.class, ExecutorService.class)), new j((Executor) interfaceC1858b.g(new p(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1857a> getComponents() {
        Y a9 = C1857a.a(e.class);
        a9.f20191a = LIBRARY_NAME;
        a9.a(h.c(i.class));
        a9.a(h.b(f.class));
        a9.a(new h(new p(InterfaceC1142a.class, ExecutorService.class), 1, 0));
        a9.a(new h(new p(b.class, Executor.class), 1, 0));
        a9.f20196f = new C1265a(10);
        C1857a b2 = a9.b();
        h8.e eVar = new h8.e(0);
        Y a10 = C1857a.a(h8.e.class);
        a10.f20193c = 1;
        a10.f20196f = new n4.d(eVar);
        return Arrays.asList(b2, a10.b(), Y6.b.j(LIBRARY_NAME, "18.0.0"));
    }
}
