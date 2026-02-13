package com.google.firebase.abt.component;

import Y6.b;
import a7.C0783a;
import android.content.Context;
import androidx.annotation.Keep;
import c7.InterfaceC0913b;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import m4.Y;
import p7.C1857a;
import p7.InterfaceC1858b;
import p7.h;

@Keep
/* loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ C0783a lambda$getComponents$0(InterfaceC1858b interfaceC1858b) {
        return new C0783a((Context) interfaceC1858b.a(Context.class), interfaceC1858b.d(InterfaceC0913b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1857a> getComponents() {
        Y a9 = C1857a.a(C0783a.class);
        a9.f20191a = LIBRARY_NAME;
        a9.a(h.c(Context.class));
        a9.a(h.b(InterfaceC0913b.class));
        a9.f20196f = new P4.Y(25);
        return Arrays.asList(a9.b(), b.j(LIBRARY_NAME, "21.1.1"));
    }
}
