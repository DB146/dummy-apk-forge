package t3;

import M1.C0404t;

/* renamed from: t3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2025h extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24469a;

    /* renamed from: b, reason: collision with root package name */
    public int f24470b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0404t f24471c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2025h(C0404t c0404t, Hb.d dVar) {
        super(dVar);
        this.f24471c = c0404t;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f24469a = obj;
        this.f24470b |= Integer.MIN_VALUE;
        return this.f24471c.emit(null, this);
    }
}
