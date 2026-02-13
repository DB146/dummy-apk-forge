package O6;

import java.util.Objects;

/* loaded from: classes.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static final c f7485c = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* renamed from: a, reason: collision with root package name */
    public final a f7486a;

    /* renamed from: b, reason: collision with root package name */
    public final Character f7487b;

    static {
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public d(a aVar, Character ch) {
        aVar.getClass();
        this.f7486a = aVar;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = aVar.f7483e;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                throw new IllegalArgumentException(Tb.a.w("Padding character %s was already in alphabet", ch));
            }
        }
        this.f7487b = ch;
    }

    public d(String str, String str2) {
        this(new a(str, str2.toCharArray()), (Character) '=');
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f7486a.equals(dVar.f7486a) && Objects.equals(this.f7487b, dVar.f7487b);
    }

    public final int hashCode() {
        return this.f7486a.hashCode() ^ Objects.hashCode(this.f7487b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        a aVar = this.f7486a;
        sb2.append(aVar);
        if (8 % aVar.f7481c != 0) {
            Character ch = this.f7487b;
            if (ch == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }
}
