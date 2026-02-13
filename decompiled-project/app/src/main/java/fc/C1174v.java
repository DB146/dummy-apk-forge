package fc;

/* renamed from: fc.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1174v extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public C1159f f17195a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17196b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f17197c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1159f f17198d;

    /* renamed from: e, reason: collision with root package name */
    public int f17199e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1174v(C1159f c1159f, Hb.d dVar) {
        super(dVar);
        this.f17198d = c1159f;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f17197c = obj;
        this.f17199e |= Integer.MIN_VALUE;
        return this.f17198d.emit(null, this);
    }
}
