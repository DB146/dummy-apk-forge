package b4;

import android.util.Base64;
import java.util.Arrays;

/* renamed from: b4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0838i {

    /* renamed from: a, reason: collision with root package name */
    public final String f13859a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f13860b;

    /* renamed from: c, reason: collision with root package name */
    public final Y3.d f13861c;

    public C0838i(String str, byte[] bArr, Y3.d dVar) {
        this.f13859a = str;
        this.f13860b = bArr;
        this.f13861c = dVar;
    }

    public static Q7.h a() {
        Q7.h hVar = new Q7.h(22, (char) 0);
        hVar.f8697d = Y3.d.f11149a;
        return hVar;
    }

    public final C0838i b(Y3.d dVar) {
        Q7.h a9 = a();
        a9.O(this.f13859a);
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        a9.f8697d = dVar;
        a9.f8696c = this.f13860b;
        return a9.n();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0838i)) {
            return false;
        }
        C0838i c0838i = (C0838i) obj;
        return this.f13859a.equals(c0838i.f13859a) && Arrays.equals(this.f13860b, c0838i.f13860b) && this.f13861c.equals(c0838i.f13861c);
    }

    public final int hashCode() {
        return ((((this.f13859a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13860b)) * 1000003) ^ this.f13861c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f13860b;
        return "TransportContext(" + this.f13859a + ", " + this.f13861c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
