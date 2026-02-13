package A9;

import G3.C0283e;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.kt.apps.core.utils.UtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

/* renamed from: A9.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0107l0 extends AbstractC0113m2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1269b;

    public /* synthetic */ C0107l0(int i7) {
        this.f1269b = i7;
    }

    private final void i(C0109l2 c0109l2) {
    }

    private final void j(C0109l2 c0109l2) {
    }

    public static void k(TextView textView, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        marginLayoutParams.topMargin = i7;
        textView.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // A9.AbstractC0113m2
    public final void c(C0109l2 viewHolder, Object obj) {
        Object[] objArr;
        boolean z8 = true;
        int i7 = 4;
        String str = null;
        switch (this.f1269b) {
            case 0:
                ImageView imageView = (ImageView) viewHolder.f1271a;
                ((C0111m0) obj).getClass();
                imageView.setImageDrawable(null);
                return;
            case 1:
                C0070c c0070c = (C0070c) viewHolder;
                TextView textView = c0070c.f1073b;
                ((C9.c) obj).getClass();
                textView.setText((CharSequence) null);
                TextView textView2 = c0070c.f1074c;
                textView2.setText((CharSequence) null);
                TextView textView3 = c0070c.f1073b;
                if (TextUtils.isEmpty(textView3.getText())) {
                    textView3.setVisibility(8);
                    objArr = false;
                } else {
                    textView3.setVisibility(0);
                    textView3.setLineSpacing(textView3.getLineSpacingExtra() + (c0070c.f1078h - textView3.getLineHeight()), textView3.getLineSpacingMultiplier());
                    textView3.setMaxLines(c0070c.f1083o);
                    objArr = true;
                }
                k(textView3, c0070c.f1076e);
                boolean isEmpty = TextUtils.isEmpty(textView2.getText());
                Paint.FontMetricsInt fontMetricsInt = c0070c.f1080l;
                Paint.FontMetricsInt fontMetricsInt2 = c0070c.f1081m;
                int i10 = c0070c.f1077f;
                if (isEmpty) {
                    textView2.setVisibility(8);
                    z8 = false;
                } else {
                    textView2.setVisibility(0);
                    if (objArr == true) {
                        k(textView2, (fontMetricsInt2.ascent + i10) - fontMetricsInt.descent);
                    } else {
                        k(textView2, 0);
                    }
                }
                TextView textView4 = c0070c.f1075d;
                if (TextUtils.isEmpty(textView4.getText())) {
                    textView4.setVisibility(8);
                    return;
                }
                textView4.setVisibility(0);
                textView4.setLineSpacing(textView4.getLineSpacingExtra() + (c0070c.f1079i - textView4.getLineHeight()), textView4.getLineSpacingMultiplier());
                Paint.FontMetricsInt fontMetricsInt3 = c0070c.f1082n;
                if (z8) {
                    k(textView4, (c0070c.g + fontMetricsInt3.ascent) - fontMetricsInt2.descent);
                    return;
                } else if (objArr == true) {
                    k(textView4, (i10 + fontMetricsInt3.ascent) - fontMetricsInt.descent);
                    return;
                } else {
                    k(textView4, 0);
                    return;
                }
            case 2:
                kotlin.jvm.internal.l.e(viewHolder, "viewHolder");
                Jc.a aVar = obj instanceof Jc.a ? (Jc.a) obj : null;
                if (aVar == null) {
                    return;
                }
                View view = viewHolder.f1271a;
                ImageView imageView2 = (ImageView) view.findViewById(R.id.product_image);
                com.bumptech.glide.n d10 = com.bumptech.glide.b.d(view.getContext());
                String str2 = aVar.f5778H;
                if (str2 == null || str2.length() == 0) {
                    str2 = null;
                }
                if (str2 == null) {
                    List list = aVar.f5773C;
                    if (list != null) {
                        str = (String) Eb.o.Z(list);
                    }
                } else {
                    str = str2;
                }
                com.bumptech.glide.k kVar = (com.bumptech.glide.k) d10.p(str).l(R.drawable.anim_list_text_view);
                A3.p[] pVarArr = {new Object(), new J3.y()};
                kVar.getClass();
                ((com.bumptech.glide.k) ((com.bumptech.glide.k) kVar.u(new A3.i(pVarArr), true)).f(android.R.drawable.ic_menu_report_image)).D(imageView2);
                imageView2.setContentDescription("Product image: " + aVar.f5781c);
                return;
            case 3:
                kotlin.jvm.internal.l.e(viewHolder, "viewHolder");
                Jc.a aVar2 = obj instanceof Jc.a ? (Jc.a) obj : null;
                if (aVar2 == null) {
                    return;
                }
                View view2 = viewHolder.f1271a;
                Context context = view2.getContext();
                kotlin.jvm.internal.l.b(context);
                TextView textView5 = (TextView) view2.findViewById(R.id.product_title);
                if (textView5 != null) {
                    textView5.setText(aVar2.f5781c);
                }
                TextView textView6 = (TextView) view2.findViewById(R.id.category_name);
                if (textView6 != null) {
                    String str3 = aVar2.f5776F;
                    if (str3 == null) {
                        str3 = view2.getContext().getString(R.string.shopee_category_name);
                        kotlin.jvm.internal.l.d(str3, "getString(...)");
                    }
                    textView6.setText(str3);
                }
                TextView textView7 = (TextView) view2.findViewById(R.id.product_description);
                if (textView7 != null) {
                    textView7.setText(aVar2.f5782d);
                }
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                TextView textView8 = (TextView) view2.findViewById(R.id.original_price);
                TextView textView9 = (TextView) view2.findViewById(R.id.sale_price);
                TextView textView10 = (TextView) view2.findViewById(R.id.sale_percentage);
                Double d11 = aVar2.f5783e;
                if (d11 != null) {
                    Integer num = aVar2.f5788x;
                    Double d12 = aVar2.f5789y;
                    if (textView8 != null) {
                        textView8.setVisibility(0);
                        textView8.setText(currencyInstance.format(d11.doubleValue()));
                        if (d12 == null || num == null) {
                            textView8.setPaintFlags(textView8.getPaintFlags() & (-17));
                        } else {
                            textView8.setPaintFlags(textView8.getPaintFlags() | 16);
                        }
                    }
                    if (d12 == null || num == null) {
                        if (textView9 != null) {
                            textView9.setVisibility(8);
                        }
                        if (textView10 != null) {
                            textView10.setVisibility(8);
                        }
                    } else {
                        if (textView9 != null) {
                            textView9.setVisibility(0);
                            textView9.setText(currencyInstance.format(d12.doubleValue()));
                        }
                        if (textView10 != null) {
                            textView10.setVisibility(0);
                            textView10.setText(textView10.getResources().getString(R.string.ads_banner_product_sale_format, num));
                        }
                    }
                } else {
                    if (textView8 != null) {
                        textView8.setVisibility(8);
                    }
                    if (textView9 != null) {
                        textView9.setVisibility(8);
                    }
                    if (textView10 != null) {
                        textView10.setVisibility(8);
                    }
                }
                ImageView imageView3 = (ImageView) view2.findViewById(R.id.product_icon);
                String str4 = aVar2.f5790z;
                if (str4 != null) {
                    ((com.bumptech.glide.k) com.bumptech.glide.b.b(context).e(context).p(str4).b()).D(imageView3);
                }
                com.bumptech.glide.b.b(context).e(context).p(aVar2.f5785u).D((ImageView) view2.findViewById(R.id.qr_code_image));
                TextView textView11 = (TextView) view2.findViewById(R.id.qr_instruction);
                if (textView11 != null) {
                    textView11.setText(R.string.scan_qr_code_to_buy);
                    return;
                }
                return;
            case 4:
                kotlin.jvm.internal.l.e(viewHolder, "viewHolder");
                if (obj instanceof Jc.a) {
                    View view3 = viewHolder.f1271a;
                    kotlin.jvm.internal.l.c(view3, "null cannot be cast to non-null type android.widget.FrameLayout");
                    View childAt = ((FrameLayout) view3).getChildAt(0);
                    kotlin.jvm.internal.l.c(childAt, "null cannot be cast to non-null type tss.r.core.ads.ui.TVBannerAdView");
                    Lc.g gVar = (Lc.g) childAt;
                    Context context2 = view3.getContext();
                    kotlin.jvm.internal.l.b(context2);
                    gVar.setAdClickListener(new C0283e(context2, i7));
                    gVar.m((Jc.a) obj);
                    return;
                }
                return;
            case 5:
                kotlin.jvm.internal.l.e(viewHolder, "viewHolder");
                if (obj instanceof Jc.a) {
                    View view4 = viewHolder.f1271a;
                    kotlin.jvm.internal.l.c(view4, "null cannot be cast to non-null type android.widget.FrameLayout");
                    View childAt2 = ((FrameLayout) view4).getChildAt(0);
                    kotlin.jvm.internal.l.c(childAt2, "null cannot be cast to non-null type tss.r.core.ads.ui.TVBannerAdView");
                    Lc.g gVar2 = (Lc.g) childAt2;
                    Context context3 = view4.getContext();
                    kotlin.jvm.internal.l.b(context3);
                    gVar2.setAdClickListener(new E6.e(context3, i7));
                    gVar2.m((Jc.a) obj);
                    return;
                }
                return;
            default:
                kotlin.jvm.internal.l.e(viewHolder, "viewHolder");
                if (obj instanceof Jc.a) {
                    View view5 = viewHolder.f1271a;
                    kotlin.jvm.internal.l.c(view5, "null cannot be cast to non-null type android.widget.FrameLayout");
                    View childAt3 = ((FrameLayout) view5).getChildAt(0);
                    kotlin.jvm.internal.l.c(childAt3, "null cannot be cast to non-null type tss.r.core.ads.ui.TVBannerAdView");
                    Lc.g gVar3 = (Lc.g) childAt3;
                    Context context4 = view5.getContext();
                    kotlin.jvm.internal.l.b(context4);
                    gVar3.setAdClickListener(new E3.e(context4, i7));
                    gVar3.m((Jc.a) obj);
                    return;
                }
                return;
        }
    }

    @Override // A9.AbstractC0113m2
    public final C0109l2 d(ViewGroup parent) {
        switch (this.f1269b) {
            case 0:
                View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.lb_fullwidth_details_overview_logo, parent, false);
                C0109l2 c0109l2 = new C0109l2(inflate);
                int i7 = inflate.getLayoutParams().width;
                return c0109l2;
            case 1:
                return new C0070c(LayoutInflater.from(parent.getContext()).inflate(R.layout.lb_details_description, parent, false));
            case 2:
                kotlin.jvm.internal.l.e(parent, "parent");
                return new C0109l2(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product_image_tv, parent, false));
            case 3:
                kotlin.jvm.internal.l.e(parent, "parent");
                return new C0109l2(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_shopee_product_details, parent, false));
            case 4:
                kotlin.jvm.internal.l.e(parent, "parent");
                Context context = parent.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(UtilsKt.dpToPx(200), -2));
                frameLayout.setFocusable(true);
                frameLayout.setFocusableInTouchMode(true);
                frameLayout.setTag("SmallBannerAdPresenter");
                kotlin.jvm.internal.l.b(context);
                Lc.g gVar = new Lc.g(context);
                gVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                gVar.setScaleX(0.8f);
                gVar.setScaleY(0.8f);
                frameLayout.addView(gVar);
                return new C0109l2(frameLayout);
            case 5:
                kotlin.jvm.internal.l.e(parent, "parent");
                Context context2 = parent.getContext();
                FrameLayout frameLayout2 = new FrameLayout(context2);
                frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                frameLayout2.setFocusable(true);
                frameLayout2.setFocusableInTouchMode(true);
                frameLayout2.setTag("BannerAdPresenter");
                kotlin.jvm.internal.l.b(context2);
                Lc.g gVar2 = new Lc.g(context2);
                gVar2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                frameLayout2.addView(gVar2);
                return new C0109l2(frameLayout2);
            default:
                kotlin.jvm.internal.l.e(parent, "parent");
                Context context3 = parent.getContext();
                FrameLayout frameLayout3 = new FrameLayout(context3);
                frameLayout3.setLayoutParams(new ViewGroup.LayoutParams(180, -2));
                frameLayout3.setFocusable(true);
                frameLayout3.setFocusableInTouchMode(true);
                frameLayout3.setTag("TinyBannerAdPresenter");
                kotlin.jvm.internal.l.b(context3);
                Lc.g gVar3 = new Lc.g(context3);
                gVar3.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                gVar3.setScaleX(0.6f);
                gVar3.setScaleY(0.6f);
                frameLayout3.addView(gVar3);
                return new C0109l2(frameLayout3);
        }
    }

    @Override // A9.AbstractC0113m2
    public final void e(C0109l2 viewHolder) {
        switch (this.f1269b) {
            case 0:
            case 1:
                return;
            case 2:
                kotlin.jvm.internal.l.e(viewHolder, "viewHolder");
                View view = viewHolder.f1271a;
                ImageView imageView = (ImageView) view.findViewById(R.id.product_image);
                com.bumptech.glide.n d10 = com.bumptech.glide.b.d(view.getContext());
                d10.getClass();
                d10.n(new T3.f(imageView));
                return;
            case 3:
                kotlin.jvm.internal.l.e(viewHolder, "viewHolder");
                return;
            case 4:
                kotlin.jvm.internal.l.e(viewHolder, "viewHolder");
                return;
            case 5:
                kotlin.jvm.internal.l.e(viewHolder, "viewHolder");
                return;
            default:
                kotlin.jvm.internal.l.e(viewHolder, "viewHolder");
                return;
        }
    }

    @Override // A9.AbstractC0113m2
    public void f(C0109l2 c0109l2) {
        switch (this.f1269b) {
            case 1:
                C0070c c0070c = (C0070c) c0109l2;
                if (c0070c.f1084p != null) {
                    return;
                }
                c0070c.f1084p = new ViewTreeObserverOnPreDrawListenerC0066b(c0070c);
                c0070c.f1271a.getViewTreeObserver().addOnPreDrawListener(c0070c.f1084p);
                return;
            default:
                return;
        }
    }

    @Override // A9.AbstractC0113m2
    public void g(C0109l2 c0109l2) {
        switch (this.f1269b) {
            case 1:
                C0070c c0070c = (C0070c) c0109l2;
                if (c0070c.f1084p != null) {
                    c0070c.f1271a.getViewTreeObserver().removeOnPreDrawListener(c0070c.f1084p);
                    c0070c.f1084p = null;
                }
                super.g(c0109l2);
                return;
            default:
                super.g(c0109l2);
                return;
        }
    }
}
