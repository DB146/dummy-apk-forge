package V0;

/* loaded from: classes.dex */
public interface c {
    default int B(float f4) {
        float p10 = p(f4);
        return Float.isInfinite(p10) ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : Math.round(p10);
    }

    default long G(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float p10 = p(Float.intBitsToFloat((int) (j >> 32)));
        float p11 = p(Float.intBitsToFloat((int) (j & 4294967295L)));
        return (Float.floatToRawIntBits(p10) << 32) | (Float.floatToRawIntBits(p11) & 4294967295L);
    }

    default float J(long j) {
        if (!o.a(n.b(j), 4294967296L)) {
            h.b("Only Sp can convert to Px");
        }
        return p(y(j));
    }

    default long P(float f4) {
        return n(a0(f4));
    }

    default float W(int i7) {
        return i7 / k();
    }

    default float a0(float f4) {
        return f4 / k();
    }

    float f();

    float k();

    default long n(float f4) {
        float[] fArr = W0.b.f10251a;
        if (!(f() >= 1.03f)) {
            return android.support.v4.media.session.b.B(4294967296L, f4 / f());
        }
        W0.a a9 = W0.b.a(f());
        return android.support.v4.media.session.b.B(4294967296L, a9 != null ? a9.a(f4) : f4 / f());
    }

    default float p(float f4) {
        return k() * f4;
    }

    default float y(long j) {
        if (!o.a(n.b(j), 4294967296L)) {
            h.b("Only Sp can convert to Px");
        }
        float[] fArr = W0.b.f10251a;
        if (f() < 1.03f) {
            return f() * n.c(j);
        }
        W0.a a9 = W0.b.a(f());
        float c10 = n.c(j);
        return a9 == null ? f() * c10 : a9.b(c10);
    }
}
