package com.google.firebase.appcheck;

import Ra.a;
import Y6.i;
import com.google.firebase.components.ComponentRegistrar;
import f7.InterfaceC1142a;
import f7.b;
import f7.c;
import f7.d;
import h7.C1259e;
import h8.e;
import h8.f;
import j7.InterfaceC1385a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import m4.Y;
import p7.C1857a;
import p7.h;
import p7.p;

/* loaded from: classes.dex */
public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        p pVar = new p(d.class, Executor.class);
        p pVar2 = new p(c.class, Executor.class);
        p pVar3 = new p(InterfaceC1142a.class, Executor.class);
        p pVar4 = new p(b.class, ScheduledExecutorService.class);
        Y y10 = new Y(C1259e.class, new Class[]{InterfaceC1385a.class});
        y10.f20191a = "fire-app-check";
        y10.a(h.c(i.class));
        y10.a(new h(pVar, 1, 0));
        y10.a(new h(pVar2, 1, 0));
        y10.a(new h(pVar3, 1, 0));
        y10.a(new h(pVar4, 1, 0));
        y10.a(h.b(f.class));
        y10.f20196f = new a(pVar, pVar2, pVar3, pVar4);
        y10.c(1);
        C1857a b2 = y10.b();
        e eVar = new e(0);
        Y a9 = C1857a.a(e.class);
        a9.f20193c = 1;
        a9.f20196f = new n4.d(eVar);
        return Arrays.asList(b2, a9.b(), Y6.b.j("fire-app-check", "18.0.0"));
    }
}
