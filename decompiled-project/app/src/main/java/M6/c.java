package M6;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: a, reason: collision with root package name */
    public final char f6795a;

    public c(char c10) {
        this.f6795a = c10;
    }

    @Override // M6.b
    public final boolean a(char c10) {
        return c10 == this.f6795a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c10 = this.f6795a;
        for (int i7 = 0; i7 < 4; i7++) {
            cArr[5 - i7] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        sb2.append(String.copyValueOf(cArr));
        sb2.append("')");
        return sb2.toString();
    }
}
