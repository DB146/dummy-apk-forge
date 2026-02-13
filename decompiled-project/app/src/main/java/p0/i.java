package p0;

/* loaded from: classes.dex */
public final class i extends l {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        ((i) obj).getClass();
        return Float.compare(18.3f, 18.3f) == 0 && Float.compare(5.71f, 5.71f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(5.71f) + (Float.hashCode(18.3f) * 31);
    }

    public final String toString() {
        return "MoveTo(x=18.3, y=5.71)";
    }
}
