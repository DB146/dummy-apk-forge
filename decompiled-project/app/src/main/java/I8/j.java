package I8;

/* loaded from: classes.dex */
public final class j extends Number {

    /* renamed from: a, reason: collision with root package name */
    public final String f5279a;

    public j(String str) {
        this.f5279a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f5279a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.f5279a.equals(((j) obj).f5279a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f5279a);
    }

    public final int hashCode() {
        return this.f5279a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f5279a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return h.i(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f5279a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return h.i(str).longValue();
        }
    }

    public final String toString() {
        return this.f5279a;
    }
}
