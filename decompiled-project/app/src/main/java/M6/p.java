package M6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import t8.C2034c;

/* loaded from: classes.dex */
public final class p implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public String f6809b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f6810c;

    /* renamed from: d, reason: collision with root package name */
    public final d f6811d;

    /* renamed from: f, reason: collision with root package name */
    public int f6813f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2034c f6814u;

    /* renamed from: a, reason: collision with root package name */
    public int f6808a = 2;

    /* renamed from: e, reason: collision with root package name */
    public int f6812e = 0;

    public p(C2034c c2034c, A4.s sVar, CharSequence charSequence) {
        this.f6814u = c2034c;
        this.f6811d = (d) sVar.f471b;
        this.f6813f = sVar.f470a;
        this.f6810c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i7 = this.f6808a;
        if (i7 == 4) {
            throw new IllegalStateException();
        }
        int b2 = P.c.b(i7);
        if (b2 == 0) {
            return true;
        }
        if (b2 == 2) {
            return false;
        }
        this.f6808a = 4;
        int i10 = this.f6812e;
        while (true) {
            int i11 = this.f6812e;
            if (i11 == -1) {
                this.f6808a = 3;
                str = null;
                break;
            }
            c cVar = (c) this.f6814u.f24513b;
            CharSequence charSequence = this.f6810c;
            int length = charSequence.length();
            Q5.e.n(i11, length);
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                if (cVar.a(charSequence.charAt(i11))) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                i11 = charSequence.length();
                this.f6812e = -1;
            } else {
                this.f6812e = i11 + 1;
            }
            int i12 = this.f6812e;
            if (i12 == i10) {
                int i13 = i12 + 1;
                this.f6812e = i13;
                if (i13 > charSequence.length()) {
                    this.f6812e = -1;
                }
            } else {
                d dVar = this.f6811d;
                if (i10 < i11) {
                    charSequence.charAt(i10);
                    dVar.getClass();
                }
                if (i11 > i10) {
                    charSequence.charAt(i11 - 1);
                    dVar.getClass();
                }
                int i14 = this.f6813f;
                if (i14 == 1) {
                    i11 = charSequence.length();
                    this.f6812e = -1;
                    if (i11 > i10) {
                        charSequence.charAt(i11 - 1);
                        dVar.getClass();
                    }
                } else {
                    this.f6813f = i14 - 1;
                }
                str = charSequence.subSequence(i10, i11).toString();
            }
        }
        this.f6809b = str;
        if (this.f6808a == 3) {
            return false;
        }
        this.f6808a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6808a = 2;
        String str = this.f6809b;
        this.f6809b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
