package sa;

import A9.AbstractC0113m2;
import A9.C0109l2;
import P4.C0463k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kt.apps.core.base.leanback.ImageCardView;
import com.kt.apps.core.utils.BitmapUtilsKt;
import com.kt.apps.core.utils.StringUtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import ha.C1266b;
import ha.C1267c;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.w;
import l1.AbstractC1449a;
import x9.AbstractC2271a;

/* loaded from: classes2.dex */
public final class g extends AbstractC0113m2 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Yb.h[] f24225e;

    /* renamed from: b, reason: collision with root package name */
    public final C0463k f24226b = new C0463k(9, false);

    /* renamed from: c, reason: collision with root package name */
    public final C0463k f24227c = new C0463k(9, false);

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f24228d;

    static {
        n nVar = new n(g.class, "sSelectedBackgroundColor", "getSSelectedBackgroundColor()I", 0);
        w.f19135a.getClass();
        f24225e = new Yb.h[]{nVar, new n(g.class, "sDefaultBackgroundColor", "getSDefaultBackgroundColor()I", 0)};
    }

    public static void i(ImageCardView imageCardView) {
        ((TextView) imageCardView.findViewById(R.id.title_text)).setBackground(null);
        imageCardView.setBackground(null);
        imageCardView.setInfoAreaBackground(null);
    }

    @Override // A9.AbstractC0113m2
    public final void c(C0109l2 viewHolder, Object item) {
        l.e(viewHolder, "viewHolder");
        l.e(item, "item");
        View view = viewHolder.f1271a;
        l.c(view, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.ImageCardView");
        ImageCardView imageCardView = (ImageCardView) view;
        if (item instanceof C1266b) {
            C1266b c1266b = (C1266b) item;
            imageCardView.setTitleText(c1266b.f17900c);
            imageCardView.setContentText("");
            imageCardView.c(313, 176);
            i(imageCardView);
            Map map = (Map) AbstractC2271a.f26275b.getValue();
            V9.a aVar = c1266b.f17899b;
            String str = (String) map.get(StringUtilsKt.getKeyForLocalLogo(aVar.f10235b));
            imageCardView.getMainImageView().setScaleType(ImageView.ScaleType.FIT_CENTER);
            String str2 = aVar.f10236c;
            if (str != null) {
                ImageView mainImageView = imageCardView.getMainImageView();
                l.d(mainImageView, "getMainImageView(...)");
                BitmapUtilsKt.loadImgByDrawableIdResName$default(mainImageView, str, ac.g.v0(str2).toString(), null, 4, null);
                return;
            } else {
                ImageView mainImageView2 = imageCardView.getMainImageView();
                l.d(mainImageView2, "getMainImageView(...)");
                BitmapUtilsKt.loadImgByUrl$default(mainImageView2, ac.g.v0(str2).toString(), null, 2, null);
                return;
            }
        }
        if (!(item instanceof C1267c)) {
            if (item instanceof ha.d) {
                ha.d dVar = (ha.d) item;
                imageCardView.setTitleText(dVar.f17905d);
                imageCardView.setContentText(null);
                imageCardView.c(313, 176);
                imageCardView.getMainImageView().setScaleType(ImageView.ScaleType.FIT_CENTER);
                ImageView mainImageView3 = imageCardView.getMainImageView();
                l.d(mainImageView3, "getMainImageView(...)");
                W9.e eVar = dVar.f17903b;
                BitmapUtilsKt.loadImgByDrawableIdResName$default(mainImageView3, eVar.c(), eVar.c(), null, 4, null);
                i(imageCardView);
                return;
            }
            return;
        }
        W9.c cVar = ((C1267c) item).f17902b;
        imageCardView.setTitleText(cVar.f10860c);
        imageCardView.setContentText(cVar.f10859b);
        imageCardView.c(313, 176);
        i(imageCardView);
        String str3 = (String) ((Map) AbstractC2271a.f26275b.getValue()).get(StringUtilsKt.getKeyForLocalLogo(cVar.f10860c));
        imageCardView.getMainImageView().setScaleType(ImageView.ScaleType.FIT_CENTER);
        String str4 = cVar.f10861d;
        if (str3 != null) {
            ImageView mainImageView4 = imageCardView.getMainImageView();
            l.d(mainImageView4, "getMainImageView(...)");
            BitmapUtilsKt.loadImgByDrawableIdResName$default(mainImageView4, str3, ac.g.v0(str4).toString(), null, 4, null);
        } else {
            ImageView mainImageView5 = imageCardView.getMainImageView();
            l.d(mainImageView5, "getMainImageView(...)");
            BitmapUtilsKt.loadImgByUrl$default(mainImageView5, ac.g.v0(str4).toString(), null, 2, null);
        }
    }

    @Override // A9.AbstractC0113m2
    public final C0109l2 d(ViewGroup parent) {
        l.e(parent, "parent");
        Yb.h[] hVarArr = f24225e;
        this.f24227c.E(hVarArr[1], 0);
        this.f24226b.E(hVarArr[0], 0);
        AbstractC1449a.getDrawable(parent.getContext(), R.drawable.app_icon);
        Context context = parent.getContext();
        l.d(context, "getContext(...)");
        d dVar = new d(context);
        dVar.setFocusable(true);
        dVar.setFocusableInTouchMode(true);
        i(dVar);
        return new C0109l2(dVar);
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
