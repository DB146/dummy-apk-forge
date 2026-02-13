package Aa;

import A9.C0098j;
import A9.C0107l0;
import A9.C0163z1;
import A9.O0;
import A9.t3;
import H2.K;
import W1.C;
import W1.C0558a;
import W1.U;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kt.apps.core.base.leanback.SeekBar;
import com.kt.apps.core.base.leanback.VerticalGridView;
import com.kt.apps.core.tv.datasource.impl.MainTVDataSource$TVChannelUrlType;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.core.tv.viewmodels.BaseTVChannelViewModel;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.core.utils.AnimationUtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import fb.AbstractC1148b;
import hb.C1268a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import jb.InterfaceC1390a;
import l2.AbstractC1456G;
import m4.InterfaceC1587p;
import m4.q0;
import ob.C1842j;
import t8.C2034c;
import y7.u0;
import y9.G;
import y9.H;
import y9.I;

/* loaded from: classes2.dex */
public final class w extends h {

    /* renamed from: v2, reason: collision with root package name */
    public static final SimpleDateFormat f1546v2 = new SimpleDateFormat("HH:mm");

    /* renamed from: p2, reason: collision with root package name */
    public Kc.d f1549p2;

    /* renamed from: t2, reason: collision with root package name */
    public TVChannel f1553t2;

    /* renamed from: u2, reason: collision with root package name */
    public int f1554u2;

    /* renamed from: n2, reason: collision with root package name */
    public final O0 f1547n2 = vc.i.o(this, kotlin.jvm.internal.w.a(ta.c.class), new v(this, 0), new v(this, 1), new v(this, 2));

    /* renamed from: o2, reason: collision with root package name */
    public final O0 f1548o2 = vc.i.o(this, kotlin.jvm.internal.w.a(wa.h.class), new v(this, 3), new v(this, 4), new v(this, 5));

    /* renamed from: q2, reason: collision with root package name */
    public final C1268a f1550q2 = new Object();

    /* renamed from: r2, reason: collision with root package name */
    public final Db.o f1551r2 = android.support.v4.media.session.b.z(new C0163z1(5));

    /* renamed from: s2, reason: collision with root package name */
    public final Db.o f1552s2 = android.support.v4.media.session.b.z(new C0163z1(6));

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, hb.a] */
    public w() {
        new C0098j(new C0107l0(4));
    }

    public static String m1(N9.a aVar) {
        String str;
        String b2 = aVar.b();
        String message = aVar + ",\ndescription: " + b2;
        kotlin.jvm.internal.l.e(message, "message");
        String str2 = aVar.f7393e;
        if (ac.g.h0(ac.g.v0(str2).toString())) {
            str2 = null;
        }
        if (str2 == null || (str = ac.g.v0(str2).toString()) == null) {
            str = "";
        }
        if (ac.g.v0(str).toString().length() == 0) {
            return b2;
        }
        return X.c.h(str, b2.length() != 0 ? " • ".concat(b2) : "");
    }

    @Override // y9.AbstractC2456A
    public final void E0(String number) {
        kotlin.jvm.internal.l.e(number, "number");
        TVChannel findChannelByNumber = q1().findChannelByNumber(number);
        if (findChannelByNumber != null) {
            r1();
            q1().markLastWatchedChannel(findChannelByNumber);
            synchronized (n1()) {
                n1().clear();
                n1().put(findChannelByNumber.getChannelId(), Boolean.TRUE);
            }
            o1(findChannelByNumber);
            C0098j c0098j = this.f27464h1;
            kotlin.jvm.internal.l.c(c0098j, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.ArrayObjectAdapter");
            int indexOf = c0098j.f1233c.indexOf(findChannelByNumber);
            Integer valueOf = Integer.valueOf(indexOf);
            if (indexOf <= -1) {
                valueOf = null;
            }
            if ((valueOf != null ? Db.q.f3365a : null) != null) {
                return;
            }
        }
        ActivityUtilsKt.showErrorDialog$default(this, null, "Không tìm thấy kênh phù hợp cho: ".concat(number), "Oops!", null, null, false, false, null, null, 441, null);
    }

    @Override // y9.AbstractC2456A
    public final N9.a G0() {
        I i7 = (I) q1().getProgrammeForChannelLiveData().d();
        if (i7 == null) {
            return null;
        }
        if (i7 instanceof G) {
            return (N9.a) ((G) i7).f27483a;
        }
        if (i7 instanceof H) {
            return (N9.a) ((H) i7).f27484a;
        }
        return null;
    }

    @Override // y9.AbstractC2456A
    public final AbstractC1456G J0() {
        return q1().getListProgramForChannel();
    }

    @Override // A9.C0085f2, W1.C
    public final void S(Bundle bundle) {
        super.S(bundle);
        this.f27445Q1 = (wa.h) this.f1548o2.getValue();
    }

    @Override // y9.AbstractC2456A
    public final C S0() {
        return new d();
    }

    @Override // y9.AbstractC2456A, A9.C0085f2, W1.C
    public final View T(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.l.e(inflater, "inflater");
        View T10 = super.T(inflater, viewGroup, bundle);
        q1().getProgrammeForChannelLiveData().e(H(), new b(new s(this, 0), 2));
        return T10;
    }

    @Override // y9.AbstractC2456A
    public final void T0(boolean z8) {
        final TVChannel channel;
        TVChannelLinkStream lastWatchedChannel = q1().getLastWatchedChannel();
        if (lastWatchedChannel == null || (channel = lastWatchedChannel.getChannel()) == null) {
            return;
        }
        O0 o02 = this.f1548o2;
        if (!z8) {
            final wa.h hVar = (wa.h) o02.getValue();
            C1842j a9 = hVar.g.a(new W9.j(channel.getChannelId(), ((TVChannel.Url) Eb.o.Y(channel.getUrls())).getUrl(), channel.getTvChannelName(), channel.getTvGroup(), channel.getLogoChannel(), channel.getSourceFrom(), W9.i.f10890a));
            final int i7 = 1;
            nb.e eVar = new nb.e(0, new wa.g(hVar, 0), new InterfaceC1390a() { // from class: wa.e
                @Override // jb.InterfaceC1390a
                public final void run() {
                    switch (i7) {
                        case 0:
                            h hVar2 = hVar;
                            l2.H h10 = (l2.H) hVar2.f5329c.getValue();
                            TVChannel tVChannel = channel;
                            h10.l(new G(tVChannel));
                            hVar2.e();
                            String.valueOf(tVChannel);
                            return;
                        default:
                            l2.H h11 = (l2.H) hVar.f5331e.getValue();
                            TVChannel tVChannel2 = channel;
                            h11.l(new G(tVChannel2));
                            String.valueOf(tVChannel2);
                            return;
                    }
                }
            });
            a9.c(eVar);
            hVar.add(eVar);
            return;
        }
        final wa.h hVar2 = (wa.h) o02.getValue();
        W9.j jVar = new W9.j(channel.getChannelId(), ((TVChannel.Url) Eb.o.Y(channel.getUrls())).getUrl(), channel.getTvChannelName(), channel.getTvGroup(), channel.getLogoChannel(), channel.getSourceFrom(), channel.isRadio() ? W9.i.f10891b : W9.i.f10890a);
        P9.b bVar = hVar2.g;
        bVar.getClass();
        U9.w wVar = (U9.w) bVar.f8254b.getValue();
        wVar.getClass();
        C1842j e2 = android.support.v4.media.session.b.g(wVar.f9918a, new U9.v(wVar, jVar, 0)).e(Ab.e.f1561c);
        final int i10 = 0;
        nb.e eVar2 = new nb.e(0, new wa.g(hVar2, 1), new InterfaceC1390a() { // from class: wa.e
            @Override // jb.InterfaceC1390a
            public final void run() {
                switch (i10) {
                    case 0:
                        h hVar22 = hVar2;
                        l2.H h10 = (l2.H) hVar22.f5329c.getValue();
                        TVChannel tVChannel = channel;
                        h10.l(new G(tVChannel));
                        hVar22.e();
                        String.valueOf(tVChannel);
                        return;
                    default:
                        l2.H h11 = (l2.H) hVar2.f5331e.getValue();
                        TVChannel tVChannel2 = channel;
                        h11.l(new G(tVChannel2));
                        String.valueOf(tVChannel2);
                        return;
                }
            }
        });
        e2.c(eVar2);
        hVar2.add(eVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01de  */
    @Override // y9.AbstractC2456A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0(q0 error) {
        int i7;
        TVChannelLinkStream lastWatchedChannel;
        ArrayList arrayList;
        TVChannel channel;
        TVChannel channel2;
        List<TVChannel.Url> linkStream;
        TVChannel channel3;
        String tvChannelName;
        TVChannel channel4;
        String tvChannelName2;
        List<TVChannel.Url> linkReadyToStream;
        List<TVChannel.Url> linkReadyToStream2;
        Integer num;
        TVChannel channel5;
        kotlin.jvm.internal.l.e(error, "error");
        if (error.getCause() == null) {
            new Throwable("Error playback");
        }
        try {
            Map p1 = p1();
            TVChannelLinkStream lastWatchedChannel2 = q1().getLastWatchedChannel();
            num = (Integer) p1.get((lastWatchedChannel2 == null || (channel5 = lastWatchedChannel2.getChannel()) == null) ? null : channel5.getChannelId());
        } catch (Exception unused) {
        }
        if (num != null) {
            i7 = num.intValue();
            if (i7 <= 3) {
                TVChannelLinkStream lastWatchedChannel3 = q1().getLastWatchedChannel();
                if (((lastWatchedChannel3 == null || (linkReadyToStream2 = lastWatchedChannel3.getLinkReadyToStream()) == null) ? 0 : linkReadyToStream2.size()) != 0) {
                    TVChannelLinkStream lastWatchedChannel4 = q1().getLastWatchedChannel();
                    String str = "Unknown";
                    if (((lastWatchedChannel4 == null || (linkReadyToStream = lastWatchedChannel4.getLinkReadyToStream()) == null) ? 0 : linkReadyToStream.size()) <= 1) {
                        q1().retryGetLastWatchedChannel();
                        O9.a aVar = this.f27458d1;
                        if (aVar == null) {
                            kotlin.jvm.internal.l.j("actionLogger");
                            throw null;
                        }
                        TVChannelLinkStream lastWatchedChannel5 = q1().getLastWatchedChannel();
                        if (lastWatchedChannel5 != null && (channel3 = lastWatchedChannel5.getChannel()) != null && (tvChannelName = channel3.getTvChannelName()) != null) {
                            str = tvChannelName;
                        }
                        c2.q.q(aVar, error, str, new Db.j[0]);
                        Map p12 = p1();
                        TVChannelLinkStream lastWatchedChannel6 = q1().getLastWatchedChannel();
                        channel = lastWatchedChannel6 != null ? lastWatchedChannel6.getChannel() : null;
                        kotlin.jvm.internal.l.b(channel);
                        p12.put(channel.getChannelId(), Integer.valueOf(i7 + 1));
                        return;
                    }
                    TVChannelLinkStream lastWatchedChannel7 = q1().getLastWatchedChannel();
                    kotlin.jvm.internal.l.b(lastWatchedChannel7);
                    List<TVChannel.Url> linkReadyToStream3 = lastWatchedChannel7.getLinkReadyToStream();
                    TVChannelLinkStream lastWatchedChannel8 = q1().getLastWatchedChannel();
                    kotlin.jvm.internal.l.b(lastWatchedChannel8);
                    List<TVChannel.Url> subList = linkReadyToStream3.subList(1, lastWatchedChannel8.getLinkReadyToStream().size());
                    TVChannelLinkStream lastWatchedChannel9 = q1().getLastWatchedChannel();
                    kotlin.jvm.internal.l.b(lastWatchedChannel9);
                    TVChannelLinkStream tVChannelLinkStream = new TVChannelLinkStream(lastWatchedChannel9.getChannel(), subList);
                    q1().markLastWatchedChannel(tVChannelLinkStream);
                    s1(tVChannelLinkStream, false);
                    O9.a aVar2 = this.f27458d1;
                    if (aVar2 == null) {
                        kotlin.jvm.internal.l.j("actionLogger");
                        throw null;
                    }
                    TVChannelLinkStream lastWatchedChannel10 = q1().getLastWatchedChannel();
                    if (lastWatchedChannel10 != null && (channel4 = lastWatchedChannel10.getChannel()) != null && (tvChannelName2 = channel4.getTvChannelName()) != null) {
                        str = tvChannelName2;
                    }
                    c2.q.r(aVar2, error, str, new Db.j("link", Eb.o.Y(subList)));
                    Map p13 = p1();
                    TVChannelLinkStream lastWatchedChannel11 = q1().getLastWatchedChannel();
                    channel = lastWatchedChannel11 != null ? lastWatchedChannel11.getChannel() : null;
                    kotlin.jvm.internal.l.b(channel);
                    p13.put(channel.getChannelId(), Integer.valueOf(i7 + 1));
                    return;
                }
            }
            lastWatchedChannel = q1().getLastWatchedChannel();
            if (lastWatchedChannel != null || (linkStream = lastWatchedChannel.getLinkStream()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Object obj : linkStream) {
                    if (kotlin.jvm.internal.l.a(((TVChannel.Url) obj).getType(), MainTVDataSource$TVChannelUrlType.WEB_PAGE.getValue())) {
                        arrayList.add(obj);
                    }
                }
            }
            if (arrayList != null || arrayList.isEmpty()) {
                Map p14 = p1();
                TVChannelLinkStream lastWatchedChannel12 = q1().getLastWatchedChannel();
                channel = lastWatchedChannel12 != null ? lastWatchedChannel12.getChannel() : null;
                kotlin.jvm.internal.l.b(channel);
                p14.put(channel.getChannelId(), 0);
                ta.c q12 = q1();
                TVChannelLinkStream lastWatchedChannel13 = q1().getLastWatchedChannel();
                kotlin.jvm.internal.l.b(lastWatchedChannel13);
                q12.getLinkStreamForChannel(lastWatchedChannel13.getChannel(), true);
                return;
            }
            f1(error.f20477a, null, new wa.f(15));
            TVChannelLinkStream lastWatchedChannel14 = q1().getLastWatchedChannel();
            if (lastWatchedChannel14 == null || (channel2 = lastWatchedChannel14.getChannel()) == null) {
                return;
            }
            p1().put(channel2.getChannelId(), 0);
            O9.a aVar3 = this.f27458d1;
            if (aVar3 != null) {
                c2.q.s(aVar3, error, channel2.getTvChannelName(), new Db.j[0]);
                return;
            } else {
                kotlin.jvm.internal.l.j("actionLogger");
                throw null;
            }
        }
        i7 = 0;
        if (i7 <= 3) {
        }
        lastWatchedChannel = q1().getLastWatchedChannel();
        if (lastWatchedChannel != null) {
        }
        arrayList = null;
        if (arrayList != null || arrayList.isEmpty()) {
        }
    }

    @Override // y9.AbstractC2456A, W1.C
    public final void W() {
        this.f1550q2.e();
        super.W();
    }

    @Override // y9.AbstractC2456A
    public final void W0() {
        TVChannelLinkStream lastWatchedChannel = q1().getLastWatchedChannel();
        if (lastWatchedChannel == null || System.currentTimeMillis() - q1().getLastGetProgramme() < 60000) {
            return;
        }
        q1().loadProgramForChannel(lastWatchedChannel.getChannel(), true);
    }

    @Override // y9.AbstractC2456A
    public final void b1(int i7) {
        VerticalGridView verticalGridView;
        t3 t3Var = this.f27465i1;
        if (t3Var == null || (verticalGridView = t3Var.f1376c) == null) {
            return;
        }
        verticalGridView.setSelectedPositionSmooth(i7);
    }

    @Override // y9.AbstractC2456A, y9.J
    public final void c() {
        VerticalGridView verticalGridView;
        K adapter;
        Q0();
        int i7 = 0;
        int max = Math.max(0, this.f1554u2) - 1;
        if (max <= -1) {
            return;
        }
        this.f1554u2 = max;
        b1(max);
        String message = "onKeyCodeChannelDown: " + this.f1554u2;
        kotlin.jvm.internal.l.e(message, "message");
        t3 t3Var = this.f27465i1;
        if (t3Var != null && (verticalGridView = t3Var.f1376c) != null && (adapter = verticalGridView.getAdapter()) != null) {
            i7 = adapter.a();
        }
        int i10 = this.f1554u2;
        int i11 = i7 - 1;
        if (i10 > i11) {
            this.f1554u2 = i11;
            return;
        }
        C0098j c0098j = this.f27464h1;
        Object obj = c0098j != null ? c0098j.f1233c.get(i10) : null;
        TVChannel tVChannel = obj instanceof TVChannel ? (TVChannel) obj : null;
        if (tVChannel == null) {
            return;
        }
        o1(tVChannel);
    }

    @Override // y9.AbstractC2456A, A9.C0085f2, W1.C
    public final void d0(View view, Bundle bundle) {
        kotlin.jvm.internal.l.e(view, "view");
        super.d0(view, bundle);
        if (!(q1().getTvChannelLiveData().d() instanceof G)) {
            q1().getListTVChannel(false);
        }
        Bundle bundle2 = this.f10300u;
        TVChannelLinkStream tVChannelLinkStream = bundle2 != null ? (TVChannelLinkStream) bundle2.getParcelable("extra:tv_channel") : null;
        if (tVChannelLinkStream != null) {
            this.f1553t2 = tVChannelLinkStream.getChannel();
            if (tVChannelLinkStream.getChannel().isRadio()) {
                View view2 = this.t1;
                if (view2 != null) {
                    view2.setBackgroundResource(R.drawable.bg_radio_playing);
                }
            } else {
                View view3 = this.t1;
                if (view3 != null) {
                    view3.setBackground(new ColorDrawable(0));
                }
            }
            q1().getListProgramForChannel(tVChannelLinkStream.getChannel());
            q1().markLastWatchedChannel(tVChannelLinkStream);
            s1(tVChannelLinkStream, true);
        }
        this.f27442M1 = new A1.d(this, 4);
        q1().getTvWithLinkStreamLiveData().e(H(), new b(new s(this, 1), 2));
        q1().getTvChannelLiveData().e(H(), new b(new t(0, tVChannelLinkStream, this), 2));
    }

    @Override // y9.AbstractC2456A
    public final void j1(InterfaceC1587p interfaceC1587p) {
        TVChannel channel;
        Db.q qVar;
        N9.a G02 = G0();
        String str = null;
        if (G02 != null) {
            if (G02.f7391c.length() <= 0 || G02.f7392d.length() <= 0) {
                TextView textView = this.f27480z1;
                if (textView != null) {
                    AnimationUtilsKt.gone(textView);
                }
                SeekBar seekBar = this.f27432A1;
                if (seekBar != null) {
                    seekBar.setMax(1);
                }
                SeekBar seekBar2 = this.f27432A1;
                if (seekBar2 != null) {
                    seekBar2.setProgress(1);
                }
            } else {
                SimpleDateFormat simpleDateFormat = f1546v2;
                String format = simpleDateFormat.format(Long.valueOf(G02.d()));
                String format2 = simpleDateFormat.format(Long.valueOf(G02.a()));
                TextView textView2 = this.f27480z1;
                if (textView2 != null) {
                    textView2.setText(format + " - " + format2);
                }
                TextView textView3 = this.f27480z1;
                if (textView3 != null) {
                    AnimationUtilsKt.visible(textView3);
                }
                SeekBar seekBar3 = this.f27432A1;
                if (seekBar3 != null) {
                    seekBar3.setMax((int) (G02.a() - G02.d()));
                }
                SeekBar seekBar4 = this.f27432A1;
                if (seekBar4 != null) {
                    seekBar4.setProgress((int) (System.currentTimeMillis() - G02.d()));
                }
            }
            SeekBar seekBar5 = this.f27432A1;
            if (seekBar5 != null) {
                seekBar5.setSeekAble(false);
            }
            TextView textView4 = this.f27433C1;
            if (textView4 != null) {
                AnimationUtilsKt.gone(textView4);
            }
            TextView textView5 = this.f27434D1;
            if (textView5 != null) {
                AnimationUtilsKt.gone(textView5);
                qVar = Db.q.f3365a;
            } else {
                qVar = null;
            }
            if (qVar != null) {
                return;
            }
        }
        SeekBar seekBar6 = this.f27432A1;
        if (seekBar6 != null) {
            seekBar6.setMax(1);
        }
        SeekBar seekBar7 = this.f27432A1;
        if (seekBar7 != null) {
            seekBar7.setProgress(1);
        }
        TextView textView6 = this.f27480z1;
        if (textView6 != null) {
            TVChannelLinkStream lastWatchedChannel = q1().getLastWatchedChannel();
            if (lastWatchedChannel != null && (channel = lastWatchedChannel.getChannel()) != null) {
                str = channel.getTvGroup();
            }
            textView6.setText(str);
        }
        TextView textView7 = this.f27480z1;
        if (textView7 != null) {
            AnimationUtilsKt.visible(textView7);
        }
        TextView textView8 = this.f27434D1;
        if (textView8 != null) {
            AnimationUtilsKt.gone(textView8);
        }
        TextView textView9 = this.f27433C1;
        if (textView9 != null) {
            AnimationUtilsKt.gone(textView9);
        }
    }

    public final Map n1() {
        return (Map) this.f1552s2.getValue();
    }

    public final void o1(TVChannel tVChannel) {
        q1().getListProgramForChannel(tVChannel);
        BaseTVChannelViewModel.getLinkStreamForChannel$default(q1(), tVChannel, false, 2, null);
    }

    public final Map p1() {
        return (Map) this.f1551r2.getValue();
    }

    public final ta.c q1() {
        return (ta.c) this.f1547n2.getValue();
    }

    public final void r1() {
        try {
            C D10 = B().D(R.id.container_program);
            if (D10 != null) {
                U B10 = B();
                B10.getClass();
                C0558a c0558a = new C0558a(B10);
                c0558a.i(D10);
                c0558a.f();
            }
        } catch (Exception unused) {
        }
    }

    @Override // A9.C0085f2
    public final void s0(int i7, String str) {
    }

    public final void s1(TVChannelLinkStream tVChannelLinkStream, boolean z8) {
        Object obj;
        int i7;
        List<E9.i> inputExoPlayerLink = tVChannelLinkStream.getInputExoPlayerLink();
        Map<String, String> mapData = tVChannelLinkStream.getChannel().getMapData();
        boolean isHls = tVChannelLinkStream.getChannel().isHls();
        Iterator<T> it = tVChannelLinkStream.getLinkReadyToStream().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((TVChannel.Url) obj).getProps() != null) {
                    break;
                }
            }
        }
        TVChannel.Url url = (TVChannel.Url) obj;
        X0(inputExoPlayerLink, mapData, url != null ? url.getProps() : null, isHls, true, z8);
        String message = "PlayVideo: " + tVChannelLinkStream;
        kotlin.jvm.internal.l.e(message, "message");
        if (q1().getTvChannelLiveData().d() instanceof G) {
            Object d10 = q1().getTvChannelLiveData().d();
            kotlin.jvm.internal.l.c(d10, "null cannot be cast to non-null type com.kt.apps.core.base.DataState.Success<kotlin.collections.List<com.kt.apps.core.tv.model.TVChannel>>");
            List list = (List) ((G) d10).f27483a;
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i7 = -1;
                    break;
                }
                String channelId = ((TVChannel) listIterator.previous()).getChannelId();
                TVChannel tVChannel = this.f1553t2;
                if (kotlin.jvm.internal.l.a(channelId, tVChannel != null ? tVChannel.getChannelId() : null)) {
                    i7 = listIterator.nextIndex();
                    break;
                }
            }
            Integer valueOf = i7 >= 0 ? Integer.valueOf(i7) : null;
            this.f1554u2 = valueOf != null ? valueOf.intValue() : 0;
        }
    }

    public final void t1(ArrayList arrayList) {
        int i7;
        Object obj;
        if (this.f1553t2 != null) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                String channelId = ((TVChannel) obj).getChannelId();
                TVChannel tVChannel = this.f1553t2;
                kotlin.jvm.internal.l.b(tVChannel);
                if (kotlin.jvm.internal.l.a(channelId, tVChannel.getChannelId())) {
                    break;
                }
            }
            i7 = arrayList.lastIndexOf((TVChannel) obj);
        } else {
            i7 = 0;
        }
        this.f1554u2 = i7;
        String message = "setupRowAdapter: " + i7;
        kotlin.jvm.internal.l.e(message, "message");
        C0098j c0098j = new C0098j(new sa.h(g0()));
        c0098j.h(0, arrayList);
        this.f27464h1 = c0098j;
        i1();
        Kc.d dVar = this.f1549p2;
        if (dVar == null) {
            kotlin.jvm.internal.l.j("adsRepository");
            throw null;
        }
        ob.m f4 = dVar.b(5).f(Ab.e.f1561c);
        gb.o a9 = AbstractC1148b.a();
        nb.e eVar = new nb.e(1, new C2034c(this, 1), u.f1543a);
        try {
            f4.d(new qb.p(eVar, a9, 1));
            this.f1550q2.d(eVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            u0.L(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @Override // y9.AbstractC2456A, y9.J
    public final void v() {
        VerticalGridView verticalGridView;
        VerticalGridView verticalGridView2;
        K adapter;
        Q0();
        int i7 = 0;
        int max = Math.max(0, this.f1554u2) + 1;
        this.f1554u2 = max;
        b1(max);
        String message = "onKeyCodeChannelUp: " + this.f1554u2;
        kotlin.jvm.internal.l.e(message, "message");
        t3 t3Var = this.f27465i1;
        int a9 = (t3Var == null || (verticalGridView2 = t3Var.f1376c) == null || (adapter = verticalGridView2.getAdapter()) == null) ? 0 : adapter.a();
        int i10 = this.f1554u2;
        if (i10 > a9 - 1) {
            t3 t3Var2 = this.f27465i1;
            if (t3Var2 != null && (verticalGridView = t3Var2.f1376c) != null) {
                i7 = verticalGridView.getSelectedPosition();
            }
            this.f1554u2 = i7;
            return;
        }
        C0098j c0098j = this.f27464h1;
        Object obj = c0098j != null ? c0098j.f1233c.get(i10) : null;
        TVChannel tVChannel = obj instanceof TVChannel ? (TVChannel) obj : null;
        if (tVChannel == null) {
            return;
        }
        o1(tVChannel);
    }
}
