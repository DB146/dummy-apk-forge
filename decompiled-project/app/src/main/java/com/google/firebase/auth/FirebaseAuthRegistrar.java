package com.google.firebase.auth;

import Y6.i;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import f7.InterfaceC1142a;
import f7.b;
import f7.c;
import f7.d;
import h8.e;
import h8.f;
import j7.InterfaceC1385a;
import j8.InterfaceC1387b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import m4.Y;
import o7.InterfaceC1811a;
import p7.C1857a;
import p7.InterfaceC1858b;
import p7.h;
import p7.p;

@Keep
/* loaded from: classes.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static FirebaseAuth lambda$getComponents$0(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, InterfaceC1858b interfaceC1858b) {
        i iVar = (i) interfaceC1858b.a(i.class);
        InterfaceC1387b d10 = interfaceC1858b.d(InterfaceC1385a.class);
        InterfaceC1387b d11 = interfaceC1858b.d(f.class);
        return new FirebaseAuth(iVar, d10, d11, (Executor) interfaceC1858b.g(pVar2), (Executor) interfaceC1858b.g(pVar3), (ScheduledExecutorService) interfaceC1858b.g(pVar4), (Executor) interfaceC1858b.g(pVar5));
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [A9.O0, java.lang.Object] */
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C1857a> getComponents() {
        p pVar = new p(InterfaceC1142a.class, Executor.class);
        p pVar2 = new p(b.class, Executor.class);
        p pVar3 = new p(c.class, Executor.class);
        p pVar4 = new p(c.class, ScheduledExecutorService.class);
        p pVar5 = new p(d.class, Executor.class);
        Y y10 = new Y(FirebaseAuth.class, new Class[]{InterfaceC1811a.class});
        y10.a(h.c(i.class));
        y10.a(new h(1, 1, f.class));
        y10.a(new h(pVar, 1, 0));
        y10.a(new h(pVar2, 1, 0));
        y10.a(new h(pVar3, 1, 0));
        y10.a(new h(pVar4, 1, 0));
        y10.a(new h(pVar5, 1, 0));
        y10.a(h.b(InterfaceC1385a.class));
        ?? obj = new Object();
        obj.f922a = pVar;
        obj.f923b = pVar2;
        obj.f924c = pVar3;
        obj.f925d = pVar4;
        obj.f926e = pVar5;
        y10.f20196f = obj;
        C1857a b2 = y10.b();
        e eVar = new e(0);
        Y a9 = C1857a.a(e.class);
        a9.f20193c = 1;
        a9.f20196f = new n4.d(eVar);
        return Arrays.asList(b2, a9.b(), Y6.b.j("fire-auth", "23.2.1"));
    }
}
