package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public abstract class q extends c implements Yb.h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19129a;

    public q(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, (i7 & 1) == 1);
        this.f19129a = false;
    }

    @Override // kotlin.jvm.internal.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Yb.h getReflected() {
        if (this.f19129a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        Yb.b compute = compute();
        if (compute != this) {
            return (Yb.h) compute;
        }
        throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    @Override // kotlin.jvm.internal.c
    public final Yb.b compute() {
        return this.f19129a ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return getOwner().equals(qVar.getOwner()) && getName().equals(qVar.getName()) && getSignature().equals(qVar.getSignature()) && l.a(getBoundReceiver(), qVar.getBoundReceiver());
        }
        if (obj instanceof Yb.h) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        Yb.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
