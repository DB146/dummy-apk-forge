package com.google.firebase.firestore;

import Y6.b;
import Y6.i;
import Y6.m;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import f8.C1143a;
import h8.g;
import j7.InterfaceC1385a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import m4.Y;
import o7.InterfaceC1811a;
import p7.C1857a;
import p7.InterfaceC1858b;
import p7.h;
import t8.C2033b;

@Keep
/* loaded from: classes.dex */
public class FirestoreRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, f8.a] */
    public static C1143a lambda$getComponents$0(InterfaceC1858b interfaceC1858b) {
        i iVar = (i) interfaceC1858b.a(i.class);
        interfaceC1858b.f(InterfaceC1811a.class);
        interfaceC1858b.f(InterfaceC1385a.class);
        interfaceC1858b.d(C2033b.class);
        interfaceC1858b.d(g.class);
        ?? obj = new Object();
        new HashMap();
        iVar.b();
        iVar.j.add(obj);
        return obj;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C1857a> getComponents() {
        Y a9 = C1857a.a(C1143a.class);
        a9.f20191a = LIBRARY_NAME;
        a9.a(h.c(i.class));
        a9.a(h.c(Context.class));
        a9.a(h.b(g.class));
        a9.a(h.b(C2033b.class));
        a9.a(h.a(InterfaceC1811a.class));
        a9.a(h.a(InterfaceC1385a.class));
        a9.a(new h(0, 0, m.class));
        a9.f20196f = new P4.Y(27);
        return Arrays.asList(a9.b(), b.j(LIBRARY_NAME, "25.1.4"));
    }
}
