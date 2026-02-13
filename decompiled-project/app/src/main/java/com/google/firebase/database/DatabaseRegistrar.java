package com.google.firebase.database;

import A4.p;
import G7.g;
import Y6.b;
import Y6.i;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import j7.InterfaceC1385a;
import java.util.Arrays;
import java.util.List;
import m4.Y;
import o7.InterfaceC1811a;
import p7.C1857a;
import p7.InterfaceC1858b;
import p7.h;

@Keep
/* loaded from: classes.dex */
public class DatabaseRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rtdb";

    public static /* synthetic */ g lambda$getComponents$0(InterfaceC1858b interfaceC1858b) {
        return new g((i) interfaceC1858b.a(i.class), interfaceC1858b.f(InterfaceC1811a.class), interfaceC1858b.f(InterfaceC1385a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1857a> getComponents() {
        Y a9 = C1857a.a(g.class);
        a9.f20191a = LIBRARY_NAME;
        a9.a(h.c(i.class));
        a9.a(h.a(InterfaceC1811a.class));
        a9.a(h.a(InterfaceC1385a.class));
        a9.f20196f = new p(17);
        return Arrays.asList(a9.b(), b.j(LIBRARY_NAME, "21.0.0"));
    }
}
