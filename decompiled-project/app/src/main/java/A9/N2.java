package A9;

import A9.AbstractC0068b1;
import Db.o;
import I2.AbstractC0315d;
import Y5.C0658x;
import Y5.C0660y;
import a.AbstractC0672a;
import android.app.PendingIntent;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.base.leanback.SearchView;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.tv.model.TVDataSourceFrom;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.core.utils.blurry.BlurFactor;
import com.kt.apps.core.workers.PreloadDataWorker;
import com.kt.apps.media.xemtv.ui.playback.PlaybackActivity;
import com.kt.apps.voiceselector.ui.VoiceSearchActivity;
import i2.C1332t;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.l;
import l3.AbstractC1482a;
import l3.C1484c;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import r3.AbstractC1918b;
import rc.AbstractC1958b;
import tss.r.core.ads.database.AdsDatabase;

/* loaded from: classes2.dex */
public final /* synthetic */ class N2 implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f919b;

    public /* synthetic */ N2(Object obj, int i7) {
        this.f918a = i7;
        this.f919b = obj;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x027a A[Catch: all -> 0x021b, TRY_LEAVE, TryCatch #18 {all -> 0x021b, blocks: (B:32:0x00d0, B:34:0x00de, B:35:0x00e9, B:55:0x0145, B:57:0x0152, B:110:0x021a, B:121:0x0212, B:122:0x021f, B:149:0x027a, B:156:0x029b, B:160:0x0274, B:40:0x02a5, B:44:0x02b4, B:45:0x02bb, B:178:0x02bc, B:179:0x02bf, B:181:0x02c0, B:182:0x02d5, B:116:0x020c, B:146:0x026e, B:59:0x015a, B:61:0x0163, B:64:0x0174, B:80:0x01fa, B:99:0x01f3, B:101:0x01ff, B:102:0x0204, B:66:0x017c, B:68:0x0185, B:72:0x01a2, B:84:0x01bc, B:85:0x01c1, B:89:0x01c4, B:90:0x01ea, B:94:0x01ed, B:37:0x00f1, B:48:0x00fa, B:54:0x011f, B:172:0x029e, B:173:0x02a3), top: B:31:0x00d0, inners: #11, #15, #17, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x029b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[SYNTHETIC] */
    @Override // Rb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object n6;
        V2.g gVar;
        Map map;
        int i02;
        long n8;
        Iterator it;
        ArrayList arrayList;
        Throwable th;
        Db.j jVar;
        Throwable th2;
        Throwable th3;
        int T10;
        Db.j jVar2;
        int i7 = -1;
        boolean z8 = false;
        switch (this.f918a) {
            case 0:
                Db.o oVar = SearchView.f16055H;
                return new T2((SearchView) this.f919b, 0);
            case 1:
                int i10 = PlaybackActivity.f16206f0;
                return new Aa.n((PlaybackActivity) this.f919b);
            case 2:
                Aa.w wVar = (Aa.w) this.f919b;
                SimpleDateFormat simpleDateFormat = Aa.w.f1546v2;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(ActivityUtilsKt.getDefScheme(wVar.i0()) + "://tv/dashboard"));
                    intent.setFlags(32768);
                    wVar.n0(intent);
                    W1.G A10 = wVar.A();
                    if (A10 != null) {
                        A10.finish();
                    }
                } catch (Exception unused) {
                }
                return Db.q.f3365a;
            case 3:
                return new Ba.b(((Ba.h) this.f919b).f2252c);
            case 4:
                try {
                    W1.U j = ((Da.k) this.f919b).g0().j();
                    j.getClass();
                    j.y(new W1.S(j, -1, 0), false);
                    n6 = Db.q.f3365a;
                } catch (Throwable th4) {
                    n6 = com.bumptech.glide.c.n(th4);
                }
                return (Db.q) (n6 instanceof Db.l ? null : n6);
            case 5:
                return new E9.b((E9.c) this.f919b);
            case 6:
                final E9.e eVar = (E9.e) this.f919b;
                return new AudioManager.OnAudioFocusChangeListener() { // from class: E9.d
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i11) {
                        AudioFocusRequest.Builder willPauseWhenDucked;
                        AudioFocusRequest.Builder onAudioFocusChangeListener;
                        AudioFocusRequest.Builder audioAttributes;
                        AudioFocusRequest build;
                        e t5 = e.this;
                        if (i11 == -1) {
                            l.e(t5, "t");
                            t5.a();
                            t5.f3814d = null;
                            return;
                        }
                        if (i11 != 0) {
                            if (i11 != 1) {
                                return;
                            }
                            t5.getClass();
                            return;
                        }
                        l.e(t5, "t");
                        Object systemService = t5.f3811a.getSystemService("audio");
                        l.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                        AudioManager audioManager = (AudioManager) systemService;
                        audioManager.generateAudioSessionId();
                        int i12 = Build.VERSION.SDK_INT;
                        o oVar2 = t5.f3813c;
                        if (i12 < 26) {
                            audioManager.requestAudioFocus((AudioManager.OnAudioFocusChangeListener) oVar2.getValue(), 3, 1);
                            return;
                        }
                        willPauseWhenDucked = AbstractC0068b1.g().setWillPauseWhenDucked(true);
                        onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener((AudioManager.OnAudioFocusChangeListener) oVar2.getValue());
                        audioAttributes = onAudioFocusChangeListener.setAudioAttributes((AudioAttributes) t5.f3812b.getValue());
                        build = audioAttributes.build();
                        t5.f3814d = build;
                        l.b(build);
                        audioManager.requestAudioFocus(build);
                    }
                };
            case 7:
                ((Runnable) this.f919b).run();
                return Db.q.f3365a;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return ((Callable) this.f919b).call();
            case 9:
                return ((I2.I) this.f919b).e();
            case 10:
                return ((q3.s) this.f919b).d(":memory:");
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                Kc.d dVar = (Kc.d) this.f919b;
                C1332t c1332t = AdsDatabase.f24541l;
                Context context = dVar.f6227a;
                kotlin.jvm.internal.l.e(context, "context");
                AdsDatabase adsDatabase = AdsDatabase.f24542m;
                if (adsDatabase == null) {
                    synchronized (c1332t) {
                        Context applicationContext = context.getApplicationContext();
                        kotlin.jvm.internal.l.d(applicationContext, "getApplicationContext(...)");
                        adsDatabase = (AdsDatabase) AbstractC0315d.d(applicationContext, AdsDatabase.class, "ads_database").b();
                        AdsDatabase.f24542m = adsDatabase;
                    }
                }
                return adsDatabase;
            case 12:
                return ((M9.k) this.f919b).f6875b.A();
            case 13:
                return ((M9.t) this.f919b).f6916c.y();
            case 14:
                return ((P9.c) this.f919b).f8255a.B();
            case 15:
                Q2.e eVar2 = (Q2.e) this.f919b;
                eVar2.w().a(new Q2.b(eVar2));
                return Db.q.f3365a;
            case 16:
                return ((Ma.d) ((Qa.g) this.f919b).v0()).f6931E;
            case 17:
                int i11 = VoiceSearchActivity.f16250d0;
                Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                intent2.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
                VoiceSearchActivity voiceSearchActivity = (VoiceSearchActivity) this.f919b;
                Object systemService = voiceSearchActivity.getSystemService("search");
                kotlin.jvm.internal.l.c(systemService, "null cannot be cast to non-null type android.app.SearchManager");
                SearchableInfo searchableInfo = ((SearchManager) systemService).getSearchableInfo(voiceSearchActivity.getComponentName());
                Intent intent3 = new Intent("android.intent.action.SEARCH");
                try {
                    intent3.setComponent(searchableInfo.getSearchActivity());
                } catch (Throwable th5) {
                    com.bumptech.glide.c.n(th5);
                }
                intent3.setPackage(intent2.getPackage());
                Bundle extras = voiceSearchActivity.getIntent().getExtras();
                if (extras != null) {
                    intent3.putExtras(extras);
                }
                PendingIntent activity = PendingIntent.getActivity(voiceSearchActivity, 0, intent3, 1241513984);
                intent2.putExtra("android.speech.extra.LANGUAGE", "vi-VN");
                intent2.putExtra("android.speech.extra.PROMPT", "Tìm kiếm trên iMedia");
                intent2.putExtra("android.speech.extra.MAX_RESULTS", 1);
                intent2.putExtra("calling_package", voiceSearchActivity.getComponentName().flattenToShortString());
                intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                intent2.putExtra("android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS", 1);
                return intent2;
            case 18:
                V2.h hVar = (V2.h) this.f919b;
                if (hVar.f10019b == null || !hVar.f10021d) {
                    gVar = new V2.g(hVar.f10018a, hVar.f10019b, new R7.a(8), hVar.f10020c, hVar.f10022e);
                } else {
                    Context context2 = hVar.f10018a;
                    kotlin.jvm.internal.l.e(context2, "context");
                    File noBackupFilesDir = context2.getNoBackupFilesDir();
                    kotlin.jvm.internal.l.d(noBackupFilesDir, "getNoBackupFilesDir(...)");
                    gVar = new V2.g(hVar.f10018a, new File(noBackupFilesDir, hVar.f10019b).getAbsolutePath(), new R7.a(8), hVar.f10020c, hVar.f10022e);
                }
                gVar.setWriteAheadLoggingEnabled(hVar.f10024u);
                return gVar;
            case 19:
                return Eb.B.M(((Z9.t) this.f919b).f12311b.c(TVDataSourceFrom.ON_LIVE));
            case 20:
                return this.f919b;
            case 21:
                return ((RoomDataBase) ((Ra.c) this.f919b).f8949c).B();
            case 22:
                i3.m mVar = (i3.m) this.f919b;
                mVar.getClass();
                AbstractC1918b.a(mVar);
                return Db.q.f3365a;
            case 23:
                i3.p pVar = (i3.p) this.f919b;
                pVar.getClass();
                int i12 = Build.VERSION.SDK_INT;
                String str = C1484c.f19252f;
                Context context3 = pVar.f18378b;
                if (i12 >= 34) {
                    AbstractC1482a.b(context3).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context3.getSystemService("jobscheduler");
                ArrayList e2 = C1484c.e(context3, jobScheduler);
                if (e2 != null && !e2.isEmpty()) {
                    Iterator it2 = e2.iterator();
                    while (it2.hasNext()) {
                        C1484c.b(jobScheduler, ((JobInfo) it2.next()).getId());
                    }
                }
                WorkDatabase workDatabase = pVar.f18380d;
                q3.q C2 = workDatabase.C();
                WorkDatabase_Impl workDatabase_Impl = C2.f23424a;
                workDatabase_Impl.b();
                q3.h hVar2 = C2.f23433m;
                V2.j a9 = hVar2.a();
                try {
                    workDatabase_Impl.c();
                    try {
                        a9.l();
                        workDatabase_Impl.v();
                        hVar2.l(a9);
                        i3.h.b(pVar.f18379c, workDatabase, pVar.f18382f);
                        return Db.q.f3365a;
                    } finally {
                        workDatabase_Impl.r();
                    }
                } catch (Throwable th6) {
                    hVar2.l(a9);
                    throw th6;
                }
            case 24:
                return ((PreloadDataWorker) this.f919b).f16179f.z();
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                R9.b bVar = (R9.b) ((ka.c) this.f919b).f19065b;
                bVar.getClass();
                try {
                    Object c10 = new G8.m().c(bVar.f8941a.getString("extra:cookie_91phut", ""), N8.a.a(Map.class, String.class, String.class).f7387b);
                    kotlin.jvm.internal.l.c(c10, "null cannot be cast to non-null type kotlin.collections.Map<T of com.kt.apps.core.storage.KeyValueStorageImpl.get, U of com.kt.apps.core.storage.KeyValueStorageImpl.get>");
                    map = (Map) c10;
                } catch (Exception unused2) {
                    map = Eb.w.f3892a;
                }
                return Eb.B.M(map);
            case 26:
                return l2.Q.g((l2.e0) this.f919b);
            case 27:
                return (List) this.f919b;
            case 28:
                Http2Connection.Companion companion = Http2Connection.f22760O;
                Http2Connection http2Connection = (Http2Connection) this.f919b;
                http2Connection.getClass();
                try {
                    http2Connection.L.T(false, 2, 0);
                } catch (IOException e10) {
                    ErrorCode errorCode = ErrorCode.f22723d;
                    http2Connection.l(errorCode, errorCode, e10);
                }
                return Db.q.f3365a;
            default:
                sc.e eVar3 = (sc.e) this.f919b;
                ClassLoader classLoader = eVar3.f24368c;
                Enumeration<URL> resources = classLoader.getResources("");
                kotlin.jvm.internal.l.d(resources, "getResources(...)");
                ArrayList list = Collections.list(resources);
                kotlin.jvm.internal.l.d(list, "list(...)");
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = list.iterator();
                while (true) {
                    boolean hasNext = it3.hasNext();
                    rc.o oVar2 = eVar3.f24369d;
                    if (!hasNext) {
                        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                        kotlin.jvm.internal.l.d(resources2, "getResources(...)");
                        ArrayList list2 = Collections.list(resources2);
                        kotlin.jvm.internal.l.d(list2, "list(...)");
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            URL url = (URL) it4.next();
                            kotlin.jvm.internal.l.b(url);
                            String url2 = url.toString();
                            kotlin.jvm.internal.l.d(url2, "toString(...)");
                            if (ac.n.Y(url2, "jar:file:", z8) && (i02 = ac.g.i0(6, url2, "!")) != i7) {
                                String str2 = rc.z.f24006b;
                                String substring = url2.substring(4, i02);
                                kotlin.jvm.internal.l.d(substring, "substring(...)");
                                rc.z b2 = C0660y.b(new File(URI.create(substring)));
                                rc.v F10 = oVar2.F(b2);
                                try {
                                    n8 = F10.n() - 22;
                                } catch (Throwable th7) {
                                    if (F10 != null) {
                                    }
                                }
                                if (n8 < 0) {
                                    throw new IOException("not a zip: size=" + F10.n());
                                }
                                it = it4;
                                long max = Math.max(n8 - 65536, 0L);
                                while (true) {
                                    rc.C c11 = AbstractC1958b.c(F10.F(n8));
                                    try {
                                        if (c11.T() == 101010256) {
                                            int W10 = c11.W() & 65535;
                                            int W11 = c11.W() & 65535;
                                            long W12 = c11.W() & 65535;
                                            if (W12 != (c11.W() & 65535) || W10 != 0 || W11 != 0) {
                                                throw new IOException("unsupported zip: spanned");
                                            }
                                            c11.a0(4L);
                                            int W13 = c11.W() & 65535;
                                            h7.g gVar2 = new h7.g(W13, W12, c11.T() & 4294967295L);
                                            c11.X(W13);
                                            c11.close();
                                            long j10 = n8 - 20;
                                            long j11 = 0;
                                            if (j10 > 0) {
                                                c11 = AbstractC1958b.c(F10.F(j10));
                                                try {
                                                    if (c11.T() == 117853008) {
                                                        int T11 = c11.T();
                                                        long U8 = c11.U();
                                                        if (c11.T() != 1 || T11 != 0) {
                                                            throw new IOException("unsupported zip: spanned");
                                                        }
                                                        c11 = AbstractC1958b.c(F10.F(U8));
                                                        try {
                                                            T10 = c11.T();
                                                        } catch (Throwable th8) {
                                                            try {
                                                            } catch (Throwable th9) {
                                                                AbstractC0672a.c(th8, th9);
                                                            }
                                                            th3 = th8;
                                                        }
                                                        if (T10 != 101075792) {
                                                            throw new IOException("bad zip: expected " + sc.b.c(101075792) + " but was " + sc.b.c(T10));
                                                        }
                                                        c11.a0(12L);
                                                        int T12 = c11.T();
                                                        int T13 = c11.T();
                                                        long U10 = c11.U();
                                                        if (U10 != c11.U() || T12 != 0 || T13 != 0) {
                                                            throw new IOException("unsupported zip: spanned");
                                                        }
                                                        c11.a0(8L);
                                                        h7.g gVar3 = new h7.g(W13, U10, c11.U());
                                                        try {
                                                            th3 = null;
                                                        } catch (Throwable th10) {
                                                            th3 = th10;
                                                        }
                                                        gVar2 = gVar3;
                                                        if (th3 != null) {
                                                            throw th3;
                                                        }
                                                    }
                                                    try {
                                                        th2 = null;
                                                    } catch (Throwable th11) {
                                                        th2 = th11;
                                                    }
                                                } catch (Throwable th12) {
                                                    try {
                                                    } catch (Throwable th13) {
                                                        AbstractC0672a.c(th12, th13);
                                                    }
                                                    th2 = th12;
                                                    gVar2 = gVar2;
                                                }
                                                if (th2 != null) {
                                                    throw th2;
                                                }
                                            }
                                            ArrayList arrayList4 = new ArrayList();
                                            c11 = AbstractC1958b.c(F10.F(gVar2.f17853b));
                                            try {
                                                long j12 = gVar2.f17852a;
                                                while (j11 < j12) {
                                                    sc.g d10 = sc.b.d(c11);
                                                    long j13 = j12;
                                                    arrayList = arrayList2;
                                                    try {
                                                        if (d10.f24378h >= gVar2.f17853b) {
                                                            throw new IOException("bad zip: local file header offset >= central directory offset");
                                                            break;
                                                        } else {
                                                            rc.z zVar = sc.e.f24367f;
                                                            if (C0658x.a(d10.f24372a)) {
                                                                arrayList4.add(d10);
                                                            }
                                                            j11++;
                                                            arrayList2 = arrayList;
                                                            j12 = j13;
                                                        }
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                        Throwable th15 = th;
                                                        try {
                                                        } catch (Throwable th16) {
                                                            AbstractC0672a.c(th15, th16);
                                                        }
                                                        th = th15;
                                                        if (th == null) {
                                                        }
                                                    }
                                                }
                                                arrayList = arrayList2;
                                                try {
                                                    th = null;
                                                } catch (Throwable th17) {
                                                    th = th17;
                                                }
                                            } catch (Throwable th18) {
                                                th = th18;
                                                arrayList = arrayList2;
                                            }
                                            if (th == null) {
                                                throw th;
                                            }
                                            rc.K k = new rc.K(b2, oVar2, sc.b.b(arrayList4));
                                            try {
                                                F10.close();
                                            } catch (Throwable unused3) {
                                            }
                                            jVar = new Db.j(k, sc.e.f24367f);
                                            if (F10 != null) {
                                                throw th7;
                                            }
                                            try {
                                                F10.close();
                                                throw th7;
                                            } catch (Throwable th19) {
                                                AbstractC0672a.c(th7, th19);
                                                throw th7;
                                            }
                                        }
                                        ArrayList arrayList5 = arrayList2;
                                        c11.close();
                                        n8--;
                                        if (n8 < max) {
                                            throw new IOException("not a zip: end of central directory signature not found");
                                        }
                                        arrayList2 = arrayList5;
                                    } finally {
                                        c11.close();
                                    }
                                }
                            } else {
                                it = it4;
                                arrayList = arrayList2;
                                jVar = null;
                            }
                            if (jVar != null) {
                                arrayList3.add(jVar);
                            }
                            arrayList2 = arrayList;
                            it4 = it;
                            i7 = -1;
                            z8 = false;
                        }
                        return Eb.o.i0(arrayList2, arrayList3);
                    }
                    URL url3 = (URL) it3.next();
                    kotlin.jvm.internal.l.b(url3);
                    if (kotlin.jvm.internal.l.a(url3.getProtocol(), "file")) {
                        String str3 = rc.z.f24006b;
                        jVar2 = new Db.j(oVar2, C0660y.b(new File(url3.toURI())));
                    } else {
                        jVar2 = null;
                    }
                    if (jVar2 != null) {
                        arrayList2.add(jVar2);
                    }
                }
                break;
        }
    }
}
