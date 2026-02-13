package u;

/* renamed from: u.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2057j {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f24689a;

    static {
        long[] jArr = Q.f24633a;
        int e2 = Q.e(0);
        int max = e2 > 0 ? Math.max(7, Q.d(e2)) : 0;
        if (max != 0) {
            jArr = new long[((max + 15) & (-8)) >> 3];
            Eb.n.V(jArr, -9187201950435737472L);
        }
        int i7 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i7] = (jArr[i7] & (~j)) | j;
        float[] fArr = new float[max];
        f24689a = new float[0];
    }
}
