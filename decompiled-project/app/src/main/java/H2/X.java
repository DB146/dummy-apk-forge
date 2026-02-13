package H2;

import android.util.SparseArray;
import java.util.Set;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f4623a;

    /* renamed from: b, reason: collision with root package name */
    public int f4624b;

    /* renamed from: c, reason: collision with root package name */
    public Set f4625c;

    public final W a(int i7) {
        SparseArray sparseArray = this.f4623a;
        W w10 = (W) sparseArray.get(i7);
        if (w10 != null) {
            return w10;
        }
        W w11 = new W();
        sparseArray.put(i7, w11);
        return w11;
    }
}
