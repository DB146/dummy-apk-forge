package b5;

import A0.B;
import a5.C0776b;
import android.text.Layout;
import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final B f13920c = new B(8);

    /* renamed from: a, reason: collision with root package name */
    public final C0776b f13921a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13922b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f4, int i7, float f10, int i10, boolean z8, int i11, int i12) {
        boolean z10;
        int i13;
        if (z8) {
            i13 = i11;
            z10 = true;
        } else {
            z10 = false;
            i13 = -16777216;
        }
        this.f13921a = new C0776b(spannableStringBuilder, alignment, null, null, f4, 0, i7, f10, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z10, i13, Integer.MIN_VALUE, 0.0f);
        this.f13922b = i12;
    }
}
