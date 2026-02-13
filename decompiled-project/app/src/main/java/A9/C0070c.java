package A9;

import android.graphics.Paint;
import android.view.View;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: A9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0070c extends C0109l2 {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f1073b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f1074c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f1075d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1076e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1077f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1078h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1079i;
    public final int j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint.FontMetricsInt f1080l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint.FontMetricsInt f1081m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint.FontMetricsInt f1082n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1083o;

    /* renamed from: p, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC0066b f1084p;

    public C0070c(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.lb_details_description_title);
        this.f1073b = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.lb_details_description_subtitle);
        this.f1074c = textView2;
        TextView textView3 = (TextView) view.findViewById(R.id.lb_details_description_body);
        this.f1075d = textView3;
        this.f1076e = view.getResources().getDimensionPixelSize(R.dimen.lb_details_description_title_baseline) + c(textView).ascent;
        this.f1077f = view.getResources().getDimensionPixelSize(R.dimen.lb_details_description_under_title_baseline_margin);
        this.g = view.getResources().getDimensionPixelSize(R.dimen.lb_details_description_under_subtitle_baseline_margin);
        this.f1078h = view.getResources().getDimensionPixelSize(R.dimen.lb_details_description_title_line_spacing);
        this.f1079i = view.getResources().getDimensionPixelSize(R.dimen.lb_details_description_body_line_spacing);
        this.j = view.getResources().getInteger(R.integer.lb_details_description_body_max_lines);
        this.k = view.getResources().getInteger(R.integer.lb_details_description_body_min_lines);
        this.f1083o = textView.getMaxLines();
        this.f1080l = c(textView);
        this.f1081m = c(textView2);
        this.f1082n = c(textView3);
        textView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0062a(this, 0));
    }

    public static Paint.FontMetricsInt c(TextView textView) {
        Paint paint = new Paint(1);
        paint.setTextSize(textView.getTextSize());
        paint.setTypeface(textView.getTypeface());
        return paint.getFontMetricsInt();
    }
}
