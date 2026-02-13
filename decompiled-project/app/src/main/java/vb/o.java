package vb;

/* loaded from: classes2.dex */
public final class o extends gb.o {

    /* renamed from: b, reason: collision with root package name */
    public static final q f25418b = new q("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())), false);

    /* renamed from: a, reason: collision with root package name */
    public final q f25419a = f25418b;

    @Override // gb.o
    public final gb.n a() {
        return new p(this.f25419a);
    }
}
