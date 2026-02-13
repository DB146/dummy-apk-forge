package pa;

import android.util.SparseIntArray;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class l extends k {

    /* renamed from: D, reason: collision with root package name */
    public static final SparseIntArray f23248D;

    /* renamed from: C, reason: collision with root package name */
    public long f23249C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23248D = sparseIntArray;
        sparseIntArray.put(R.id.container_list, 1);
        sparseIntArray.put(R.id.tab_layout, 2);
        sparseIntArray.put(R.id.view_pager, 3);
    }

    @Override // J1.k
    public final void b() {
        synchronized (this) {
            this.f23249C = 0L;
        }
    }

    @Override // J1.k
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f23249C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.k
    public final void f() {
        synchronized (this) {
            this.f23249C = 1L;
        }
        j();
    }

    @Override // J1.k
    public final boolean i(int i7, int i10, J1.a aVar) {
        return false;
    }
}
