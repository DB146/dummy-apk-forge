package M6;

/* loaded from: classes.dex */
public final class a extends k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6794a = new Object();

    @Override // M6.k
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // M6.k
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
