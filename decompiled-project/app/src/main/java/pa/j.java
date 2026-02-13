package pa;

import android.util.SparseIntArray;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class j extends i {

    /* renamed from: K, reason: collision with root package name */
    public static final SparseIntArray f23246K;

    /* renamed from: J, reason: collision with root package name */
    public long f23247J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23246K = sparseIntArray;
        sparseIntArray.put(R.id.version_title, 1);
        sparseIntArray.put(R.id.btn_check_update, 2);
        sparseIntArray.put(R.id.btn_custom_number, 3);
        sparseIntArray.put(R.id.imedia_link, 4);
        sparseIntArray.put(R.id.fb_group_link, 5);
        sparseIntArray.put(R.id.zalo_group_link, 6);
    }

    @Override // J1.k
    public final void b() {
        synchronized (this) {
            this.f23247J = 0L;
        }
    }

    @Override // J1.k
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f23247J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.k
    public final void f() {
        synchronized (this) {
            this.f23247J = 1L;
        }
        j();
    }

    @Override // J1.k
    public final boolean i(int i7, int i10, J1.a aVar) {
        return false;
    }
}
