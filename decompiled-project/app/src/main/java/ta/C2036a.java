package ta;

import Hb.d;
import M1.C0404t;

/* renamed from: ta.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2036a extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24516a;

    /* renamed from: b, reason: collision with root package name */
    public int f24517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0404t f24518c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2036a(C0404t c0404t, d dVar) {
        super(dVar);
        this.f24518c = c0404t;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f24516a = obj;
        this.f24517b |= Integer.MIN_VALUE;
        return this.f24518c.emit(null, this);
    }
}
