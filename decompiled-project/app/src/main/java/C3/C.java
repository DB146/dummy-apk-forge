package C3;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class C implements A3.h {
    public static final W3.k j = new W3.k(50);

    /* renamed from: b, reason: collision with root package name */
    public final D3.f f2494b;

    /* renamed from: c, reason: collision with root package name */
    public final A3.h f2495c;

    /* renamed from: d, reason: collision with root package name */
    public final A3.h f2496d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2497e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2498f;
    public final Class g;

    /* renamed from: h, reason: collision with root package name */
    public final A3.l f2499h;

    /* renamed from: i, reason: collision with root package name */
    public final A3.p f2500i;

    public C(D3.f fVar, A3.h hVar, A3.h hVar2, int i7, int i10, A3.p pVar, Class cls, A3.l lVar) {
        this.f2494b = fVar;
        this.f2495c = hVar;
        this.f2496d = hVar2;
        this.f2497e = i7;
        this.f2498f = i10;
        this.f2500i = pVar;
        this.g = cls;
        this.f2499h = lVar;
    }

    @Override // A3.h
    public final void b(MessageDigest messageDigest) {
        Object e2;
        D3.f fVar = this.f2494b;
        synchronized (fVar) {
            D3.e eVar = fVar.f3174b;
            D3.h hVar = (D3.h) ((ArrayDeque) eVar.f3094a).poll();
            if (hVar == null) {
                hVar = eVar.K();
            }
            D3.d dVar = (D3.d) hVar;
            dVar.f3170b = 8;
            dVar.f3171c = byte[].class;
            e2 = fVar.e(dVar, byte[].class);
        }
        byte[] bArr = (byte[]) e2;
        ByteBuffer.wrap(bArr).putInt(this.f2497e).putInt(this.f2498f).array();
        this.f2496d.b(messageDigest);
        this.f2495c.b(messageDigest);
        messageDigest.update(bArr);
        A3.p pVar = this.f2500i;
        if (pVar != null) {
            pVar.b(messageDigest);
        }
        this.f2499h.b(messageDigest);
        W3.k kVar = j;
        Class cls = this.g;
        byte[] bArr2 = (byte[]) kVar.a(cls);
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(A3.h.f353a);
            kVar.d(cls, bArr2);
        }
        messageDigest.update(bArr2);
        this.f2494b.g(bArr);
    }

    @Override // A3.h
    public final boolean equals(Object obj) {
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return this.f2498f == c10.f2498f && this.f2497e == c10.f2497e && W3.o.b(this.f2500i, c10.f2500i) && this.g.equals(c10.g) && this.f2495c.equals(c10.f2495c) && this.f2496d.equals(c10.f2496d) && this.f2499h.equals(c10.f2499h);
    }

    @Override // A3.h
    public final int hashCode() {
        int hashCode = ((((this.f2496d.hashCode() + (this.f2495c.hashCode() * 31)) * 31) + this.f2497e) * 31) + this.f2498f;
        A3.p pVar = this.f2500i;
        if (pVar != null) {
            hashCode = (hashCode * 31) + pVar.hashCode();
        }
        return this.f2499h.f360b.hashCode() + ((this.g.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f2495c + ", signature=" + this.f2496d + ", width=" + this.f2497e + ", height=" + this.f2498f + ", decodedResourceClass=" + this.g + ", transformation='" + this.f2500i + "', options=" + this.f2499h + '}';
    }
}
