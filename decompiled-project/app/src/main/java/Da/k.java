package Da;

import A9.O0;
import A9.Q;
import A9.S;
import android.os.Build;
import android.os.Bundle;
import cc.F;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.media.xemtv.beta.R;
import kotlin.jvm.internal.w;
import pa.AbstractC1866d;
import y9.AbstractC2464g;
import y9.J;

/* loaded from: classes2.dex */
public final class k extends AbstractC2464g<AbstractC1866d> implements S, J {

    /* renamed from: p0, reason: collision with root package name */
    public final O0 f3325p0 = vc.i.o(this, w.a(ta.c.class), new j(this, 0), new j(this, 1), new j(this, 2));

    @Override // y9.J
    public final void c() {
    }

    @Override // y9.J
    public final void f() {
    }

    @Override // y9.J
    public final void g() {
    }

    @Override // A9.S
    public final Q h() {
        return new Q(this);
    }

    @Override // y9.J
    public final void i() {
    }

    @Override // y9.J
    public final void j() {
    }

    @Override // y9.J
    public final void k() {
    }

    @Override // y9.J
    public final void l() {
    }

    @Override // y9.J
    public final void m(int i7) {
        F.B(l2.Q.f(this), null, 0, new i(this, i7, null), 3);
    }

    @Override // y9.J
    public final void p() {
    }

    @Override // y9.AbstractC2464g
    public final int p0() {
        return R.layout.fragment_custom_number;
    }

    @Override // y9.J
    public final void q() {
    }

    @Override // y9.AbstractC2464g
    public final String q0() {
        return "FragmentCustomNumber";
    }

    @Override // y9.AbstractC2464g
    public final void r0(Bundle bundle) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if (r3 == null) goto L13;
     */
    @Override // y9.AbstractC2464g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0() {
        TVChannel tVChannel;
        Object obj;
        Object parcelable;
        ((AbstractC1866d) o0()).f23229E.requestFocus();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = h0().getParcelable("extra:key_tv_channel", TVChannel.class);
            tVChannel = (TVChannel) parcelable;
        } else {
            tVChannel = (TVChannel) h0().getParcelable("extra:key_tv_channel");
        }
        AbstractC1866d abstractC1866d = (AbstractC1866d) o0();
        if (tVChannel != null) {
            int channelNumber = tVChannel.getChannelNumber();
            obj = Integer.valueOf(channelNumber);
            if (channelNumber <= 0) {
                obj = null;
            }
        }
        obj = "";
        abstractC1866d.f23231G.setText(String.valueOf(obj));
        AbstractC1866d abstractC1866d2 = (AbstractC1866d) o0();
        abstractC1866d2.f23228D.setOnClickListener(new h(0, this, tVChannel));
        AbstractC1866d abstractC1866d3 = (AbstractC1866d) o0();
        abstractC1866d3.f23227C.setOnClickListener(new Aa.q(this, 5));
        AbstractC1866d abstractC1866d4 = (AbstractC1866d) o0();
        abstractC1866d4.f23229E.setOnClickListener(new h(1, this, tVChannel));
    }

    @Override // y9.J
    public final void u() {
    }

    @Override // y9.J
    public final void v() {
    }
}
