package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public abstract class i extends c implements h, Yb.e {
    private final int arity;
    private final int flags;

    public i(int i7, int i10, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.arity = i7;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.c
    public Yb.b computeReflected() {
        w.f19135a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return getName().equals(iVar.getName()) && getSignature().equals(iVar.getSignature()) && this.flags == iVar.flags && this.arity == iVar.arity && l.a(getBoundReceiver(), iVar.getBoundReceiver()) && l.a(getOwner(), iVar.getOwner());
        }
        if (obj instanceof Yb.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.jvm.internal.c
    public Yb.e getReflected() {
        Yb.b compute = compute();
        if (compute != this) {
            return (Yb.e) compute;
        }
        throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // Yb.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // Yb.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // Yb.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // Yb.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // Yb.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        Yb.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
