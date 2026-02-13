package A8;

/* loaded from: classes.dex */
public final class I extends Jb.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f553a;

    /* renamed from: b, reason: collision with root package name */
    public int f554b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J f555c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j, Hb.d dVar) {
        super(dVar);
        this.f555c = j;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.f553a = obj;
        this.f554b |= Integer.MIN_VALUE;
        return this.f555c.emit(null, this);
    }
}
