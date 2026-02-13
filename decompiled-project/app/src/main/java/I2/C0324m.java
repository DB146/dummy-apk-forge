package I2;

/* renamed from: I2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324m extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5176a;

    /* renamed from: b, reason: collision with root package name */
    public int f5177b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A8.J f5178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0324m(A8.J j, Hb.d dVar) {
        super(dVar);
        this.f5178c = j;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f5176a = obj;
        this.f5177b |= Integer.MIN_VALUE;
        return this.f5178c.emit(null, this);
    }
}
