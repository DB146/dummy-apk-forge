package pa;

import android.util.SparseIntArray;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: pa.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1865c extends J9.i {

    /* renamed from: E, reason: collision with root package name */
    public static final SparseIntArray f23225E;

    /* renamed from: D, reason: collision with root package name */
    public long f23226D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23225E = sparseIntArray;
        sparseIntArray.put(R.id.title, 1);
        sparseIntArray.put(R.id.textInputLayout_2, 2);
        sparseIntArray.put(R.id.textInputEditText_2, 3);
        sparseIntArray.put(R.id.textInputLayout, 4);
        sparseIntArray.put(R.id.textInputEditText, 5);
        sparseIntArray.put(R.id.type_group, 6);
        sparseIntArray.put(R.id.type_tv, 7);
        sparseIntArray.put(R.id.type_movie, 8);
        sparseIntArray.put(R.id.type_football, 9);
        sparseIntArray.put(R.id.btn_save, 10);
    }

    @Override // J1.k
    public final void b() {
        synchronized (this) {
            this.f23226D = 0L;
        }
    }

    @Override // J1.k
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f23226D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.k
    public final void f() {
        synchronized (this) {
            this.f23226D = 1L;
        }
        j();
    }

    @Override // J1.k
    public final boolean i(int i7, int i10, J1.a aVar) {
        return false;
    }
}
