package pa;

import A0.G0;
import android.util.SparseIntArray;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: pa.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1864b extends AbstractC1863a {

    /* renamed from: E, reason: collision with root package name */
    public static final G0 f23222E;

    /* renamed from: F, reason: collision with root package name */
    public static final SparseIntArray f23223F;

    /* renamed from: D, reason: collision with root package name */
    public long f23224D;

    static {
        G0 g02 = new G0(3);
        f23222E = g02;
        int[] iArr = {R.layout.layout_tv_channel_number};
        ((String[][]) g02.f27b)[0] = new String[]{"layout_tv_channel_number"};
        ((int[][]) g02.f28c)[0] = new int[]{1};
        ((int[][]) g02.f29d)[0] = iArr;
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23223F = sparseIntArray;
        sparseIntArray.put(R.id.main_browse_fragment, 2);
    }

    @Override // J1.k
    public final void b() {
        synchronized (this) {
            this.f23224D = 0L;
        }
        this.f23221C.c();
    }

    @Override // J1.k
    public final boolean e() {
        synchronized (this) {
            try {
                if (this.f23224D != 0) {
                    return true;
                }
                return this.f23221C.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.k
    public final void f() {
        synchronized (this) {
            this.f23224D = 2L;
        }
        this.f23221C.f();
        j();
    }

    @Override // J1.k
    public final boolean i(int i7, int i10, J1.a aVar) {
        if (i7 != 0) {
            return false;
        }
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f23224D |= 1;
        }
        return true;
    }
}
