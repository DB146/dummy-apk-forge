package Da;

import A9.AbstractC0113m2;
import A9.C0109l2;
import P4.C0463k;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kt.apps.core.base.leanback.ImageCardView;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.utils.BitmapUtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import kotlin.jvm.internal.w;
import l1.AbstractC1449a;
import m.C1521c;

/* loaded from: classes2.dex */
public final class b extends AbstractC0113m2 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Yb.h[] f3305e;

    /* renamed from: b, reason: collision with root package name */
    public final C0463k f3306b = new C0463k(9, false);

    /* renamed from: c, reason: collision with root package name */
    public final C0463k f3307c = new C0463k(9, false);

    /* renamed from: d, reason: collision with root package name */
    public final float f3308d;

    static {
        kotlin.jvm.internal.n nVar = new kotlin.jvm.internal.n(b.class, "sSelectedBackgroundColor", "getSSelectedBackgroundColor()I", 0);
        w.f19135a.getClass();
        f3305e = new Yb.h[]{nVar, new kotlin.jvm.internal.n(b.class, "sDefaultBackgroundColor", "getSDefaultBackgroundColor()I", 0)};
    }

    public b() {
        sa.e.f24219e.getClass();
        this.f3308d = sa.e.g;
    }

    @Override // A9.AbstractC0113m2
    public final void c(C0109l2 viewHolder, Object item) {
        kotlin.jvm.internal.l.e(viewHolder, "viewHolder");
        kotlin.jvm.internal.l.e(item, "item");
        View view = viewHolder.f1271a;
        kotlin.jvm.internal.l.c(view, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.ImageCardView");
        ImageCardView imageCardView = (ImageCardView) view;
        float f4 = this.f3308d;
        imageCardView.c((int) f4, (int) (f4 / 1.7777777777777777d));
        if (item instanceof TVChannel) {
            TVChannel tVChannel = (TVChannel) item;
            imageCardView.setTitleText(tVChannel.getTvChannelName());
            SpannableString spannableString = new SpannableString(h3.o.l(tVChannel.getChannelNumber(), "Phím số: "));
            int f02 = ac.g.f0(spannableString, String.valueOf(tVChannel.getChannelNumber()), 0, 6);
            spannableString.setSpan(new ForegroundColorSpan(AbstractC1449a.getColor(view.getContext(), R.color.color_text_highlight)), f02, String.valueOf(tVChannel.getChannelNumber()).length() + f02, 34);
            imageCardView.setContentText(spannableString);
            imageCardView.getMainImageView().setScaleType(ImageView.ScaleType.FIT_CENTER);
            ImageView mainImageView = imageCardView.getMainImageView();
            kotlin.jvm.internal.l.d(mainImageView, "getMainImageView(...)");
            BitmapUtilsKt.loadImgByDrawableIdResName$default(mainImageView, tVChannel.getLogoChannel(), tVChannel.getLogoChannel(), null, 4, null);
            ((TextView) imageCardView.findViewById(R.id.title_text)).setBackground(null);
            imageCardView.setBackground(null);
            imageCardView.setInfoAreaBackground(null);
        }
    }

    @Override // A9.AbstractC0113m2
    public final C0109l2 d(ViewGroup parent) {
        kotlin.jvm.internal.l.e(parent, "parent");
        Yb.h[] hVarArr = f3305e;
        this.f3307c.E(hVarArr[1], 0);
        this.f3306b.E(hVarArr[0], 0);
        AbstractC1449a.getDrawable(parent.getContext(), R.drawable.app_icon);
        Context context = parent.getContext();
        kotlin.jvm.internal.l.d(context, "getContext(...)");
        ImageCardView imageCardView = new ImageCardView(new C1521c(context, R.style.ImageCardViewStyleTitle), null);
        imageCardView.setFocusable(true);
        imageCardView.setFocusableInTouchMode(true);
        return new C0109l2(imageCardView);
    }

    @Override // A9.AbstractC0113m2
    public final void e(C0109l2 viewHolder) {
        kotlin.jvm.internal.l.e(viewHolder, "viewHolder");
    }
}
