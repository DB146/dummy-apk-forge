package Aa;

import A9.N2;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.TextView;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.core.tv.viewmodels.BaseTVChannelViewModel;
import com.kt.apps.media.xemtv.beta.R;
import da.C1063a;
import java.text.SimpleDateFormat;
import y9.D;
import y9.E;
import y9.G;
import y9.H;
import y9.I;

/* loaded from: classes2.dex */
public final /* synthetic */ class s implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f1539b;

    public /* synthetic */ s(w wVar, int i7) {
        this.f1538a = i7;
        this.f1539b = wVar;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        TVChannelLinkStream lastWatchedChannel;
        TVChannel channel;
        TextView textView;
        TextView textView2;
        TextView textView3;
        TVChannel channel2;
        switch (this.f1538a) {
            case 0:
                I i7 = (I) obj;
                SimpleDateFormat simpleDateFormat = w.f1546v2;
                boolean z8 = i7 instanceof G;
                w wVar = this.f1539b;
                if (z8) {
                    TVChannelLinkStream lastWatchedChannel2 = wVar.q1().getLastWatchedChannel();
                    if (lastWatchedChannel2 != null && (channel2 = lastWatchedChannel2.getChannel()) != null) {
                        G g = (G) i7;
                        wVar.Y0(channel2.getTvChannelName(), w.m1((N9.a) g.f27483a), true, false);
                        channel2.setCurrentProgramme((N9.a) g.f27483a);
                        wVar.j1(wVar.H0().f3807c);
                    }
                } else if ((i7 instanceof H) && (lastWatchedChannel = wVar.q1().getLastWatchedChannel()) != null && (channel = lastWatchedChannel.getChannel()) != null) {
                    String tvChannelName = channel.getTvChannelName();
                    H h10 = (H) i7;
                    String m12 = w.m1((N9.a) h10.f27484a);
                    TextView textView4 = wVar.f27476v1;
                    if (!String.valueOf(textView4 != null ? textView4.getText() : null).equalsIgnoreCase(tvChannelName) && (textView3 = wVar.f27476v1) != null) {
                        textView3.setText(tvChannelName);
                    }
                    TextView textView5 = wVar.f27477w1;
                    if (!String.valueOf(textView5 != null ? textView5.getText() : null).equalsIgnoreCase(m12) && (textView2 = wVar.f27477w1) != null) {
                        textView2.setText(m12 != null ? ac.g.v0(m12).toString() : null);
                    }
                    TextView textView6 = wVar.f27476v1;
                    if ((textView6 == null || !textView6.isSelected()) && (textView = wVar.f27476v1) != null) {
                        textView.setSelected(true);
                    }
                    channel.setCurrentProgramme((N9.a) h10.f27484a);
                    wVar.j1(wVar.H0().f3807c);
                }
                return Db.q.f3365a;
            default:
                w wVar2 = this.f1539b;
                I i10 = (I) obj;
                SimpleDateFormat simpleDateFormat2 = w.f1546v2;
                wVar2.getClass();
                if (i10 instanceof G) {
                    G g2 = (G) i10;
                    wVar2.f1553t2 = ((TVChannelLinkStream) g2.f27483a).getChannel();
                    wVar2.M0().a();
                    TVChannelLinkStream tVChannelLinkStream = (TVChannelLinkStream) g2.f27483a;
                    if (tVChannelLinkStream.getChannel().isRadio()) {
                        View view = wVar2.t1;
                        if (view != null) {
                            view.setBackgroundResource(R.drawable.bg_radio_playing);
                        }
                    } else {
                        View view2 = wVar2.t1;
                        if (view2 != null) {
                            view2.setBackground(new ColorDrawable(0));
                        }
                    }
                    synchronized (wVar2.n1()) {
                        try {
                            if (kotlin.jvm.internal.l.a(wVar2.n1().get(tVChannelLinkStream.getChannel().getChannelId()), Boolean.TRUE)) {
                                wVar2.n1().put(tVChannelLinkStream.getChannel().getChannelId(), Boolean.FALSE);
                                BaseTVChannelViewModel.loadProgramForChannel$default(wVar2.q1(), tVChannelLinkStream.getChannel(), false, 2, null);
                                wVar2.s1(tVChannelLinkStream, true);
                            } else {
                                wVar2.s1(tVChannelLinkStream, false);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else if (i10 instanceof E) {
                    if (!wVar2.M0().g) {
                        wVar2.M0().b();
                    }
                } else if (i10 instanceof D) {
                    wVar2.M0().a();
                    Throwable th2 = ((D) i10).f27482a;
                    if (th2 instanceof C1063a) {
                        wVar2.f1(4998, ((C1063a) th2).f16607a, new N2(wVar2, 2));
                    } else {
                        wVar2.f1(4998, null, new wa.f(15));
                    }
                    TVChannelLinkStream lastWatchedChannel3 = wVar2.q1().getLastWatchedChannel();
                    if (lastWatchedChannel3 != null) {
                        wVar2.p1().put(lastWatchedChannel3.getChannel().getChannelId(), 0);
                    }
                } else {
                    wVar2.M0().a();
                }
                return Db.q.f3365a;
        }
    }
}
