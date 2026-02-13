package B0;

/* renamed from: B0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177g extends AbstractC0169c {

    /* renamed from: c, reason: collision with root package name */
    public static C0177g f1906c;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        return null;
     */
    @Override // B0.AbstractC0169c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] e(int i7) {
        int length = i().length();
        if (length <= 0 || i7 >= length) {
            return null;
        }
        if (i7 < 0) {
            i7 = 0;
        }
        while (i7 < length && i().charAt(i7) == '\n' && !p(i7)) {
            i7++;
        }
        int i10 = i7 + 1;
        while (i10 < length && !o(i10)) {
            i10++;
        }
        return h(i7, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        return null;
     */
    @Override // B0.AbstractC0169c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] l(int i7) {
        int length = i().length();
        if (length <= 0 || i7 <= 0) {
            return null;
        }
        if (i7 > length) {
            i7 = length;
        }
        while (i7 > 0 && i().charAt(i7 - 1) == '\n' && !o(i7)) {
            i7--;
        }
        int i10 = i7 - 1;
        while (i10 > 0 && !p(i10)) {
            i10--;
        }
        return h(i10, i7);
    }

    public final boolean o(int i7) {
        return i7 > 0 && i().charAt(i7 + (-1)) != '\n' && (i7 == i().length() || i().charAt(i7) == '\n');
    }

    public final boolean p(int i7) {
        return i().charAt(i7) != '\n' && (i7 == 0 || i().charAt(i7 - 1) == '\n');
    }
}
