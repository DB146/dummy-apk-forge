package com.google.firebase.messaging;

import W7.b;
import Y3.f;
import Y6.i;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import e8.InterfaceC1100c;
import h8.C1262b;
import h8.g;
import i8.InterfaceC1348a;
import java.util.Arrays;
import java.util.List;
import k8.e;
import m4.Y;
import p7.C1857a;
import p7.InterfaceC1858b;
import p7.h;
import p7.p;
import t8.C2033b;

@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(p pVar, InterfaceC1858b interfaceC1858b) {
        i iVar = (i) interfaceC1858b.a(i.class);
        if (interfaceC1858b.a(InterfaceC1348a.class) == null) {
            return new FirebaseMessaging(iVar, interfaceC1858b.d(C2033b.class), interfaceC1858b.d(g.class), (e) interfaceC1858b.a(e.class), interfaceC1858b.h(pVar), (InterfaceC1100c) interfaceC1858b.a(InterfaceC1100c.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C1857a> getComponents() {
        p pVar = new p(b.class, f.class);
        Y a9 = C1857a.a(FirebaseMessaging.class);
        a9.f20191a = LIBRARY_NAME;
        a9.a(h.c(i.class));
        a9.a(new h(0, 0, InterfaceC1348a.class));
        a9.a(h.b(C2033b.class));
        a9.a(h.b(g.class));
        a9.a(h.c(e.class));
        a9.a(new h(pVar, 0, 1));
        a9.a(h.c(InterfaceC1100c.class));
        a9.f20196f = new C1262b(pVar, 1);
        a9.c(1);
        return Arrays.asList(a9.b(), Y6.b.j(LIBRARY_NAME, "24.1.2"));
    }
}
