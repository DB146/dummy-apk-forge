package pa;

import android.util.SparseIntArray;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class r extends J9.i {

    /* renamed from: E, reason: collision with root package name */
    public static final SparseIntArray f23259E;

    /* renamed from: D, reason: collision with root package name */
    public long f23260D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23259E = sparseIntArray;
        sparseIntArray.put(R.id.browse_grid_dock, 1);
    }

    @Override // J1.k
    public final void b() {
        synchronized (this) {
            this.f23260D = 0L;
        }
    }

    @Override // J1.k
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f23260D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.k
    public final void f() {
        synchronized (this) {
            this.f23260D = 1L;
        }
        j();
    }

    @Override // J1.k
    public final boolean i(int i7, int i10, J1.a aVar) {
        return false;
    }
}
