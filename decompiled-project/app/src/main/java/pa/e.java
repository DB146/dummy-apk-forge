package pa;

import android.util.SparseIntArray;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class e extends AbstractC1866d {

    /* renamed from: I, reason: collision with root package name */
    public static final SparseIntArray f23232I;

    /* renamed from: H, reason: collision with root package name */
    public long f23233H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23232I = sparseIntArray;
        sparseIntArray.put(R.id.txt_channel_number, 1);
        sparseIntArray.put(R.id.btn_back, 2);
        sparseIntArray.put(R.id.btn_reset, 3);
        sparseIntArray.put(R.id.btn_save, 4);
    }

    @Override // J1.k
    public final void b() {
        synchronized (this) {
            this.f23233H = 0L;
        }
    }

    @Override // J1.k
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f23233H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.k
    public final void f() {
        synchronized (this) {
            this.f23233H = 1L;
        }
        j();
    }

    @Override // J1.k
    public final boolean i(int i7, int i10, J1.a aVar) {
        return false;
    }
}
