package Ea;

import Db.o;
import c2.q;
import com.kt.apps.core.tv.datasource.impl.MainTVDataSource$TVChannelUrlType;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import com.kt.apps.media.xemtv.ui_mobile.MobileMainActivity;
import fc.J;
import fc.b0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m4.C1549C;
import m4.E0;
import m4.q0;
import m4.u0;
import m4.v0;
import o5.w;

/* loaded from: classes2.dex */
public final class f implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MobileMainActivity f3834a;

    public f(MobileMainActivity mobileMainActivity) {
        this.f3834a = mobileMainActivity;
    }

    @Override // m4.v0
    public final void J(w videoSize) {
        kotlin.jvm.internal.l.e(videoSize, "videoSize");
        this.f3834a.k();
    }

    @Override // m4.v0
    public final void L(boolean z8) {
    }

    @Override // m4.v0
    public final void h(C1549C player, u0 u0Var) {
        b0 b0Var;
        Object value;
        b0 b0Var2;
        Object value2;
        kotlin.jvm.internal.l.e(player, "player");
        if (u0Var.a(5, 4)) {
            int d02 = player.d0();
            o oVar = this.f3834a.f16232Q;
            if (d02 == 2) {
                if (((Boolean) ((b0) ((J) oVar.getValue())).getValue()).booleanValue()) {
                    return;
                }
                J j = (J) oVar.getValue();
                do {
                    b0Var2 = (b0) j;
                    value2 = b0Var2.getValue();
                    ((Boolean) value2).getClass();
                } while (!b0Var2.h(value2, Boolean.TRUE));
                return;
            }
            if (player.d0() != 1) {
                J j10 = (J) oVar.getValue();
                do {
                    b0Var = (b0) j10;
                    value = b0Var.getValue();
                    ((Boolean) value).getClass();
                } while (!b0Var.h(value, Boolean.FALSE));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023c  */
    @Override // m4.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(q0 error) {
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
        MobileMainActivity mobileMainActivity = this.f3834a;
        o oVar = mobileMainActivity.f16231P;
        if (error.getCause() == null) {
            new Throwable("Error playback");
        }
        try {
            Map map = (Map) oVar.getValue();
            TVChannelLinkStream lastWatchedChannel2 = mobileMainActivity.l().getLastWatchedChannel();
            num = (Integer) map.get((lastWatchedChannel2 == null || (channel5 = lastWatchedChannel2.getChannel()) == null) ? null : channel5.getChannelId());
        } catch (Exception unused) {
        }
        if (num != null) {
            i7 = num.intValue();
            if (i7 <= 3) {
                TVChannelLinkStream lastWatchedChannel3 = mobileMainActivity.l().getLastWatchedChannel();
                if (((lastWatchedChannel3 == null || (linkReadyToStream2 = lastWatchedChannel3.getLinkReadyToStream()) == null) ? 0 : linkReadyToStream2.size()) != 0) {
                    TVChannelLinkStream lastWatchedChannel4 = mobileMainActivity.l().getLastWatchedChannel();
                    String str = "Unknown";
                    if (((lastWatchedChannel4 == null || (linkReadyToStream = lastWatchedChannel4.getLinkReadyToStream()) == null) ? 0 : linkReadyToStream.size()) <= 1) {
                        mobileMainActivity.l().retryGetLastWatchedChannel();
                        O9.a aVar = mobileMainActivity.f16228M;
                        if (aVar == null) {
                            kotlin.jvm.internal.l.j("actionLogger");
                            throw null;
                        }
                        TVChannelLinkStream lastWatchedChannel5 = mobileMainActivity.l().getLastWatchedChannel();
                        if (lastWatchedChannel5 != null && (channel3 = lastWatchedChannel5.getChannel()) != null && (tvChannelName = channel3.getTvChannelName()) != null) {
                            str = tvChannelName;
                        }
                        q.q(aVar, error, str, new Db.j[0]);
                        Map map2 = (Map) oVar.getValue();
                        TVChannelLinkStream lastWatchedChannel6 = mobileMainActivity.l().getLastWatchedChannel();
                        channel = lastWatchedChannel6 != null ? lastWatchedChannel6.getChannel() : null;
                        kotlin.jvm.internal.l.b(channel);
                        map2.put(channel.getChannelId(), Integer.valueOf(i7 + 1));
                        return;
                    }
                    TVChannelLinkStream lastWatchedChannel7 = mobileMainActivity.l().getLastWatchedChannel();
                    kotlin.jvm.internal.l.b(lastWatchedChannel7);
                    List<TVChannel.Url> linkReadyToStream3 = lastWatchedChannel7.getLinkReadyToStream();
                    TVChannelLinkStream lastWatchedChannel8 = mobileMainActivity.l().getLastWatchedChannel();
                    kotlin.jvm.internal.l.b(lastWatchedChannel8);
                    List<TVChannel.Url> subList = linkReadyToStream3.subList(1, lastWatchedChannel8.getLinkReadyToStream().size());
                    TVChannelLinkStream lastWatchedChannel9 = mobileMainActivity.l().getLastWatchedChannel();
                    kotlin.jvm.internal.l.b(lastWatchedChannel9);
                    TVChannelLinkStream tVChannelLinkStream = new TVChannelLinkStream(lastWatchedChannel9.getChannel(), subList);
                    mobileMainActivity.l().markLastWatchedChannel(tVChannelLinkStream);
                    E9.h k = mobileMainActivity.k();
                    List<E9.i> inputExoPlayerLink = tVChannelLinkStream.getInputExoPlayerLink();
                    boolean isHls = tVChannelLinkStream.getChannel().isHls();
                    Map<String, String> mapData = tVChannelLinkStream.getChannel().getMapData();
                    f fVar = (f) mobileMainActivity.f16233R.getValue();
                    int i10 = E9.c.f3804f;
                    k.d(inputExoPlayerLink, isHls, mapData, fVar, null);
                    O9.a aVar2 = mobileMainActivity.f16228M;
                    if (aVar2 == null) {
                        kotlin.jvm.internal.l.j("actionLogger");
                        throw null;
                    }
                    TVChannelLinkStream lastWatchedChannel10 = mobileMainActivity.l().getLastWatchedChannel();
                    if (lastWatchedChannel10 != null && (channel4 = lastWatchedChannel10.getChannel()) != null && (tvChannelName2 = channel4.getTvChannelName()) != null) {
                        str = tvChannelName2;
                    }
                    q.r(aVar2, error, str, new Db.j("link", Eb.o.Y(subList)));
                    Map map3 = (Map) oVar.getValue();
                    TVChannelLinkStream lastWatchedChannel11 = mobileMainActivity.l().getLastWatchedChannel();
                    channel = lastWatchedChannel11 != null ? lastWatchedChannel11.getChannel() : null;
                    kotlin.jvm.internal.l.b(channel);
                    map3.put(channel.getChannelId(), Integer.valueOf(i7 + 1));
                    return;
                }
            }
            lastWatchedChannel = mobileMainActivity.l().getLastWatchedChannel();
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
                Map map4 = (Map) oVar.getValue();
                TVChannelLinkStream lastWatchedChannel12 = mobileMainActivity.l().getLastWatchedChannel();
                channel = lastWatchedChannel12 != null ? lastWatchedChannel12.getChannel() : null;
                kotlin.jvm.internal.l.b(channel);
                map4.put(channel.getChannelId(), 0);
                ta.c l10 = mobileMainActivity.l();
                TVChannelLinkStream lastWatchedChannel13 = mobileMainActivity.l().getLastWatchedChannel();
                kotlin.jvm.internal.l.b(lastWatchedChannel13);
                l10.getLinkStreamForChannel(lastWatchedChannel13.getChannel(), true);
                return;
            }
            ActivityUtilsKt.showErrorDialog$default(mobileMainActivity, null, mobileMainActivity.getString(R.string.error_playback_popup_content_text, Integer.valueOf(error.f20477a)), null, null, null, false, false, false, null, null, 1021, null);
            TVChannelLinkStream lastWatchedChannel14 = mobileMainActivity.l().getLastWatchedChannel();
            if (lastWatchedChannel14 == null || (channel2 = lastWatchedChannel14.getChannel()) == null) {
                return;
            }
            ((Map) oVar.getValue()).put(channel2.getChannelId(), 0);
            O9.a aVar3 = mobileMainActivity.f16228M;
            if (aVar3 != null) {
                q.s(aVar3, error, channel2.getTvChannelName(), new Db.j[0]);
                return;
            } else {
                kotlin.jvm.internal.l.j("actionLogger");
                throw null;
            }
        }
        i7 = 0;
        if (i7 <= 3) {
        }
        lastWatchedChannel = mobileMainActivity.l().getLastWatchedChannel();
        if (lastWatchedChannel != null) {
        }
        arrayList = null;
        if (arrayList != null || arrayList.isEmpty()) {
        }
    }

    @Override // m4.v0
    public final void v(int i7) {
        if (i7 != 3) {
            return;
        }
        int i10 = MobileMainActivity.f16227S;
        MobileMainActivity mobileMainActivity = this.f3834a;
        TVChannelLinkStream tVChannelLinkStream = (TVChannelLinkStream) ((b0) mobileMainActivity.l().i().f17078a).getValue();
        if (tVChannelLinkStream != null) {
            O9.a aVar = mobileMainActivity.f16228M;
            if (aVar == null) {
                kotlin.jvm.internal.l.j("actionLogger");
                throw null;
            }
            q.t(aVar, tVChannelLinkStream.getChannel().getTvChannelName(), new Db.j("channelLink", Eb.o.Z(tVChannelLinkStream.getLinkStream())));
        }
        C1549C c1549c = mobileMainActivity.k().f3807c;
        if (c1549c == null) {
            return;
        }
        c1549c.s0(new E0(10000L, 10000L));
    }
}
