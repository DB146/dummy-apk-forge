package E3;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class i implements X3.b {

    /* renamed from: a, reason: collision with root package name */
    public final MessageDigest f3540a;

    /* renamed from: b, reason: collision with root package name */
    public final X3.e f3541b = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X3.e] */
    public i(MessageDigest messageDigest) {
        this.f3540a = messageDigest;
    }

    @Override // X3.b
    public final X3.e a() {
        return this.f3541b;
    }
}
