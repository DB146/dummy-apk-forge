package sa;

import A9.AbstractC0113m2;
import A9.C0109l2;
import A9.Q2;
import Ba.i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.kt.apps.core.utils.BitmapUtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import java.util.Locale;
import kotlin.jvm.internal.l;
import ma.C1651b;

/* loaded from: classes2.dex */
public final class f extends AbstractC0113m2 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24224b;

    public f(boolean z8) {
        this.f24224b = z8;
    }

    @Override // A9.AbstractC0113m2
    public final void c(C0109l2 c0109l2, Object obj) {
        l.c(obj, "null cannot be cast to non-null type com.kt.apps.football.model.FootballMatch");
        C1651b c1651b = (C1651b) obj;
        l.b(c0109l2);
        View view = c0109l2.f1271a;
        ImageView imageView = (ImageView) view.findViewById(R.id.home_team);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.away_team);
        TextView textView = (TextView) view.findViewById(R.id.match_name);
        TextView textView2 = (TextView) view.findViewById(R.id.match_time);
        TextView textView3 = (TextView) view.findViewById(R.id.league);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.card_view);
        frameLayout.setClipToOutline(true);
        textView.setSelected(true);
        textView.setText(c1651b.a());
        if (c1651b.b()) {
            textView2.setText(R.string.football_live_match_title);
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.background_live_football_circle, 0, 0, 0);
        } else {
            textView2.setText(c1651b.f20816c);
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        }
        if (this.f24224b) {
            textView3.setText(c1651b.f20821v);
        }
        view.setOnFocusChangeListener(new Q2(1, frameLayout, view.getOnFocusChangeListener()));
        l.b(imageView);
        ma.f fVar = c1651b.f20814a;
        String str = fVar.f20833d;
        Locale locale = Locale.ROOT;
        String lowerCase = fVar.f20830a.toLowerCase(locale);
        l.d(lowerCase, "toLowerCase(...)");
        BitmapUtilsKt.loadImageBitmap(imageView, str, ac.g.b0(lowerCase, "juv") ? -1 : 0, new i(11));
        l.b(imageView2);
        ma.f fVar2 = c1651b.f20815b;
        String str2 = fVar2.f20833d;
        String lowerCase2 = fVar2.f20830a.toLowerCase(locale);
        l.d(lowerCase2, "toLowerCase(...)");
        BitmapUtilsKt.loadImageBitmap(imageView2, str2, ac.g.b0(lowerCase2, "juv") ? -1 : 0, new i(12));
    }

    @Override // A9.AbstractC0113m2
    public final C0109l2 d(ViewGroup viewGroup) {
        l.b(viewGroup);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_football_presenter, viewGroup, false);
        inflate.setFocusable(true);
        inflate.setFocusableInTouchMode(true);
        return new C0109l2(inflate);
    }

    @Override // A9.AbstractC0113m2
    public final void e(C0109l2 c0109l2) {
    }
}
