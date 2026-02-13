package Q;

import B0.C0186k0;

/* renamed from: Q.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0489f0 extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public C0186k0 f8390a;

    /* renamed from: b, reason: collision with root package name */
    public Rb.c f8391b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f8392c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0186k0 f8393d;

    /* renamed from: e, reason: collision with root package name */
    public int f8394e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0489f0(C0186k0 c0186k0, Jb.c cVar) {
        super(cVar);
        this.f8393d = c0186k0;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f8392c = obj;
        this.f8394e |= Integer.MIN_VALUE;
        return this.f8393d.n(null, this);
    }
}
