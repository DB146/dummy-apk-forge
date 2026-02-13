package Ba;

import A9.C0096i1;
import A9.C0098j;
import A9.C0139t1;
import A9.O;
import A9.X;
import Eb.AbstractC0250a;
import Eb.AbstractC0256g;
import Eb.B;
import I2.A;
import I2.C0312a;
import I2.C0313b;
import I2.H;
import U9.w;
import a.AbstractC0672a;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.extensions.ExtensionsChannel;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelGroup;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.core.utils.blurry.BlurFactor;
import com.kt.apps.core.workers.AutoRefreshExtensionsChannelWorker;
import com.kt.apps.core.workers.TVEpgWorkers;
import com.kt.apps.media.xemtv.App;
import com.kt.apps.media.xemtv.beta.R;
import com.kt.apps.media.xemtv.ui.playback.PlaybackActivity;
import fb.AbstractC1148b;
import g3.C1191j;
import h3.C1236B;
import h3.C1249k;
import ia.C1358d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.v;
import ma.C1651b;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import r7.C1947c;
import t8.C2034c;
import u.T;
import v2.AbstractC2127A;
import v2.C2133e;
import v2.x;
import va.u;
import y7.u0;
import y9.AbstractActivityC2461d;
import y9.C2459b;
import y9.D;
import y9.E;
import y9.G;
import y9.I;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2267b;

    public /* synthetic */ o(Object obj, int i7) {
        this.f2266a = i7;
        this.f2267b = obj;
    }

    public /* synthetic */ o(AbstractC2127A abstractC2127A, x xVar) {
        this.f2266a = 23;
        this.f2267b = abstractC2127A;
    }

    private final Object b(Object obj) {
        C0096i1 c0096i1;
        I i7 = (I) obj;
        boolean z8 = i7 instanceof G;
        u uVar = (u) this.f2267b;
        if (z8) {
            if (!uVar.f25363Y0 || uVar.G0().f1233c.size() <= 0) {
                List list = (List) ((G) i7).f27483a;
                uVar.f25361W0 = list;
                kotlin.jvm.internal.l.b(list);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : list) {
                    String tvGroup = ((ExtensionsChannel) obj2).getTvGroup();
                    Object obj3 = linkedHashMap.get(tvGroup);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(tvGroup, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                TreeMap treeMap = new TreeMap(linkedHashMap);
                uVar.G0().i();
                sa.e eVar = new sa.e();
                for (Map.Entry entry : treeMap.entrySet()) {
                    String str = (String) entry.getKey();
                    List list2 = (List) entry.getValue();
                    try {
                        kotlin.jvm.internal.l.b(str);
                        c0096i1 = new C0096i1(TVChannelGroup.valueOf(str).getValue());
                    } catch (Exception unused) {
                        c0096i1 = new C0096i1(str);
                    }
                    C0098j c0098j = new C0098j(eVar);
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        c0098j.g((ExtensionsChannel) it.next());
                    }
                    uVar.G0().g(new C0139t1(c0096i1, c0098j));
                    uVar.f25363Y0 = true;
                }
                int size = uVar.G0().f1233c.size();
                int i10 = size >= 4 ? size <= 6 ? 2 : 3 : 1;
                Kc.d dVar = uVar.f25355Q0;
                if (dVar == null) {
                    kotlin.jvm.internal.l.j("adsRepository");
                    throw null;
                }
                ob.m f4 = dVar.b(i10 * 4).f(Ab.e.f1561c);
                gb.o a9 = AbstractC1148b.a();
                nb.e eVar2 = new nb.e(1, new A4.h(size, uVar, i10), new C1358d(uVar, 20));
                try {
                    f4.d(new qb.p(eVar2, a9, 1));
                    uVar.f25356R0.d(eVar2);
                } catch (NullPointerException e2) {
                    throw e2;
                } catch (Throwable th) {
                    u0.L(th);
                    NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                    nullPointerException.initCause(th);
                    throw nullPointerException;
                }
            }
        } else if (i7 instanceof D) {
            uVar.f25363Y0 = true;
            D d10 = (D) i7;
            ActivityUtilsKt.showErrorDialog$default(uVar, null, d10.f27482a.getMessage(), null, null, null, false, false, null, null, 509, null);
            Throwable exception = d10.f27482a;
            kotlin.jvm.internal.l.e(exception, "exception");
        } else if (i7 instanceof E) {
            uVar.f25363Y0 = false;
        }
        return Db.q.f3365a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    private final Object c(Object obj) {
        int i7 = 1;
        I i10 = (I) obj;
        int i11 = xa.i.f26297r2;
        if (i10 instanceof G) {
            G g = (G) i10;
            Iterable iterable = (Iterable) g.f27483a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (((C1651b) obj2).b()) {
                    arrayList.add(obj2);
                }
            }
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = arrayList;
            if (isEmpty) {
                arrayList2 = Eb.o.n0(new Object(), (Iterable) g.f27483a);
            }
            xa.i iVar = (xa.i) this.f2267b;
            iVar.d1(arrayList2, new sa.h(iVar.g0()), new List[0]);
            Kc.d dVar = iVar.f26299o2;
            if (dVar == null) {
                kotlin.jvm.internal.l.j("adsRepository");
                throw null;
            }
            ob.m f4 = dVar.b(5).f(Ab.e.f1561c);
            gb.o a9 = AbstractC1148b.a();
            nb.e eVar = new nb.e(i7, new o7.o(iVar, 15), xa.b.f26283c);
            try {
                f4.d(new qb.p(eVar, a9, 1));
                iVar.f26300p2.d(eVar);
                iVar.f27442M1 = new C1947c(iVar, 18);
            } catch (NullPointerException e2) {
                throw e2;
            } catch (Throwable th) {
                u0.L(th);
                NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        }
        return Db.q.f3365a;
    }

    private final Object d(Object obj) {
        AbstractActivityC2461d abstractActivityC2461d = (AbstractActivityC2461d) this.f2267b;
        E6.a aVar = (E6.a) obj;
        if (aVar.f3716a == 2 && !abstractActivityC2461d.f27495S && abstractActivityC2461d.m()) {
            abstractActivityC2461d.f27495S = true;
            E6.d dVar = (E6.d) abstractActivityC2461d.f27491O.getValue();
            C2459b c2459b = (C2459b) abstractActivityC2461d.f27493Q.getValue();
            synchronized (dVar) {
                E6.c cVar = dVar.f3731b;
                synchronized (cVar) {
                    cVar.f3725a.c("registerListener", new Object[0]);
                    if (c2459b == null) {
                        throw new NullPointerException("Registered Play Core listener should not be null.");
                    }
                    cVar.f3728d.add(c2459b);
                    cVar.a();
                }
            }
            ((E6.d) abstractActivityC2461d.f27491O.getValue()).getClass();
            byte b2 = (byte) (((byte) 1) | 2);
            if (b2 != 3) {
                StringBuilder sb2 = new StringBuilder();
                if ((b2 & 1) == 0) {
                    sb2.append(" appUpdateType");
                }
                if ((b2 & 2) == 0) {
                    sb2.append(" allowAssetPackDeletion");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
            PendingIntent pendingIntent = aVar.f3717b;
            if ((pendingIntent != null ? pendingIntent : null) != null && !aVar.f3718c) {
                aVar.f3718c = true;
                if (pendingIntent == null) {
                    pendingIntent = null;
                }
                abstractActivityC2461d.startIntentSenderForResult(pendingIntent.getIntentSender(), 102, null, 0, 0, 0, null);
            }
        }
        return Db.q.f3365a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:233:0x05b3, code lost:
    
        if (r9.isRadio() == false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x05d9, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x05d7, code lost:
    
        if (r9 != false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x06c8, code lost:
    
        if (r9.isRadio() == false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x06ee, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x06ec, code lost:
    
        if (r9 != false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x080e, code lost:
    
        if (r7.isRadio() == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0834, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0832, code lost:
    
        if (r7 != false) goto L337;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.Map, u.T, u.e] */
    @Override // Rb.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        C0096i1 c0096i1;
        boolean isRadio;
        boolean isRadio2;
        boolean isRadio3;
        T2.c R10;
        W9.b bVar;
        W9.i iVar;
        switch (this.f2266a) {
            case 0:
                I it = (I) obj;
                kotlin.jvm.internal.l.e(it, "it");
                boolean z8 = it instanceof E;
                s sVar = (s) this.f2267b;
                if (z8) {
                    sVar.B0().b();
                } else {
                    sVar.B0().a();
                }
                if (it instanceof G) {
                    Object obj2 = ((G) it).f27483a;
                    if (obj2 instanceof M9.b) {
                        Intent intent = new Intent(sVar.g0(), (Class<?>) PlaybackActivity.class);
                        intent.putExtra("extra:playback_type", (Parcelable) Aa.l.f1526d);
                        M9.b bVar2 = (M9.b) obj2;
                        intent.putExtra("extra:item_to_play", bVar2.f6844a);
                        intent.putExtra("extra:extensions_id", bVar2.f6845b);
                        sVar.n0(intent);
                    } else if (obj2 instanceof TVChannelLinkStream) {
                        Intent intent2 = new Intent(sVar.g0(), (Class<?>) PlaybackActivity.class);
                        intent2.putExtra("extra:tv_channel", (Parcelable) obj2);
                        intent2.putExtra("extra:playback_type", (Parcelable) Aa.l.f1523a);
                        sVar.n0(intent2);
                    }
                }
                return Db.q.f3365a;
            case 1:
                I i7 = (I) obj;
                if (i7 instanceof G) {
                    Ca.i iVar2 = (Ca.i) this.f2267b;
                    iVar2.G0().i();
                    Iterable iterable = (Iterable) ((G) i7).f27483a;
                    String filterGroup = iVar2.f3105S0;
                    Aa.l filterType = iVar2.f3106T0;
                    kotlin.jvm.internal.l.e(filterGroup, "filterGroup");
                    kotlin.jvm.internal.l.e(filterType, "filterType");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : iterable) {
                        TVChannel channel = (TVChannel) obj3;
                        kotlin.jvm.internal.l.e(channel, "channel");
                        boolean z10 = false;
                        if (!kotlin.jvm.internal.l.a(filterGroup, "Tất cả")) {
                            if (kotlin.jvm.internal.l.a(channel.getTvGroup(), filterGroup)) {
                                if (filterType == Aa.l.f1523a) {
                                    if (channel.isRadio()) {
                                        isRadio = false;
                                        break;
                                    } else {
                                        isRadio = true;
                                        break;
                                    }
                                } else {
                                    isRadio = channel.isRadio();
                                    break;
                                }
                            }
                        } else if (filterType == Aa.l.f1523a) {
                            break;
                        } else {
                            z10 = channel.isRadio();
                        }
                        if (z10) {
                            arrayList.add(obj3);
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        String tvGroup = ((TVChannel) next).getTvGroup();
                        Object obj4 = linkedHashMap.get(tvGroup);
                        if (obj4 == null) {
                            obj4 = new ArrayList();
                            linkedHashMap.put(tvGroup, obj4);
                        }
                        ((List) obj4).add(next);
                    }
                    X x2 = new X();
                    x2.c(W9.j.class, new sa.e());
                    x2.c(TVChannel.class, new sa.e());
                    x2.c(TVChannel.class, new sa.e());
                    x2.c(ExtensionsChannel.class, new sa.e());
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        List list = (List) entry.getValue();
                        try {
                            c0096i1 = new C0096i1(TVChannelGroup.valueOf(str).getValue());
                        } catch (Exception unused) {
                            c0096i1 = new C0096i1(str);
                        }
                        C0098j c0098j = new C0098j(x2);
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            c0098j.g((TVChannel) it3.next());
                        }
                        iVar2.G0().g(new C0139t1(c0096i1, c0098j));
                    }
                    Kc.d dVar = iVar2.f3103Q0;
                    if (dVar == null) {
                        kotlin.jvm.internal.l.j("adsRepository");
                        throw null;
                    }
                    ob.m f4 = dVar.b(10).f(Ab.e.f1561c);
                    gb.o a9 = AbstractC1148b.a();
                    nb.e eVar = new nb.e(1, new C1191j(iVar2, 4), Ca.e.f3098b);
                    try {
                        f4.d(new qb.p(eVar, a9, 1));
                        iVar2.f3104R0.d(eVar);
                        O o10 = iVar2.h().f937c;
                        iVar2.h();
                        o10.g();
                    } catch (NullPointerException e2) {
                        throw e2;
                    } catch (Throwable th) {
                        u0.L(th);
                        NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                        nullPointerException.initCause(th);
                        throw nullPointerException;
                    }
                } else {
                    boolean z11 = i7 instanceof E;
                }
                return Db.q.f3365a;
            case 2:
                I i10 = (I) obj;
                kotlin.jvm.internal.l.b(i10);
                Ca.m mVar = (Ca.m) this.f2267b;
                mVar.getClass();
                boolean z12 = i10 instanceof E;
                if (!z12) {
                    if (i10 instanceof G) {
                        Intent intent3 = new Intent(mVar.g0(), (Class<?>) PlaybackActivity.class);
                        Object obj5 = ((G) i10).f27483a;
                        intent3.putExtra("extra:tv_channel", (Parcelable) obj5);
                        intent3.putExtra("extra:playback_type", (Parcelable) (((TVChannelLinkStream) obj5).getChannel().isRadio() ? Aa.l.f1525c : Aa.l.f1523a));
                        mVar.n0(intent3);
                    } else if (i10 instanceof D) {
                        ActivityUtilsKt.showErrorDialog$default(mVar, null, ((D) i10).f27482a.getMessage(), null, null, null, false, false, null, null, 509, null);
                    }
                }
                if (z12) {
                    mVar.B0().b();
                } else {
                    mVar.B0().a();
                }
                return Db.q.f3365a;
            case 3:
                I i11 = (I) obj;
                if (i11 instanceof G) {
                    Ca.r rVar = (Ca.r) this.f2267b;
                    if (rVar.f27506m0 == null) {
                        rVar.s0();
                    }
                    C0098j c0098j2 = rVar.f27506m0;
                    kotlin.jvm.internal.l.c(c0098j2, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.ArrayObjectAdapter");
                    c0098j2.i();
                    ((pa.m) rVar.o0()).f23250C.setText(rVar.f3128D0);
                    Iterable iterable2 = (Iterable) ((G) i11).f27483a;
                    String filterGroup2 = rVar.f3128D0;
                    Aa.l filterType2 = rVar.f3129E0;
                    kotlin.jvm.internal.l.e(filterGroup2, "filterGroup");
                    kotlin.jvm.internal.l.e(filterType2, "filterType");
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it4 = iterable2.iterator();
                    while (true) {
                        boolean z13 = false;
                        if (it4.hasNext()) {
                            Object next2 = it4.next();
                            TVChannel channel2 = (TVChannel) next2;
                            kotlin.jvm.internal.l.e(channel2, "channel");
                            if (!filterGroup2.equals("Tất cả")) {
                                if (kotlin.jvm.internal.l.a(channel2.getTvGroup(), filterGroup2)) {
                                    if (filterType2 == Aa.l.f1523a) {
                                        if (channel2.isRadio()) {
                                            isRadio2 = false;
                                            break;
                                        } else {
                                            isRadio2 = true;
                                            break;
                                        }
                                    } else {
                                        isRadio2 = channel2.isRadio();
                                        break;
                                    }
                                }
                            } else if (filterType2 == Aa.l.f1523a) {
                                break;
                            } else {
                                z13 = channel2.isRadio();
                            }
                            if (z13) {
                                arrayList2.add(next2);
                            }
                        } else {
                            C0098j c0098j3 = rVar.f27506m0;
                            kotlin.jvm.internal.l.c(c0098j3, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.ArrayObjectAdapter");
                            c0098j3.h(0, arrayList2);
                            Kc.d dVar2 = rVar.f3127B0;
                            if (dVar2 == null) {
                                kotlin.jvm.internal.l.j("adsRepository");
                                throw null;
                            }
                            ob.m f10 = dVar2.b(6).f(Ab.e.f1561c);
                            gb.o a10 = AbstractC1148b.a();
                            nb.e eVar2 = new nb.e(1, new C2034c(rVar, 5), Ca.e.f3099c);
                            try {
                                f10.d(new qb.p(eVar2, a10, 1));
                                rVar.C0.d(eVar2);
                            } catch (NullPointerException e10) {
                                throw e10;
                            } catch (Throwable th2) {
                                u0.L(th2);
                                NullPointerException nullPointerException2 = new NullPointerException("subscribeActual failed");
                                nullPointerException2.initCause(th2);
                                throw nullPointerException2;
                            }
                        }
                    }
                }
                return Db.q.f3365a;
            case 4:
                I i12 = (I) obj;
                kotlin.jvm.internal.l.b(i12);
                Da.f fVar = (Da.f) this.f2267b;
                fVar.getClass();
                boolean z14 = i12 instanceof E;
                if (!z14) {
                    if (i12 instanceof G) {
                        Intent intent4 = new Intent(fVar.g0(), (Class<?>) PlaybackActivity.class);
                        Object obj6 = ((G) i12).f27483a;
                        intent4.putExtra("extra:tv_channel", (Parcelable) obj6);
                        intent4.putExtra("extra:playback_type", (Parcelable) (((TVChannelLinkStream) obj6).getChannel().isRadio() ? Aa.l.f1525c : Aa.l.f1523a));
                        fVar.n0(intent4);
                    } else if (i12 instanceof D) {
                        ActivityUtilsKt.showErrorDialog$default(fVar, null, ((D) i12).f27482a.getMessage(), null, null, null, false, false, null, null, 509, null);
                    }
                }
                if (z14) {
                    fVar.B0().b();
                } else {
                    fVar.B0().a();
                }
                return Db.q.f3365a;
            case 5:
                I i13 = (I) obj;
                if (i13 instanceof G) {
                    Da.m mVar2 = (Da.m) this.f2267b;
                    if (mVar2.f27506m0 == null) {
                        mVar2.s0();
                    }
                    C0098j c0098j4 = mVar2.f27506m0;
                    kotlin.jvm.internal.l.c(c0098j4, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.ArrayObjectAdapter");
                    c0098j4.i();
                    ((pa.m) mVar2.o0()).f23250C.setText(mVar2.f3328B0);
                    Iterable iterable3 = (Iterable) ((G) i13).f27483a;
                    String filterGroup3 = mVar2.f3328B0;
                    Aa.l filterType3 = mVar2.C0;
                    kotlin.jvm.internal.l.e(filterGroup3, "filterGroup");
                    kotlin.jvm.internal.l.e(filterType3, "filterType");
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it5 = iterable3.iterator();
                    while (true) {
                        boolean z15 = false;
                        if (it5.hasNext()) {
                            Object next3 = it5.next();
                            TVChannel channel3 = (TVChannel) next3;
                            kotlin.jvm.internal.l.e(channel3, "channel");
                            if (!filterGroup3.equals("Tất cả")) {
                                if (kotlin.jvm.internal.l.a(channel3.getTvGroup(), filterGroup3)) {
                                    if (filterType3 == Aa.l.f1523a) {
                                        if (channel3.isRadio()) {
                                            isRadio3 = false;
                                            break;
                                        } else {
                                            isRadio3 = true;
                                            break;
                                        }
                                    } else {
                                        isRadio3 = channel3.isRadio();
                                        break;
                                    }
                                }
                            } else if (filterType3 == Aa.l.f1523a) {
                                break;
                            } else {
                                z15 = channel3.isRadio();
                            }
                            if (z15) {
                                arrayList3.add(next3);
                            }
                        } else {
                            C0098j c0098j5 = mVar2.f27506m0;
                            kotlin.jvm.internal.l.c(c0098j5, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.ArrayObjectAdapter");
                            c0098j5.h(0, arrayList3);
                        }
                    }
                }
                return Db.q.f3365a;
            case 6:
                return obj == ((AbstractC0250a) this.f2267b) ? "(this Collection)" : String.valueOf(obj);
            case 7:
                Map.Entry it6 = (Map.Entry) obj;
                kotlin.jvm.internal.l.e(it6, "it");
                AbstractC0256g abstractC0256g = (AbstractC0256g) this.f2267b;
                StringBuilder sb2 = new StringBuilder();
                Object key = it6.getKey();
                sb2.append(key == abstractC0256g ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value = it6.getValue();
                sb2.append(value != abstractC0256g ? String.valueOf(value) : "(this Map)");
                return sb2.toString();
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return ((Db.j) ((List) this.f2267b).get(((Integer) obj).intValue())).f3354a;
            case 9:
                StyledPlayerView it7 = (StyledPlayerView) obj;
                kotlin.jvm.internal.l.e(it7, "it");
                it7.setPlayer(((E9.h) this.f2267b).f3807c);
                return Db.q.f3365a;
            case 10:
                kotlin.jvm.internal.l.e((T2.a) obj, "it");
                return ((L7.r) this.f2267b).call();
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                U2.a db2 = (U2.a) obj;
                kotlin.jvm.internal.l.e(db2, "db");
                ((A) this.f2267b).f5006h = db2;
                return Db.q.f3365a;
            case 12:
                C0313b config = (C0313b) obj;
                kotlin.jvm.internal.l.e(config, "config");
                return ((I2.E) this.f2267b).g(config);
            case 13:
                kotlin.jvm.internal.l.e((T2.a) obj, "it");
                return ((Rb.a) this.f2267b).invoke();
            case 14:
                T2.c it8 = (T2.c) obj;
                kotlin.jvm.internal.l.e(it8, "it");
                ((o) this.f2267b).invoke(new C0312a(it8));
                return Db.q.f3365a;
            case 15:
                T2.c it9 = (T2.c) obj;
                kotlin.jvm.internal.l.e(it9, "it");
                H h10 = (H) this.f2267b;
                h10.getClass();
                int i14 = h10.f5047v;
                if (1 <= i14) {
                    int i15 = 1;
                    while (true) {
                        int i16 = h10.f5046u[i15];
                        if (i16 == 1) {
                            it9.a(i15);
                        } else if (i16 == 2) {
                            it9.f(i15, h10.f5042c[i15]);
                        } else if (i16 == 3) {
                            it9.b(i15, h10.f5043d[i15]);
                        } else if (i16 == 4) {
                            String str2 = h10.f5044e[i15];
                            if (str2 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            it9.y(i15, str2);
                        } else if (i16 == 5) {
                            byte[] bArr = h10.f5045f[i15];
                            if (bArr == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            it9.g(i15, bArr);
                        }
                        if (i15 != i14) {
                            i15++;
                        }
                    }
                }
                return Db.q.f3365a;
            case 16:
                U9.h hVar = (U9.h) this.f2267b;
                T2.a _connection = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection, "_connection");
                R10 = _connection.R("SELECT * FROM ExtensionsConfig");
                try {
                    int h11 = P2.j.h(R10, "sourceName");
                    int h12 = P2.j.h(R10, "sourceUrl");
                    int h13 = P2.j.h(R10, "type");
                    ArrayList arrayList4 = new ArrayList();
                    while (R10.J()) {
                        String j = R10.j(h11);
                        String j10 = R10.j(h12);
                        String j11 = R10.j(h13);
                        hVar.f9864c.getClass();
                        arrayList4.add(new M9.d(j, j10, T9.a.a(j11)));
                    }
                    return arrayList4;
                } finally {
                }
            case 17:
                U9.l lVar = (U9.l) this.f2267b;
                T2.a _connection2 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection2, "_connection");
                R10 = _connection2.R("SELECT * from HistoryMediaItemDTO order by lastViewTime desc");
                try {
                    int h14 = P2.j.h(R10, "itemId");
                    int h15 = P2.j.h(R10, "category");
                    int h16 = P2.j.h(R10, "displayName");
                    int h17 = P2.j.h(R10, "thumb");
                    int h18 = P2.j.h(R10, "currentPosition");
                    int h19 = P2.j.h(R10, "contentDuration");
                    int h20 = P2.j.h(R10, "isLiveStreaming");
                    int h21 = P2.j.h(R10, "description");
                    int h22 = P2.j.h(R10, "linkPlay");
                    int h23 = P2.j.h(R10, "type");
                    int h24 = P2.j.h(R10, "lastViewTime");
                    ArrayList arrayList5 = new ArrayList();
                    while (R10.J()) {
                        String j12 = R10.j(h14);
                        String j13 = R10.j(h15);
                        String j14 = R10.j(h16);
                        String j15 = R10.j(h17);
                        long x10 = R10.x(h18);
                        long x11 = R10.x(h19);
                        int i17 = h15;
                        int i18 = h16;
                        boolean z16 = ((int) R10.x(h20)) != 0;
                        String j16 = R10.j(h21);
                        String j17 = R10.j(h22);
                        String str3 = R10.j(h23);
                        lVar.f9901c.getClass();
                        kotlin.jvm.internal.l.e(str3, "str");
                        try {
                            bVar = W9.b.valueOf(str3);
                        } catch (Exception unused2) {
                            bVar = W9.b.f10855a;
                        }
                        arrayList5.add(new W9.c(j12, j13, j14, j15, x10, x11, z16, j16, j17, bVar, R10.x(h24)));
                        h15 = i17;
                        h16 = i18;
                    }
                    return arrayList5;
                } finally {
                }
            case 18:
                U9.o oVar = (U9.o) this.f2267b;
                T2.a _connection3 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection3, "_connection");
                R10 = _connection3.R("SELECT * FROM TVChannelDTO");
                try {
                    int h25 = P2.j.h(R10, "tvGroup");
                    int h26 = P2.j.h(R10, "logoChannel");
                    int h27 = P2.j.h(R10, "tvChannelName");
                    int h28 = P2.j.h(R10, "sourceFrom");
                    int h29 = P2.j.h(R10, "channelId");
                    int h30 = P2.j.h(R10, "searchKey");
                    int h31 = P2.j.h(R10, "channelNumber");
                    ?? t5 = new T(0);
                    while (R10.J()) {
                        String j18 = R10.j(h29);
                        if (!t5.containsKey(j18)) {
                            t5.put(j18, new ArrayList());
                        }
                    }
                    R10.reset();
                    oVar.a(_connection3, t5);
                    ArrayList arrayList6 = new ArrayList();
                    while (R10.J()) {
                        int i19 = h25;
                        int i20 = h26;
                        W9.e eVar3 = new W9.e(R10.j(h25), R10.j(h26), R10.j(h27), R10.j(h28), R10.j(h29), R10.j(h30), (int) R10.x(h31));
                        Object E10 = B.E(R10.j(h29), t5);
                        kotlin.jvm.internal.l.d(E10, "getValue(...)");
                        arrayList6.add(new W9.h(eVar3, (List) E10));
                        h25 = i19;
                        h26 = i20;
                    }
                    return arrayList6;
                } catch (Throwable th3) {
                    throw th3;
                }
            case 19:
                w wVar = (w) this.f2267b;
                T2.a _connection4 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection4, "_connection");
                R10 = _connection4.R("SELECT * FROM VIDEOFAVORITEDTO");
                try {
                    int h32 = P2.j.h(R10, "id");
                    int h33 = P2.j.h(R10, "url");
                    int h34 = P2.j.h(R10, "title");
                    int h35 = P2.j.h(R10, "category");
                    int h36 = P2.j.h(R10, "logoUrl");
                    int h37 = P2.j.h(R10, "sourceFrom");
                    int h38 = P2.j.h(R10, "type");
                    ArrayList arrayList7 = new ArrayList();
                    while (R10.J()) {
                        String j19 = R10.j(h32);
                        String j20 = R10.j(h33);
                        String j21 = R10.j(h34);
                        String j22 = R10.j(h35);
                        String j23 = R10.j(h36);
                        String j24 = R10.j(h37);
                        String str4 = R10.j(h38);
                        wVar.f9920c.getClass();
                        kotlin.jvm.internal.l.e(str4, "str");
                        try {
                            iVar = W9.i.valueOf(str4);
                        } catch (Exception unused3) {
                            iVar = W9.i.f10892c;
                        }
                        arrayList7.add(new W9.j(j19, j20, j21, j22, j23, j24, iVar));
                    }
                    return arrayList7;
                } finally {
                }
            case 20:
                ResponseBody it10 = (ResponseBody) obj;
                kotlin.jvm.internal.l.e(it10, "it");
                ((U9.k) this.f2267b).invoke(ac.g.v0(ac.g.p0(ac.n.W(it10.K(), "\\u0026", "&"), "\"")).toString());
                return Db.q.f3365a;
            case 21:
                return ((V.k) this.f2267b).o(((Integer) obj).intValue());
            case 22:
                String key2 = (String) obj;
                kotlin.jvm.internal.l.e(key2, "key");
                Object obj7 = ((v) this.f2267b).f19134a;
                boolean z17 = true;
                if (obj7 != null && ((Bundle) obj7).containsKey(key2)) {
                    z17 = false;
                }
                return Boolean.valueOf(z17);
            case 23:
                C2133e backStackEntry = (C2133e) obj;
                kotlin.jvm.internal.l.e(backStackEntry, "backStackEntry");
                v2.q qVar = backStackEntry.f24967b;
                if (qVar == null) {
                    qVar = null;
                }
                if (qVar == null) {
                    return null;
                }
                y2.c cVar = backStackEntry.f24973v;
                cVar.a();
                AbstractC2127A abstractC2127A = (AbstractC2127A) this.f2267b;
                v2.q c10 = abstractC2127A.c(qVar);
                if (c10 == null) {
                    backStackEntry = null;
                } else if (!c10.equals(qVar)) {
                    backStackEntry = abstractC2127A.b().b(c10, c10.b(cVar.a()));
                }
                return backStackEntry;
            case 24:
                return b(obj);
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                return c(obj);
            case 26:
                return d(obj);
            case 27:
                App t10 = (App) this.f2267b;
                kotlin.jvm.internal.l.e(t10, "t");
                i3.p pVar = t10.f16192v;
                if (pVar == null) {
                    kotlin.jvm.internal.l.j("workManager");
                    throw null;
                }
                TimeUnit timeUnit = TimeUnit.MINUTES;
                C1236B c1236b = new C1236B(AutoRefreshExtensionsChannelWorker.class, timeUnit);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("extra:key_version_is_beta", Boolean.valueOf(t10.getResources().getBoolean(R.bool.isBeta)));
                C1249k c1249k = new C1249k(linkedHashMap2);
                c2.i.y(c1249k);
                ((q3.p) c1236b.f5049b).f23407e = c1249k;
                pVar.M("Refresh_extension_channel", (h3.G) c1236b.c());
                i3.p pVar2 = t10.f16192v;
                if (pVar2 == null) {
                    kotlin.jvm.internal.l.j("workManager");
                    throw null;
                }
                C1236B c1236b2 = new C1236B(TVEpgWorkers.class, timeUnit);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                String g = AbstractC0672a.i().g("epg_url");
                if (g.length() == 0) {
                    g = "https://lichphatsong.xyz/schedule/epg.xml";
                }
                linkedHashMap3.put("extra:default_url", g);
                C1249k c1249k2 = new C1249k(linkedHashMap3);
                c2.i.y(c1249k2);
                ((q3.p) c1236b2.f5049b).f23407e = c1249k2;
                pVar2.M("RefreshEpgData", (h3.G) c1236b2.c());
                return Db.q.f3365a;
            default:
                try {
                    JSONObject jSONObject = new JSONObject(AbstractC0672a.i().g("user_groups"));
                    String optString = jSONObject.optString("facebook");
                    kotlin.jvm.internal.l.b(optString);
                    String str5 = null;
                    if (optString.length() <= 0 || ac.g.h0(optString)) {
                        optString = null;
                    }
                    ya.j jVar = (ya.j) this.f2267b;
                    if (optString != null) {
                        ((pa.i) jVar.o0()).f23242F.setText(optString);
                    }
                    String optString2 = jSONObject.optString("zalo");
                    kotlin.jvm.internal.l.b(optString2);
                    if (optString2.length() <= 0 || ac.g.h0(optString2)) {
                        optString2 = null;
                    }
                    if (optString2 != null) {
                        ((pa.i) jVar.o0()).f23245I.setText(optString2);
                    }
                    String optString3 = jSONObject.optString("imedia");
                    kotlin.jvm.internal.l.b(optString3);
                    if (optString3.length() > 0 && !ac.g.h0(optString3)) {
                        str5 = optString3;
                    }
                    if (str5 != null) {
                        ((pa.i) jVar.o0()).f23243G.setText(str5);
                    }
                } catch (Exception unused4) {
                }
                return Db.q.f3365a;
        }
    }
}
