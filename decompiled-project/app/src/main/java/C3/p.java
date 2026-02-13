package C3;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final S3.g f2592a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f2593b;

    public p(S3.g gVar, Executor executor) {
        this.f2592a = gVar;
        this.f2593b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f2592a.equals(((p) obj).f2592a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2592a.hashCode();
    }
}
