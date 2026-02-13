package fc;

import M1.C0404t;

/* loaded from: classes2.dex */
public final class G extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17069a;

    /* renamed from: b, reason: collision with root package name */
    public int f17070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0404t f17071c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C0404t c0404t, Hb.d dVar) {
        super(dVar);
        this.f17071c = c0404t;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f17069a = obj;
        this.f17070b |= Integer.MIN_VALUE;
        return this.f17071c.emit(null, this);
    }
}
