package s9;

import android.util.SparseIntArray;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: s9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2001b extends AbstractC2000a {

    /* renamed from: F, reason: collision with root package name */
    public static final SparseIntArray f24210F;

    /* renamed from: E, reason: collision with root package name */
    public long f24211E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f24210F = sparseIntArray;
        sparseIntArray.put(R.id.qr_code, 1);
        sparseIntArray.put(R.id.qr_code_center, 2);
    }

    @Override // J1.k
    public final void b() {
        synchronized (this) {
            this.f24211E = 0L;
        }
    }

    @Override // J1.k
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f24211E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.k
    public final void f() {
        synchronized (this) {
            this.f24211E = 1L;
        }
        j();
    }

    @Override // J1.k
    public final boolean i(int i7, int i10, J1.a aVar) {
        return false;
    }
}
