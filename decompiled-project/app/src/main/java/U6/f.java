package U6;

import Q7.h;
import W6.D;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements S6.b {

    /* renamed from: a, reason: collision with root package name */
    public final h f9816a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9817b = {0};

    public f(h hVar) {
        this.f9816a = hVar;
    }

    @Override // S6.b
    public final void a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 5);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
        h hVar = this.f9816a;
        for (S6.c cVar : hVar.C(copyOf)) {
            try {
                boolean equals = cVar.f9175d.equals(D.LEGACY);
                Object obj = cVar.f9172a;
                if (equals) {
                    ((S6.b) obj).a(copyOfRange, android.support.v4.media.session.b.f(bArr2, this.f9817b));
                    return;
                } else {
                    ((S6.b) obj).a(copyOfRange, bArr2);
                    return;
                }
            } catch (GeneralSecurityException e2) {
                g.f9818a.info("tag prefix matches a key, but cannot verify: " + e2);
            }
        }
        Iterator it = hVar.C(S6.a.f9171a).iterator();
        while (it.hasNext()) {
            try {
                ((S6.b) ((S6.c) it.next()).f9172a).a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // S6.b
    public final byte[] b(byte[] bArr) {
        h hVar = this.f9816a;
        if (((S6.c) hVar.f8696c).f9175d.equals(D.LEGACY)) {
            byte[] bArr2 = ((S6.c) hVar.f8696c).f9173b;
            return android.support.v4.media.session.b.f(bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : null, ((S6.b) ((S6.c) hVar.f8696c).f9172a).b(android.support.v4.media.session.b.f(bArr, this.f9817b)));
        }
        byte[] bArr3 = ((S6.c) hVar.f8696c).f9173b;
        return android.support.v4.media.session.b.f(bArr3 != null ? Arrays.copyOf(bArr3, bArr3.length) : null, ((S6.b) ((S6.c) hVar.f8696c).f9172a).b(bArr));
    }
}
