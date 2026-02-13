package M1;

import mc.C1659d;

/* renamed from: M1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0407w extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public Q f6725a;

    /* renamed from: b, reason: collision with root package name */
    public C1659d f6726b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6727c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f6728d;

    /* renamed from: e, reason: collision with root package name */
    public int f6729e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0407w(Q q10, Jb.c cVar) {
        super(cVar);
        this.f6728d = q10;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f6727c = obj;
        this.f6729e |= Integer.MIN_VALUE;
        return Q.b(this.f6728d, this);
    }
}
