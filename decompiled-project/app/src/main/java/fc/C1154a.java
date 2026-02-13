package fc;

import M1.C0405u;
import gc.C1205A;

/* renamed from: fc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1154a extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public C1205A f17115a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17116b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0405u f17117c;

    /* renamed from: d, reason: collision with root package name */
    public int f17118d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1154a(C0405u c0405u, Hb.d dVar) {
        super(dVar);
        this.f17117c = c0405u;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f17116b = obj;
        this.f17118d |= Integer.MIN_VALUE;
        return this.f17117c.a(null, this);
    }
}
