package q6;

import Q5.e;
import android.content.Context;
import com.kt.apps.media.xemtv.beta.R;
import q3.f;

/* renamed from: q6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1896a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f23508f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23509a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23510b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23511c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23512d;

    /* renamed from: e, reason: collision with root package name */
    public final float f23513e;

    public C1896a(Context context) {
        boolean O10 = e.O(context, R.attr.elevationOverlayEnabled, false);
        int o10 = f.o(context, R.attr.elevationOverlayColor, 0);
        int o11 = f.o(context, R.attr.elevationOverlayAccentColor, 0);
        int o12 = f.o(context, R.attr.colorSurface, 0);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f23509a = O10;
        this.f23510b = o10;
        this.f23511c = o11;
        this.f23512d = o12;
        this.f23513e = f4;
    }
}
