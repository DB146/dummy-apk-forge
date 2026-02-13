package pa;

import android.util.SparseIntArray;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class g extends f {

    /* renamed from: E, reason: collision with root package name */
    public static final SparseIntArray f23235E;

    /* renamed from: D, reason: collision with root package name */
    public long f23236D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23235E = sparseIntArray;
        sparseIntArray.put(R.id.empty_source_notify_text_view, 1);
        sparseIntArray.put(R.id.btn_add_source, 2);
        sparseIntArray.put(R.id.container_list, 3);
        sparseIntArray.put(R.id.tab_layout, 4);
        sparseIntArray.put(R.id.view_pager, 5);
    }

    @Override // J1.k
    public final void b() {
        synchronized (this) {
            this.f23236D = 0L;
        }
    }

    @Override // J1.k
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f23236D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.k
    public final void f() {
        synchronized (this) {
            this.f23236D = 1L;
        }
        j();
    }

    @Override // J1.k
    public final boolean i(int i7, int i10, J1.a aVar) {
        return false;
    }
}
