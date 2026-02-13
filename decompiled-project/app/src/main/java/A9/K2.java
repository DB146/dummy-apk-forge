package A9;

import android.graphics.Color;

/* loaded from: classes2.dex */
public final class K2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f859a;

    /* renamed from: b, reason: collision with root package name */
    public final int f860b;

    /* renamed from: c, reason: collision with root package name */
    public final int f861c;

    public K2(int i7, int i10, int i11) {
        this.f859a = i7;
        if (i10 == i7) {
            i10 = Color.argb((int) ((Color.alpha(i7) * 0.85f) + 38.25f), (int) ((Color.red(i7) * 0.85f) + 38.25f), (int) ((Color.green(i7) * 0.85f) + 38.25f), (int) ((Color.blue(i7) * 0.85f) + 38.25f));
        }
        this.f860b = i10;
        this.f861c = i11;
    }
}
