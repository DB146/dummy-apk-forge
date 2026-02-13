package y6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import x6.C2268a;

/* renamed from: y6.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2406l extends r {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f27058c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f27059d;

    public C2406l(ArrayList arrayList, Matrix matrix) {
        this.f27058c = arrayList;
        this.f27059d = matrix;
    }

    @Override // y6.r
    public final void a(Matrix matrix, C2268a c2268a, int i7, Canvas canvas) {
        Iterator it = this.f27058c.iterator();
        while (it.hasNext()) {
            ((r) it.next()).a(this.f27059d, c2268a, i7, canvas);
        }
    }
}
