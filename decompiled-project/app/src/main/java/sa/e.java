package sa;

import A9.AbstractC0113m2;
import A9.C0109l2;
import P4.C0463k;
import W9.i;
import W9.j;
import Y5.C0656w;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kt.apps.core.base.leanback.ImageCardView;
import com.kt.apps.core.extensions.ExtensionsChannel;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.utils.BitmapUtilsKt;
import com.kt.apps.core.utils.StringUtilsKt;
import com.kt.apps.core.utils.UtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import h3.o;
import java.util.Map;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.w;
import l1.AbstractC1449a;
import x9.AbstractC2271a;

/* loaded from: classes2.dex */
public final class e extends AbstractC0113m2 {

    /* renamed from: e, reason: collision with root package name */
    public static final C0656w f24219e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ Yb.h[] f24220f;
    public static final int g;

    /* renamed from: b, reason: collision with root package name */
    public final C0463k f24221b = new C0463k(9, false);

    /* renamed from: c, reason: collision with root package name */
    public final C0463k f24222c = new C0463k(9, false);

    /* renamed from: d, reason: collision with root package name */
    public float f24223d = g;

    static {
        n nVar = new n(e.class, "sSelectedBackgroundColor", "getSSelectedBackgroundColor()I", 0);
        w.f19135a.getClass();
        f24220f = new Yb.h[]{nVar, new n(e.class, "sDefaultBackgroundColor", "getSDefaultBackgroundColor()I", 0)};
        f24219e = new C0656w(18);
        g = UtilsKt.dpToPx(160);
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
        float f4 = this.f24223d;
        imageCardView.c((int) f4, (int) (f4 / 1.7777777777777777d));
        if (item instanceof j) {
            j jVar = (j) item;
            imageCardView.setTitleText(jVar.f10896c);
            imageCardView.setContentText(null);
            if (jVar.g == i.f10892c) {
                Map map = (Map) AbstractC2271a.f26275b.getValue();
                String str = jVar.f10894a;
                if (ac.g.h0(ac.g.v0(str).toString())) {
                    str = null;
                }
                String str2 = jVar.f10898e;
                if (str == null) {
                    str = str2;
                }
                String str3 = (String) map.get(StringUtilsKt.getKeyForLocalLogo(str));
                imageCardView.getMainImageView().setScaleType(ImageView.ScaleType.FIT_CENTER);
                if (str3 != null) {
                    ImageView mainImageView = imageCardView.getMainImageView();
                    l.d(mainImageView, "getMainImageView(...)");
                    BitmapUtilsKt.loadImgByDrawableIdResName$default(mainImageView, str3, ac.g.v0(str2).toString(), null, 4, null);
                } else {
                    ImageView mainImageView2 = imageCardView.getMainImageView();
                    l.d(mainImageView2, "getMainImageView(...)");
                    BitmapUtilsKt.loadImgByUrl$default(mainImageView2, ac.g.v0(str2).toString(), null, 2, null);
                }
            } else {
                imageCardView.getMainImageView().setScaleType(ImageView.ScaleType.FIT_CENTER);
                ImageView mainImageView3 = imageCardView.getMainImageView();
                l.d(mainImageView3, "getMainImageView(...)");
                String str4 = jVar.f10898e;
                BitmapUtilsKt.loadImgByDrawableIdResName$default(mainImageView3, str4, str4, null, 4, null);
            }
            i(imageCardView);
            return;
        }
        if (item instanceof TVChannel) {
            TVChannel tVChannel = (TVChannel) item;
            imageCardView.setTitleText(tVChannel.getTvChannelName());
            SpannableString spannableString = new SpannableString(o.l(tVChannel.getChannelNumber(), "Phím số: "));
            int f02 = ac.g.f0(spannableString, String.valueOf(tVChannel.getChannelNumber()), 0, 6);
            spannableString.setSpan(new ForegroundColorSpan(AbstractC1449a.getColor(view.getContext(), R.color.color_text_highlight)), f02, String.valueOf(tVChannel.getChannelNumber()).length() + f02, 34);
            imageCardView.setContentText(spannableString);
            imageCardView.getMainImageView().setScaleType(ImageView.ScaleType.FIT_CENTER);
            ImageView mainImageView4 = imageCardView.getMainImageView();
            l.d(mainImageView4, "getMainImageView(...)");
            BitmapUtilsKt.loadImgByDrawableIdResName$default(mainImageView4, tVChannel.getLogoChannel(), tVChannel.getLogoChannel(), null, 4, null);
            i(imageCardView);
            return;
        }
        if (item instanceof ExtensionsChannel) {
            ExtensionsChannel extensionsChannel = (ExtensionsChannel) item;
            imageCardView.setTitleText(extensionsChannel.getTvChannelName());
            imageCardView.setContentText("");
            i(imageCardView);
            Map map2 = (Map) AbstractC2271a.f26275b.getValue();
            String channelId = extensionsChannel.getChannelId();
            if (ac.g.h0(ac.g.v0(channelId).toString())) {
                channelId = null;
            }
            if (channelId == null) {
                channelId = extensionsChannel.getTvChannelName();
            }
            String str5 = (String) map2.get(StringUtilsKt.getKeyForLocalLogo(channelId));
            imageCardView.getMainImageView().setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (str5 != null) {
                ImageView mainImageView5 = imageCardView.getMainImageView();
                l.d(mainImageView5, "getMainImageView(...)");
                BitmapUtilsKt.loadImgByDrawableIdResName$default(mainImageView5, str5, ac.g.v0(extensionsChannel.getLogoChannel()).toString(), null, 4, null);
            } else {
                ImageView mainImageView6 = imageCardView.getMainImageView();
                l.d(mainImageView6, "getMainImageView(...)");
                BitmapUtilsKt.loadImgByUrl$default(mainImageView6, ac.g.v0(extensionsChannel.getLogoChannel()).toString(), null, 2, null);
            }
        }
    }

    @Override // A9.AbstractC0113m2
    public final C0109l2 d(ViewGroup parent) {
        l.e(parent, "parent");
        Yb.h[] hVarArr = f24220f;
        this.f24222c.E(hVarArr[1], 0);
        this.f24221b.E(hVarArr[0], 0);
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
