package h0;

/* renamed from: h0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1216c {

    /* renamed from: a, reason: collision with root package name */
    public final int f17595a;

    public static final boolean a(int i7, int i10) {
        return i7 == i10;
    }

    public static String b(int i7) {
        return a(i7, 1) ? "Next" : a(i7, 2) ? "Previous" : a(i7, 3) ? "Left" : a(i7, 4) ? "Right" : a(i7, 5) ? "Up" : a(i7, 6) ? "Down" : a(i7, 7) ? "Enter" : a(i7, 8) ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1216c) {
            return this.f17595a == ((C1216c) obj).f17595a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17595a);
    }

    public final String toString() {
        return b(this.f17595a);
    }
}
