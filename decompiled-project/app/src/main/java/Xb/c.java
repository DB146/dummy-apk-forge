package Xb;

import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class c extends a {
    static {
        new a((char) 1, (char) 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (kotlin.jvm.internal.l.f(r2.f11018a, r2.f11019b) > 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            char c10 = this.f11018a;
            char c11 = this.f11019b;
            if (l.f(c10, c11) > 0) {
                c cVar = (c) obj;
            }
            c cVar2 = (c) obj;
            if (c10 == cVar2.f11018a && c11 == cVar2.f11019b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        char c10 = this.f11018a;
        char c11 = this.f11019b;
        if (l.f(c10, c11) > 0) {
            return -1;
        }
        return (c10 * 31) + c11;
    }

    public final String toString() {
        return this.f11018a + ".." + this.f11019b;
    }
}
