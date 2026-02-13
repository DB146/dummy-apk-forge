package Ma;

import android.util.SparseIntArray;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class c extends b {

    /* renamed from: I, reason: collision with root package name */
    public static final SparseIntArray f6927I;

    /* renamed from: H, reason: collision with root package name */
    public long f6928H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6927I = sparseIntArray;
        sparseIntArray.put(R.id.gg_assistant, 1);
        sparseIntArray.put(R.id.always_btn, 2);
        sparseIntArray.put(R.id.use_btn, 3);
        sparseIntArray.put(R.id.voice_app_item, 4);
        sparseIntArray.put(R.id.install_btn, 5);
    }

    @Override // J1.k
    public final void b() {
        synchronized (this) {
            this.f6928H = 0L;
        }
    }

    @Override // J1.k
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f6928H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.k
    public final void f() {
        synchronized (this) {
            this.f6928H = 1L;
        }
        j();
    }

    @Override // J1.k
    public final boolean i(int i7, int i10, J1.a aVar) {
        return false;
    }
}
