package G7;

import L7.C0385e;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final L7.j f4359a;

    /* renamed from: b, reason: collision with root package name */
    public final C0385e f4360b;

    /* renamed from: c, reason: collision with root package name */
    public final Q7.e f4361c = Q7.e.f8679f;

    public d(L7.j jVar, C0385e c0385e) {
        this.f4359a = jVar;
        this.f4360b = c0385e;
    }

    public final Q7.f a() {
        return new Q7.f(this.f4360b, this.f4361c);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && toString().equals(obj.toString());
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        C0385e c0385e = this.f4360b;
        C0385e D10 = c0385e.D();
        L7.j jVar = this.f4359a;
        d dVar = D10 != null ? new d(jVar, D10) : null;
        if (dVar == null) {
            return ((L7.k) jVar.f6356b).toString();
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dVar.toString());
            sb2.append("/");
            sb2.append(URLEncoder.encode(c0385e.isEmpty() ? null : c0385e.z().f9331a, "UTF-8").replace("+", "%20"));
            return sb2.toString();
        } catch (UnsupportedEncodingException e2) {
            StringBuilder sb3 = new StringBuilder("Failed to URLEncode key: ");
            sb3.append(c0385e.isEmpty() ? null : c0385e.z().f9331a);
            throw new RuntimeException(sb3.toString(), e2);
        }
    }
}
