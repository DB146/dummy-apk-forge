package vb;

/* renamed from: vb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2168b {

    /* renamed from: a, reason: collision with root package name */
    public final int f25377a;

    /* renamed from: b, reason: collision with root package name */
    public final C2169c[] f25378b;

    /* renamed from: c, reason: collision with root package name */
    public long f25379c;

    /* JADX WARN: Multi-variable type inference failed */
    public C2168b(int i7, q qVar) {
        this.f25377a = i7;
        this.f25378b = new C2169c[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            this.f25378b[i10] = new p(qVar);
        }
    }
}
