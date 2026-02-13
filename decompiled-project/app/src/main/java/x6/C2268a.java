package x6;

import android.graphics.Paint;
import android.graphics.Path;
import q1.AbstractC1875a;

/* renamed from: x6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2268a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f26226i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};
    public static final int[] k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f26227l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f26228a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f26229b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f26230c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26231d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26232e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26233f;
    public final Path g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f26234h;

    public C2268a() {
        Paint paint = new Paint();
        this.f26234h = paint;
        Paint paint2 = new Paint();
        this.f26228a = paint2;
        this.f26231d = AbstractC1875a.h(-16777216, 68);
        this.f26232e = AbstractC1875a.h(-16777216, 20);
        this.f26233f = AbstractC1875a.h(-16777216, 0);
        paint2.setColor(this.f26231d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f26229b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f26230c = new Paint(paint3);
    }
}
