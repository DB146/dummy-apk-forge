package B0;

import java.text.BreakIterator;

/* renamed from: B0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171d extends AbstractC0169c {

    /* renamed from: e, reason: collision with root package name */
    public static C0171d f1870e;

    /* renamed from: f, reason: collision with root package name */
    public static C0171d f1871f;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1872c;

    /* renamed from: d, reason: collision with root package name */
    public BreakIterator f1873d;

    @Override // B0.AbstractC0169c
    public final int[] e(int i7) {
        switch (this.f1872c) {
            case 0:
                int length = i().length();
                if (length <= 0 || i7 >= length) {
                    return null;
                }
                if (i7 < 0) {
                    i7 = 0;
                }
                do {
                    BreakIterator breakIterator = this.f1873d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.l.j("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i7)) {
                        BreakIterator breakIterator2 = this.f1873d;
                        if (breakIterator2 == null) {
                            kotlin.jvm.internal.l.j("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i7);
                        if (following == -1) {
                            return null;
                        }
                        return h(i7, following);
                    }
                    BreakIterator breakIterator3 = this.f1873d;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.l.j("impl");
                        throw null;
                    }
                    i7 = breakIterator3.following(i7);
                } while (i7 != -1);
                return null;
            default:
                if (i().length() <= 0 || i7 >= i().length()) {
                    return null;
                }
                if (i7 < 0) {
                    i7 = 0;
                }
                while (!q(i7) && (!q(i7) || (i7 != 0 && q(i7 - 1)))) {
                    BreakIterator breakIterator4 = this.f1873d;
                    if (breakIterator4 == null) {
                        kotlin.jvm.internal.l.j("impl");
                        throw null;
                    }
                    i7 = breakIterator4.following(i7);
                    if (i7 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f1873d;
                if (breakIterator5 == null) {
                    kotlin.jvm.internal.l.j("impl");
                    throw null;
                }
                int following2 = breakIterator5.following(i7);
                if (following2 == -1 || !p(following2)) {
                    return null;
                }
                return h(i7, following2);
        }
    }

    @Override // B0.AbstractC0169c
    public final int[] l(int i7) {
        switch (this.f1872c) {
            case 0:
                int length = i().length();
                if (length <= 0 || i7 <= 0) {
                    return null;
                }
                if (i7 > length) {
                    i7 = length;
                }
                do {
                    BreakIterator breakIterator = this.f1873d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.l.j("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i7)) {
                        BreakIterator breakIterator2 = this.f1873d;
                        if (breakIterator2 == null) {
                            kotlin.jvm.internal.l.j("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i7);
                        if (preceding == -1) {
                            return null;
                        }
                        return h(preceding, i7);
                    }
                    BreakIterator breakIterator3 = this.f1873d;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.l.j("impl");
                        throw null;
                    }
                    i7 = breakIterator3.preceding(i7);
                } while (i7 != -1);
                return null;
            default:
                int length2 = i().length();
                if (length2 <= 0 || i7 <= 0) {
                    return null;
                }
                if (i7 > length2) {
                    i7 = length2;
                }
                while (i7 > 0 && !q(i7 - 1) && !p(i7)) {
                    BreakIterator breakIterator4 = this.f1873d;
                    if (breakIterator4 == null) {
                        kotlin.jvm.internal.l.j("impl");
                        throw null;
                    }
                    i7 = breakIterator4.preceding(i7);
                    if (i7 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f1873d;
                if (breakIterator5 == null) {
                    kotlin.jvm.internal.l.j("impl");
                    throw null;
                }
                int preceding2 = breakIterator5.preceding(i7);
                if (preceding2 == -1 || !q(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !q(preceding2 - 1)) {
                    return h(preceding2, i7);
                }
                return null;
        }
    }

    public final void o(String str) {
        switch (this.f1872c) {
            case 0:
                this.f1861a = str;
                BreakIterator breakIterator = this.f1873d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.l.j("impl");
                    throw null;
                }
            default:
                this.f1861a = str;
                BreakIterator breakIterator2 = this.f1873d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.l.j("impl");
                    throw null;
                }
        }
    }

    public boolean p(int i7) {
        return i7 > 0 && q(i7 + (-1)) && (i7 == i().length() || !q(i7));
    }

    public boolean q(int i7) {
        if (i7 < 0 || i7 >= i().length()) {
            return false;
        }
        return Character.isLetterOrDigit(i().codePointAt(i7));
    }
}
