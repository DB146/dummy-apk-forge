package A9;

import H2.C0304s;
import androidx.recyclerview.widget.RecyclerView;
import i2.C1322j;
import i2.C1324l;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class C0 extends H2.V {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f776b;

    public /* synthetic */ C0(Object obj, int i7) {
        this.f775a = i7;
        this.f776b = obj;
    }

    private final void c(RecyclerView recyclerView, int i7) {
    }

    private final void d(RecyclerView recyclerView, int i7) {
    }

    @Override // H2.V
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f775a) {
            case 0:
                return;
            case 1:
                if (i7 == 0) {
                    N0 n02 = (N0) this.f776b;
                    ArrayList arrayList = n02.f909r.f13680x0;
                    if (arrayList != null) {
                        arrayList.remove(this);
                    }
                    n02.F0();
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            default:
                return;
        }
    }

    @Override // H2.V
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f775a) {
            case 0:
                ((E0) this.f776b).c();
                return;
            case 1:
            default:
                return;
            case 2:
                ((C0115n0) this.f776b).f();
                return;
            case 3:
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                C0304s c0304s = (C0304s) this.f776b;
                int computeVerticalScrollRange = c0304s.f4817s.computeVerticalScrollRange();
                int i11 = c0304s.f4816r;
                int i12 = computeVerticalScrollRange - i11;
                int i13 = c0304s.f4802a;
                c0304s.f4818t = i12 > 0 && i11 >= i13;
                int computeHorizontalScrollRange = c0304s.f4817s.computeHorizontalScrollRange();
                int i14 = c0304s.f4815q;
                boolean z8 = computeHorizontalScrollRange - i14 > 0 && i14 >= i13;
                c0304s.f4819u = z8;
                boolean z10 = c0304s.f4818t;
                if (!z10 && !z8) {
                    if (c0304s.f4820v != 0) {
                        c0304s.f(0);
                        return;
                    }
                    return;
                }
                if (z10) {
                    float f4 = i11;
                    c0304s.f4810l = (int) ((((f4 / 2.0f) + computeVerticalScrollOffset) * f4) / computeVerticalScrollRange);
                    c0304s.k = Math.min(i11, (i11 * i11) / computeVerticalScrollRange);
                }
                if (c0304s.f4819u) {
                    float f10 = computeHorizontalScrollOffset;
                    float f11 = i14;
                    c0304s.f4813o = (int) ((((f11 / 2.0f) + f10) * f11) / computeHorizontalScrollRange);
                    c0304s.f4812n = Math.min(i14, (i14 * i14) / computeHorizontalScrollRange);
                }
                int i15 = c0304s.f4820v;
                if (i15 == 0 || i15 == 1) {
                    c0304s.f(1);
                    return;
                }
                return;
            case 4:
                ((C1324l) this.f776b).getClass();
                throw null;
            case 5:
                ((C1322j) this.f776b).d();
                return;
        }
    }
}
