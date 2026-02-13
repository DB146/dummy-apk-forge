package com.google.firebase.ktx;

import Db.a;
import androidx.annotation.Keep;
import cc.A;
import com.google.firebase.components.ComponentRegistrar;
import f7.InterfaceC1142a;
import f7.b;
import f7.c;
import f7.d;
import java.util.List;
import java.util.concurrent.Executor;
import m4.Y;
import p7.C1857a;
import p7.h;
import p7.p;
import q8.C1906a;
import y7.u0;

@a
@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1857a> getComponents() {
        Y b2 = C1857a.b(new p(InterfaceC1142a.class, A.class));
        b2.a(new h(new p(InterfaceC1142a.class, Executor.class), 1, 0));
        b2.f20196f = C1906a.f23546b;
        C1857a b10 = b2.b();
        Y b11 = C1857a.b(new p(c.class, A.class));
        b11.a(new h(new p(c.class, Executor.class), 1, 0));
        b11.f20196f = C1906a.f23547c;
        C1857a b12 = b11.b();
        Y b13 = C1857a.b(new p(b.class, A.class));
        b13.a(new h(new p(b.class, Executor.class), 1, 0));
        b13.f20196f = C1906a.f23548d;
        C1857a b14 = b13.b();
        Y b15 = C1857a.b(new p(d.class, A.class));
        b15.a(new h(new p(d.class, Executor.class), 1, 0));
        b15.f20196f = C1906a.f23549e;
        return u0.y(b10, b12, b14, b15.b());
    }
}
