package J9;

import A0.G0;
import android.util.SparseIntArray;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class g extends f {

    /* renamed from: E, reason: collision with root package name */
    public static final G0 f5755E;

    /* renamed from: F, reason: collision with root package name */
    public static final SparseIntArray f5756F;

    /* renamed from: D, reason: collision with root package name */
    public long f5757D;

    static {
        G0 g02 = new G0(11);
        f5755E = g02;
        int[] iArr = {R.layout.lb_program_row_header};
        ((String[][]) g02.f27b)[1] = new String[]{"lb_program_row_header"};
        ((int[][]) g02.f28c)[1] = new int[]{2};
        ((int[][]) g02.f29d)[1] = iArr;
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5756F = sparseIntArray;
        sparseIntArray.put(R.id.video_title, 3);
        sparseIntArray.put(R.id.video_duration_title, 4);
        sparseIntArray.put(R.id.video_duration, 5);
        sparseIntArray.put(R.id.video_resolution, 6);
        sparseIntArray.put(R.id.video_frame_rate, 7);
        sparseIntArray.put(R.id.video_codec, 8);
        sparseIntArray.put(R.id.audio_codec, 9);
        sparseIntArray.put(R.id.byte_rate, 10);
    }

    @Override // J1.k
    public final void b() {
        long j;
        synchronized (this) {
            j = this.f5757D;
            this.f5757D = 0L;
        }
        if ((j & 2) != 0) {
            this.f5754C.m(this.f5434e.getResources().getString(R.string.nav_info_title));
        }
        this.f5754C.c();
    }

    @Override // J1.k
    public final boolean e() {
        synchronized (this) {
            try {
                if (this.f5757D != 0) {
                    return true;
                }
                return this.f5754C.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.k
    public final void f() {
        synchronized (this) {
            this.f5757D = 2L;
        }
        this.f5754C.f();
        j();
    }

    @Override // J1.k
    public final boolean i(int i7, int i10, J1.a aVar) {
        if (i7 != 0) {
            return false;
        }
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f5757D |= 1;
        }
        return true;
    }
}
