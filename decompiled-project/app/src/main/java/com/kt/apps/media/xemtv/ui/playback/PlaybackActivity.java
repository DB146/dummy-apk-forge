package com.kt.apps.media.xemtv.ui.playback;

import A9.N2;
import A9.O0;
import Aa.g;
import Ab.e;
import Db.j;
import Db.o;
import Eb.B;
import M9.d;
import R7.a;
import U9.k;
import W1.C;
import W1.C0558a;
import W1.U;
import Y5.A;
import a.AbstractC0672a;
import ab.C0792b;
import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import cb.b;
import cn.pedant.SweetAlert.SweetAlertDialog;
import com.kt.apps.core.extensions.ExtensionsChannel;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.media.xemtv.ui.main.MainActivity;
import fb.AbstractC1148b;
import g3.C1191j;
import gb.i;
import java.text.SimpleDateFormat;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import l2.a0;
import ma.C1652c;
import qb.p;
import qb.q;
import ta.c;
import u.C2054g;
import wa.h;
import xa.m;
import xa.n;
import y7.u0;
import y9.AbstractActivityC2461d;

/* loaded from: classes2.dex */
public final class PlaybackActivity extends AbstractActivityC2461d implements b {

    /* renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f16206f0 = 0;

    /* renamed from: V, reason: collision with root package name */
    public a f16207V;

    /* renamed from: W, reason: collision with root package name */
    public volatile C0792b f16208W;

    /* renamed from: X, reason: collision with root package name */
    public final Object f16209X = new Object();

    /* renamed from: Y, reason: collision with root package name */
    public boolean f16210Y = false;

    /* renamed from: Z, reason: collision with root package name */
    public RoomDataBase f16211Z;

    /* renamed from: a0, reason: collision with root package name */
    public final O0 f16212a0;

    /* renamed from: b0, reason: collision with root package name */
    public final O0 f16213b0;

    /* renamed from: c0, reason: collision with root package name */
    public final O0 f16214c0;

    /* renamed from: d0, reason: collision with root package name */
    public SweetAlertDialog f16215d0;

    /* renamed from: e0, reason: collision with root package name */
    public final o f16216e0;

    public PlaybackActivity() {
        g(new g(this, 0));
        this.f16212a0 = new O0(w.a(c.class), new Aa.o(this, 1), new Aa.o(this, 0), new Aa.o(this, 2));
        this.f16213b0 = new O0(w.a(n.class), new Aa.o(this, 4), new Aa.o(this, 3), new Aa.o(this, 5));
        this.f16214c0 = new O0(w.a(h.class), new Aa.o(this, 7), new Aa.o(this, 6), new Aa.o(this, 8));
        this.f16216e0 = android.support.v4.media.session.b.z(new N2(this, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a9, code lost:
    
        if (r0.L() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x019f, code lost:
    
        if (r0.L() == false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(Uri uri) {
        if (ac.n.T(uri.getHost(), "bongda", false)) {
            n nVar = (n) this.f16213b0.getValue();
            String host = uri.getHost();
            if (host != null) {
                host.contentEquals("xemtivihd.net");
                List<String> pathSegments = uri.getPathSegments();
                l.d(pathSegments, "getPathSegments(...)");
                String str = (String) Eb.o.e0(pathSegments);
                if (str != null && !str.contentEquals("xemtv")) {
                    String message = "play by deeplink: {uri: " + uri + "}";
                    l.e(message, "message");
                    nVar.c().l(new Object());
                    i execute = nVar.f26308a.f26294c.execute(B.G(new j("extra:team_name", str)));
                    xa.l lVar = new xa.l(nVar, 1);
                    m mVar = new m(nVar, 1);
                    A a9 = lb.b.f19614c;
                    execute.getClass();
                    nb.h hVar = new nb.h(lVar, mVar, a9);
                    execute.b(hVar);
                    nVar.add(hVar);
                }
            }
            C D10 = j().D(R.id.content);
            if (D10 instanceof xa.i) {
                xa.i iVar = (xa.i) D10;
                if (!iVar.f10272P) {
                }
            }
            D10 = null;
            if (D10 == null) {
                U j = j();
                j.getClass();
                C0558a c0558a = new C0558a(j);
                c0558a.j(R.id.content, new xa.i(), null);
                c0558a.e(false);
            }
            Intent intent = getIntent();
            if (intent != null) {
                intent.setData(null);
                return;
            }
            return;
        }
        if (ac.n.T(uri.getHost(), "tv", false) || ac.n.T(uri.getHost(), "radio", false)) {
            ((c) this.f16212a0.getValue()).playTvByDeepLinks(uri);
            C D11 = j().D(R.id.content);
            if (D11 instanceof Aa.w) {
                Aa.w wVar = (Aa.w) D11;
                if (!wVar.f10272P) {
                }
            }
            D11 = null;
            if (D11 == null) {
                U j10 = j();
                j10.getClass();
                C0558a c0558a2 = new C0558a(j10);
                c0558a2.j(R.id.content, new Aa.w(), null);
                c0558a2.e(false);
            }
            Intent intent2 = getIntent();
            if (intent2 != null) {
                intent2.setData(null);
                return;
            }
            return;
        }
        if (!ac.n.T(uri.getHost(), "iptv", false)) {
            Intent intent3 = new Intent(this, (Class<?>) MainActivity.class);
            intent3.setFlags(32768);
            startActivity(intent3);
            return;
        }
        String lastPathSegment = uri.getLastPathSegment();
        String message2 = "ID: " + lastPathSegment;
        l.e(message2, "message");
        RoomDataBase roomDataBase = this.f16211Z;
        if (roomDataBase == null) {
            l.j("roomDatabase");
            throw null;
        }
        U9.w H10 = roomDataBase.H();
        l.b(lastPathSegment);
        H10.getClass();
        q d10 = android.support.v4.media.session.b.i(H10.f9918a, new k(lastPathSegment, "IPTV", H10, 2)).d(e.f1561c);
        gb.o a10 = AbstractC1148b.a();
        qb.b bVar = new qb.b(new D5.i(this, 2), new C1191j(this, 2));
        try {
            d10.b(new p(bVar, a10, 0));
            new C2054g().a(bVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            u0.L(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final void B(Intent intent) {
        U j = j();
        j.getClass();
        C0558a c0558a = new C0558a(j);
        int i7 = va.C.f25269v2;
        Bundle extras = intent.getExtras();
        l.b(extras);
        Parcelable parcelable = extras.getParcelable("extra:item_to_play");
        l.b(parcelable);
        Bundle extras2 = intent.getExtras();
        l.b(extras2);
        Parcelable parcelable2 = extras2.getParcelable("extra:extensions_id");
        l.b(parcelable2);
        va.C c10 = new va.C();
        c10.l0(com.bumptech.glide.c.f(new j("extra:tv_channel", (ExtensionsChannel) parcelable), new j("extra:extension_id", (d) parcelable2)));
        c0558a.j(R.id.content, c10, null);
        c0558a.e(false);
    }

    @Override // cb.b
    public final Object e() {
        return v().e();
    }

    @Override // y9.AbstractActivityC2461d
    public final int l() {
        return com.kt.apps.media.xemtv.beta.R.layout.activity_playback;
    }

    @Override // c.AbstractActivityC0867k, l2.InterfaceC1470n
    public final a0 n() {
        return E6.b.m(this, super.n());
    }

    @Override // y9.AbstractActivityC2461d, W1.G, c.AbstractActivityC0867k, k1.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        y(bundle);
        Aa.n nVar = (Aa.n) this.f16216e0.getValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_TICK");
        intentFilter.addAction("android.intent.action.TIME_SET");
        registerReceiver(nVar, intentFilter);
    }

    @Override // y9.AbstractActivityC2461d, W1.G, android.app.Activity
    public final void onDestroy() {
        try {
            unregisterReceiver((Aa.n) this.f16216e0.getValue());
        } catch (Exception unused) {
        }
        z();
    }

    @Override // c.AbstractActivityC0867k, android.app.Activity
    public final void onNewIntent(Intent intent) {
        l.e(intent, "intent");
        super.onNewIntent(intent);
        String message = "OnNewIntent: " + ((Aa.l) intent.getParcelableExtra("extra:playback_type"));
        l.e(message, "message");
        Bundle extras = intent.getExtras();
        String message2 = "OnNewIntent: " + (extras != null ? (C1652c) extras.getParcelable("extra:football_match") : null);
        l.e(message2, "message");
        String message3 = "OnNewIntent: " + intent.getData();
        l.e(message3, "message");
        Uri data = intent.getData();
        if (data != null) {
            A(data);
        }
        Aa.l lVar = (Aa.l) intent.getParcelableExtra("extra:playback_type");
        int i7 = lVar == null ? -1 : Aa.m.f1528a[lVar.ordinal()];
        if (i7 == 1) {
            ((n) this.f16213b0.getValue()).a();
            U j = j();
            j.getClass();
            C0558a c0558a = new C0558a(j);
            int i10 = xa.i.f26297r2;
            Bundle extras2 = intent.getExtras();
            l.b(extras2);
            Parcelable parcelable = extras2.getParcelable("extra:football_match");
            l.b(parcelable);
            c0558a.j(R.id.content, Tb.a.x((C1652c) parcelable), null);
            c0558a.e(false);
            return;
        }
        if (i7 != 2 && i7 != 3) {
            if (i7 != 4) {
                return;
            }
            B(intent);
            return;
        }
        ((c) this.f16212a0.getValue()).getListTVChannel(false);
        U j10 = j();
        j10.getClass();
        C0558a c0558a2 = new C0558a(j10);
        SimpleDateFormat simpleDateFormat = Aa.w.f1546v2;
        Parcelable parcelableExtra = intent.getParcelableExtra("extra:playback_type");
        l.b(parcelableExtra);
        Bundle extras3 = intent.getExtras();
        l.b(extras3);
        Parcelable parcelable2 = extras3.getParcelable("extra:tv_channel");
        l.b(parcelable2);
        c0558a2.j(R.id.content, AbstractC0672a.l((Aa.l) parcelableExtra, (TVChannelLinkStream) parcelable2), null);
        c0558a2.e(false);
    }

    @Override // W1.G, android.app.Activity
    public final void onPause() {
        super.onPause();
        SweetAlertDialog sweetAlertDialog = this.f16215d0;
        if (sweetAlertDialog != null) {
            sweetAlertDialog.dismissWithAnimation();
        }
        ((c) this.f16212a0.getValue()).clearCurrentPlayingChannelState();
        ((n) this.f16213b0.getValue()).c().l(new Object());
    }

    @Override // y9.AbstractActivityC2461d
    public final void p(Bundle bundle) {
        Uri data;
        int i7 = 0;
        int i10 = 1;
        String.valueOf(bundle);
        String message = getIntent().getExtras() + " - " + getIntent().getData();
        l.e(message, "message");
        Aa.l lVar = (Aa.l) getIntent().getParcelableExtra("extra:playback_type");
        int i11 = lVar == null ? -1 : Aa.m.f1528a[lVar.ordinal()];
        O0 o02 = this.f16213b0;
        O0 o03 = this.f16212a0;
        if (i11 == 1) {
            ((n) o02.getValue()).a();
            U j = j();
            j.getClass();
            C0558a c0558a = new C0558a(j);
            int i12 = xa.i.f26297r2;
            Bundle extras = getIntent().getExtras();
            l.b(extras);
            Parcelable parcelable = extras.getParcelable("extra:football_match");
            l.b(parcelable);
            c0558a.j(R.id.content, Tb.a.x((C1652c) parcelable), null);
            c0558a.e(false);
        } else if (i11 == 2 || i11 == 3) {
            ((c) o03.getValue()).getListTVChannel(false);
            U j10 = j();
            j10.getClass();
            C0558a c0558a2 = new C0558a(j10);
            SimpleDateFormat simpleDateFormat = Aa.w.f1546v2;
            Parcelable parcelableExtra = getIntent().getParcelableExtra("extra:playback_type");
            l.b(parcelableExtra);
            Bundle extras2 = getIntent().getExtras();
            l.b(extras2);
            Parcelable parcelable2 = extras2.getParcelable("extra:tv_channel");
            l.b(parcelable2);
            c0558a2.j(R.id.content, AbstractC0672a.l((Aa.l) parcelableExtra, (TVChannelLinkStream) parcelable2), null);
            c0558a2.e(false);
        } else if (i11 != 4) {
            Intent intent = getIntent();
            if (intent != null && (data = intent.getData()) != null) {
                A(data);
            }
        } else {
            Intent intent2 = getIntent();
            l.d(intent2, "getIntent(...)");
            B(intent2);
        }
        ((n) o02.getValue()).c().e(this, new Aa.b(new Aa.i(this, i7), 1));
        ((c) o03.getValue()).getTvWithLinkStreamLiveData().e(this, new Aa.b(new Aa.i(this, i10), 1));
    }

    @Override // y9.AbstractActivityC2461d
    public final void q() {
    }

    public final C0792b v() {
        if (this.f16208W == null) {
            synchronized (this.f16209X) {
                try {
                    if (this.f16208W == null) {
                        this.f16208W = new C0792b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f16208W;
    }

    public final h x() {
        return (h) this.f16214c0.getValue();
    }

    public final void y(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof b) {
            a b2 = v().b();
            this.f16207V = b2;
            if (b2.A()) {
                this.f16207V.f8927b = o();
            }
        }
    }

    public final void z() {
        super.onDestroy();
        a aVar = this.f16207V;
        if (aVar != null) {
            aVar.f8927b = null;
        }
    }
}
