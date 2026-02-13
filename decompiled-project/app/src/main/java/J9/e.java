package J9;

import A0.G0;
import android.util.SparseIntArray;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class e extends d {

    /* renamed from: I, reason: collision with root package name */
    public static final G0 f5751I;

    /* renamed from: J, reason: collision with root package name */
    public static final SparseIntArray f5752J;

    /* renamed from: H, reason: collision with root package name */
    public long f5753H;

    static {
        G0 g02 = new G0(4);
        f5751I = g02;
        int[] iArr = {R.layout.lb_program_row_header};
        ((String[][]) g02.f27b)[0] = new String[]{"lb_program_row_header"};
        ((int[][]) g02.f28c)[0] = new int[]{1};
        ((int[][]) g02.f29d)[0] = iArr;
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5752J = sparseIntArray;
        sparseIntArray.put(R.id.empty_program_text, 2);
        sparseIntArray.put(R.id.vertical_grid_view, 3);
    }

    @Override // J1.k
    public final void b() {
        long j;
        synchronized (this) {
            j = this.f5753H;
            this.f5753H = 0L;
        }
        J1.f fVar = this.f5750G;
        if ((6 & j) != 0) {
            h hVar = this.f5748E;
            hVar.l(0, fVar);
            hVar.f5759D = fVar;
            synchronized (hVar) {
                hVar.f5762G |= 1;
            }
            hVar.a(1);
            hVar.j();
        }
        if ((j & 4) != 0) {
            this.f5748E.m(this.f5434e.getResources().getString(R.string.program_title));
        }
        this.f5748E.c();
    }

    @Override // J1.k
    public final boolean e() {
        synchronized (this) {
            try {
                if (this.f5753H != 0) {
                    return true;
                }
                return this.f5748E.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.k
    public final void f() {
        synchronized (this) {
            this.f5753H = 4L;
        }
        this.f5748E.f();
        j();
    }

    @Override // J1.k
    public final boolean i(int i7, int i10, J1.a aVar) {
        if (i7 == 0) {
            if (i10 != 0) {
                return false;
            }
            synchronized (this) {
                this.f5753H |= 1;
            }
            return true;
        }
        if (i7 != 1) {
            return false;
        }
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f5753H |= 2;
        }
        return true;
    }
}
