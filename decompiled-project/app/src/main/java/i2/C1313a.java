package i2;

import android.graphics.Paint;
import android.view.View;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;
import h6.ViewOnLayoutChangeListenerC1254a;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1313a extends C9.h {

    /* renamed from: A, reason: collision with root package name */
    public final Paint.FontMetricsInt f18237A;

    /* renamed from: B, reason: collision with root package name */
    public final Paint.FontMetricsInt f18238B;

    /* renamed from: C, reason: collision with root package name */
    public final int f18239C;

    /* renamed from: D, reason: collision with root package name */
    public i1.f f18240D;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f18241b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f18242c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f18243d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18244e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18245f;

    /* renamed from: u, reason: collision with root package name */
    public final int f18246u;

    /* renamed from: v, reason: collision with root package name */
    public final int f18247v;

    /* renamed from: w, reason: collision with root package name */
    public final int f18248w;

    /* renamed from: x, reason: collision with root package name */
    public final int f18249x;

    /* renamed from: y, reason: collision with root package name */
    public final int f18250y;

    /* renamed from: z, reason: collision with root package name */
    public final Paint.FontMetricsInt f18251z;

    public C1313a(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.lb_details_description_title);
        this.f18241b = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.lb_details_description_subtitle);
        this.f18242c = textView2;
        TextView textView3 = (TextView) view.findViewById(R.id.lb_details_description_body);
        this.f18243d = textView3;
        this.f18244e = view.getResources().getDimensionPixelSize(R.dimen.lb_details_description_title_baseline) + K(textView).ascent;
        this.f18245f = view.getResources().getDimensionPixelSize(R.dimen.lb_details_description_under_title_baseline_margin);
        this.f18246u = view.getResources().getDimensionPixelSize(R.dimen.lb_details_description_under_subtitle_baseline_margin);
        this.f18247v = view.getResources().getDimensionPixelSize(R.dimen.lb_details_description_title_line_spacing);
        this.f18248w = view.getResources().getDimensionPixelSize(R.dimen.lb_details_description_body_line_spacing);
        this.f18249x = view.getResources().getInteger(R.integer.lb_details_description_body_max_lines);
        this.f18250y = view.getResources().getInteger(R.integer.lb_details_description_body_min_lines);
        this.f18239C = textView.getMaxLines();
        this.f18251z = K(textView);
        this.f18237A = K(textView2);
        this.f18238B = K(textView3);
        textView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1254a(this, 1));
    }

    public static Paint.FontMetricsInt K(TextView textView) {
        Paint paint = new Paint(1);
        paint.setTextSize(textView.getTextSize());
        paint.setTypeface(textView.getTypeface());
        return paint.getFontMetricsInt();
    }
}
