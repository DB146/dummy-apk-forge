package com.google.android.exoplayer2.source.dash;

import P4.A;
import S4.h;
import S4.j;
import Y5.B;
import h8.e;
import java.util.List;
import l2.X;
import m4.C1558a0;
import m5.InterfaceC1615l;
import q3.l;
import r4.r;

/* loaded from: classes.dex */
public final class DashMediaSource$Factory implements A {

    /* renamed from: a, reason: collision with root package name */
    public final j f14712a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1615l f14713b;

    /* renamed from: c, reason: collision with root package name */
    public r f14714c;

    /* renamed from: d, reason: collision with root package name */
    public final e f14715d;

    /* renamed from: e, reason: collision with root package name */
    public B f14716e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14717f;
    public final long g;

    public DashMediaSource$Factory(j jVar, InterfaceC1615l interfaceC1615l) {
        this.f14712a = jVar;
        this.f14713b = interfaceC1615l;
        this.f14714c = new X();
        this.f14716e = new B(14);
        this.f14717f = 30000L;
        this.g = 5000000L;
        this.f14715d = new e(12);
    }

    public DashMediaSource$Factory(InterfaceC1615l interfaceC1615l) {
        this(new j(interfaceC1615l), interfaceC1615l);
    }

    @Override // P4.A
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h a(C1558a0 c1558a0) {
        c1558a0.f20224b.getClass();
        T4.e eVar = new T4.e();
        List list = c1558a0.f20224b.f20181e;
        return new h(c1558a0, this.f14713b, !list.isEmpty() ? new l(17, eVar, list, false) : eVar, this.f14712a, this.f14715d, this.f14714c.e(c1558a0), this.f14716e, this.f14717f, this.g);
    }
}
