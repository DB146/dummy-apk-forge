package sa;

import A9.AbstractC0113m2;
import A9.C0109l2;
import P4.C0463k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.k;
import com.kt.apps.core.base.leanback.ImageCardView;
import com.kt.apps.core.utils.BitmapUtilsKt;
import com.kt.apps.core.utils.UtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.w;
import l1.AbstractC1449a;
import m.C1521c;

/* loaded from: classes2.dex */
public final class c extends AbstractC0113m2 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ Yb.h[] f24214f;
    public static final int g;

    /* renamed from: b, reason: collision with root package name */
    public Drawable f24215b;

    /* renamed from: c, reason: collision with root package name */
    public final C0463k f24216c = new C0463k(9, false);

    /* renamed from: d, reason: collision with root package name */
    public final C0463k f24217d = new C0463k(9, false);

    /* renamed from: e, reason: collision with root package name */
    public float f24218e = g;

    static {
        n nVar = new n(c.class, "sSelectedBackgroundColor", "getSSelectedBackgroundColor()I", 0);
        w.f19135a.getClass();
        f24214f = new Yb.h[]{nVar, new n(c.class, "sDefaultBackgroundColor", "getSDefaultBackgroundColor()I", 0)};
        g = UtilsKt.dpToPx(160);
    }

    @Override // A9.AbstractC0113m2
    public final void c(C0109l2 viewHolder, Object item) {
        String str;
        l.e(viewHolder, "viewHolder");
        l.e(item, "item");
        if (item instanceof Jc.a) {
            View view = viewHolder.f1271a;
            l.c(view, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.ImageCardView");
            ImageCardView imageCardView = (ImageCardView) view;
            float f4 = this.f24218e;
            imageCardView.c((int) f4, (int) (f4 / 1.7777777777777777d));
            Jc.a aVar = (Jc.a) item;
            imageCardView.setTitleText(aVar.f5781c);
            Double d10 = aVar.f5789y;
            if (d10 != null) {
                str = d10 + "đ";
            } else {
                Double d11 = aVar.f5783e;
                if (d11 != null) {
                    str = d11 + "đ";
                } else {
                    str = "Liên hệ";
                }
            }
            imageCardView.setContentText(str);
            imageCardView.getMainImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
            String str2 = aVar.f5790z;
            if (str2 == null || ac.g.h0(str2)) {
                imageCardView.setMainImage(this.f24215b);
            } else {
                ImageView mainImageView = imageCardView.getMainImageView();
                l.d(mainImageView, "getMainImageView(...)");
                BitmapUtilsKt.loadImgByUrl$default(mainImageView, ac.g.v0(str2).toString(), null, 2, null);
            }
            Integer num = aVar.f5788x;
            if (num == null || num.intValue() <= 0) {
                imageCardView.setBadgeImage(null);
            } else {
                k p10 = com.bumptech.glide.b.e(imageCardView).p(aVar.f5785u);
                p10.C(new b(imageCardView, 0), null, p10, W3.g.f10605a);
            }
            ((TextView) imageCardView.findViewById(R.id.title_text)).setBackground(null);
            imageCardView.setBackground(null);
            imageCardView.setInfoAreaBackground(null);
        }
    }

    @Override // A9.AbstractC0113m2
    public final C0109l2 d(ViewGroup parent) {
        l.e(parent, "parent");
        Yb.h[] hVarArr = f24214f;
        this.f24217d.E(hVarArr[1], 0);
        this.f24216c.E(hVarArr[0], 0);
        if (this.f24215b == null) {
            this.f24215b = AbstractC1449a.getDrawable(parent.getContext(), R.drawable.app_icon);
        }
        Context context = parent.getContext();
        l.d(context, "getContext(...)");
        ImageCardView imageCardView = new ImageCardView(new C1521c(context, R.style.ImageCardViewStyleTitle), null);
        imageCardView.setFocusable(true);
        imageCardView.setFocusableInTouchMode(true);
        ((TextView) imageCardView.findViewById(R.id.title_text)).setBackground(null);
        imageCardView.setBackground(null);
        imageCardView.setInfoAreaBackground(null);
        imageCardView.setTag("AdsShopee");
        return new C0109l2(imageCardView);
    }

    @Override // A9.AbstractC0113m2
    public final void e(C0109l2 viewHolder) {
        l.e(viewHolder, "viewHolder");
        View view = viewHolder.f1271a;
        l.c(view, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.ImageCardView");
        ImageCardView imageCardView = (ImageCardView) view;
        imageCardView.setBadgeImage(null);
        imageCardView.setMainImage(null);
    }
}
