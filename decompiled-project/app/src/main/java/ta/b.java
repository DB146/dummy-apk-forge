package ta;

import A8.J;
import Hb.d;

/* loaded from: classes2.dex */
public final class b extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24519a;

    /* renamed from: b, reason: collision with root package name */
    public int f24520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J f24521c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(J j, d dVar) {
        super(dVar);
        this.f24521c = j;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f24519a = obj;
        this.f24520b |= Integer.MIN_VALUE;
        return this.f24521c.emit(null, this);
    }
}
