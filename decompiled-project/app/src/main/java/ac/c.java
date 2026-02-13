package ac;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class c implements Iterator, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f12826a;

    /* renamed from: b, reason: collision with root package name */
    public int f12827b;

    /* renamed from: c, reason: collision with root package name */
    public int f12828c;

    /* renamed from: d, reason: collision with root package name */
    public int f12829d;

    /* renamed from: e, reason: collision with root package name */
    public int f12830e;

    public c(String string) {
        kotlin.jvm.internal.l.e(string, "string");
        this.f12826a = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        int i10;
        int i11 = this.f12827b;
        if (i11 != 0) {
            return i11 == 1;
        }
        if (this.f12830e < 0) {
            this.f12827b = 2;
            return false;
        }
        String str = this.f12826a;
        int length = str.length();
        int length2 = str.length();
        for (int i12 = this.f12828c; i12 < length2; i12++) {
            char charAt = str.charAt(i12);
            if (charAt == '\n' || charAt == '\r') {
                i7 = (charAt == '\r' && (i10 = i12 + 1) < str.length() && str.charAt(i10) == '\n') ? 2 : 1;
                length = i12;
                this.f12827b = 1;
                this.f12830e = i7;
                this.f12829d = length;
                return true;
            }
        }
        i7 = -1;
        this.f12827b = 1;
        this.f12830e = i7;
        this.f12829d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12827b = 0;
        int i7 = this.f12829d;
        int i10 = this.f12828c;
        this.f12828c = this.f12830e + i7;
        return this.f12826a.subSequence(i10, i7).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
