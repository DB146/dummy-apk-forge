package M1;

import mc.C1659d;

/* renamed from: M1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0410z extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public Q f6738a;

    /* renamed from: b, reason: collision with root package name */
    public C1659d f6739b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6740c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f6741d;

    /* renamed from: e, reason: collision with root package name */
    public int f6742e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0410z(Q q10, Jb.c cVar) {
        super(cVar);
        this.f6741d = q10;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f6740c = obj;
        this.f6742e |= Integer.MIN_VALUE;
        return Q.d(this.f6741d, this);
    }
}
