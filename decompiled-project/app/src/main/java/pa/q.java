package pa;

import android.util.SparseIntArray;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class q extends k {

    /* renamed from: D, reason: collision with root package name */
    public static final SparseIntArray f23257D;

    /* renamed from: C, reason: collision with root package name */
    public long f23258C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23257D = sparseIntArray;
        sparseIntArray.put(R.id.logoChannel, 1);
        sparseIntArray.put(R.id.channel_name, 2);
    }

    @Override // J1.k
    public final void b() {
        synchronized (this) {
            this.f23258C = 0L;
        }
    }

    @Override // J1.k
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f23258C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.k
    public final void f() {
        synchronized (this) {
            this.f23258C = 1L;
        }
        j();
    }

    @Override // J1.k
    public final boolean i(int i7, int i10, J1.a aVar) {
        return false;
    }
}
