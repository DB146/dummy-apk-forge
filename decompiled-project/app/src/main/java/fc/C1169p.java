package fc;

import gc.C1205A;

/* renamed from: fc.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1169p extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17167a;

    /* renamed from: b, reason: collision with root package name */
    public int f17168b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A8.K f17169c;

    /* renamed from: d, reason: collision with root package name */
    public A8.K f17170d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1162i f17171e;

    /* renamed from: f, reason: collision with root package name */
    public C1205A f17172f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1169p(A8.K k, Hb.d dVar) {
        super(dVar);
        this.f17169c = k;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f17167a = obj;
        this.f17168b |= Integer.MIN_VALUE;
        return this.f17169c.a(null, this);
    }
}
