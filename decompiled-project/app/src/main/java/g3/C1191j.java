package g3;

import A0.G0;
import A9.C0096i1;
import A9.C0098j;
import A9.C0107l0;
import A9.C0139t1;
import A9.E1;
import Ba.o;
import Eb.p;
import Eb.v;
import G3.C;
import G3.C0280b;
import G3.C0281c;
import G3.D;
import G3.E;
import G3.F;
import G3.s;
import G3.t;
import H2.C0287a;
import H2.T;
import H2.Y;
import H2.i0;
import H2.s0;
import L7.A;
import L7.C0384d;
import L7.q;
import L7.y;
import N6.C0448v;
import Q.C0480b;
import W9.f;
import ac.g;
import android.content.ClipDescription;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.media.tv.TvContract;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import b3.AbstractC0826a;
import b3.AbstractC0829d;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.core.utils.UtilsKt;
import com.kt.apps.core.utils.blurry.BlurFactor;
import com.kt.apps.media.xemtv.App;
import com.kt.apps.media.xemtv.beta.R;
import com.kt.apps.media.xemtv.ui.playback.PlaybackActivity;
import com.kt.apps.media.xemtv.workers.TVRecommendationWorkers;
import f3.C1132c;
import f3.InterfaceC1133d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import kotlin.jvm.internal.l;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import x9.AbstractC2271a;

/* renamed from: g3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1191j implements WebMessageListenerBoundaryInterface, InterfaceC1393d, E1, t, A3.d, E, s0, InterfaceC1394e, J3.m, com.bumptech.glide.load.data.g, T2.b, y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17440a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17441b;

    public C1191j(int i7) {
        this.f17440a = i7;
        switch (i7) {
            case 9:
                this.f17441b = new C(7);
                return;
            case 28:
                this.f17441b = Build.VERSION.SDK_INT >= 28 ? new Hc.e(10) : new U9.i(10);
                return;
            case 29:
                this.f17441b = C0448v.a();
                return;
            default:
                this.f17441b = C0480b.o(Boolean.FALSE);
                return;
        }
    }

    public /* synthetic */ C1191j(int i7, boolean z8) {
        this.f17440a = i7;
    }

    public C1191j(U2.d openHelper) {
        this.f17440a = 22;
        kotlin.jvm.internal.l.e(openHelper, "openHelper");
        this.f17441b = openHelper;
    }

    public C1191j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f17440a = 1;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f17441b = new A1.g(uri, clipDescription, uri2);
        } else {
            this.f17441b = new G0(uri, clipDescription, uri2, 1);
        }
    }

    public /* synthetic */ C1191j(Object obj, int i7) {
        this.f17440a = i7;
        this.f17441b = obj;
    }

    public C1191j(String str, o oVar) {
        this.f17440a = 17;
        this.f17441b = new o(oVar, 14);
    }

    @Override // com.bumptech.glide.load.data.g
    public void a() {
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object it) {
        Object n6;
        switch (this.f17440a) {
            case 2:
                Throwable it2 = (Throwable) it;
                kotlin.jvm.internal.l.e(it2, "it");
                PlaybackActivity t5 = (PlaybackActivity) this.f17441b;
                kotlin.jvm.internal.l.e(t5, "t");
                ActivityUtilsKt.showErrorDialog$default((PlaybackActivity) this.f17441b, null, it2.getMessage(), null, null, null, false, false, false, null, null, 989, null);
                return;
            case 4:
                List bannerAds = (List) it;
                Ca.i iVar = (Ca.i) this.f17441b;
                kotlin.jvm.internal.l.e(bannerAds, "bannerAds");
                if (bannerAds.isEmpty()) {
                    return;
                }
                try {
                    n6 = iVar.G0().f1233c.get(1);
                } catch (Throwable th) {
                    n6 = com.bumptech.glide.c.n(th);
                }
                if (n6 instanceof Db.l) {
                    n6 = null;
                }
                if (n6 == null) {
                    return;
                }
                boolean equals = n6.equals(iVar.f3112Z0);
                Ca.f fVar = iVar.f3113a1;
                if (equals) {
                    C0139t1 c0139t1 = iVar.f3112Z0;
                    kotlin.jvm.internal.l.b(c0139t1);
                    C0098j c0098j = c0139t1.f1371b;
                    kotlin.jvm.internal.l.c(c0098j, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.ArrayObjectAdapter");
                    c0098j.j(bannerAds, fVar);
                    return;
                }
                C0096i1 c0096i1 = new C0096i1(iVar.G(R.string.header_ads_title), 0L);
                C0098j c0098j2 = iVar.f3111Y0;
                c0098j2.j(bannerAds, fVar);
                iVar.f3112Z0 = new C0139t1(c0096i1, c0098j2);
                iVar.G0().f(1, iVar.f3112Z0);
                return;
            case 16:
                kotlin.jvm.internal.l.e(it, "it");
                ((C9.h) this.f17441b).f3094a = it;
                return;
            case 18:
                Throwable it3 = (Throwable) it;
                kotlin.jvm.internal.l.e(it3, "it");
                A3.c.r(it3, ((I9.i) this.f17441b).b());
                return;
            case 24:
                Ra.d it4 = (Ra.d) it;
                kotlin.jvm.internal.l.e(it4, "it");
                La.g gVar = (La.g) this.f17441b;
                gVar.getClass();
                String t10 = UtilsKt.getTAG(gVar);
                String message = "executeFetchedData: " + it4;
                kotlin.jvm.internal.l.e(t10, "t");
                kotlin.jvm.internal.l.e(message, "message");
                Pa.a aVar = it4.f8951a;
                if (aVar == null) {
                    gVar.e(null);
                    return;
                }
                Intent intent = aVar.f8262d;
                if (!gVar.f6440d.getBoolean("key:ACTIVE_VOICE", false)) {
                    gVar.e(it4);
                    return;
                }
                c2.i.v(gVar.f6441e, Oa.f.f7537c);
                Context context = gVar.f6439c;
                Context applicationContext = context.getApplicationContext();
                intent.setData(Uri.parse(""));
                intent.putExtra("calling_package_name", context.getPackageName());
                applicationContext.startActivity(intent);
                return;
            default:
                List bannerAds2 = (List) it;
                kotlin.jvm.internal.l.e(bannerAds2, "bannerAds");
                ArrayList arrayList = new ArrayList();
                Iterator it5 = bannerAds2.iterator();
                while (true) {
                    boolean hasNext = it5.hasNext();
                    Mc.f fVar2 = (Mc.f) this.f17441b;
                    if (!hasNext) {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        C0098j c0098j3 = new C0098j(new C0107l0(4));
                        Iterator it6 = arrayList.iterator();
                        while (it6.hasNext()) {
                            c0098j3.g((Jc.a) it6.next());
                        }
                        C0139t1 c0139t12 = new C0139t1(new C0096i1("Sản phẩm liên quan", 0L), c0098j3);
                        C0098j c0098j4 = fVar2.f1399c1;
                        kotlin.jvm.internal.l.c(c0098j4, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.ArrayObjectAdapter");
                        c0098j4.g(c0139t12);
                        return;
                    }
                    Object next = it5.next();
                    String str = ((Jc.a) next).f5779a;
                    Jc.a aVar2 = fVar2.p1;
                    if (aVar2 == null) {
                        kotlin.jvm.internal.l.j("bannerAd");
                        throw null;
                    }
                    if (!kotlin.jvm.internal.l.a(str, aVar2.f5779a)) {
                        arrayList.add(next);
                    }
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a6, code lost:
    
        if (r5.moveToFirst() != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a8, code lost:
    
        r7 = b3.e.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ac, code lost:
    
        if (r7 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ae, code lost:
    
        r6.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
    
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0 A[Catch: IllegalArgumentException -> 0x00c4, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x00c4, blocks: (B:14:0x0087, B:16:0x00a2, B:22:0x00b8, B:32:0x00c0), top: B:13:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0236  */
    /* JADX WARN: Type inference failed for: r0v19, types: [b3.g, java.lang.Object, b3.c] */
    /* JADX WARN: Type inference failed for: r6v0, types: [Eb.v] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v19, types: [E6.e] */
    @Override // jb.InterfaceC1394e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        ?? r62;
        Iterator it;
        Object obj2;
        App app;
        final long b2;
        Iterator it2;
        Object obj3;
        AbstractC0826a abstractC0826a;
        char c10;
        Cursor query;
        switch (this.f17440a) {
            case 19:
                List channelList = (List) obj;
                kotlin.jvm.internal.l.e(channelList, "channelList");
                String message = h3.o.l(channelList.size(), "Size: ");
                final TVRecommendationWorkers t5 = (TVRecommendationWorkers) this.f17441b;
                kotlin.jvm.internal.l.e(t5, "t");
                Context context = t5.g;
                kotlin.jvm.internal.l.e(message, "message");
                boolean isRadio = ((TVChannel) Eb.o.Y(channelList)).isRadio();
                try {
                    kotlin.jvm.internal.l.e(context, "context");
                    query = context.getContentResolver().query(b3.h.f13826a, AbstractC0829d.f13818a, null, null, null);
                    r62 = new ArrayList();
                    if (query != null) {
                        break;
                    }
                    if (query != null) {
                        query.close();
                    }
                } catch (IllegalArgumentException unused) {
                    r62 = v.f3891a;
                }
                String str = !isRadio ? "radioChannelIMedia" : "tvChannelIMedia";
                String str2 = !isRadio ? "Phát thanh" : "Truyền hình";
                Uri parse = isRadio ? Uri.parse(ActivityUtilsKt.getDefScheme(context) + "://tv/dashboard") : Uri.parse(ActivityUtilsKt.getDefScheme(context) + "://radio/dashboard");
                it = r62.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = null;
                    } else {
                        obj2 = it.next();
                        if (kotlin.jvm.internal.l.a(((b3.e) obj2).f13820a.getAsString("internal_provider_id"), str)) {
                        }
                    }
                }
                b3.e eVar = (b3.e) obj2;
                q3.c cVar = eVar != null ? new q3.c(27, (byte) 0) : new q3.c(eVar);
                app = App.f16184z;
                if (app != null) {
                    kotlin.jvm.internal.l.j("app");
                    throw null;
                }
                Resources resources = app.getResources();
                kotlin.jvm.internal.l.d(resources, "getResources(...)");
                kotlin.jvm.internal.l.d(TVRecommendationWorkers.g(resources, R.drawable.app_icon_fg).toString(), "toString(...)");
                ((ContentValues) cVar.f23371b).put("display_name", str2.toString());
                cVar.f23372c = Uri.parse("android.resource://" + context.getPackageName() + "/drawable/app_icon_fg");
                ((ContentValues) cVar.f23371b).put("description", "iMedia".toString());
                ((ContentValues) cVar.f23371b).put("internal_provider_id", str);
                ((ContentValues) cVar.f23371b).put("app_link_intent_uri", parse == null ? null : parse.toString());
                b3.e g = cVar.g();
                if (eVar == null) {
                    b2 = new E6.e(context, 6).h(g);
                } else {
                    new E6.e(context, 6).j(eVar.b(), g);
                    b2 = eVar.b();
                }
                Rb.c cVar2 = new Rb.c() { // from class: Ia.c
                    @Override // Rb.c
                    public final Object invoke(Object obj4) {
                        String str3;
                        Uri parse2;
                        Context context2;
                        int identifier;
                        TVRecommendationWorkers tVRecommendationWorkers = TVRecommendationWorkers.this;
                        TVChannel channel = (TVChannel) obj4;
                        l.e(channel, "channel");
                        if (l.a(channel.getSourceFrom(), "MAIN_SOURCE")) {
                            str3 = channel.getLogoChannel();
                        } else {
                            Object obj5 = ((Map) AbstractC2271a.f26275b.getValue()).get(channel.getTvChannelName());
                            l.b(obj5);
                            str3 = (String) obj5;
                        }
                        String o02 = g.o0(g.o0(g.o0(g.o0(str3, ".png"), ".jpg"), ".webp"), ".jpeg");
                        try {
                            context2 = tVRecommendationWorkers.g;
                            identifier = context2.getResources().getIdentifier(o02, "drawable", context2.getPackageName());
                        } catch (Exception unused2) {
                            parse2 = Uri.parse(channel.getLogoChannel());
                        }
                        if (identifier == -1 || identifier == 0) {
                            throw new Exception("Not found local resource for channel: " + channel);
                        }
                        Resources resources2 = context2.getResources();
                        l.d(resources2, "getResources(...)");
                        parse2 = TVRecommendationWorkers.g(resources2, identifier);
                        return new f(channel.getTvGroup(), parse2, channel.getTvChannelName(), channel.getTvChannelWebDetailPage(), channel.getSourceFrom(), channel.getChannelId(), b2);
                    }
                };
                ArrayList arrayList = new ArrayList(p.S(channelList, 10));
                Iterator it3 = channelList.iterator();
                while (it3.hasNext()) {
                    arrayList.add(cVar2.invoke(it3.next()));
                }
                boolean z8 = true;
                if (!r62.isEmpty()) {
                    Iterator it4 = r62.iterator();
                    while (it4.hasNext()) {
                        Integer asInteger = ((b3.e) it4.next()).f13820a.getAsInteger("browsable");
                        if (asInteger != null && asInteger.intValue() == 1) {
                            ArrayList t10 = android.support.v4.media.session.b.t(context, Long.valueOf(b2));
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                W9.f fVar = (W9.f) it2.next();
                                Iterator it5 = t10.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        obj3 = it5.next();
                                        if (kotlin.jvm.internal.l.a(((b3.g) obj3).f13817a.getAsString("content_id"), fVar.f10885f)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                b3.g gVar = (b3.g) obj3;
                                if (gVar == null) {
                                    abstractC0826a = new AbstractC0826a();
                                } else {
                                    abstractC0826a = new AbstractC0826a();
                                    abstractC0826a.f3094a = new ContentValues(gVar.f13817a);
                                }
                                ((ContentValues) abstractC0826a.f3094a).put("content_id", fVar.f10885f);
                                Uri uri = fVar.f10881b;
                                abstractC0826a.M(uri);
                                ((ContentValues) abstractC0826a.f3094a).put("title", fVar.f10882c);
                                abstractC0826a.O(0);
                                ((ContentValues) abstractC0826a.f3094a).put("channel_id", Long.valueOf(b2));
                                abstractC0826a.G(uri);
                                abstractC0826a.K(z8);
                                ((ContentValues) abstractC0826a.f3094a).put("interaction_type", (Integer) 0);
                                ((ContentValues) abstractC0826a.f3094a).put("duration_millis", (Integer) 0);
                                abstractC0826a.E(uri);
                                abstractC0826a.N(Calendar.getInstance(Locale.TAIWAN).getTime());
                                abstractC0826a.F(true);
                                abstractC0826a.E(uri);
                                StringBuilder n6 = A3.c.n(ActivityUtilsKt.getDefScheme(context), "://tv/channel/");
                                n6.append(fVar.f10885f);
                                abstractC0826a.L(Uri.parse(n6.toString()));
                                ?? obj4 = new Object();
                                obj4.f13817a = (ContentValues) abstractC0826a.f3094a;
                                if (gVar == null) {
                                    try {
                                        c10 = 26;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            try {
                                                try {
                                                    ContentUris.parseId(context.getContentResolver().insert(b3.i.f13827a, obj4.e()));
                                                } catch (IllegalArgumentException unused2) {
                                                }
                                            } catch (SecurityException e2) {
                                                Log.e("PreviewChannelHelper", "Your app's ability to insert data into the TvProvider may have been revoked.", e2);
                                            }
                                        }
                                    } catch (IllegalArgumentException unused3) {
                                        c10 = 26;
                                    }
                                } else {
                                    c10 = 26;
                                    new E6.e(context, 6).k(gVar.a(), obj4);
                                }
                                z8 = true;
                            }
                            U9.p pVar = (U9.p) t5.f16236i.getValue();
                            pVar.getClass();
                            return android.support.v4.media.session.b.g(pVar.f9906a, new Aa.t(18, pVar, arrayList));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    TvContract.requestChannelBrowsable(context, b2);
                }
                ArrayList t102 = android.support.v4.media.session.b.t(context, Long.valueOf(b2));
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                }
                U9.p pVar2 = (U9.p) t5.f16236i.getValue();
                pVar2.getClass();
                return android.support.v4.media.session.b.g(pVar2.f9906a, new Aa.t(18, pVar2, arrayList));
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                List<N9.a> it6 = (List) obj;
                kotlin.jvm.internal.l.e(it6, "it");
                ArrayList arrayList2 = new ArrayList(p.S(it6, 10));
                for (N9.a aVar : it6) {
                    arrayList2.add(new N9.a(((W9.e) this.f17441b).a(), aVar.f7390b, aVar.f7391c, aVar.f7392d, aVar.f7393e, aVar.f7394f, aVar.f7395u, aVar.f7396v));
                }
                return arrayList2;
            default:
                kotlin.jvm.internal.l.e((Throwable) obj, "it");
                return (qb.g) this.f17441b;
        }
        if (!query.moveToNext()) {
            if (query != null) {
            }
            if (!isRadio) {
            }
            if (!isRadio) {
            }
            if (isRadio) {
            }
            it = r62.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            b3.e eVar2 = (b3.e) obj2;
            if (eVar2 != null) {
            }
            app = App.f16184z;
            if (app != null) {
            }
        }
    }

    @Override // A9.E1
    public void b(int i7) {
        ((Da.t) this.f17441b).C0(i7);
    }

    @Override // A3.d
    public boolean c(Object obj, File file, A3.l lVar) {
        InputStream inputStream = (InputStream) obj;
        D3.f fVar = (D3.f) this.f17441b;
        byte[] bArr = (byte[]) fVar.c(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        fVar.g(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        fVar.g(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                fVar.g(bArr);
                return true;
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // T2.b
    public T2.a d(String fileName) {
        kotlin.jvm.internal.l.e(fileName, "fileName");
        return new L2.a(((U2.d) this.f17441b).N());
    }

    @Override // J3.m
    public long e(long j) {
        if (j < 0) {
            return 0L;
        }
        long j10 = j;
        while (j10 > 0) {
            InputStream inputStream = (InputStream) this.f17441b;
            long skip = inputStream.skip(j10);
            if (skip > 0) {
                j10 -= skip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j10--;
            }
        }
        return j - j10;
    }

    @Override // L7.y
    public void f(Q7.f fVar) {
    }

    @Override // H2.s0
    public int g() {
        androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) this.f17441b;
        return aVar.f13718o - aVar.K();
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER"};
    }

    @Override // G3.E
    public com.bumptech.glide.load.data.e h(Uri uri) {
        return new com.bumptech.glide.load.data.b(1, uri, (ContentResolver) this.f17441b);
    }

    @Override // J3.m
    public short i() {
        int read = ((InputStream) this.f17441b).read();
        if (read != -1) {
            return (short) read;
        }
        throw new J3.l();
    }

    @Override // H2.s0
    public int j(View view) {
        return ((androidx.recyclerview.widget.a) this.f17441b).H(view) - ((ViewGroup.MarginLayoutParams) ((T) view.getLayoutParams())).topMargin;
    }

    @Override // J3.m
    public int k() {
        return (i() << 8) | i();
    }

    @Override // com.bumptech.glide.load.data.g
    public Object l() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f17441b;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // G3.t
    public s m(G3.y yVar) {
        switch (this.f17440a) {
            case 9:
                return new C0281c((C) this.f17441b, 1);
            case 10:
                return new C0280b((Resources) this.f17441b, D.f4287b);
            default:
                return new F(this);
        }
    }

    @Override // J3.m
    public int n(int i7, byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < i7 && (i11 = ((InputStream) this.f17441b).read(bArr, i10, i7 - i10)) != -1) {
            i10 += i11;
        }
        if (i10 == 0 && i11 == -1) {
            throw new J3.l();
        }
        return i10;
    }

    @Override // H2.s0
    public View o(int i7) {
        return ((androidx.recyclerview.widget.a) this.f17441b).x(i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z8, InvocationHandler invocationHandler2) {
        C1132c c1132c;
        C1132c c1132c2;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) tc.b.l(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        R7.b[] bVarArr = new R7.b[ports.length];
        for (int i7 = 0; i7 < ports.length; i7++) {
            InvocationHandler invocationHandler3 = ports[i7];
            R7.b bVar = new R7.b(18);
            bVar.f8929b = (WebMessagePortBoundaryInterface) tc.b.l(WebMessagePortBoundaryInterface.class, invocationHandler3);
            bVarArr[i7] = bVar;
        }
        if (AbstractC1193l.f17443a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) tc.b.l(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                c1132c = new C1132c(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    c1132c2 = null;
                    if (c1132c2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) tc.b.l(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        ((InterfaceC1133d) this.f17441b).onPostMessage(webView, c1132c2, uri, z8, (C1189h) jsReplyProxyBoundaryInterface.getOrCreatePeer(new q(jsReplyProxyBoundaryInterface, 3)));
                        return;
                    }
                    return;
                }
                c1132c = new C1132c(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
            }
        } else {
            c1132c = new C1132c(webMessageBoundaryInterface.getData());
        }
        c1132c2 = c1132c;
        if (c1132c2 == null) {
        }
    }

    @Override // H2.s0
    public int p() {
        return ((androidx.recyclerview.widget.a) this.f17441b).N();
    }

    @Override // H2.s0
    public int r(View view) {
        return ((androidx.recyclerview.widget.a) this.f17441b).B(view) + ((ViewGroup.MarginLayoutParams) ((T) view.getLayoutParams())).bottomMargin;
    }

    @Override // L7.y
    public void s(Q7.f fVar, A a9, L7.E e2, L7.E e10) {
        ((O7.b) ((C0384d) ((L7.j) this.f17441b).f6362i).f6333e.f27b).execute(new L7.g(this, fVar, e10));
    }

    public void t(C0287a c0287a) {
        int i7 = c0287a.f4633a;
        RecyclerView recyclerView = (RecyclerView) this.f17441b;
        if (i7 == 1) {
            recyclerView.f13614B.j0(c0287a.f4634b, c0287a.f4636d);
            return;
        }
        if (i7 == 2) {
            recyclerView.f13614B.m0(c0287a.f4634b, c0287a.f4636d);
        } else if (i7 == 4) {
            recyclerView.f13614B.o0(recyclerView, c0287a.f4634b, c0287a.f4636d);
        } else {
            if (i7 != 8) {
                return;
            }
            recyclerView.f13614B.l0(c0287a.f4634b, c0287a.f4636d);
        }
    }

    public i0 u(int i7) {
        RecyclerView recyclerView = (RecyclerView) this.f17441b;
        i0 I6 = recyclerView.I(i7, true);
        if (I6 == null) {
            return null;
        }
        if (!((ArrayList) recyclerView.f13657f.f2092e).contains(I6.f4707a)) {
            return I6;
        }
        if (RecyclerView.f13603P0) {
            Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
        }
        return null;
    }

    public void v(Object obj, int i7, int i10) {
        int i11;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.f17441b;
        int p10 = recyclerView.f13657f.p();
        int i13 = i10 + i7;
        for (int i14 = 0; i14 < p10; i14++) {
            View o10 = recyclerView.f13657f.o(i14);
            i0 M3 = RecyclerView.M(o10);
            if (M3 != null && !M3.r() && (i12 = M3.f4709c) >= i7 && i12 < i13) {
                M3.a(2);
                if (obj == null) {
                    M3.a(1024);
                } else if ((1024 & M3.j) == 0) {
                    if (M3.k == null) {
                        ArrayList arrayList = new ArrayList();
                        M3.k = arrayList;
                        M3.f4715l = Collections.unmodifiableList(arrayList);
                    }
                    M3.k.add(obj);
                }
                ((T) o10.getLayoutParams()).f4617c = true;
            }
        }
        Y y10 = recyclerView.f13651c;
        ArrayList arrayList2 = y10.f4628c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            i0 i0Var = (i0) arrayList2.get(size);
            if (i0Var != null && (i11 = i0Var.f4709c) >= i7 && i11 < i13) {
                i0Var.a(2);
                y10.h(size);
            }
        }
        recyclerView.f13684z0 = true;
    }

    public void w(int i7, int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f17441b;
        int p10 = recyclerView.f13657f.p();
        for (int i11 = 0; i11 < p10; i11++) {
            i0 M3 = RecyclerView.M(recyclerView.f13657f.o(i11));
            if (M3 != null && !M3.r() && M3.f4709c >= i7) {
                if (RecyclerView.f13603P0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i11 + " holder " + M3 + " now at position " + (M3.f4709c + i10));
                }
                M3.o(i10, false);
                recyclerView.f13676v0.f4669f = true;
            }
        }
        ArrayList arrayList = recyclerView.f13651c.f4628c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            i0 i0Var = (i0) arrayList.get(i12);
            if (i0Var != null && i0Var.f4709c >= i7) {
                if (RecyclerView.f13603P0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i12 + " holder " + i0Var + " now at position " + (i0Var.f4709c + i10));
                }
                i0Var.o(i10, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f13682y0 = true;
    }

    public void x(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.f17441b;
        int p10 = recyclerView.f13657f.p();
        if (i7 < i10) {
            i12 = i7;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i7;
            i12 = i10;
            i13 = 1;
        }
        boolean z8 = false;
        for (int i19 = 0; i19 < p10; i19++) {
            i0 M3 = RecyclerView.M(recyclerView.f13657f.o(i19));
            if (M3 != null && (i18 = M3.f4709c) >= i12 && i18 <= i11) {
                if (RecyclerView.f13603P0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i19 + " holder " + M3);
                }
                if (M3.f4709c == i7) {
                    M3.o(i10 - i7, false);
                } else {
                    M3.o(i13, false);
                }
                recyclerView.f13676v0.f4669f = true;
            }
        }
        Y y10 = recyclerView.f13651c;
        y10.getClass();
        if (i7 < i10) {
            i15 = i7;
            i14 = i10;
            i16 = -1;
        } else {
            i14 = i7;
            i15 = i10;
            i16 = 1;
        }
        ArrayList arrayList = y10.f4628c;
        int size = arrayList.size();
        int i20 = 0;
        while (i20 < size) {
            i0 i0Var = (i0) arrayList.get(i20);
            if (i0Var != null && (i17 = i0Var.f4709c) >= i15 && i17 <= i14) {
                if (i17 == i7) {
                    i0Var.o(i10 - i7, z8);
                } else {
                    i0Var.o(i16, z8);
                }
                if (RecyclerView.f13603P0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i20 + " holder " + i0Var);
                }
            }
            i20++;
            z8 = false;
        }
        recyclerView.requestLayout();
        recyclerView.f13682y0 = true;
    }
}
