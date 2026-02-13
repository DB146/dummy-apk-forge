package com.google.android.exoplayer2.source.smoothstreaming;

import P4.A;
import P4.AbstractC0453a;
import P4.C0463k;
import S4.j;
import Y4.c;
import Y5.B;
import h8.e;
import java.util.List;
import l2.X;
import m4.C1558a0;
import m5.InterfaceC1615l;
import m5.L;
import q3.l;
import r4.q;

/* loaded from: classes.dex */
public final class SsMediaSource$Factory implements A {

    /* renamed from: a, reason: collision with root package name */
    public final j f14728a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1615l f14729b;

    /* renamed from: d, reason: collision with root package name */
    public final X f14731d = new X();

    /* renamed from: e, reason: collision with root package name */
    public final B f14732e = new B(14);

    /* renamed from: f, reason: collision with root package name */
    public final long f14733f = 30000;

    /* renamed from: c, reason: collision with root package name */
    public final e f14730c = new e(12);

    public SsMediaSource$Factory(InterfaceC1615l interfaceC1615l) {
        this.f14728a = new j(interfaceC1615l);
        this.f14729b = interfaceC1615l;
    }

    @Override // P4.A
    public final AbstractC0453a a(C1558a0 c1558a0) {
        c1558a0.f20224b.getClass();
        C0463k c0463k = new C0463k(16);
        List list = c1558a0.f20224b.f20181e;
        L lVar = !list.isEmpty() ? new l(17, c0463k, list, false) : c0463k;
        q e2 = this.f14731d.e(c1558a0);
        B b2 = this.f14732e;
        return new c(c1558a0, this.f14729b, lVar, this.f14728a, this.f14730c, e2, b2, this.f14733f);
    }
}
