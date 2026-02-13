package Ma;

import android.util.SparseIntArray;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class e extends d {

    /* renamed from: G, reason: collision with root package name */
    public static final SparseIntArray f6932G;

    /* renamed from: F, reason: collision with root package name */
    public long f6933F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6932G = sparseIntArray;
        sparseIntArray.put(R.id.voice_app_item, 1);
        sparseIntArray.put(R.id.install_btn, 2);
        sparseIntArray.put(R.id.gg_assistant, 3);
    }

    @Override // J1.k
    public final void b() {
        synchronized (this) {
            this.f6933F = 0L;
        }
    }

    @Override // J1.k
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f6933F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.k
    public final void f() {
        synchronized (this) {
            this.f6933F = 1L;
        }
        j();
    }

    @Override // J1.k
    public final boolean i(int i7, int i10, J1.a aVar) {
        return false;
    }
}
