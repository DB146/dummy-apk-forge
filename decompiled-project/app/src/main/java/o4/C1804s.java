package o4;

/* renamed from: o4.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1804s extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f21875a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21876b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1804s(int i7, int i10, int i11, int i12, m4.L l10, boolean z8, RuntimeException runtimeException) {
        super(r5.toString(), runtimeException);
        StringBuilder q10 = h3.o.q(i7, i10, "AudioTrack init failed ", " Config(", ", ");
        q10.append(i11);
        q10.append(", ");
        q10.append(i12);
        q10.append(") ");
        q10.append(l10);
        q10.append(z8 ? " (recoverable)" : "");
        this.f21875a = i7;
        this.f21876b = z8;
    }
}
