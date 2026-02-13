package w;

import y0.AbstractC2322G;
import y0.AbstractC2323H;

/* renamed from: w.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2184k extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2186m f25580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2323H f25581b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25582c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2184k(C2186m c2186m, AbstractC2323H abstractC2323H, long j) {
        super(1);
        this.f25580a = c2186m;
        this.f25581b = abstractC2323H;
        this.f25582c = j;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        c0.e eVar = this.f25580a.f25588E.f25591b;
        AbstractC2322G.f((AbstractC2322G) obj, this.f25581b, eVar.a((r0.f26555b & 4294967295L) | (r0.f26554a << 32), this.f25582c, V0.l.f9982a));
        return Db.q.f3365a;
    }
}
