package U0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f9432b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f9433c = new l(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f9434a;

    public l(int i7) {
        this.f9434a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f9434a == ((l) obj).f9434a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9434a;
    }

    public final String toString() {
        int i7 = this.f9434a;
        if (i7 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i7 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i7 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + X0.a.a(", ", 62, arrayList) + ']';
    }
}
