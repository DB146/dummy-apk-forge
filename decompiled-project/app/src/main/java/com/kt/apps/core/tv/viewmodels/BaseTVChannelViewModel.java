package com.kt.apps.core.tv.viewmodels;

import Aa.t;
import Db.g;
import Db.j;
import Eb.B;
import Eb.o;
import G8.m;
import I2.C0330t;
import J1.f;
import O9.a;
import U9.n;
import W9.e;
import X.c;
import Y5.A;
import android.net.Uri;
import android.support.v4.media.session.b;
import androidx.annotation.Keep;
import c2.q;
import com.bumptech.glide.d;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelGroup;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.core.tv.model.TVDataSourceFrom;
import com.kt.apps.core.utils.UtilsKt;
import da.C1065c;
import da.C1067e;
import ea.C1106a;
import ea.C1107b;
import ea.C1108c;
import ea.C1109d;
import ea.C1110e;
import ea.C1111f;
import ea.C1112g;
import ea.C1113h;
import gb.i;
import hb.C1268a;
import hb.InterfaceC1269b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kb.C1436a;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import l2.AbstractC1456G;
import l2.H;
import mb.InterfaceC1655a;
import nb.h;
import ob.C1837e;
import pb.r;
import q3.s;
import y.S;
import y7.u0;
import y9.C;
import y9.D;
import y9.G;
import y9.I;

@Keep
/* loaded from: classes2.dex */
public class BaseTVChannelViewModel extends C {
    public static final C1106a Companion = new Object();
    private static int instance;
    private final g _currentProgramTitle$delegate;
    private TVChannelLinkStream _lastWatchedChannel;
    private final g _listProgramForChannel$delegate;
    private final g _listTvChannelLiveData$delegate;
    private final g _programmeForChannelLiveData$delegate;
    private final g _tvWithLinkStreamLiveData$delegate;
    public a actionLogger;
    private final SimpleDateFormat dateFormat;
    private final C1113h interactors;
    private long lastGetProgramme;
    private InterfaceC1269b lastTVStreamLinkTask;
    private final g tvChannelStreamingRetryCount$delegate;

    public BaseTVChannelViewModel(C1113h interactors) {
        l.e(interactors, "interactors");
        this.interactors = interactors;
        this._currentProgramTitle$delegate = b.z(new com.kt.apps.core.utils.l(2));
        this._listTvChannelLiveData$delegate = b.z(new com.kt.apps.core.utils.l(3));
        this.tvChannelStreamingRetryCount$delegate = b.z(new com.kt.apps.core.utils.l(4));
        this._tvWithLinkStreamLiveData$delegate = b.z(new com.kt.apps.core.utils.l(5));
        this._listProgramForChannel$delegate = b.z(new com.kt.apps.core.utils.l(6));
        this.dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this._programmeForChannelLiveData$delegate = b.z(new com.kt.apps.core.utils.l(7));
        instance++;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [J1.b, J1.f] */
    public static final f _currentProgramTitle_delegate$lambda$0() {
        return new J1.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l2.H, l2.G] */
    public static final H _listProgramForChannel_delegate$lambda$8() {
        return new AbstractC1456G();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l2.H, l2.G] */
    public static final H _listTvChannelLiveData_delegate$lambda$1() {
        return new AbstractC1456G();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l2.H, l2.G] */
    public static final H _programmeForChannelLiveData_delegate$lambda$11() {
        return new AbstractC1456G();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l2.H, l2.G] */
    public static final H _tvWithLinkStreamLiveData_delegate$lambda$4() {
        return new AbstractC1456G();
    }

    public static /* synthetic */ void getLinkStreamForChannel$default(BaseTVChannelViewModel baseTVChannelViewModel, TVChannel tVChannel, boolean z8, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLinkStreamForChannel");
        }
        if ((i7 & 2) != 0) {
            z8 = false;
        }
        baseTVChannelViewModel.getLinkStreamForChannel(tVChannel, z8);
    }

    public static final void getLinkStreamForChannel$lambda$5(v vVar, BaseTVChannelViewModel baseTVChannelViewModel) {
        TVChannel channel;
        Object obj = vVar.f19134a;
        if (obj == null || ((TVChannelLinkStream) obj).getLinkStream().isEmpty()) {
            H h10 = baseTVChannelViewModel.get_tvWithLinkStreamLiveData();
            TVChannelLinkStream lastWatchedChannel = baseTVChannelViewModel.getLastWatchedChannel();
            h10.l(new D(new Throwable(S.b("Kênh ", (lastWatchedChannel == null || (channel = lastWatchedChannel.getChannel()) == null) ? null : channel.getTvChannelName(), " hiện tại đang lỗi hoặc chưa hỗ trợ nội dung miễn phí"))));
        } else {
            baseTVChannelViewModel.markLastWatchedChannel((TVChannelLinkStream) vVar.f19134a);
            baseTVChannelViewModel.enqueueInsertWatchNextTVChannel(((TVChannelLinkStream) vVar.f19134a).getChannel());
            baseTVChannelViewModel.get_tvWithLinkStreamLiveData().l(new G(vVar.f19134a));
            q.t(baseTVChannelViewModel.getActionLogger(), ((TVChannelLinkStream) vVar.f19134a).getChannel().getTvChannelName(), new j[0]);
        }
    }

    public static final void getListTVChannel$lambda$3(BaseTVChannelViewModel baseTVChannelViewModel, List list) {
        baseTVChannelViewModel.get_listTvChannelLiveData().l(new G(list));
        baseTVChannelViewModel.onFetchTVListSuccess(list);
    }

    private final Map<String, Integer> getTvChannelStreamingRetryCount() {
        return (Map) this.tvChannelStreamingRetryCount$delegate.getValue();
    }

    private final f get_currentProgramTitle() {
        return (f) this._currentProgramTitle$delegate.getValue();
    }

    public final H get_listProgramForChannel() {
        return (H) this._listProgramForChannel$delegate.getValue();
    }

    public final H get_programmeForChannelLiveData() {
        return (H) this._programmeForChannelLiveData$delegate.getValue();
    }

    public static /* synthetic */ void loadProgramForChannel$default(BaseTVChannelViewModel baseTVChannelViewModel, TVChannel tVChannel, boolean z8, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadProgramForChannel");
        }
        if ((i7 & 2) != 0) {
            z8 = false;
        }
        baseTVChannelViewModel.loadProgramForChannel(tVChannel, z8);
    }

    public final N9.a toDefaultProgramme(TVChannel tVChannel) {
        String tvGroup;
        String n02 = ac.g.n0(UtilsKt.removeAllSpecialChars(tVChannel.getChannelId()), "viechannel");
        try {
            tvGroup = TVChannelGroup.valueOf(tVChannel.getTvGroup()).getValue();
        } catch (Exception unused) {
            tvGroup = tVChannel.getTvGroup();
        }
        return new N9.a(206, n02, tvGroup);
    }

    public static final Map tvChannelStreamingRetryCount_delegate$lambda$2() {
        return new LinkedHashMap();
    }

    public final void cancelCurrentGetStreamLinkTask() {
        InterfaceC1269b interfaceC1269b = this.lastTVStreamLinkTask;
        if (interfaceC1269b != null) {
            getCompositeDisposable().c(interfaceC1269b);
            interfaceC1269b.b();
        }
    }

    public final void clearCurrentPlayingChannelState() {
        this._lastWatchedChannel = null;
        get_tvWithLinkStreamLiveData().l(new Object());
    }

    public void enqueueInsertWatchNextTVChannel(TVChannel tvChannel) {
        l.e(tvChannel, "tvChannel");
    }

    public final TVChannel findChannelByNumber(String channelNumber) {
        List list;
        l.e(channelNumber, "channelNumber");
        Object d10 = get_listTvChannelLiveData().d();
        Object obj = null;
        G g = d10 instanceof G ? (G) d10 : null;
        if (g == null || (list = (List) g.f27483a) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((TVChannel) next).getChannelNumber() == Integer.parseInt(channelNumber)) {
                obj = next;
                break;
            }
        }
        return (TVChannel) obj;
    }

    public final a getActionLogger() {
        a aVar = this.actionLogger;
        if (aVar != null) {
            return aVar;
        }
        l.j("actionLogger");
        throw null;
    }

    public final f getCurrentProgramTitle() {
        return get_currentProgramTitle();
    }

    public final long getLastGetProgramme() {
        return this.lastGetProgramme;
    }

    public final TVChannelLinkStream getLastWatchedChannel() {
        return this._lastWatchedChannel;
    }

    public final void getLinkStreamById(String channelId) {
        InterfaceC1269b interfaceC1269b;
        l.e(channelId, "channelId");
        InterfaceC1269b interfaceC1269b2 = this.lastTVStreamLinkTask;
        if ((interfaceC1269b2 == null || !interfaceC1269b2.g()) && (interfaceC1269b = this.lastTVStreamLinkTask) != null) {
            interfaceC1269b.b();
        }
        i invoke = this.interactors.f16844c.invoke(channelId);
        s sVar = new s(29, this, channelId, false);
        C1107b c1107b = new C1107b(this, 0);
        A a9 = lb.b.f19614c;
        invoke.getClass();
        h hVar = new h(sVar, c1107b, a9);
        invoke.b(hVar);
        this.lastTVStreamLinkTask = hVar;
        add(hVar);
    }

    public final void getLinkStreamForChannel(TVChannel tvDetail, boolean z8) {
        l.e(tvDetail, "tvDetail");
        markLastWatchedChannel(tvDetail);
        get_tvWithLinkStreamLiveData().l(new Object());
        InterfaceC1269b interfaceC1269b = this.lastTVStreamLinkTask;
        if (interfaceC1269b != null) {
            interfaceC1269b.b();
        }
        String message = "getLinkStreamForChannel: " + new m().f(tvDetail);
        l.e(message, "message");
        Object obj = new Object();
        i execute = this.interactors.f16843b.execute(B.H(new j("extra:tv_channel", tvDetail), new j("extra:datasource_from", TVDataSourceFrom.valueOf(tvDetail.getSourceFrom())), new j("extra:is_backup", Boolean.valueOf(z8))));
        C1108c c1108c = new C1108c(0, obj, this);
        C1109d c1109d = new C1109d(this, 0);
        F8.a aVar = new F8.a(16, obj, this);
        execute.getClass();
        h hVar = new h(c1108c, c1109d, aVar);
        execute.b(hVar);
        this.lastTVStreamLinkTask = hVar;
        add(hVar);
    }

    public final AbstractC1456G getListProgramForChannel() {
        return get_listProgramForChannel();
    }

    public final void getListProgramForChannel(TVChannel tvChannel) {
        l.e(tvChannel, "tvChannel");
        fa.b bVar = this.interactors.f16846e;
        e tvChannelDTO = tvChannel.toChannelDto();
        l.e(tvChannelDTO, "tvChannelDTO");
        i execute = bVar.execute(B.G(new j("extra:channel", tvChannelDTO)));
        C1110e c1110e = C1110e.f16834a;
        execute.getClass();
        q3.e eVar = new q3.e(27, this, tvChannel);
        qb.m i7 = i.i(new Throwable("Empty data"));
        h hVar = new h(new C1111f(0, this, tvChannel), new C1112g(0, this, tvChannel), lb.b.f19614c);
        try {
            C0330t c0330t = new C0330t(hVar, i7);
            hVar.c((C1436a) c0330t.f5202d);
            try {
                try {
                    execute.b(new sb.i(new sb.i(c0330t, eVar, 1), c1110e, 0));
                    add(hVar);
                } catch (NullPointerException e2) {
                    throw e2;
                } catch (Throwable th) {
                    throw new NullPointerException(r0);
                }
            } catch (NullPointerException e10) {
                throw e10;
            } catch (Throwable th2) {
                throw new NullPointerException(r0);
            }
        } catch (NullPointerException e11) {
            throw e11;
        } finally {
            u0.L(th2);
            d.t(th2);
            new NullPointerException("Actually not, but can't throw other exceptions due to RS").initCause(th2);
        }
    }

    public void getListTVChannel(boolean z8) {
        if (!z8 && this.interactors.f16842a.getCacheData() != null) {
            H h10 = get_listTvChannelLiveData();
            Object cacheData = this.interactors.f16842a.getCacheData();
            l.b(cacheData);
            h10.l(new G(cacheData));
            return;
        }
        ArrayList arrayList = new ArrayList();
        get_listTvChannelLiveData().l(new Object());
        i b2 = C1065c.b(this.interactors.f16842a, z8, 2);
        O7.e eVar = new O7.e(this, arrayList);
        C1107b c1107b = new C1107b(this, 1);
        F8.a aVar = new F8.a(15, this, arrayList);
        b2.getClass();
        h hVar = new h(eVar, c1107b, aVar);
        b2.b(hVar);
        add(hVar);
    }

    public final AbstractC1456G getProgrammeForChannelLiveData() {
        return get_programmeForChannelLiveData();
    }

    public final AbstractC1456G getTvChannelLiveData() {
        return get_listTvChannelLiveData();
    }

    public final AbstractC1456G getTvWithLinkStreamLiveData() {
        return get_tvWithLinkStreamLiveData();
    }

    public final TVChannelLinkStream get_lastWatchedChannel() {
        return this._lastWatchedChannel;
    }

    public H get_listTvChannelLiveData() {
        return (H) this._listTvChannelLiveData$delegate.getValue();
    }

    public final H get_tvWithLinkStreamLiveData() {
        return (H) this._tvWithLinkStreamLiveData$delegate.getValue();
    }

    public final void loadProgramForChannel(TVChannel channel, boolean z8) {
        List list;
        N9.a aVar;
        String str;
        l.e(channel, "channel");
        I i7 = (I) get_listProgramForChannel().d();
        Object obj = null;
        if (i7 instanceof G) {
            G g = (G) i7;
            String message = "List program is success: " + ((List) g.f27483a).size();
            l.e(message, "message");
            list = (List) g.f27483a;
        } else {
            getListProgramForChannel(channel);
            list = null;
        }
        boolean a9 = l.a((list == null || (aVar = (N9.a) o.Z(list)) == null || (str = aVar.f7389a) == null) ? null : remoAllSpecialCharsAndPrefix(str), channel.getChannelIdWithoutSpecialChars());
        String message2 = "isCurrentChannel: " + a9;
        l.e(message2, "message");
        if (!a9) {
            getListProgramForChannel(channel);
            return;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((N9.a) next).c()) {
                    obj = next;
                    break;
                }
            }
            N9.a aVar2 = (N9.a) obj;
            if (aVar2 != null) {
                this.lastGetProgramme = System.currentTimeMillis();
                if (z8) {
                    get_programmeForChannelLiveData().l(new y9.H(aVar2));
                } else {
                    get_programmeForChannelLiveData().l(new G(aVar2));
                }
            }
        }
    }

    public final void markLastWatchedChannel(TVChannel tvChannel) {
        l.e(tvChannel, "tvChannel");
        this._lastWatchedChannel = new TVChannelLinkStream(tvChannel, Eb.v.f3891a);
    }

    public final void markLastWatchedChannel(TVChannelLinkStream tVChannelLinkStream) {
        String str;
        TVChannel channel;
        String tvChannelName;
        this._lastWatchedChannel = tVChannelLinkStream;
        Date time = Calendar.getInstance().getTime();
        f fVar = get_currentProgramTitle();
        TVChannelLinkStream lastWatchedChannel = getLastWatchedChannel();
        if (lastWatchedChannel == null || (channel = lastWatchedChannel.getChannel()) == null || (tvChannelName = channel.getTvChannelName()) == null || (str = tvChannelName.concat(" | ")) == null) {
            str = "";
        }
        String h10 = c.h(str, this.dateFormat.format(time));
        if (h10 != fVar.f5417b) {
            fVar.f5417b = h10;
            synchronized (fVar) {
                try {
                    J1.g gVar = fVar.f5415a;
                    if (gVar != null) {
                        gVar.b(0, fVar);
                    }
                } finally {
                }
            }
        }
    }

    @Override // y9.C, l2.Y
    public void onCleared() {
        super.onCleared();
    }

    public void onFetchTVListSuccess(List<TVChannel> listChannel) {
        l.e(listChannel, "listChannel");
    }

    public final void playTvByDeepLinks(Uri uri) {
        InterfaceC1269b interfaceC1269b;
        l.e(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        l.d(pathSegments, "getPathSegments(...)");
        String str = (String) o.e0(pathSegments);
        if (str == null) {
            return;
        }
        String message = "play by deeplink: {uri: " + uri + "}";
        l.e(message, "message");
        InterfaceC1269b interfaceC1269b2 = this.lastTVStreamLinkTask;
        if ((interfaceC1269b2 == null || !interfaceC1269b2.g()) && (interfaceC1269b = this.lastTVStreamLinkTask) != null) {
            interfaceC1269b.b();
        }
        get_tvWithLinkStreamLiveData().l(new Object());
        i invoke = this.interactors.f16844c.invoke(str);
        C1108c c1108c = new C1108c(1, this, uri, false);
        C1109d c1109d = new C1109d(this, 1);
        A a9 = lb.b.f19614c;
        invoke.getClass();
        h hVar = new h(c1108c, c1109d, a9);
        invoke.b(hVar);
        this.lastTVStreamLinkTask = hVar;
        add(hVar);
    }

    public final String remoAllSpecialCharsAndPrefix(String str) {
        l.e(str, "<this>");
        return ac.g.o0(ac.g.n0(UtilsKt.removeAllSpecialChars(str), "viechannel"), "hd");
    }

    public final void retryGetLastWatchedChannel() {
        TVChannelLinkStream tVChannelLinkStream = this._lastWatchedChannel;
        if (tVChannelLinkStream != null) {
            Integer num = getTvChannelStreamingRetryCount().get(tVChannelLinkStream.getChannel().getChannelId());
            int intValue = num != null ? num.intValue() : 0;
            if (intValue > 2) {
                getTvChannelStreamingRetryCount().put(tVChannelLinkStream.getChannel().getChannelId(), 0);
                get_tvWithLinkStreamLiveData().l(new D(new Throwable(S.b("Kênh ", tVChannelLinkStream.getChannel().getTvChannelName(), " hiện tại đang lỗi hoặc chưa hỗ trợ nội dung miễn phí"))));
            } else if (intValue > 1) {
                getTvChannelStreamingRetryCount().put(tVChannelLinkStream.getChannel().getChannelId(), Integer.valueOf(intValue + 1));
                getLinkStreamForChannel(tVChannelLinkStream.getChannel(), true);
            } else {
                getTvChannelStreamingRetryCount().put(tVChannelLinkStream.getChannel().getChannelId(), Integer.valueOf(intValue + 1));
                getLinkStreamForChannel(tVChannelLinkStream.getChannel(), true);
            }
        }
    }

    public final void saveChannelNumber(TVChannel tVChannel, String text) {
        l.e(text, "text");
        if (tVChannel == null || ac.g.v0(text).toString().length() == 0) {
            return;
        }
        C1268a compositeDisposable = getCompositeDisposable();
        R7.a aVar = this.interactors.f16847f;
        int parseInt = Integer.parseInt(text);
        n D10 = ((RoomDataBase) aVar.f8927b).D();
        tVChannel.setChannelNumber(parseInt);
        e channel = tVChannel.toChannelDto();
        U9.o oVar = (U9.o) D10;
        oVar.getClass();
        l.e(channel, "channel");
        C1837e g = b.g(oVar.f9904a, new t(16, oVar, channel));
        vb.n nVar = Ab.e.f1561c;
        Object b2 = g.e(nVar).b(nVar);
        gb.d a9 = b2 instanceof InterfaceC1655a ? ((InterfaceC1655a) b2).a() : new ob.l(b2, 0);
        C1067e c1067e = C1067e.f16617a;
        lb.b.a(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, "maxConcurrency");
        i j = new qb.m(new r(new pb.c(a9, c1067e), nVar), 6).j(new R7.a(this, 25), com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        h hVar = new h(new C1107b(this, 2), C1110e.f16835b, lb.b.f19614c);
        j.b(hVar);
        compositeDisposable.d(hVar);
    }

    public final void setActionLogger(a aVar) {
        l.e(aVar, "<set-?>");
        this.actionLogger = aVar;
    }

    public final void set_lastWatchedChannel(TVChannelLinkStream tVChannelLinkStream) {
        this._lastWatchedChannel = tVChannelLinkStream;
    }
}
