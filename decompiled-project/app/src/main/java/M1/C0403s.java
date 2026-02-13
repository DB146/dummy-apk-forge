package M1;

/* renamed from: M1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403s extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6714a;

    /* renamed from: b, reason: collision with root package name */
    public int f6715b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0404t f6716c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0403s(C0404t c0404t, Hb.d dVar) {
        super(dVar);
        this.f6716c = c0404t;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f6714a = obj;
        this.f6715b |= Integer.MIN_VALUE;
        return this.f6716c.emit(null, this);
    }
}
