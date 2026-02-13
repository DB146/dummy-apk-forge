package w1;

/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2197a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f25639e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f25640a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25641b;

    /* renamed from: c, reason: collision with root package name */
    public int f25642c;

    /* renamed from: d, reason: collision with root package name */
    public char f25643d;

    static {
        for (int i7 = 0; i7 < 1792; i7++) {
            f25639e[i7] = Character.getDirectionality(i7);
        }
    }

    public C2197a(CharSequence charSequence) {
        this.f25640a = charSequence;
        this.f25641b = charSequence.length();
    }

    public final byte a() {
        int i7 = this.f25642c - 1;
        CharSequence charSequence = this.f25640a;
        char charAt = charSequence.charAt(i7);
        this.f25643d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f25642c);
            this.f25642c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f25642c--;
        char c10 = this.f25643d;
        return c10 < 1792 ? f25639e[c10] : Character.getDirectionality(c10);
    }
}
