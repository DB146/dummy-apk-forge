package J9;

import android.util.SparseIntArray;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class c extends b {

    /* renamed from: E, reason: collision with root package name */
    public static final SparseIntArray f5744E;

    /* renamed from: D, reason: collision with root package name */
    public long f5745D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5744E = sparseIntArray;
        sparseIntArray.put(R.id.channel_number, 1);
    }

    @Override // J1.k
    public final void b() {
        synchronized (this) {
            this.f5745D = 0L;
        }
    }

    @Override // J1.k
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f5745D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.k
    public final void f() {
        synchronized (this) {
            this.f5745D = 1L;
        }
        j();
    }

    @Override // J1.k
    public final boolean i(int i7, int i10, J1.a aVar) {
        return false;
    }
}
