package C9;

import A9.AbstractC0156x2;
import A9.C0067b0;
import A9.C0071c0;
import A9.C0089g2;
import A9.C0093h2;
import A9.C0098j;
import A9.C0101j2;
import A9.C0107l0;
import A9.C0109l2;
import A9.C0152w2;
import A9.T;
import A9.Z1;
import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kt.apps.core.base.leanback.PlaybackTransportRowView;
import com.kt.apps.core.base.leanback.SeekBar;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class d extends AbstractC0156x2 {

    /* renamed from: e, reason: collision with root package name */
    public final float f3081e = 0.01f;

    /* renamed from: f, reason: collision with root package name */
    public C0107l0 f3082f;
    public final C0071c0 g;

    /* renamed from: h, reason: collision with root package name */
    public final C0071c0 f3083h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f3084i;

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, A9.d3] */
    public d(g gVar) {
        this.f3084i = gVar;
        ?? obj = new Object();
        T t5 = new T(this);
        this.f1470b = null;
        this.f1471c = false;
        C0071c0 c0071c0 = new C0071c0();
        this.g = c0071c0;
        c0071c0.f1089d = false;
        C0071c0 c0071c02 = new C0071c0();
        this.f3083h = c0071c02;
        c0071c02.f1089d = false;
        c0071c0.f1088c = obj;
        c0071c02.f1088c = obj;
        c0071c0.f1087b = t5;
        c0071c02.f1087b = t5;
    }

    public static void y(long j, StringBuilder sb2) {
        sb2.setLength(0);
        if (j < 0) {
            sb2.append("--");
            return;
        }
        long j10 = j / 1000;
        long j11 = j10 / 60;
        long j12 = j11 / 60;
        long j13 = j10 - (j11 * 60);
        long j14 = j11 - (60 * j12);
        if (j12 > 0) {
            sb2.append(j12);
            sb2.append(':');
            if (j14 < 10) {
                sb2.append('0');
            }
        }
        sb2.append(j14);
        sb2.append(':');
        if (j13 < 10) {
            sb2.append('0');
        }
        sb2.append(j13);
    }

    @Override // A9.AbstractC0156x2
    public final C0152w2 i(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_playback_transport_controls_row, viewGroup, false);
        C0101j2 c0101j2 = new C0101j2(this, inflate, this.f3082f);
        C0071c0 c0071c0 = this.g;
        ViewGroup viewGroup2 = c0101j2.f1252r;
        c0101j2.f1238A = (C0067b0) c0071c0.d(viewGroup2);
        Context context = viewGroup2.getContext();
        TypedValue typedValue = new TypedValue();
        int color = context.getTheme().resolveAttribute(R.attr.playbackProgressPrimaryColor, typedValue, true) ? context.getResources().getColor(typedValue.resourceId) : context.getResources().getColor(R.color.lb_playback_progress_color_no_theme);
        SeekBar seekBar = c0101j2.f1256v;
        seekBar.setProgressColor(color);
        Context context2 = viewGroup2.getContext();
        TypedValue typedValue2 = new TypedValue();
        seekBar.setSecondaryProgressColor(context2.getTheme().resolveAttribute(R.attr.playbackProgressSecondaryColor, typedValue2, true) ? context2.getResources().getColor(typedValue2.resourceId) : context2.getResources().getColor(R.color.lb_playback_progress_secondary_color_no_theme));
        viewGroup2.addView(c0101j2.f1238A.f1271a);
        C0071c0 c0071c02 = this.f3083h;
        ViewGroup viewGroup3 = c0101j2.f1253s;
        C0067b0 c0067b0 = (C0067b0) c0071c02.d(viewGroup3);
        c0101j2.f1239B = c0067b0;
        viewGroup3.addView(c0067b0.f1271a);
        ((PlaybackTransportRowView) inflate.findViewById(R.id.transport_row)).setOnUnhandledKeyListener(new C0089g2(c0101j2));
        return c0101j2;
    }

    @Override // A9.AbstractC0156x2
    public final void o(C0152w2 c0152w2, Object obj) {
        super.o(c0152w2, obj);
        C0101j2 c0101j2 = (C0101j2) c0152w2;
        Z1 z12 = (Z1) c0101j2.f1460d;
        g gVar = z12.f1042b;
        ViewGroup viewGroup = c0101j2.f1251q;
        if (gVar == null) {
            viewGroup.setVisibility(8);
        } else {
            viewGroup.setVisibility(0);
            C0109l2 c0109l2 = c0101j2.f1249o;
            if (c0109l2 != null) {
                this.f3082f.c(c0109l2, z12.f1042b);
            }
        }
        ImageView imageView = c0101j2.f1250p;
        imageView.setVisibility(8);
        imageView.setImageDrawable(null);
        C0098j c0098j = z12.f1043c;
        C0093h2 c0093h2 = c0101j2.f1240C;
        c0093h2.f1219a = c0098j;
        c0093h2.f1220b = c0101j2.d(true);
        c0093h2.f1221c = c0101j2;
        this.g.c(c0101j2.f1238A, c0093h2);
        C0098j c0098j2 = z12.f1044d;
        C0093h2 c0093h22 = c0101j2.f1241D;
        c0093h22.f1219a = c0098j2;
        c0093h22.f1220b = c0101j2.d(false);
        c0093h22.f1221c = c0101j2;
        this.f3083h.c(c0101j2.f1239B, c0093h22);
        long j = z12.f1045e;
        if (c0101j2.f1258x != j) {
            c0101j2.f1258x = j;
            TextView textView = c0101j2.f1254t;
            if (textView != null) {
                StringBuilder sb2 = c0101j2.f1260z;
                y(j, sb2);
                textView.setText(sb2.toString());
            }
        }
        c0101j2.e(z12.f1046f);
        c0101j2.f1256v.setSecondaryProgress((int) ((z12.g / c0101j2.f1258x) * 2.147483647E9d));
        z12.f1047h = c0101j2.f1247J;
        c0152w2.f1465l = this.f3084i;
    }

    @Override // A9.AbstractC0156x2
    public final void p(C0152w2 c0152w2) {
        super.p(c0152w2);
        C0107l0 c0107l0 = this.f3082f;
        if (c0107l0 != null) {
            c0107l0.f(((C0101j2) c0152w2).f1249o);
        }
    }

    @Override // A9.AbstractC0156x2
    public final void q(C0152w2 c0152w2) {
        super.q(c0152w2);
        C0107l0 c0107l0 = this.f3082f;
        if (c0107l0 != null) {
            c0107l0.g(((C0101j2) c0152w2).f1249o);
        }
    }

    @Override // A9.AbstractC0156x2
    public final void s(C0152w2 c0152w2, boolean z8) {
        super.s(c0152w2, z8);
        if (z8) {
            ((C0101j2) c0152w2).c();
        }
    }

    @Override // A9.AbstractC0156x2
    public final void u(C0152w2 c0152w2) {
        C0101j2 c0101j2 = (C0101j2) c0152w2;
        Z1 z12 = (Z1) c0101j2.f1460d;
        if (c0101j2.f1249o != null) {
            this.f3082f.getClass();
        }
        this.g.e(c0101j2.f1238A);
        this.f3083h.e(c0101j2.f1239B);
        z12.f1047h = null;
        super.u(c0152w2);
        c0152w2.f1465l = null;
    }
}
