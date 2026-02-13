package L7;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public AtomicBoolean f6409a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final Q7.f f6410b;

    public x(Q7.f fVar) {
        this.f6410b = fVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x) && ((x) obj).f6410b.equals(this.f6410b);
    }

    public final int hashCode() {
        return this.f6410b.hashCode();
    }
}
