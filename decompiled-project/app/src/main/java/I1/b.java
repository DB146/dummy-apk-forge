package I1;

import U9.i;
import android.graphics.Rect;
import java.util.Comparator;
import z1.e;

/* loaded from: classes.dex */
public final class b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f4977a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f4978b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4979c;

    /* renamed from: d, reason: collision with root package name */
    public final i f4980d;

    public b(boolean z8, i iVar) {
        this.f4979c = z8;
        this.f4980d = iVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f4980d.getClass();
        Rect rect = this.f4977a;
        ((e) obj).f(rect);
        Rect rect2 = this.f4978b;
        ((e) obj2).f(rect2);
        int i7 = rect.top;
        int i10 = rect2.top;
        if (i7 < i10) {
            return -1;
        }
        if (i7 > i10) {
            return 1;
        }
        int i11 = rect.left;
        int i12 = rect2.left;
        boolean z8 = this.f4979c;
        if (i11 < i12) {
            return z8 ? 1 : -1;
        }
        if (i11 > i12) {
            return z8 ? -1 : 1;
        }
        int i13 = rect.bottom;
        int i14 = rect2.bottom;
        if (i13 < i14) {
            return -1;
        }
        if (i13 > i14) {
            return 1;
        }
        int i15 = rect.right;
        int i16 = rect2.right;
        if (i15 < i16) {
            return z8 ? 1 : -1;
        }
        if (i15 > i16) {
            return z8 ? -1 : 1;
        }
        return 0;
    }
}
