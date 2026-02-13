package A9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kt.apps.core.utils.AnimationUtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: A9.l1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0108l1 extends AbstractC0156x2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1270e;

    @Override // A9.AbstractC0156x2
    public final C0152w2 i(ViewGroup viewGroup) {
        switch (this.f1270e) {
            case 0:
                RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext());
                relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
                return new C0152w2(relativeLayout);
            default:
                kotlin.jvm.internal.l.b(viewGroup);
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_program, viewGroup, false);
                inflate.setFocusable(true);
                inflate.setFocusableInTouchMode(true);
                return new Aa.r(inflate);
        }
    }

    @Override // A9.AbstractC0156x2
    public void o(C0152w2 c0152w2, Object obj) {
        switch (this.f1270e) {
            case 1:
                super.o(c0152w2, obj);
                kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type com.kt.apps.core.extensions.model.TVScheduler.Programme");
                N9.a aVar = (N9.a) obj;
                Aa.r rVar = (Aa.r) c0152w2;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(aVar.d());
                rVar.f1534o.setText(String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12))}, 2)));
                rVar.f1535p.setText(aVar.f7393e);
                String b2 = aVar.b();
                TextView textView = rVar.f1536q;
                textView.setText(b2);
                CharSequence text = textView.getText();
                if (text == null || text.length() == 0) {
                    AnimationUtilsKt.gone(textView);
                } else {
                    AnimationUtilsKt.visible(textView);
                }
                boolean c10 = aVar.c();
                TextView textView2 = rVar.f1537r;
                if (c10) {
                    textView2.setText(R.string.program_is_live_title);
                    Context context = textView2.getContext();
                    kotlin.jvm.internal.l.d(context, "getContext(...)");
                    int i7 = com.bumptech.glide.d.i(context, 4);
                    textView2.setPadding(i7, i7, i7, i7);
                    AnimationUtilsKt.visible(textView2);
                } else {
                    textView2.setText((CharSequence) null);
                    textView2.setPadding(0, 0, 0, 0);
                }
                long d10 = aVar.d();
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                View view = rVar.f1271a;
                if (d10 <= timeInMillis) {
                    view.setAlpha(1.0f);
                    return;
                } else {
                    view.setAlpha(0.6f);
                    return;
                }
            default:
                super.o(c0152w2, obj);
                return;
        }
    }
}
