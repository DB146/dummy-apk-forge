package pa;

import android.util.SparseIntArray;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class n extends m {

    /* renamed from: E, reason: collision with root package name */
    public static final SparseIntArray f23251E;

    /* renamed from: D, reason: collision with root package name */
    public long f23252D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23251E = sparseIntArray;
        sparseIntArray.put(R.id.title, 1);
        sparseIntArray.put(R.id.browse_grid_dock, 2);
    }

    @Override // J1.k
    public final void b() {
        synchronized (this) {
            this.f23252D = 0L;
        }
    }

    @Override // J1.k
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f23252D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.k
    public final void f() {
        synchronized (this) {
            this.f23252D = 1L;
        }
        j();
    }

    @Override // J1.k
    public final boolean i(int i7, int i10, J1.a aVar) {
        return false;
    }
}
