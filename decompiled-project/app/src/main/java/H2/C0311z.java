package H2;

import android.view.View;
import java.util.List;

/* renamed from: H2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4859a;

    /* renamed from: b, reason: collision with root package name */
    public int f4860b;

    /* renamed from: c, reason: collision with root package name */
    public int f4861c;

    /* renamed from: d, reason: collision with root package name */
    public int f4862d;

    /* renamed from: e, reason: collision with root package name */
    public int f4863e;

    /* renamed from: f, reason: collision with root package name */
    public int f4864f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f4865h;

    /* renamed from: i, reason: collision with root package name */
    public int f4866i;
    public int j;
    public List k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4867l;

    public final void a(View view) {
        int d10;
        int size = this.k.size();
        View view2 = null;
        int i7 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((i0) this.k.get(i10)).f4707a;
            T t5 = (T) view3.getLayoutParams();
            if (view3 != view && !t5.f4615a.k() && (d10 = (t5.f4615a.d() - this.f4862d) * this.f4863e) >= 0 && d10 < i7) {
                view2 = view3;
                if (d10 == 0) {
                    break;
                } else {
                    i7 = d10;
                }
            }
        }
        if (view2 == null) {
            this.f4862d = -1;
        } else {
            this.f4862d = ((T) view2.getLayoutParams()).f4615a.d();
        }
    }

    public final View b(Y y10) {
        List list = this.k;
        if (list == null) {
            View d10 = y10.d(this.f4862d);
            this.f4862d += this.f4863e;
            return d10;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = ((i0) this.k.get(i7)).f4707a;
            T t5 = (T) view.getLayoutParams();
            if (!t5.f4615a.k() && this.f4862d == t5.f4615a.d()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
