package U0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f9418b = 66305;

    /* renamed from: a, reason: collision with root package name */
    public final int f9419a;

    public /* synthetic */ e(int i7) {
        this.f9419a = i7;
    }

    public static String a(int i7) {
        StringBuilder sb2 = new StringBuilder("LineBreak(strategy=");
        int i10 = i7 & 255;
        String str = "Invalid";
        sb2.append((Object) (c2.q.i(i10, 1) ? "Strategy.Simple" : c2.q.i(i10, 2) ? "Strategy.HighQuality" : c2.q.i(i10, 3) ? "Strategy.Balanced" : c2.q.i(i10, 0) ? "Strategy.Unspecified" : "Invalid"));
        sb2.append(", strictness=");
        int i11 = (i7 >> 8) & 255;
        sb2.append((Object) (c2.i.m(i11, 1) ? "Strictness.None" : c2.i.m(i11, 2) ? "Strictness.Loose" : c2.i.m(i11, 3) ? "Strictness.Normal" : c2.i.m(i11, 4) ? "Strictness.Strict" : c2.i.m(i11, 0) ? "Strictness.Unspecified" : "Invalid"));
        sb2.append(", wordBreak=");
        int i12 = (i7 >> 16) & 255;
        if (i12 == 1) {
            str = "WordBreak.None";
        } else if (i12 == 2) {
            str = "WordBreak.Phrase";
        } else if (i12 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f9419a == ((e) obj).f9419a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9419a);
    }

    public final String toString() {
        return a(this.f9419a);
    }
}
