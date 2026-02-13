package gc;

import I2.Q;

/* loaded from: classes2.dex */
public final class l extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public Q f17526a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17527b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f17528c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f17529d;

    /* renamed from: e, reason: collision with root package name */
    public int f17530e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Q q10, Hb.d dVar) {
        super(dVar);
        this.f17529d = q10;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f17528c = obj;
        this.f17530e |= Integer.MIN_VALUE;
        return this.f17529d.emit(null, this);
    }
}
