package com.google.firebase.datatransport;

import W7.b;
import Y3.f;
import Z3.a;
import android.content.Context;
import androidx.annotation.Keep;
import b4.p;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import m4.Y;
import p7.C1857a;
import p7.InterfaceC1858b;
import p7.h;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ f lambda$getComponents$0(InterfaceC1858b interfaceC1858b) {
        p.b((Context) interfaceC1858b.a(Context.class));
        return p.a().c(a.f12140f);
    }

    public static /* synthetic */ f lambda$getComponents$1(InterfaceC1858b interfaceC1858b) {
        p.b((Context) interfaceC1858b.a(Context.class));
        return p.a().c(a.f12140f);
    }

    public static /* synthetic */ f lambda$getComponents$2(InterfaceC1858b interfaceC1858b) {
        p.b((Context) interfaceC1858b.a(Context.class));
        return p.a().c(a.f12139e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1857a> getComponents() {
        Y a9 = C1857a.a(f.class);
        a9.f20191a = LIBRARY_NAME;
        a9.a(h.c(Context.class));
        a9.f20196f = new P4.Y(9);
        C1857a b2 = a9.b();
        Y b10 = C1857a.b(new p7.p(W7.a.class, f.class));
        b10.a(h.c(Context.class));
        b10.f20196f = new P4.Y(10);
        C1857a b11 = b10.b();
        Y b12 = C1857a.b(new p7.p(b.class, f.class));
        b12.a(h.c(Context.class));
        b12.f20196f = new P4.Y(11);
        return Arrays.asList(b2, b11, b12.b(), Y6.b.j(LIBRARY_NAME, "19.0.0"));
    }
}
