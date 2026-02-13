package H;

import V0.l;
import i0.d;
import j0.AbstractC1362A;
import j0.D;
import j0.w;
import j0.x;

/* loaded from: classes.dex */
public final class b implements D {

    /* renamed from: a, reason: collision with root package name */
    public final a f4456a;

    /* renamed from: b, reason: collision with root package name */
    public final a f4457b;

    /* renamed from: c, reason: collision with root package name */
    public final a f4458c;

    /* renamed from: d, reason: collision with root package name */
    public final a f4459d;

    public b(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f4456a = aVar;
        this.f4457b = aVar2;
        this.f4458c = aVar3;
        this.f4459d = aVar4;
    }

    @Override // j0.D
    public final AbstractC1362A d(long j, l lVar, V0.c cVar) {
        float a9 = this.f4456a.a(j, cVar);
        float a10 = this.f4457b.a(j, cVar);
        float a11 = this.f4458c.a(j, cVar);
        float a12 = this.f4459d.a(j, cVar);
        float min = Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
        float f4 = a9 + a12;
        if (f4 > min) {
            float f10 = min / f4;
            a9 *= f10;
            a12 *= f10;
        }
        float f11 = a10 + a11;
        if (f11 > min) {
            float f12 = min / f11;
            a10 *= f12;
            a11 *= f12;
        }
        if (a9 < 0.0f || a10 < 0.0f || a11 < 0.0f || a12 < 0.0f) {
            B.a.a("Corner size in Px can't be negative(topStart = " + a9 + ", topEnd = " + a10 + ", bottomEnd = " + a11 + ", bottomStart = " + a12 + ")!");
        }
        if (a9 + a10 + a11 + a12 == 0.0f) {
            return new w(android.support.v4.media.session.b.b(0L, j));
        }
        i0.c b2 = android.support.v4.media.session.b.b(0L, j);
        l lVar2 = l.f9982a;
        float f13 = lVar == lVar2 ? a9 : a10;
        long floatToRawIntBits = (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L);
        if (lVar == lVar2) {
            a9 = a10;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(a9) << 32) | (Float.floatToRawIntBits(a9) & 4294967295L);
        float f14 = lVar == lVar2 ? a11 : a12;
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L);
        if (lVar != lVar2) {
            a12 = a11;
        }
        return new x(new d(b2.f18174a, b2.f18175b, b2.f18176c, b2.f18177d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(a12) << 32) | (Float.floatToRawIntBits(a12) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!kotlin.jvm.internal.l.a(this.f4456a, bVar.f4456a)) {
            return false;
        }
        if (!kotlin.jvm.internal.l.a(this.f4457b, bVar.f4457b)) {
            return false;
        }
        if (kotlin.jvm.internal.l.a(this.f4458c, bVar.f4458c)) {
            return kotlin.jvm.internal.l.a(this.f4459d, bVar.f4459d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4459d.hashCode() + ((this.f4458c.hashCode() + ((this.f4457b.hashCode() + (this.f4456a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f4456a + ", topEnd = " + this.f4457b + ", bottomEnd = " + this.f4458c + ", bottomStart = " + this.f4459d + ')';
    }
}
