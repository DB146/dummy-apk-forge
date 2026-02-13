package E5;

import B0.C;
import I2.C0330t;
import J7.w;
import P4.C0463k;
import Y5.AbstractC0636n;
import Y5.AbstractC0659x0;
import Y5.B0;
import Y5.BinderC0657w0;
import Y5.C0;
import Y5.C0609e;
import Y5.C0610e0;
import Y5.C0613f0;
import Y5.C0615g;
import Y5.C0632l1;
import Y5.C0639o;
import Y5.C0640o0;
import Y5.C0646q0;
import Y5.D0;
import Y5.E0;
import Y5.EnumC0663z0;
import Y5.F;
import Y5.G0;
import Y5.H;
import Y5.I;
import Y5.I0;
import Y5.I1;
import Y5.InterfaceC0641o1;
import Y5.InterfaceC0661y0;
import Y5.M1;
import Y5.N;
import Y5.O1;
import Y5.P;
import Y5.RunnableC0617g1;
import Y5.RunnableC0626j1;
import Y5.S0;
import Y5.ServiceConnectionC0616g0;
import Y5.ServiceConnectionC0629k1;
import Y5.U;
import Y5.W;
import Y5.Z0;
import Y5.t1;
import Y5.x1;
import android.animation.ValueAnimator;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import cc.C0925c0;
import cc.C0944m;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.atv_ads_framework.zzd;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.kt.apps.core.utils.blurry.BlurFactor;
import com.kt.apps.media.xemtv.beta.R;
import i2.C1332t;
import java.io.EOFException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l1.AbstractC1449a;
import y1.K;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3695a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3696b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3697c;

    public /* synthetic */ k(int i7, Object obj, Object obj2) {
        this.f3695a = i7;
        this.f3696b = obj;
        this.f3697c = obj2;
    }

    public /* synthetic */ k(int i7, Object obj, Object obj2, boolean z8) {
        this.f3695a = i7;
        this.f3697c = obj;
        this.f3696b = obj2;
    }

    public k(C0463k c0463k, I1 i12, Runnable runnable) {
        this.f3695a = 24;
        this.f3696b = i12;
        this.f3697c = runnable;
        Objects.requireNonNull(c0463k);
    }

    public k(S0 s02, C0639o c0639o) {
        this.f3695a = 17;
        this.f3696b = c0639o;
        Objects.requireNonNull(s02);
        this.f3697c = s02;
    }

    public k(S0 s02, zzcu zzcuVar) {
        this.f3695a = 15;
        this.f3696b = zzcuVar;
        Objects.requireNonNull(s02);
        this.f3697c = s02;
    }

    public k(S0 s02, Boolean bool) {
        this.f3695a = 16;
        this.f3696b = bool;
        Objects.requireNonNull(s02);
        this.f3697c = s02;
    }

    public k(ServiceConnectionC0616g0 serviceConnectionC0616g0, zzbq zzbqVar, ServiceConnectionC0616g0 serviceConnectionC0616g02) {
        this.f3695a = 12;
        this.f3696b = zzbqVar;
        this.f3697c = serviceConnectionC0616g0;
    }

    public k(ServiceConnectionC0629k1 serviceConnectionC0629k1, F5.b bVar) {
        this.f3695a = 23;
        this.f3696b = bVar;
        Objects.requireNonNull(serviceConnectionC0629k1);
        this.f3697c = serviceConnectionC0629k1;
    }

    public k(C0632l1 c0632l1, Z0 z02) {
        this.f3695a = 21;
        this.f3696b = z02;
        Objects.requireNonNull(c0632l1);
        this.f3697c = c0632l1;
    }

    public k(AbstractC0636n abstractC0636n, InterfaceC0661y0 interfaceC0661y0) {
        this.f3695a = 11;
        this.f3696b = interfaceC0661y0;
        Objects.requireNonNull(abstractC0636n);
        this.f3697c = abstractC0636n;
    }

    public k(C0646q0 c0646q0, G0 g02) {
        this.f3695a = 13;
        this.f3696b = g02;
        Objects.requireNonNull(c0646q0);
        this.f3697c = c0646q0;
    }

    public k(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z8) {
        this.f3695a = 29;
        this.f3697c = swipeDismissBehavior;
        this.f3696b = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        Long valueOf;
        S0 s02 = (S0) this.f3697c;
        t1 t1Var = ((C0646q0) s02.f3094a).f11914v;
        C0646q0.k(t1Var);
        C0646q0 c0646q0 = (C0646q0) t1Var.f3094a;
        C0613f0 c0613f0 = c0646q0.f11911e;
        C0646q0.j(c0613f0);
        if (c0613f0.Q().i(B0.ANALYTICS_STORAGE)) {
            C0613f0 c0613f02 = c0646q0.f11911e;
            C0646q0.j(c0613f02);
            c0646q0.f11917y.getClass();
            if (!c0613f02.T(System.currentTimeMillis())) {
                C0610e0 c0610e0 = c0613f02.f11733E;
                if (c0610e0.f() != 0) {
                    valueOf = Long.valueOf(c0610e0.f());
                    C0646q0 c0646q02 = (C0646q0) s02.f3094a;
                    zzcu zzcuVar = (zzcu) this.f3696b;
                    if (valueOf == null) {
                        M1 m12 = c0646q02.f11915w;
                        C0646q0.j(m12);
                        m12.s0(zzcuVar, valueOf.longValue());
                        return;
                    } else {
                        try {
                            zzcuVar.zzb(null);
                            return;
                        } catch (RemoteException e2) {
                            W w10 = c0646q02.f11912f;
                            C0646q0.l(w10);
                            w10.f11577f.b(e2, "getSessionId failed with exception");
                            return;
                        }
                    }
                }
            }
        } else {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11582y.a("Analytics storage consent denied; will not get session id");
        }
        valueOf = null;
        C0646q0 c0646q022 = (C0646q0) s02.f3094a;
        zzcu zzcuVar2 = (zzcu) this.f3696b;
        if (valueOf == null) {
        }
    }

    private final void b() {
        S0 s02 = (S0) this.f3697c;
        C0646q0 c0646q0 = (C0646q0) s02.f3094a;
        C0613f0 c0613f0 = c0646q0.f11911e;
        C0646q0.j(c0613f0);
        c0613f0.J();
        c0613f0.J();
        C0639o b2 = C0639o.b(c0613f0.N().getString("dma_consent_settings", null));
        C0639o c0639o = (C0639o) this.f3696b;
        int i7 = b2.f11858a;
        int i10 = c0639o.f11858a;
        boolean l10 = C0.l(i10, i7);
        W w10 = c0646q0.f11912f;
        if (!l10) {
            C0646q0.l(w10);
            w10.f11583z.b(Integer.valueOf(i10), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor edit = c0613f0.N().edit();
        edit.putString("dma_consent_settings", c0639o.f11859b);
        edit.apply();
        C0646q0.l(w10);
        w10.f11573B.b(c0639o, "Setting DMA consent(FE)");
        C0646q0 c0646q02 = (C0646q0) s02.f3094a;
        if (c0646q02.o().T()) {
            C0632l1 o10 = c0646q02.o();
            o10.J();
            o10.K();
            o10.X(new RunnableC0626j1(o10, 1));
            return;
        }
        C0632l1 o11 = c0646q02.o();
        o11.J();
        o11.K();
        if (o11.S()) {
            o11.X(new RunnableC0617g1(o11, o11.Z(false)));
        }
    }

    private final void c() {
        boolean contains;
        S0 s02 = (S0) this.f3696b;
        s02.J();
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        C0613f0 c0613f0 = ((C0646q0) s02.f3094a).f11911e;
        C0646q0.j(c0613f0);
        SparseArray P10 = c0613f0.P();
        for (x1 x1Var : (List) this.f3697c) {
            int i7 = x1Var.f11995c;
            contains = P10.contains(i7);
            if (!contains || ((Long) P10.get(i7)).longValue() < x1Var.f11994b) {
                s02.g0().add(x1Var);
            }
        }
        s02.h0();
    }

    private final void d() {
        C0646q0 c0646q0 = (C0646q0) ((S0) this.f3696b).f3094a;
        N q10 = c0646q0.q();
        String str = q10.f11466E;
        String str2 = (String) this.f3697c;
        boolean z8 = false;
        if (str != null && !str.equals(str2)) {
            z8 = true;
        }
        q10.f11466E = str2;
        if (z8) {
            c0646q0.q().O();
        }
    }

    private final void e() {
        C0632l1 c0632l1 = (C0632l1) this.f3697c;
        I i7 = c0632l1.f11815d;
        C0646q0 c0646q0 = (C0646q0) c0632l1.f3094a;
        if (i7 == null) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11577f.a("Failed to send current screen to service");
            return;
        }
        try {
            Z0 z02 = (Z0) this.f3696b;
            if (z02 == null) {
                i7.k(0L, null, null, c0646q0.f11907a.getPackageName());
            } else {
                i7.k(z02.f11613c, z02.f11611a, z02.f11612b, c0646q0.f11907a.getPackageName());
            }
            c0632l1.W();
        } catch (RemoteException e2) {
            W w11 = ((C0646q0) c0632l1.f3094a).f11912f;
            C0646q0.l(w11);
            w11.f11577f.b(e2, "Failed to send current screen to the service");
        }
    }

    private final void f() {
        C0632l1 c0632l1 = ((ServiceConnectionC0629k1) this.f3697c).f11809c;
        c0632l1.f11815d = null;
        if (((F5.b) this.f3696b).f4088b != 7777) {
            c0632l1.Y();
            return;
        }
        if (c0632l1.f11818u == null) {
            c0632l1.f11818u = Executors.newScheduledThreadPool(1);
        }
        c0632l1.f11818u.schedule(new C(this, 18), ((Long) F.f11302Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
    }

    private final void g() {
        I1 i12 = (I1) this.f3696b;
        i12.A();
        i12.c().J();
        if (i12.f11383D == null) {
            i12.f11383D = new ArrayList();
        }
        i12.f11383D.add((Runnable) this.f3697c);
        i12.q();
    }

    private final /* synthetic */ void h() {
        C0463k c0463k = (C0463k) this.f3696b;
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((InterfaceC0641o1) ((Service) c0463k.f8074b)).b((JobParameters) this.f3697c);
    }

    private final void i() {
        c2.h hVar = (c2.h) this.f3697c;
        c2.g gVar = hVar.f14154l;
        if (gVar != null) {
            A7.a aVar = gVar == null ? null : gVar.f14142a[hVar.f14155m];
            Drawable drawable = (Drawable) this.f3696b;
            if (aVar != null) {
                Drawable drawable2 = (Drawable) aVar.f532b;
                if (!c2.h.f(drawable, drawable2)) {
                    hVar.f14154l.a(R.id.background_imagein, hVar.f14146a);
                    hVar.f14154l.b(R.id.background_imageout, drawable2);
                }
            }
            if (hVar.f14153i) {
                c2.g gVar2 = hVar.f14154l;
                if ((gVar2 == null ? null : gVar2.f14142a[hVar.f14155m]) == null && drawable != null) {
                    gVar2.b(R.id.background_imagein, drawable);
                    c2.g gVar3 = hVar.f14154l;
                    A7.a aVar2 = gVar3.f14142a[hVar.f14155m];
                    if (aVar2 != null) {
                        aVar2.f531a = 0;
                        gVar3.invalidateSelf();
                    }
                }
                ValueAnimator valueAnimator = hVar.k;
                valueAnimator.setDuration(500L);
                valueAnimator.start();
            }
        }
        hVar.f14156n = null;
    }

    private final void j() {
        ((C0944m) this.f3697c).B((C0925c0) this.f3696b);
    }

    private final void k() {
        ((C0944m) this.f3696b).B((dc.d) this.f3697c);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:77|(1:79)(9:320|321|322|323|(1:325)(2:346|(4:348|327|328|(26:330|(1:332)(1:344)|334|335|337|338|339|82|(2:84|(2:86|(2:88|(2:90|(2:92|(2:94|(1:96)(1:313))(1:314))(1:315))(1:316))(1:317))(1:318))(1:319)|97|98|99|(1:101)(1:310)|102|(1:104)|106|107|(1:109)(2:307|(8:309|(3:300|301|(6:303|(5:114|(1:116)(3:291|(3:294|(1:296)(1:297)|292)|298)|(1:118)(1:290)|119|(38:121|(1:123)(1:287)|124|(1:126)|127|(1:129)(1:286)|130|(1:132)|(3:285|134|(1:136))|137|(2:281|(18:283|(1:154)|155|(1:157)|158|(2:258|(2:264|(2:272|(2:273|(1:280)(2:275|(2:277|278)(1:279)))))(1:263))(1:162)|163|(3:254|(1:256)|257)|167|(1:169)|170|(1:174)|175|(3:177|(7:179|(1:181)(1:196)|182|(1:184)|185|(4:189|(1:191)|192|(1:194))|195)|197)(9:214|(3:216|(2:219|(5:221|(1:223)(1:228)|224|(1:226)|227))|229)(1:253)|230|(1:232)|233|234|235|236|(5:238|(1:240)(1:248)|(1:244)|(1:246)|247))|198|(3:200|(1:202)(1:211)|(5:204|(1:206)|207|(1:209)|210))|212|213))(1:140)|141|(1:151)|152|(0)|155|(0)|158|(1:160)|258|(1:261)|264|(5:266|268|270|272|(3:273|(0)(0)|279))|163|(1:165)|254|(0)|257|167|(0)|170|(2:172|174)|175|(0)(0)|198|(0)|212|213)(2:288|289))|299|(0)(0)|119|(0)(0)))|112|(0)|299|(0)(0)|119|(0)(0)))|110|(0)|112|(0)|299|(0)(0)|119|(0)(0))))|326|327|328|(0))|80|81|82|(0)(0)|97|98|99|(0)(0)|102|(0)|106|107|(0)(0)|110|(0)|112|(0)|299|(0)(0)|119|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:320|(2:321|322)|323|(1:325)(2:346|(4:348|327|328|(26:330|(1:332)(1:344)|334|335|337|338|339|82|(2:84|(2:86|(2:88|(2:90|(2:92|(2:94|(1:96)(1:313))(1:314))(1:315))(1:316))(1:317))(1:318))(1:319)|97|98|99|(1:101)(1:310)|102|(1:104)|106|107|(1:109)(2:307|(8:309|(3:300|301|(6:303|(5:114|(1:116)(3:291|(3:294|(1:296)(1:297)|292)|298)|(1:118)(1:290)|119|(38:121|(1:123)(1:287)|124|(1:126)|127|(1:129)(1:286)|130|(1:132)|(3:285|134|(1:136))|137|(2:281|(18:283|(1:154)|155|(1:157)|158|(2:258|(2:264|(2:272|(2:273|(1:280)(2:275|(2:277|278)(1:279)))))(1:263))(1:162)|163|(3:254|(1:256)|257)|167|(1:169)|170|(1:174)|175|(3:177|(7:179|(1:181)(1:196)|182|(1:184)|185|(4:189|(1:191)|192|(1:194))|195)|197)(9:214|(3:216|(2:219|(5:221|(1:223)(1:228)|224|(1:226)|227))|229)(1:253)|230|(1:232)|233|234|235|236|(5:238|(1:240)(1:248)|(1:244)|(1:246)|247))|198|(3:200|(1:202)(1:211)|(5:204|(1:206)|207|(1:209)|210))|212|213))(1:140)|141|(1:151)|152|(0)|155|(0)|158|(1:160)|258|(1:261)|264|(5:266|268|270|272|(3:273|(0)(0)|279))|163|(1:165)|254|(0)|257|167|(0)|170|(2:172|174)|175|(0)(0)|198|(0)|212|213)(2:288|289))|299|(0)(0)|119|(0)(0)))|112|(0)|299|(0)(0)|119|(0)(0)))|110|(0)|112|(0)|299|(0)(0)|119|(0)(0))))|326|327|328|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x04d9, code lost:
    
        if (r10.e0() == 1) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0353, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0354, code lost:
    
        Y5.C0646q0.l(r6);
        r6.f11577f.c("Fetching Google App Id failed with exception. appId", Y5.W.R(r15), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0288, code lost:
    
        r0 = r23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0343 A[Catch: IllegalStateException -> 0x0353, TRY_LEAVE, TryCatch #4 {IllegalStateException -> 0x0353, blocks: (B:99:0x0331, B:102:0x033f, B:104:0x0343), top: B:98:0x0331 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0667 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0399 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0261 A[Catch: NameNotFoundException -> 0x0288, TryCatch #2 {NameNotFoundException -> 0x0288, blocks: (B:328:0x0256, B:330:0x0261, B:332:0x026d), top: B:327:0x0256 }] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0b24  */
    /* JADX WARN: Removed duplicated region for block: B:438:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b5  */
    /* JADX WARN: Type inference failed for: r0v112, types: [E3.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v152, types: [Y5.W0, Y5.H, C9.h] */
    /* JADX WARN: Type inference failed for: r0v94, types: [Y5.x0, Y5.p] */
    /* JADX WARN: Type inference failed for: r2v91, types: [Y5.R0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [Bc.o, java.lang.Exception] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        String str2;
        String str3;
        PackageManager packageManager;
        String str4;
        String str5;
        String str6;
        PackageInfo packageInfo;
        String str7;
        int i7;
        int g;
        PackageManager packageManager2;
        Bundle U8;
        Integer valueOf;
        String[] stringArray;
        List<String> asList;
        ?? h10;
        U u3;
        U u10;
        C0 c02;
        EnumC0663z0 Y2;
        EnumC0663z0 Y10;
        zzdd zzddVar;
        Bundle bundle;
        Iterator it;
        Boolean V7;
        C0646q0 c0646q0;
        long f4;
        R7.b bVar;
        C0646q0 c0646q02;
        U u11;
        int i10;
        String b2;
        switch (this.f3695a) {
            case 0:
                m mVar = (m) this.f3696b;
                IBinder iBinder = (IBinder) this.f3697c;
                synchronized (mVar) {
                    if (iBinder == null) {
                        mVar.a("Null service connection");
                    } else {
                        try {
                            mVar.f3702c = new q3.e(iBinder);
                            mVar.f3700a = 2;
                            ((ScheduledExecutorService) mVar.f3705f.f3714c).execute(new l(mVar, 0));
                        } catch (RemoteException e2) {
                            mVar.a(e2.getMessage());
                        }
                    }
                }
                return;
            case 1:
                m mVar2 = (m) this.f3696b;
                int i11 = ((n) this.f3697c).f3706a;
                synchronized (mVar2) {
                    n nVar = (n) mVar2.f3704e.get(i11);
                    if (nVar != 0) {
                        Log.w("MessengerIpcClient", "Timing out request: " + i11);
                        mVar2.f3704e.remove(i11);
                        nVar.b(new Exception("Timed out waiting for response", null));
                        mVar2.c();
                    }
                }
                return;
            case 2:
                F3.c cVar = (F3.c) this.f3697c;
                if (cVar.f4065d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f3696b).run();
                    return;
                } catch (Throwable th) {
                    cVar.f4064c.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            case 3:
                throw new RuntimeException((String) this.f3696b, (Throwable) this.f3697c);
            case 4:
                w wVar = (w) ((q3.c) this.f3697c).f23372c;
                if (wVar.f5648c) {
                    return;
                }
                wVar.e();
                K7.b bVar2 = wVar.f5650e;
                String str8 = (String) this.f3696b;
                if (bVar2 != null) {
                    wVar.b(str8);
                    return;
                }
                if (str8.length() <= 6) {
                    try {
                        int parseInt = Integer.parseInt(str8);
                        if (parseInt > 0) {
                            wVar.d(parseInt);
                        }
                        str = null;
                    } catch (NumberFormatException unused) {
                    }
                    if (str == null) {
                        wVar.b(str);
                        return;
                    }
                    return;
                }
                wVar.d(1);
                str = str8;
                if (str == null) {
                }
            case 5:
                U7.e eVar = (U7.e) this.f3696b;
                Throwable cause = eVar.getCause();
                q3.c cVar2 = (q3.c) this.f3697c;
                if (cause == null || !(eVar.getCause() instanceof EOFException)) {
                    ((w) cVar2.f23372c).j.p("WebSocket error.", eVar, new Object[0]);
                } else {
                    ((w) cVar2.f23372c).j.p("WebSocket reached EOF.", null, new Object[0]);
                }
                w.a((w) cVar2.f23372c);
                return;
            case 6:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f3696b;
                try {
                    taskCompletionSource.setResult(zzd.zzb((Context) this.f3697c));
                    return;
                } catch (IllegalStateException e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 7:
                ((K7.a) this.f3697c).f6202h = null;
                ((J7.b) this.f3696b).run();
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                J3.w a9 = J3.w.a();
                a9.getClass();
                W3.o.a();
                a9.f5505d.set(true);
                ((P3.d) this.f3697c).f7823b.f7825b = true;
                ((P3.d) this.f3697c).f7822a.getViewTreeObserver().removeOnDrawListener((P3.d) this.f3696b);
                ((P3.d) this.f3697c).f7823b.f7824a.clear();
                return;
            case 9:
                Iterator it2 = ((ArrayList) this.f3696b).iterator();
                while (it2.hasNext()) {
                    Q7.b bVar3 = (Q7.b) it2.next();
                    q3.e eVar2 = (q3.e) this.f3697c;
                    if (((Q7.h) eVar2.f23377c).H()) {
                        ((Q7.h) eVar2.f23377c).p("Raising " + bVar3.toString(), null, new Object[0]);
                    }
                    bVar3.f8673b.getClass();
                }
                return;
            case 10:
                q3.c cVar3 = (q3.c) this.f3697c;
                try {
                    E6.b.o((R6.a) this.f3696b);
                    S0 s02 = (S0) cVar3.f23372c;
                    s02.J();
                    cVar3.B();
                    s02.f11556w = false;
                    s02.f11557x = 1;
                    W w10 = ((C0646q0) s02.f3094a).f11912f;
                    C0646q0.l(w10);
                    w10.f11572A.b(((x1) cVar3.f23371b).f11993a, "Successfully registered trigger URI");
                    s02.h0();
                    return;
                } catch (Error e11) {
                    e = e11;
                    cVar3.u(e);
                    return;
                } catch (RuntimeException e12) {
                    e = e12;
                    cVar3.u(e);
                    return;
                } catch (ExecutionException e13) {
                    cVar3.u(e13.getCause());
                    return;
                }
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                InterfaceC0661y0 interfaceC0661y0 = (InterfaceC0661y0) this.f3696b;
                interfaceC0661y0.f();
                if (C1332t.e()) {
                    interfaceC0661y0.c().S(this);
                    return;
                }
                AbstractC0636n abstractC0636n = (AbstractC0636n) this.f3697c;
                boolean z8 = abstractC0636n.f11845c != 0;
                abstractC0636n.f11845c = 0L;
                if (z8) {
                    abstractC0636n.a();
                    return;
                }
                return;
            case 12:
                ServiceConnectionC0616g0 serviceConnectionC0616g0 = (ServiceConnectionC0616g0) this.f3697c;
                C0646q0 c0646q03 = serviceConnectionC0616g0.f11758b.f11773a;
                C0640o0 c0640o0 = c0646q03.f11913u;
                C0646q0.l(c0640o0);
                c0640o0.J();
                Bundle bundle2 = new Bundle();
                bundle2.putString("package_name", serviceConnectionC0616g0.f11757a);
                try {
                    if (((zzbq) this.f3696b).zze(bundle2) == null) {
                        W w11 = c0646q03.f11912f;
                        C0646q0.l(w11);
                        w11.f11577f.a("Install Referrer Service returned a null response");
                    }
                } catch (Exception e14) {
                    W w12 = c0646q03.f11912f;
                    C0646q0.l(w12);
                    w12.f11577f.b(e14.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                C0640o0 c0640o02 = c0646q03.f11913u;
                C0646q0.l(c0640o02);
                c0640o02.J();
                throw new IllegalStateException("Unexpected call on client side");
            case 13:
                C0646q0 c0646q04 = (C0646q0) this.f3697c;
                C0640o0 c0640o03 = c0646q04.f11913u;
                C0646q0.l(c0640o03);
                c0640o03.J();
                C0615g c0615g = c0646q04.f11910d;
                ((C0646q0) c0615g.f3094a).getClass();
                ?? abstractC0659x0 = new AbstractC0659x0(c0646q04);
                abstractC0659x0.M();
                c0646q04.f11896G = abstractC0659x0;
                G0 g02 = (G0) this.f3696b;
                zzdd zzddVar2 = g02.f11366d;
                N n6 = new N(c0646q04, g02.f11365c, zzddVar2 == null ? 0L : zzddVar2.zza);
                n6.L();
                c0646q04.f11897H = n6;
                P p10 = new P(c0646q04);
                p10.L();
                c0646q04.f11894E = p10;
                C0632l1 c0632l1 = new C0632l1(c0646q04);
                c0632l1.L();
                c0646q04.f11895F = c0632l1;
                M1 m12 = c0646q04.f11915w;
                if (m12.f11992b) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                m12.J();
                SecureRandom secureRandom = new SecureRandom();
                long nextLong = secureRandom.nextLong();
                if (nextLong == 0) {
                    nextLong = secureRandom.nextLong();
                    if (nextLong == 0) {
                        W w13 = ((C0646q0) m12.f3094a).f11912f;
                        C0646q0.l(w13);
                        w13.f11580w.a("Utils falling back to Random for random id");
                    }
                }
                m12.f11457d.set(nextLong);
                C0646q0 c0646q05 = (C0646q0) m12.f3094a;
                c0646q05.f11905Q.incrementAndGet();
                m12.f11992b = true;
                C0613f0 c0613f0 = c0646q04.f11911e;
                if (c0613f0.f11992b) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                SharedPreferences sharedPreferences = ((C0646q0) c0613f0.f3094a).f11907a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                c0613f0.f11741c = sharedPreferences;
                boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
                c0613f0.f11734F = z10;
                if (!z10) {
                    SharedPreferences.Editor edit = c0613f0.f11741c.edit();
                    edit.putBoolean("has_been_opened", true);
                    edit.apply();
                }
                long max = Math.max(0L, ((Long) F.f11313d.a(null)).longValue());
                ?? obj = new Object();
                Objects.requireNonNull(c0613f0);
                obj.f3528e = c0613f0;
                G.d("health_monitor");
                G.b(max > 0);
                obj.f3525b = "health_monitor:start";
                obj.f3526c = "health_monitor:count";
                obj.f3527d = "health_monitor:value";
                obj.f3524a = max;
                c0613f0.f11743e = obj;
                ((C0646q0) c0613f0.f3094a).f11905Q.incrementAndGet();
                c0613f0.f11992b = true;
                N n8 = c0646q04.f11897H;
                if (n8.f11371b) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                C0646q0 c0646q06 = (C0646q0) n8.f3094a;
                W w14 = c0646q06.f11912f;
                C0646q0.l(w14);
                w14.f11573B.c("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(n8.f11474x), Long.valueOf(n8.f11473w));
                Context context = c0646q06.f11907a;
                String packageName = context.getPackageName();
                PackageManager packageManager3 = context.getPackageManager();
                W w15 = c0646q06.f11912f;
                String str9 = "";
                String str10 = "unknown";
                if (packageManager3 == null) {
                    C0646q0.l(w15);
                    str2 = "Unknown";
                    w15.f11577f.b(W.R(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
                } else {
                    str2 = "Unknown";
                    try {
                        str10 = packageManager3.getInstallerPackageName(packageName);
                    } catch (IllegalArgumentException unused2) {
                        C0646q0.l(w15);
                        w15.f11577f.b(W.R(packageName), "Error retrieving app installer package name. appId");
                    }
                    String str11 = str10;
                    if (str11 == null) {
                        str11 = "manual_install";
                    } else if ("com.android.vending".equals(str11)) {
                        str10 = "";
                        packageInfo = packageManager3.getPackageInfo(context.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager3.getApplicationLabel(packageInfo.applicationInfo);
                            str4 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : str2;
                            try {
                                str7 = packageInfo.versionName;
                            } catch (PackageManager.NameNotFoundException unused3) {
                                str3 = str4;
                            }
                            try {
                                packageManager = packageManager3;
                                str5 = str10;
                                i7 = packageInfo.versionCode;
                                str6 = str7;
                            } catch (PackageManager.NameNotFoundException unused4) {
                                str3 = str4;
                                str2 = str7;
                                C0646q0.l(w15);
                                packageManager = packageManager3;
                                w15.f11577f.c("Error retrieving package info. appId, appName", W.R(packageName), str3);
                                str4 = str3;
                                str5 = str10;
                                str6 = str2;
                                i7 = Integer.MIN_VALUE;
                                n8.f11467c = packageName;
                                n8.f11470f = str5;
                                n8.f11468d = str6;
                                n8.f11469e = i7;
                                n8.f11471u = str4;
                                n8.f11472v = 0L;
                                g = c0646q06.g();
                                if (g == 0) {
                                }
                                n8.f11463B = "";
                                b2 = D0.b(context, c0646q06.f11893D);
                                if (!TextUtils.isEmpty(b2)) {
                                }
                                n8.f11463B = str9;
                                if (g == 0) {
                                }
                                n8.f11475y = null;
                                C0615g c0615g2 = c0646q06.f11910d;
                                c0615g2.getClass();
                                G.d("analytics.safelisted_events");
                                U8 = c0615g2.U();
                                C0646q0 c0646q07 = (C0646q0) c0615g2.f3094a;
                                if (U8 == null) {
                                }
                                valueOf = null;
                                if (valueOf != null) {
                                }
                                asList = null;
                                if (asList != null) {
                                }
                                n8.f11475y = asList;
                                if (packageManager2 == null) {
                                }
                                ((C0646q0) n8.f3094a).f11905Q.incrementAndGet();
                                n8.f11371b = true;
                                h10 = new H(c0646q04);
                                h10.L();
                                c0646q04.f11898I = h10;
                                if (!h10.f11371b) {
                                }
                            }
                            n8.f11467c = packageName;
                            n8.f11470f = str5;
                            n8.f11468d = str6;
                            n8.f11469e = i7;
                            n8.f11471u = str4;
                            n8.f11472v = 0L;
                            g = c0646q06.g();
                            if (g == 0) {
                                packageManager2 = packageManager;
                                C0646q0.l(w15);
                                w15.f11573B.a("App measurement collection enabled");
                            } else if (g != 1) {
                                packageManager2 = packageManager;
                                if (g == 3) {
                                    C0646q0.l(w15);
                                    w15.f11583z.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                                } else if (g == 4) {
                                    C0646q0.l(w15);
                                    w15.f11583z.a("App measurement disabled via the manifest");
                                } else if (g == 6) {
                                    C0646q0.l(w15);
                                    w15.f11582y.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                                } else if (g == 7) {
                                    C0646q0.l(w15);
                                    w15.f11583z.a("App measurement disabled via the global data collection setting");
                                } else if (g != 8) {
                                    C0646q0.l(w15);
                                    w15.f11583z.a("App measurement disabled");
                                    C0646q0.l(w15);
                                    w15.f11578u.a("Invalid scion state in identity");
                                } else {
                                    C0646q0.l(w15);
                                    w15.f11583z.a("App measurement disabled due to denied storage consent");
                                }
                            } else {
                                packageManager2 = packageManager;
                                C0646q0.l(w15);
                                w15.f11583z.a("App measurement deactivated via the manifest");
                            }
                            n8.f11463B = "";
                            b2 = D0.b(context, c0646q06.f11893D);
                            if (!TextUtils.isEmpty(b2)) {
                                str9 = b2;
                            }
                            n8.f11463B = str9;
                            if (g == 0) {
                                C0646q0.l(w15);
                                w15.f11573B.c("App measurement enabled for app package, google app id", n8.f11467c, n8.f11463B);
                            }
                            n8.f11475y = null;
                            C0615g c0615g22 = c0646q06.f11910d;
                            c0615g22.getClass();
                            G.d("analytics.safelisted_events");
                            U8 = c0615g22.U();
                            C0646q0 c0646q072 = (C0646q0) c0615g22.f3094a;
                            if (U8 == null) {
                                W w16 = c0646q072.f11912f;
                                C0646q0.l(w16);
                                w16.f11577f.a("Failed to load metadata: Metadata bundle is null");
                            } else if (U8.containsKey("analytics.safelisted_events")) {
                                valueOf = Integer.valueOf(U8.getInt("analytics.safelisted_events"));
                                if (valueOf != null) {
                                    try {
                                        stringArray = c0646q072.f11907a.getResources().getStringArray(valueOf.intValue());
                                    } catch (Resources.NotFoundException e15) {
                                        W w17 = c0646q072.f11912f;
                                        C0646q0.l(w17);
                                        w17.f11577f.b(e15, "Failed to load string array from metadata: resource not found");
                                    }
                                    if (stringArray != null) {
                                        asList = Arrays.asList(stringArray);
                                        if (asList != null) {
                                            if (asList.isEmpty()) {
                                                C0646q0.l(w15);
                                                w15.f11582y.a("Safelisted event list is empty. Ignoring");
                                            } else {
                                                for (String str12 : asList) {
                                                    M1 m13 = c0646q06.f11915w;
                                                    C0646q0.j(m13);
                                                    if (!m13.K0("safelisted event", str12)) {
                                                    }
                                                }
                                            }
                                            if (packageManager2 == null) {
                                                n8.f11462A = O5.b.v(context) ? 1 : 0;
                                            } else {
                                                n8.f11462A = 0;
                                            }
                                            ((C0646q0) n8.f3094a).f11905Q.incrementAndGet();
                                            n8.f11371b = true;
                                            h10 = new H(c0646q04);
                                            h10.L();
                                            c0646q04.f11898I = h10;
                                            if (!h10.f11371b) {
                                                throw new IllegalStateException("Can't initialize twice");
                                            }
                                            h10.f11584c = (JobScheduler) ((C0646q0) h10.f3094a).f11907a.getSystemService("jobscheduler");
                                            ((C0646q0) h10.f3094a).f11905Q.incrementAndGet();
                                            h10.f11371b = true;
                                            W w18 = c0646q04.f11912f;
                                            C0646q0.l(w18);
                                            c0615g.O();
                                            U u12 = w18.f11583z;
                                            u12.b(130000L, "App measurement initialized, version");
                                            C0646q0.l(w18);
                                            u12.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                            String P10 = n6.P();
                                            if (m12.j0(P10, c0615g.f11754c)) {
                                                C0646q0.l(w18);
                                                u12.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                            } else {
                                                C0646q0.l(w18);
                                                u12.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(P10)));
                                            }
                                            C0646q0.l(w18);
                                            U u13 = w18.f11572A;
                                            u13.a("Debug-level message logging enabled");
                                            int i12 = c0646q04.f11903O;
                                            AtomicInteger atomicInteger = c0646q04.f11905Q;
                                            int i13 = atomicInteger.get();
                                            U u14 = w18.f11577f;
                                            if (i12 != i13) {
                                                C0646q0.l(w18);
                                                u14.c("Not all components initialized", Integer.valueOf(c0646q04.f11903O), Integer.valueOf(atomicInteger.get()));
                                            }
                                            c0646q04.f11899J = true;
                                            C0640o0 c0640o04 = c0646q04.f11913u;
                                            C0646q0.l(c0640o04);
                                            c0640o04.J();
                                            C0646q0.i(c0646q04.f11898I);
                                            zzin O10 = c0646q04.f11898I.O();
                                            zzin zzinVar = zzin.CLIENT_UPLOAD_ELIGIBLE;
                                            zzql.zza();
                                            boolean T10 = c0615g.T(null, F.f11285Q0);
                                            boolean z11 = O10 == zzinVar;
                                            if (T10) {
                                                m12.J();
                                                break;
                                            }
                                            if (z11) {
                                                z11 = true;
                                                m12.J();
                                                IntentFilter intentFilter = new IntentFilter();
                                                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                AbstractC1449a.registerReceiver(c0646q05.f11907a, new F6.j(c0646q05), intentFilter, 2);
                                                W w19 = c0646q05.f11912f;
                                                C0646q0.l(w19);
                                                w19.f11572A.a("Registered app receiver");
                                                if (z11) {
                                                    C0646q0.i(c0646q04.f11898I);
                                                    c0646q04.f11898I.N(((Long) F.f11258C.a(null)).longValue());
                                                }
                                            }
                                            C0 Q3 = c0613f0.Q();
                                            EnumC0663z0 Y11 = c0615g.Y("google_analytics_default_allow_ad_storage", false);
                                            EnumC0663z0 Y12 = c0615g.Y("google_analytics_default_allow_analytics_storage", false);
                                            EnumC0663z0 enumC0663z0 = EnumC0663z0.UNINITIALIZED;
                                            B0 b02 = B0.ANALYTICS_STORAGE;
                                            final S0 s03 = c0646q04.f11890A;
                                            if (Y11 == enumC0663z0 && Y12 == enumC0663z0) {
                                                u3 = u12;
                                                u10 = u14;
                                            } else {
                                                u3 = u12;
                                                u10 = u14;
                                                if (C0.l(-10, c0613f0.N().getInt("consent_source", 100))) {
                                                    EnumMap enumMap = new EnumMap(B0.class);
                                                    enumMap.put((EnumMap) B0.AD_STORAGE, (B0) Y11);
                                                    enumMap.put((EnumMap) b02, (B0) Y12);
                                                    c02 = new C0(enumMap, -10);
                                                    if (c02 != null) {
                                                        C0646q0.k(s03);
                                                        s03.e0(c02, true);
                                                        Q3 = c02;
                                                    }
                                                    C0646q0.k(s03);
                                                    s03.N(Q3);
                                                    c0613f0.J();
                                                    int i14 = C0639o.b(c0613f0.N().getString("dma_consent_settings", null)).f11858a;
                                                    Y2 = c0615g.Y("google_analytics_default_allow_ad_personalization_signals", true);
                                                    U u15 = w18.f11573B;
                                                    if (Y2 != enumC0663z0) {
                                                        C0646q0.l(w18);
                                                        u15.b(Y2, "Default ad personalization consent from Manifest");
                                                    }
                                                    Y10 = c0615g.Y("google_analytics_default_allow_ad_user_data", true);
                                                    if (Y10 == enumC0663z0 && C0.l(-10, i14)) {
                                                        C0646q0.k(s03);
                                                        EnumMap enumMap2 = new EnumMap(B0.class);
                                                        enumMap2.put((EnumMap) B0.AD_USER_DATA, (B0) Y10);
                                                        s03.d0(new C0639o(enumMap2, -10, (Boolean) null, (String) null), true);
                                                    } else if (TextUtils.isEmpty(c0646q04.q().Q()) && (i14 == 0 || i14 == 30)) {
                                                        C0646q0.k(s03);
                                                        s03.d0(new C0639o((Boolean) null, -10, (Boolean) null, (String) null), true);
                                                    } else if (TextUtils.isEmpty(c0646q04.q().Q()) && (zzddVar = g02.f11366d) != null && (bundle = zzddVar.zzd) != null && C0.l(30, i14)) {
                                                        C0639o c10 = C0639o.c(30, bundle);
                                                        it = c10.f11862e.values().iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                if (((EnumC0663z0) it.next()) != enumC0663z0) {
                                                                    C0646q0.k(s03);
                                                                    s03.d0(c10, true);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    V7 = c0615g.V("google_analytics_tcf_data_enabled");
                                                    c0646q0 = (C0646q0) s03.f3094a;
                                                    if (V7 != null || V7.booleanValue()) {
                                                        C0646q0.l(w18);
                                                        u13.a("TCF client enabled.");
                                                        C0646q0.k(s03);
                                                        s03.J();
                                                        W w20 = c0646q0.f11912f;
                                                        C0646q0.l(w20);
                                                        w20.f11572A.a("Register tcfPrefChangeListener.");
                                                        if (s03.f11547I == null) {
                                                            s03.f11548J = new I0(s03, c0646q0, 2);
                                                            s03.f11547I = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: Y5.R0
                                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str13) {
                                                                    S0 s04 = S0.this;
                                                                    C0646q0 c0646q08 = (C0646q0) s04.f3094a;
                                                                    boolean T11 = c0646q08.f11910d.T(null, F.f11303Z0);
                                                                    W w21 = c0646q08.f11912f;
                                                                    if (!T11) {
                                                                        if (Objects.equals(str13, "IABTCF_TCString")) {
                                                                            C0646q0.l(w21);
                                                                            w21.f11573B.a("IABTCF_TCString change picked up in listener.");
                                                                            I0 i02 = s04.f11548J;
                                                                            com.google.android.gms.common.internal.G.g(i02);
                                                                            i02.b(500L);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    if (Objects.equals(str13, "IABTCF_TCString") || Objects.equals(str13, "IABTCF_gdprApplies") || Objects.equals(str13, "IABTCF_EnableAdvertiserConsentMode")) {
                                                                        C0646q0.l(w21);
                                                                        w21.f11573B.a("IABTCF_TCString change picked up in listener.");
                                                                        I0 i03 = s04.f11548J;
                                                                        com.google.android.gms.common.internal.G.g(i03);
                                                                        i03.b(500L);
                                                                    }
                                                                }
                                                            };
                                                        }
                                                        C0613f0 c0613f02 = c0646q0.f11911e;
                                                        C0646q0.j(c0613f02);
                                                        c0613f02.O().registerOnSharedPreferenceChangeListener(s03.f11547I);
                                                        C0646q0.k(s03);
                                                        s03.P();
                                                    }
                                                    C0610e0 c0610e0 = c0613f0.f11744f;
                                                    f4 = c0610e0.f();
                                                    long j = c0646q04.f11906R;
                                                    if (f4 == 0) {
                                                        C0646q0.l(w18);
                                                        u15.b(Long.valueOf(j), "Persisting first open");
                                                        c0610e0.g(j);
                                                    }
                                                    C0646q0.k(s03);
                                                    bVar = s03.f11544F;
                                                    if (bVar.B() && bVar.A()) {
                                                        C0613f0 c0613f03 = ((C0646q0) bVar.f8929b).f11911e;
                                                        C0646q0.j(c0613f03);
                                                        c0613f03.f11739K.u(null);
                                                    }
                                                    if (c0646q04.h()) {
                                                        if (c0646q04.a()) {
                                                            if (m12.g0("android.permission.INTERNET")) {
                                                                u11 = u10;
                                                            } else {
                                                                C0646q0.l(w18);
                                                                u11 = u10;
                                                                u11.a("App is missing INTERNET permission");
                                                            }
                                                            if (!m12.g0("android.permission.ACCESS_NETWORK_STATE")) {
                                                                C0646q0.l(w18);
                                                                u11.a("App is missing ACCESS_NETWORK_STATE permission");
                                                            }
                                                            Context context2 = c0646q04.f11907a;
                                                            if (!O5.c.a(context2).i() && !c0615g.M()) {
                                                                if (!M1.z0(context2)) {
                                                                    C0646q0.l(w18);
                                                                    u11.a("AppMeasurementReceiver not registered/enabled");
                                                                }
                                                                if (!M1.c0(context2)) {
                                                                    C0646q0.l(w18);
                                                                    u11.a("AppMeasurementService not registered/enabled");
                                                                }
                                                            }
                                                            C0646q0.l(w18);
                                                            u11.a("Uploading is not possible. App measurement disabled");
                                                        }
                                                        c0646q02 = c0646q0;
                                                    } else {
                                                        boolean isEmpty = TextUtils.isEmpty(c0646q04.q().Q());
                                                        C0330t c0330t = c0613f0.f11745u;
                                                        if (isEmpty) {
                                                            c0646q02 = c0646q0;
                                                        } else {
                                                            String Q10 = c0646q04.q().Q();
                                                            c0613f0.J();
                                                            c0646q02 = c0646q0;
                                                            String string = c0613f0.N().getString("gmp_app_id", null);
                                                            boolean isEmpty2 = TextUtils.isEmpty(Q10);
                                                            boolean isEmpty3 = TextUtils.isEmpty(string);
                                                            if (!isEmpty2 && !isEmpty3) {
                                                                G.g(Q10);
                                                                if (!Q10.equals(string)) {
                                                                    C0646q0.l(w18);
                                                                    u3.a("Rechecking which service to use due to a GMP App Id change");
                                                                    c0613f0.J();
                                                                    c0613f0.J();
                                                                    Boolean valueOf2 = c0613f0.N().contains("measurement_enabled") ? Boolean.valueOf(c0613f0.N().getBoolean("measurement_enabled", true)) : null;
                                                                    SharedPreferences.Editor edit2 = c0613f0.N().edit();
                                                                    edit2.clear();
                                                                    edit2.apply();
                                                                    if (valueOf2 != null) {
                                                                        c0613f0.J();
                                                                        SharedPreferences.Editor edit3 = c0613f0.N().edit();
                                                                        edit3.putBoolean("measurement_enabled", valueOf2.booleanValue());
                                                                        edit3.apply();
                                                                    }
                                                                    c0646q04.n().N();
                                                                    c0646q04.f11895F.R();
                                                                    c0646q04.f11895F.P();
                                                                    c0610e0.g(j);
                                                                    c0330t.u(null);
                                                                }
                                                            }
                                                            String Q11 = c0646q04.q().Q();
                                                            c0613f0.J();
                                                            SharedPreferences.Editor edit4 = c0613f0.N().edit();
                                                            edit4.putString("gmp_app_id", Q11);
                                                            edit4.apply();
                                                        }
                                                        if (!c0613f0.Q().i(b02)) {
                                                            c0330t.u(null);
                                                        }
                                                        C0646q0.k(s03);
                                                        s03.f11554u.set(c0330t.t());
                                                        try {
                                                            c0646q05.f11907a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                                        } catch (ClassNotFoundException unused5) {
                                                            C0330t c0330t2 = c0613f0.f11738J;
                                                            if (!TextUtils.isEmpty(c0330t2.t())) {
                                                                C0646q0.l(w18);
                                                                w18.f11580w.a("Remote config removed with active feature rollouts");
                                                                c0330t2.u(null);
                                                            }
                                                        }
                                                        if (!TextUtils.isEmpty(c0646q04.q().Q())) {
                                                            boolean a10 = c0646q04.a();
                                                            SharedPreferences sharedPreferences2 = c0613f0.f11741c;
                                                            if (!(sharedPreferences2 == null ? false : sharedPreferences2.contains("deferred_analytics_collection")) && !c0615g.W()) {
                                                                c0613f0.S(!a10);
                                                            }
                                                            if (a10) {
                                                                C0646q0.k(s03);
                                                                s03.V();
                                                            }
                                                            t1 t1Var = c0646q04.f11914v;
                                                            C0646q0.k(t1Var);
                                                            t1Var.f11948e.H();
                                                            c0646q04.o().N(new AtomicReference());
                                                            c0646q04.o().O(c0613f0.f11740M.n());
                                                        }
                                                    }
                                                    zzql.zza();
                                                    if (c0615g.T(null, F.f11285Q0)) {
                                                        m12.J();
                                                        if (m12.e0() == 1) {
                                                            c0646q04.f11917y.getClass();
                                                            long max2 = Math.max(500L, ((((Integer) F.f11358x0.a(null)).intValue() * 1000) + new Random().nextInt(5000)) - SystemClock.elapsedRealtime());
                                                            if (max2 > 500) {
                                                                C0646q0.l(w18);
                                                                u15.b(Long.valueOf(max2), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                            }
                                                            C0646q0.k(s03);
                                                            s03.J();
                                                            if (s03.f11559z == null) {
                                                                s03.f11559z = new I0(s03, c0646q02, 0);
                                                            }
                                                            s03.f11559z.b(max2);
                                                        }
                                                    }
                                                    c0613f0.f11731C.b(true);
                                                    return;
                                                }
                                            }
                                            if (!TextUtils.isEmpty(c0646q04.q().Q()) && ((i10 = Q3.f11231b) == 0 || i10 == 30 || i10 == 10 || i10 == 40)) {
                                                C0646q0.k(s03);
                                                s03.e0(new C0(-10), false);
                                            }
                                            c02 = null;
                                            if (c02 != null) {
                                            }
                                            C0646q0.k(s03);
                                            s03.N(Q3);
                                            c0613f0.J();
                                            int i142 = C0639o.b(c0613f0.N().getString("dma_consent_settings", null)).f11858a;
                                            Y2 = c0615g.Y("google_analytics_default_allow_ad_personalization_signals", true);
                                            U u152 = w18.f11573B;
                                            if (Y2 != enumC0663z0) {
                                            }
                                            Y10 = c0615g.Y("google_analytics_default_allow_ad_user_data", true);
                                            if (Y10 == enumC0663z0) {
                                            }
                                            if (TextUtils.isEmpty(c0646q04.q().Q())) {
                                            }
                                            if (TextUtils.isEmpty(c0646q04.q().Q())) {
                                                C0639o c102 = C0639o.c(30, bundle);
                                                it = c102.f11862e.values().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                    }
                                                }
                                            }
                                            V7 = c0615g.V("google_analytics_tcf_data_enabled");
                                            c0646q0 = (C0646q0) s03.f3094a;
                                            if (V7 != null) {
                                            }
                                            C0646q0.l(w18);
                                            u13.a("TCF client enabled.");
                                            C0646q0.k(s03);
                                            s03.J();
                                            W w202 = c0646q0.f11912f;
                                            C0646q0.l(w202);
                                            w202.f11572A.a("Register tcfPrefChangeListener.");
                                            if (s03.f11547I == null) {
                                            }
                                            C0613f0 c0613f022 = c0646q0.f11911e;
                                            C0646q0.j(c0613f022);
                                            c0613f022.O().registerOnSharedPreferenceChangeListener(s03.f11547I);
                                            C0646q0.k(s03);
                                            s03.P();
                                            C0610e0 c0610e02 = c0613f0.f11744f;
                                            f4 = c0610e02.f();
                                            long j10 = c0646q04.f11906R;
                                            if (f4 == 0) {
                                            }
                                            C0646q0.k(s03);
                                            bVar = s03.f11544F;
                                            if (bVar.B()) {
                                                C0613f0 c0613f032 = ((C0646q0) bVar.f8929b).f11911e;
                                                C0646q0.j(c0613f032);
                                                c0613f032.f11739K.u(null);
                                            }
                                            if (c0646q04.h()) {
                                            }
                                            zzql.zza();
                                            if (c0615g.T(null, F.f11285Q0)) {
                                            }
                                            c0613f0.f11731C.b(true);
                                            return;
                                        }
                                        n8.f11475y = asList;
                                        if (packageManager2 == null) {
                                        }
                                        ((C0646q0) n8.f3094a).f11905Q.incrementAndGet();
                                        n8.f11371b = true;
                                        h10 = new H(c0646q04);
                                        h10.L();
                                        c0646q04.f11898I = h10;
                                        if (!h10.f11371b) {
                                        }
                                    }
                                }
                                asList = null;
                                if (asList != null) {
                                }
                                n8.f11475y = asList;
                                if (packageManager2 == null) {
                                }
                                ((C0646q0) n8.f3094a).f11905Q.incrementAndGet();
                                n8.f11371b = true;
                                h10 = new H(c0646q04);
                                h10.L();
                                c0646q04.f11898I = h10;
                                if (!h10.f11371b) {
                                }
                            }
                            valueOf = null;
                            if (valueOf != null) {
                            }
                            asList = null;
                            if (asList != null) {
                            }
                            n8.f11475y = asList;
                            if (packageManager2 == null) {
                            }
                            ((C0646q0) n8.f3094a).f11905Q.incrementAndGet();
                            n8.f11371b = true;
                            h10 = new H(c0646q04);
                            h10.L();
                            c0646q04.f11898I = h10;
                            if (!h10.f11371b) {
                            }
                        }
                    }
                    str10 = str11;
                    packageInfo = packageManager3.getPackageInfo(context.getPackageName(), 0);
                    if (packageInfo != null) {
                    }
                }
                packageManager = packageManager3;
                str5 = str10;
                str6 = str2;
                str4 = str6;
                i7 = Integer.MIN_VALUE;
                n8.f11467c = packageName;
                n8.f11470f = str5;
                n8.f11468d = str6;
                n8.f11469e = i7;
                n8.f11471u = str4;
                n8.f11472v = 0L;
                g = c0646q06.g();
                if (g == 0) {
                }
                n8.f11463B = "";
                b2 = D0.b(context, c0646q06.f11893D);
                if (!TextUtils.isEmpty(b2)) {
                }
                n8.f11463B = str9;
                if (g == 0) {
                }
                n8.f11475y = null;
                C0615g c0615g222 = c0646q06.f11910d;
                c0615g222.getClass();
                G.d("analytics.safelisted_events");
                U8 = c0615g222.U();
                C0646q0 c0646q0722 = (C0646q0) c0615g222.f3094a;
                if (U8 == null) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                asList = null;
                if (asList != null) {
                }
                n8.f11475y = asList;
                if (packageManager2 == null) {
                }
                ((C0646q0) n8.f3094a).f11905Q.incrementAndGet();
                n8.f11371b = true;
                h10 = new H(c0646q04);
                h10.L();
                c0646q04.f11898I = h10;
                if (!h10.f11371b) {
                }
                break;
            case 14:
                BinderC0657w0 binderC0657w0 = (BinderC0657w0) this.f3697c;
                binderC0657w0.f11980a.A();
                C0609e c0609e = (C0609e) this.f3696b;
                Object t5 = c0609e.f11713c.t();
                I1 i15 = binderC0657w0.f11980a;
                if (t5 == null) {
                    i15.getClass();
                    String str13 = c0609e.f11711a;
                    G.g(str13);
                    O1 O11 = i15.O(str13);
                    if (O11 != null) {
                        i15.Y(c0609e, O11);
                        return;
                    }
                    return;
                }
                i15.getClass();
                String str14 = c0609e.f11711a;
                G.g(str14);
                O1 O12 = i15.O(str14);
                if (O12 != null) {
                    i15.X(c0609e, O12);
                    return;
                }
                return;
            case 15:
                a();
                return;
            case 16:
                ((S0) this.f3697c).Z((Boolean) this.f3696b, true);
                return;
            case 17:
                b();
                return;
            case 18:
                S0 s04 = ((AppMeasurementDynamiteService) this.f3697c).f15154a.f11890A;
                C0646q0.k(s04);
                q3.l lVar = (q3.l) this.f3696b;
                s04.J();
                s04.K();
                E0 e02 = s04.f11551d;
                if (lVar != e02) {
                    G.i("EventInterceptor already set.", e02 == null);
                }
                s04.f11551d = lVar;
                return;
            case 19:
                c();
                return;
            case 20:
                d();
                return;
            case 21:
                e();
                return;
            case 22:
                ((ServiceConnectionC0629k1) this.f3697c).f11809c.U((ComponentName) this.f3696b);
                return;
            case 23:
                f();
                return;
            case 24:
                g();
                return;
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                h();
                return;
            case 26:
                i();
                return;
            case 27:
                j();
                return;
            case 28:
                k();
                return;
            default:
                I1.c cVar4 = ((SwipeDismissBehavior) this.f3697c).f15175a;
                if (cVar4 == null || !cVar4.f()) {
                    return;
                }
                WeakHashMap weakHashMap = K.f26642a;
                ((View) this.f3696b).postOnAnimation(this);
                return;
        }
    }

    public String toString() {
        switch (this.f3695a) {
            case 10:
                A0.G0 C2 = E6.b.C(this);
                A0.G0 g02 = new A0.G0(23, (char) 0);
                ((A0.G0) C2.f29d).f28c = g02;
                C2.f29d = g02;
                g02.f29d = (q3.c) this.f3697c;
                return C2.toString();
            default:
                return super.toString();
        }
    }
}
