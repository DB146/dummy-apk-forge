package i2;

import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: i2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1320h extends AbstractC1300H {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18263b;

    public /* synthetic */ C1320h(int i7) {
        this.f18263b = i7;
    }

    private final void g(C9.h hVar) {
    }

    private final void h(C9.h hVar) {
    }

    public static void i(TextView textView, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        marginLayoutParams.topMargin = i7;
        textView.setLayoutParams(marginLayoutParams);
    }

    @Override // i2.AbstractC1300H
    public final void b(C9.h hVar, Object item) {
        boolean z8;
        switch (this.f18263b) {
            case 0:
                C1321i c1321i = (C1321i) item;
                ImageView imageView = (ImageView) ((View) hVar.f3094a);
                imageView.setImageDrawable(c1321i.f18265c);
                C1319g c1319g = (C1319g) hVar;
                if (c1321i.f18265c != null) {
                    if (c1319g.f18262b) {
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        layoutParams.width = c1321i.f18265c.getIntrinsicWidth();
                        layoutParams.height = c1321i.f18265c.getIntrinsicHeight();
                        if (imageView.getMaxWidth() > 0 || imageView.getMaxHeight() > 0) {
                            float f4 = 1.0f;
                            float maxWidth = (imageView.getMaxWidth() <= 0 || layoutParams.width <= imageView.getMaxWidth()) ? 1.0f : imageView.getMaxWidth() / layoutParams.width;
                            if (imageView.getMaxHeight() > 0 && layoutParams.height > imageView.getMaxHeight()) {
                                f4 = imageView.getMaxHeight() / layoutParams.height;
                            }
                            float min = Math.min(maxWidth, f4);
                            layoutParams.width = (int) (layoutParams.width * min);
                            layoutParams.height = (int) (layoutParams.height * min);
                        }
                        imageView.setLayoutParams(layoutParams);
                    }
                    throw null;
                }
                return;
            default:
                C1313a viewHolder = (C1313a) hVar;
                kotlin.jvm.internal.l.e(viewHolder, "viewHolder");
                kotlin.jvm.internal.l.e(item, "item");
                TVChannel tVChannel = (TVChannel) item;
                String tvChannelName = tVChannel.getTvChannelName();
                TextView textView = viewHolder.f18241b;
                textView.setText(tvChannelName);
                String tvChannelName2 = tVChannel.getTvChannelName();
                TextView textView2 = viewHolder.f18242c;
                textView2.setText(tvChannelName2);
                String tvChannelName3 = tVChannel.getTvChannelName();
                TextView textView3 = viewHolder.f18243d;
                textView3.setText(tvChannelName3);
                boolean z10 = true;
                if (TextUtils.isEmpty(textView.getText())) {
                    textView.setVisibility(8);
                    z8 = false;
                } else {
                    textView.setVisibility(0);
                    textView.setLineSpacing(textView.getLineSpacingExtra() + (viewHolder.f18247v - textView.getLineHeight()), textView.getLineSpacingMultiplier());
                    textView.setMaxLines(viewHolder.f18239C);
                    z8 = true;
                }
                i(textView, viewHolder.f18244e);
                boolean isEmpty = TextUtils.isEmpty(textView2.getText());
                Paint.FontMetricsInt fontMetricsInt = viewHolder.f18251z;
                Paint.FontMetricsInt fontMetricsInt2 = viewHolder.f18237A;
                int i7 = viewHolder.f18245f;
                if (isEmpty) {
                    textView2.setVisibility(8);
                    z10 = false;
                } else {
                    textView2.setVisibility(0);
                    if (z8) {
                        i(textView2, (fontMetricsInt2.ascent + i7) - fontMetricsInt.descent);
                    } else {
                        i(textView2, 0);
                    }
                }
                if (TextUtils.isEmpty(textView3.getText())) {
                    textView3.setVisibility(8);
                    return;
                }
                textView3.setVisibility(0);
                textView3.setLineSpacing(textView3.getLineSpacingExtra() + (viewHolder.f18248w - textView3.getLineHeight()), textView3.getLineSpacingMultiplier());
                Paint.FontMetricsInt fontMetricsInt3 = viewHolder.f18238B;
                if (z10) {
                    i(textView3, (viewHolder.f18246u + fontMetricsInt3.ascent) - fontMetricsInt2.descent);
                    return;
                } else if (z8) {
                    i(textView3, (i7 + fontMetricsInt3.ascent) - fontMetricsInt.descent);
                    return;
                } else {
                    i(textView3, 0);
                    return;
                }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [i2.g, C9.h] */
    @Override // i2.AbstractC1300H
    public final C9.h c(ViewGroup viewGroup) {
        switch (this.f18263b) {
            case 0:
                boolean z8 = false;
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_fullwidth_details_overview_logo, viewGroup, false);
                ?? hVar = new C9.h(inflate);
                ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
                if (layoutParams.width == -2 && layoutParams.height == -2) {
                    z8 = true;
                }
                hVar.f18262b = z8;
                return hVar;
            default:
                return new C1313a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_details_description, viewGroup, false));
        }
    }

    @Override // i2.AbstractC1300H
    public final void d(C9.h hVar) {
        int i7 = this.f18263b;
    }

    @Override // i2.AbstractC1300H
    public void e(C9.h hVar) {
        switch (this.f18263b) {
            case 1:
                C1313a c1313a = (C1313a) hVar;
                if (c1313a.f18240D != null) {
                    return;
                }
                c1313a.f18240D = new i1.f(c1313a, 1);
                ((View) c1313a.f3094a).getViewTreeObserver().addOnPreDrawListener(c1313a.f18240D);
                return;
            default:
                return;
        }
    }

    @Override // i2.AbstractC1300H
    public void f(C9.h hVar) {
        switch (this.f18263b) {
            case 1:
                C1313a c1313a = (C1313a) hVar;
                if (c1313a.f18240D != null) {
                    ((View) c1313a.f3094a).getViewTreeObserver().removeOnPreDrawListener(c1313a.f18240D);
                    c1313a.f18240D = null;
                }
                super.f(hVar);
                return;
            default:
                super.f(hVar);
                return;
        }
    }
}
