package com.google.firebase.appcheck.playintegrity;

import F8.a;
import Y6.i;
import com.google.firebase.components.ComponentRegistrar;
import f7.b;
import f7.c;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import l7.C1511c;
import m4.Y;
import p7.C1857a;
import p7.h;
import p7.p;

/* loaded from: classes.dex */
public class FirebaseAppCheckPlayIntegrityRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        p pVar = new p(c.class, Executor.class);
        p pVar2 = new p(b.class, Executor.class);
        Y a9 = C1857a.a(C1511c.class);
        a9.f20191a = "fire-app-check-play-integrity";
        a9.a(h.c(i.class));
        a9.a(new h(pVar, 1, 0));
        a9.a(new h(pVar2, 1, 0));
        a9.f20196f = new a(29, pVar, pVar2);
        return Arrays.asList(a9.b(), Y6.b.j("fire-app-check-play-integrity", "18.0.0"));
    }
}
