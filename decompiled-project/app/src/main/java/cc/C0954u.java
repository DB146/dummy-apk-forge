package cc;

import java.util.concurrent.CancellationException;

/* renamed from: cc.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0954u {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14576a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0940k f14577b;

    /* renamed from: c, reason: collision with root package name */
    public final Rb.c f14578c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f14579d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f14580e;

    public C0954u(Object obj, AbstractC0940k abstractC0940k, Rb.c cVar, Object obj2, Throwable th) {
        this.f14576a = obj;
        this.f14577b = abstractC0940k;
        this.f14578c = cVar;
        this.f14579d = obj2;
        this.f14580e = th;
    }

    public /* synthetic */ C0954u(Object obj, AbstractC0940k abstractC0940k, Rb.c cVar, CancellationException cancellationException, int i7) {
        this(obj, (i7 & 2) != 0 ? null : abstractC0940k, (i7 & 4) != 0 ? null : cVar, (Object) null, (i7 & 16) != 0 ? null : cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0954u a(C0954u c0954u, AbstractC0940k abstractC0940k, CancellationException cancellationException, int i7) {
        Object obj = c0954u.f14576a;
        if ((i7 & 2) != 0) {
            abstractC0940k = c0954u.f14577b;
        }
        AbstractC0940k abstractC0940k2 = abstractC0940k;
        Rb.c cVar = c0954u.f14578c;
        Object obj2 = c0954u.f14579d;
        CancellationException cancellationException2 = cancellationException;
        if ((i7 & 16) != 0) {
            cancellationException2 = c0954u.f14580e;
        }
        c0954u.getClass();
        return new C0954u(obj, abstractC0940k2, cVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0954u)) {
            return false;
        }
        C0954u c0954u = (C0954u) obj;
        return kotlin.jvm.internal.l.a(this.f14576a, c0954u.f14576a) && kotlin.jvm.internal.l.a(this.f14577b, c0954u.f14577b) && kotlin.jvm.internal.l.a(this.f14578c, c0954u.f14578c) && kotlin.jvm.internal.l.a(this.f14579d, c0954u.f14579d) && kotlin.jvm.internal.l.a(this.f14580e, c0954u.f14580e);
    }

    public final int hashCode() {
        Object obj = this.f14576a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC0940k abstractC0940k = this.f14577b;
        int hashCode2 = (hashCode + (abstractC0940k == null ? 0 : abstractC0940k.hashCode())) * 31;
        Rb.c cVar = this.f14578c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Object obj2 = this.f14579d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f14580e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f14576a + ", cancelHandler=" + this.f14577b + ", onCancellation=" + this.f14578c + ", idempotentResume=" + this.f14579d + ", cancelCause=" + this.f14580e + ')';
    }
}
