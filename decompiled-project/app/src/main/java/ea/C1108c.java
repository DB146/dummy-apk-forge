package ea;

import A9.E1;
import Db.j;
import Eb.o;
import N6.F;
import N6.H;
import Y6.i;
import android.app.Application;
import android.content.Context;
import android.graphics.Insets;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzahk;
import com.google.android.gms.internal.p002firebaseauthapi.zzv;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.kt.apps.core.extensions.ExtensionsChannel;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.core.tv.viewmodels.BaseTVChannelViewModel;
import gb.q;
import hb.InterfaceC1269b;
import i.n;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import kb.EnumC1437b;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.v;
import l8.C1513b;
import m.AbstractC1519a;
import m.C1523e;
import n.MenuC1663A;
import n.MenuC1678l;
import o7.w;
import ob.m;
import org.json.JSONException;
import org.json.JSONObject;
import q1.C1876b;
import r4.C1931c;
import ra.C1953a;
import u.T;
import va.C;
import y1.AbstractC2377z;
import y1.K;
import y1.S;
import y7.u0;
import y9.G;
import za.C2606e;

/* renamed from: ea.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1108c implements InterfaceC1393d, Continuation, q, InterfaceC1394e, E1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16829a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16830b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16831c;

    public C1108c(int i7) {
        this.f16829a = i7;
        switch (i7) {
            case 7:
                this.f16831c = new HashMap();
                return;
            case 12:
                this.f16831c = new HashSet();
                return;
            default:
                this.f16831c = Collections.emptyList();
                this.f16830b = Collections.emptyList();
                return;
        }
    }

    public /* synthetic */ C1108c(int i7, Object obj, Object obj2) {
        this.f16829a = i7;
        this.f16831c = obj;
        this.f16830b = obj2;
    }

    public /* synthetic */ C1108c(int i7, Object obj, Object obj2, boolean z8) {
        this.f16829a = i7;
        this.f16830b = obj;
        this.f16831c = obj2;
    }

    public C1108c(i iVar) {
        this.f16829a = 6;
        this.f16830b = iVar;
    }

    public C1108c(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.f16829a = 19;
        lowerBound = bounds.getLowerBound();
        this.f16831c = C1876b.c(lowerBound);
        upperBound = bounds.getUpperBound();
        this.f16830b = C1876b.c(upperBound);
    }

    public C1108c(ha.g gVar) {
        this.f16829a = 13;
        int d10 = v7.g.d((Context) gVar.f17915b, "com.google.firebase.crashlytics.unity_version", "string");
        Context context = (Context) gVar.f17915b;
        if (d10 != 0) {
            this.f16831c = "Unity";
            String string = context.getResources().getString(d10);
            this.f16830b = string;
            String t5 = X.c.t("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", t5, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (open != null) {
                    open.close();
                }
                this.f16831c = "Flutter";
                this.f16830b = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.f16831c = null;
                this.f16830b = null;
            }
        }
        this.f16831c = null;
        this.f16830b = null;
    }

    public C1108c(Locale locale) {
        this.f16829a = 5;
        this.f16831c = locale;
        this.f16830b = DateFormatSymbols.getInstance(locale).getShortMonths();
        Calendar calendar = Calendar.getInstance(locale);
        int minimum = calendar.getMinimum(5);
        int maximum = calendar.getMaximum(5);
        String[] strArr = new String[(maximum - minimum) + 1];
        for (int i7 = minimum; i7 <= maximum; i7++) {
            strArr[i7 - minimum] = String.format("%02d", Integer.valueOf(i7));
        }
    }

    public void a() {
        String str = (String) this.f16831c;
        try {
            B7.d dVar = (B7.d) this.f16830b;
            dVar.getClass();
            new File((File) dVar.f2212c, str).createNewFile();
        } catch (IOException e2) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e2);
        }
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        switch (this.f16829a) {
            case 0:
                TVChannelLinkStream it = (TVChannelLinkStream) obj;
                l.e(it, "it");
                v vVar = (v) this.f16831c;
                Object obj2 = vVar.f19134a;
                if (obj2 != null) {
                    ArrayList u02 = o.u0(((TVChannelLinkStream) obj2).getLinkStream());
                    u02.addAll(it.getLinkStream());
                    it = new TVChannelLinkStream(it.getChannel(), u02);
                }
                ((BaseTVChannelViewModel) this.f16830b).markLastWatchedChannel(it);
                vVar.f19134a = it;
                return;
            case 1:
                TVChannelLinkStream it2 = (TVChannelLinkStream) obj;
                l.e(it2, "it");
                BaseTVChannelViewModel baseTVChannelViewModel = (BaseTVChannelViewModel) this.f16830b;
                baseTVChannelViewModel.markLastWatchedChannel(it2);
                baseTVChannelViewModel.getListProgramForChannel(it2.getChannel());
                baseTVChannelViewModel.enqueueInsertWatchNextTVChannel(it2.getChannel());
                baseTVChannelViewModel.get_tvWithLinkStreamLiveData().l(new G(it2));
                StringBuilder sb2 = new StringBuilder("play by deeplink result: {uri: ");
                Uri uri = (Uri) this.f16831c;
                sb2.append(uri);
                sb2.append(", channel: ");
                sb2.append(it2);
                sb2.append("}");
                String message = sb2.toString();
                l.e(message, "message");
                O9.a actionLogger = baseTVChannelViewModel.getActionLogger();
                String channelName = it2.getChannel().getTvChannelName();
                l.e(actionLogger, "<this>");
                l.e(channelName, "channelName");
                O3.c cVar = new O3.c(3);
                cVar.a(new j("uri", String.valueOf(uri)));
                cVar.a(new j("channel", channelName));
                cVar.b(new j[0]);
                ArrayList arrayList = cVar.f7466a;
                ((C1953a) actionLogger).a("PlayByDeepLink", com.bumptech.glide.c.f((j[]) arrayList.toArray(new j[arrayList.size()])));
                c2.q.t(baseTVChannelViewModel.getActionLogger(), it2.getChannel().getTvChannelName(), new j[0]);
                return;
            case 2:
                List it3 = (List) obj;
                l.e(it3, "it");
                String str = (String) this.f16831c;
                if (str == null || str.length() == 0 || it3.isEmpty()) {
                    return;
                }
                fa.b bVar = (fa.b) this.f16830b;
                ((WeakHashMap) bVar.f17033b.getValue()).put(str, it3);
                ((ConcurrentHashMap) bVar.f17034c.getValue()).put(str, Long.valueOf(System.currentTimeMillis()));
                return;
            default:
                String str2 = (String) obj;
                C c10 = (C) this.f16831c;
                if (c10.f10272P) {
                    return;
                }
                l.b(str2);
                int i7 = C.f25269v2;
                C.p1(c10, (ExtensionsChannel) this.f16830b, str2);
                return;
        }
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        W9.j it = (W9.j) obj;
        l.e(it, "it");
        U9.d y10 = ((wa.h) this.f16831c).f25841h.y();
        String streamLink = ((W9.j) this.f16830b).f10895b;
        y10.getClass();
        l.e(streamLink, "streamLink");
        return android.support.v4.media.session.b.k(y10.f9854a, true, new U9.c(streamLink, y10, 0));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.concurrent.atomic.AtomicReference, hb.b] */
    @Override // A9.E1
    public void b(int i7) {
        boolean z8 = C2606e.f28342J1;
        int a02 = o.a0(com.bumptech.glide.c.C().keySet(), 10994L);
        t tVar = (t) this.f16831c;
        C2606e c2606e = (C2606e) this.f16830b;
        if (i7 != a02) {
            Ba.h hVar = (Ba.h) c2606e.f28346D1.getValue();
            ?? r32 = hVar.j;
            if (r32 != 0) {
                r32.b();
            }
            hVar.c().l(new Object());
        } else if (tVar.f19132a != i7) {
            Ba.h.d((Ba.h) c2606e.f28346D1.getValue());
        }
        if (i7 != o.a0(com.bumptech.glide.c.C().keySet(), 10992L)) {
            wa.h hVar2 = (wa.h) c2606e.f28348F1.getValue();
            qb.b bVar = hVar2.j;
            if (bVar != null) {
                EnumC1437b.a(bVar);
            }
            hVar2.d().l(new Object());
        }
        if ((i7 == o.a0(com.bumptech.glide.c.C().keySet(), 10999L) || i7 == o.a0(com.bumptech.glide.c.C().keySet(), 10997L) || i7 == o.a0(com.bumptech.glide.c.C().keySet(), 10992L)) && tVar.f19132a != i7) {
            ((ta.c) c2606e.f28347E1.getValue()).cancelCurrentGetStreamLinkTask();
            ((ta.c) c2606e.f28347E1.getValue()).clearCurrentPlayingChannelState();
        }
        c2606e.C0(i7);
        tVar.f19132a = i7;
    }

    @Override // gb.q
    public void c(InterfaceC1269b interfaceC1269b) {
        switch (this.f16829a) {
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                EnumC1437b.f((nb.e) this.f16831c, interfaceC1269b);
                return;
            default:
                ((q) this.f16831c).c(interfaceC1269b);
                return;
        }
    }

    public void d(q4.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.f16831c;
        if (handler != null) {
            handler.post(new Aa.j(25, this, dVar));
        }
    }

    public File e() {
        if (((File) this.f16831c) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f16831c) == null) {
                        i iVar = (i) this.f16830b;
                        iVar.b();
                        this.f16831c = new File(iVar.f12041a.getFilesDir(), "PersistedInstallation." + ((i) this.f16830b).g() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f16831c;
    }

    public synchronized Map f() {
        try {
            if (((Map) this.f16830b) == null) {
                this.f16830b = Collections.unmodifiableMap(new HashMap((HashMap) this.f16831c));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f16830b;
    }

    public void g(C1513b c1513b) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c1513b.f19600a);
            jSONObject.put("Status", P.c.b(c1513b.f19601b));
            jSONObject.put("AuthToken", c1513b.f19602c);
            jSONObject.put("RefreshToken", c1513b.f19603d);
            jSONObject.put("TokenCreationEpochInSecs", c1513b.f19605f);
            jSONObject.put("ExpiresInSecs", c1513b.f19604e);
            jSONObject.put("FisError", c1513b.g);
            i iVar = (i) this.f16830b;
            iVar.b();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", iVar.f12041a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(e())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void h(AbstractC1519a abstractC1519a) {
        q3.i iVar = (q3.i) this.f16831c;
        ((ActionMode.Callback) iVar.f23382a).onDestroyActionMode(iVar.t(abstractC1519a));
        i.v vVar = (i.v) this.f16830b;
        if (vVar.f18121K != null) {
            vVar.f18160z.getDecorView().removeCallbacks(vVar.L);
        }
        if (vVar.f18120J != null) {
            S s3 = vVar.f18122M;
            if (s3 != null) {
                s3.b();
            }
            S a9 = K.a(vVar.f18120J);
            a9.a(0.0f);
            vVar.f18122M = a9;
            a9.d(new n(this, 2));
        }
        vVar.f18119I = null;
        ViewGroup viewGroup = vVar.f18125P;
        WeakHashMap weakHashMap = K.f26642a;
        AbstractC2377z.c(viewGroup);
        vVar.H();
    }

    public boolean i(AbstractC1519a abstractC1519a, MenuC1678l menuC1678l) {
        ViewGroup viewGroup = ((i.v) this.f16830b).f18125P;
        WeakHashMap weakHashMap = K.f26642a;
        AbstractC2377z.c(viewGroup);
        q3.i iVar = (q3.i) this.f16831c;
        C1523e t5 = iVar.t(abstractC1519a);
        T t10 = (T) iVar.f23385d;
        Menu menu = (Menu) t10.get(menuC1678l);
        if (menu == null) {
            menu = new MenuC1663A((Context) iVar.f23383b, menuC1678l);
            t10.put(menuC1678l, menu);
        }
        return ((ActionMode.Callback) iVar.f23382a).onPrepareActionMode(t5, menu);
    }

    public void j(Exception exc, boolean z8) {
        this.f16830b = null;
        HashSet hashSet = (HashSet) this.f16831c;
        H F10 = H.F(hashSet);
        hashSet.clear();
        F listIterator = F10.listIterator(0);
        while (listIterator.hasNext()) {
            C1931c c1931c = (C1931c) listIterator.next();
            c1931c.getClass();
            c1931c.i(z8 ? 1 : 3, exc);
        }
    }

    public C1513b k() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(e());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i7 = P.c.c(5)[optInt];
        if (i7 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i7 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new C1513b(optString, i7, optString2, optString3, optLong2, optLong, optString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // gb.q
    public void onError(Throwable th) {
        switch (this.f16829a) {
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                ((gb.g) this.f16830b).onError(th);
                return;
            default:
                ((q) this.f16831c).onError(th);
                return;
        }
    }

    @Override // gb.q
    public void onSuccess(Object obj) {
        switch (this.f16829a) {
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                ((gb.g) this.f16830b).onSuccess(obj);
                return;
            default:
                q qVar = (q) this.f16831c;
                try {
                    ((InterfaceC1393d) ((m) this.f16830b).f22236c).accept(obj);
                    qVar.onSuccess(obj);
                    return;
                } catch (Throwable th) {
                    u0.L(th);
                    qVar.onError(th);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            com.google.android.gms.common.internal.G.g(exception);
            String message = exception.getMessage();
            com.google.android.gms.common.internal.G.g(message);
            return Tasks.forException(new Exception(message));
        }
        zzahk zzahkVar = (zzahk) task.getResult();
        String zza = zzahkVar.zza();
        if (zzae.zzc(zza)) {
            return Tasks.forException(new Exception(X.c.t("No Recaptcha Enterprise siteKey configured for tenant/project ", (String) this.f16831c)));
        }
        List<String> zza2 = zzv.zza('/').zza((CharSequence) zza);
        String str = zza2.size() != 4 ? null : zza2.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception(X.c.t("Invalid siteKey format ", zza)));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + ((String) this.f16831c));
        }
        T6.a aVar = (T6.a) this.f16830b;
        w wVar = (w) aVar.f9325f;
        i iVar = (i) aVar.f9323d;
        iVar.b();
        Application application = (Application) iVar.f12041a;
        wVar.getClass();
        Task<RecaptchaTasksClient> fetchTaskClient = Recaptcha.fetchTaskClient(application, str);
        T6.a aVar2 = (T6.a) this.f16830b;
        String str2 = (String) this.f16831c;
        synchronized (aVar2.f9320a) {
            aVar2.f9322c = zzahkVar;
            ((HashMap) aVar2.f9321b).put(str2, fetchTaskClient);
        }
        return fetchTaskClient;
    }

    public String toString() {
        switch (this.f16829a) {
            case 19:
                return "Bounds{lower=" + ((C1876b) this.f16831c) + " upper=" + ((C1876b) this.f16830b) + "}";
            default:
                return super.toString();
        }
    }
}
