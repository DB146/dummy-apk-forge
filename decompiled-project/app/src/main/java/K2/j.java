package K2;

import fc.InterfaceC1162i;

/* loaded from: classes.dex */
public final class j extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6039a;

    /* renamed from: b, reason: collision with root package name */
    public int f6040b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1162i f6041c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f6042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Hb.d dVar) {
        super(dVar);
        this.f6042d = kVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f6039a = obj;
        this.f6040b |= Integer.MIN_VALUE;
        return this.f6042d.emit(null, this);
    }
}
