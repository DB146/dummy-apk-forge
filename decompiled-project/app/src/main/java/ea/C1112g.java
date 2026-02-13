package ea;

import Db.o;
import Eb.p;
import H2.r0;
import W1.C;
import W1.W;
import Y6.k;
import a3.C0723O;
import a5.C0776b;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.SpannableString;
import android.util.Log;
import com.google.android.gms.common.api.internal.G;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaem;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.internal.RecaptchaActivity;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.viewmodels.BaseTVChannelViewModel;
import com.kt.apps.core.utils.ActivityUtilsKt;
import fa.C1146a;
import gb.q;
import ha.i;
import hb.InterfaceC1269b;
import i1.C1290a;
import i9.C1350b;
import ib.C1360b;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import kb.EnumC1437b;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import l1.AbstractC1449a;
import l2.InterfaceC1479x;
import l2.c0;
import l2.d0;
import m5.C1622t;
import m5.InterfaceC1615l;
import m5.InterfaceC1616m;
import n5.AbstractC1705a;
import n5.D;
import o2.C1779a;
import o7.u;
import ob.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C1916a;
import v8.C2149c;
import v8.C2151e;
import va.C2157a;
import va.C2159c;
import y7.u0;
import y9.H;

/* renamed from: ea.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1112g implements InterfaceC1393d, InterfaceC1394e, a5.g, InterfaceC1615l, q, OnCompleteListener, gb.b, gb.g, SuccessContinuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16839a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16840b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16841c;

    public C1112g() {
        this.f16839a = 19;
        this.f16840b = new T7.h(0);
        this.f16841c = new T7.h(0);
    }

    public /* synthetic */ C1112g(int i7) {
        this.f16839a = i7;
    }

    public /* synthetic */ C1112g(int i7, Object obj, Object obj2) {
        this.f16839a = i7;
        this.f16840b = obj;
        this.f16841c = obj2;
    }

    public /* synthetic */ C1112g(int i7, Object obj, Object obj2, boolean z8) {
        this.f16839a = i7;
        this.f16841c = obj;
        this.f16840b = obj2;
    }

    public C1112g(Context context) {
        this.f16839a = 6;
        C0723O c0723o = new C0723O();
        this.f16840b = context.getApplicationContext();
        this.f16841c = c0723o;
    }

    public C1112g(C1350b c1350b) {
        this.f16839a = 4;
        this.f16840b = new C1350b(c1350b);
        this.f16841c = new r0[(c1350b.f18471i - c1350b.f18470h) + 1];
    }

    public C1112g(InterfaceC1479x interfaceC1479x, d0 store) {
        this.f16839a = 11;
        this.f16840b = interfaceC1479x;
        W w10 = r2.c.f23651c;
        l.e(store, "store");
        this.f16841c = (r2.c) new c0(store, w10, C1779a.f21662b).a(w.a(r2.c.class));
    }

    @Override // gb.b
    public void a() {
        switch (this.f16839a) {
            case 9:
                m mVar = (m) this.f16841c;
                mVar.getClass();
                ((q) this.f16840b).onSuccess((h3.w) mVar.f22236c);
                return;
            default:
                ((gb.g) this.f16841c).a();
                return;
        }
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        switch (this.f16839a) {
            case 0:
                Throwable it = (Throwable) obj;
                l.e(it, "it");
                BaseTVChannelViewModel t5 = (BaseTVChannelViewModel) this.f16840b;
                l.e(t5, "t");
                BaseTVChannelViewModel.access$get_programmeForChannelLiveData(t5).l(new H(BaseTVChannelViewModel.access$toDefaultProgramme(t5, (TVChannel) this.f16841c)));
                A3.c.r(it, BaseTVChannelViewModel.access$get_listProgramForChannel(t5));
                return;
            default:
                l.e((List) obj, "it");
                C2159c c2159c = (C2159c) this.f16840b;
                if (!c2159c.K() || c2159c.f10272P || c2159c.A() == null) {
                    return;
                }
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f16841c;
                if (atomicBoolean.get()) {
                    return;
                }
                atomicBoolean.set(true);
                c2159c.f25311G0.invoke();
                c2159c.C0.a();
                C2159c c2159c2 = (C2159c) this.f16840b;
                ActivityUtilsKt.showSuccessDialog$default((C) c2159c2, (Rb.a) new C2157a(c2159c2, 1), "Cập nhật nguồn kênh thành công", (Integer) null, false, 12, (Object) null);
                return;
        }
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        switch (this.f16839a) {
            case 1:
                N9.a it = (N9.a) obj;
                l.e(it, "it");
                String.valueOf(it);
                C1146a t5 = (C1146a) this.f16840b;
                l.e(t5, "t");
                String str = it.f7391c;
                String str2 = it.f7392d;
                String str3 = it.f7393e;
                String str4 = it.f7394f;
                String str5 = it.f7395u;
                String str6 = it.f7396v;
                return new N9.a((String) this.f16841c, it.f7390b, str, str2, str3, str4, str5, str6);
            default:
                List<W9.g> it2 = (List) obj;
                l.e(it2, "it");
                ArrayList arrayList = new ArrayList(p.S(it2, 10));
                for (W9.g gVar : it2) {
                    W9.e eVar = gVar.f10886a;
                    o oVar = i.f17917e;
                    String f4 = eVar.f();
                    ArrayList arrayList2 = (ArrayList) this.f16840b;
                    SpannableString b2 = ha.f.b(f4, arrayList2);
                    W9.e eVar2 = gVar.f10886a;
                    String f10 = eVar2.f();
                    v vVar = (v) this.f16841c;
                    arrayList.add(new ha.d(eVar, gVar.f10887b, b2, ha.f.a(eVar2.g(), (String) vVar.f19134a, arrayList2, 95) + ha.f.a(f10, (String) vVar.f19134a, arrayList2, 95)));
                }
                return arrayList;
        }
    }

    @Override // a5.g
    public int b(long j) {
        long[] jArr = (long[]) this.f16841c;
        int b2 = D.b(jArr, j, false);
        if (b2 < jArr.length) {
            return b2;
        }
        return -1;
    }

    @Override // gb.q
    public void c(InterfaceC1269b interfaceC1269b) {
        switch (this.f16839a) {
            case 7:
                EnumC1437b.f((AtomicReference) this.f16840b, interfaceC1269b);
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
            case 12:
            default:
                ((q) this.f16840b).c(interfaceC1269b);
                return;
            case 9:
                ((q) this.f16840b).c(interfaceC1269b);
                return;
            case 10:
                EnumC1437b.f((nb.e) this.f16840b, interfaceC1269b);
                return;
            case 13:
                ((q) this.f16840b).c(interfaceC1269b);
                return;
        }
    }

    @Override // a5.g
    public long d(int i7) {
        AbstractC1705a.h(i7 >= 0);
        long[] jArr = (long[]) this.f16841c;
        AbstractC1705a.h(i7 < jArr.length);
        return jArr[i7];
    }

    @Override // m5.InterfaceC1615l
    public InterfaceC1616m e() {
        return new C1622t((Context) this.f16840b, ((C0723O) this.f16841c).e());
    }

    public void f(String str, PrintWriter printWriter) {
        r2.c cVar = (r2.c) this.f16841c;
        if (cVar.f23652a.f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i7 = 0; i7 < cVar.f23652a.f(); i7++) {
                C1916a c1916a = (C1916a) cVar.f23652a.g(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(cVar.f23652a.d(i7));
                printWriter.print(": ");
                printWriter.println(c1916a.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(c1916a.f23646l);
                D5.d dVar = c1916a.f23646l;
                String str3 = str2 + "  ";
                dVar.getClass();
                printWriter.print(str3);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println(dVar.f3241a);
                if (dVar.f3242b || dVar.f3245e) {
                    printWriter.print(str3);
                    printWriter.print("mStarted=");
                    printWriter.print(dVar.f3242b);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(dVar.f3245e);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (dVar.f3243c || dVar.f3244d) {
                    printWriter.print(str3);
                    printWriter.print("mAbandoned=");
                    printWriter.print(dVar.f3243c);
                    printWriter.print(" mReset=");
                    printWriter.println(dVar.f3244d);
                }
                if (dVar.g != null) {
                    printWriter.print(str3);
                    printWriter.print("mTask=");
                    printWriter.print(dVar.g);
                    printWriter.print(" waiting=");
                    dVar.g.getClass();
                    printWriter.println(false);
                }
                if (dVar.f3247h != null) {
                    printWriter.print(str3);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(dVar.f3247h);
                    printWriter.print(" waiting=");
                    dVar.f3247h.getClass();
                    printWriter.println(false);
                }
                if (c1916a.f23648n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(c1916a.f23648n);
                    r2.b bVar = c1916a.f23648n;
                    bVar.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bVar.f23650b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                D5.d dVar2 = c1916a.f23646l;
                Object d10 = c1916a.d();
                dVar2.getClass();
                StringBuilder sb2 = new StringBuilder(64);
                if (d10 == null) {
                    sb2.append("null");
                } else {
                    Class<?> cls = d10.getClass();
                    sb2.append(cls.getSimpleName());
                    sb2.append("{");
                    sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                    sb2.append("}");
                }
                printWriter.println(sb2.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(c1916a.f19162c > 0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[Catch: JSONException -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {JSONException -> 0x003a, blocks: (B:5:0x0014, B:7:0x002a, B:8:0x003d, B:13:0x0057, B:22:0x006d, B:24:0x0076, B:26:0x0080, B:28:0x0084, B:30:0x009a, B:31:0x00a1, B:34:0x00a2, B:35:0x00a9, B:37:0x00aa, B:38:0x00b1), top: B:4:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[Catch: JSONException -> 0x003a, TryCatch #1 {JSONException -> 0x003a, blocks: (B:5:0x0014, B:7:0x002a, B:8:0x003d, B:13:0x0057, B:22:0x006d, B:24:0x0076, B:26:0x0080, B:28:0x0084, B:30:0x009a, B:31:0x00a1, B:34:0x00a2, B:35:0x00a9, B:37:0x00aa, B:38:0x00b1), top: B:4:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2, types: [y8.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y8.d g(C2151e c2151e) {
        String string;
        JSONArray jSONArray = c2151e.g;
        long j = c2151e.f25215f;
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i7);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String optString = jSONArray2.optString(0, "");
                C2151e c10 = ((C2149c) this.f16840b).c();
                String str = null;
                if (c10 != null) {
                    try {
                        string = c10.f25211b.getString(optString);
                    } catch (JSONException unused) {
                    }
                    if (string == null) {
                        C2151e c11 = ((C2149c) this.f16841c).c();
                        if (c11 != null) {
                            try {
                                str = c11.f25211b.getString(optString);
                            } catch (JSONException unused2) {
                            }
                        }
                        string = str != null ? str : "";
                    }
                    int i10 = y8.e.f27430a;
                    ?? obj = new Object();
                    if (string2 != null) {
                        throw new NullPointerException("Null rolloutId");
                    }
                    obj.f27418a = string2;
                    String string3 = jSONObject.getString("variantId");
                    if (string3 == null) {
                        throw new NullPointerException("Null variantId");
                    }
                    obj.f27419b = string3;
                    if (optString == null) {
                        throw new NullPointerException("Null parameterKey");
                    }
                    obj.f27420c = optString;
                    obj.f27421d = string;
                    obj.f27422e = j;
                    obj.f27423f = (byte) (obj.f27423f | 1);
                    hashSet.add(obj.a());
                }
                string = null;
                if (string == null) {
                }
                int i102 = y8.e.f27430a;
                ?? obj2 = new Object();
                if (string2 != null) {
                }
            } catch (JSONException e2) {
                throw new k("Exception parsing rollouts metadata to create RolloutsState.", e2);
            }
        }
        return new y8.d(hashSet);
    }

    public r0 h(int i7) {
        r0 r0Var;
        r0 r0Var2;
        r0[] r0VarArr = (r0[]) this.f16841c;
        r0 r0Var3 = r0VarArr[i(i7)];
        if (r0Var3 != null) {
            return r0Var3;
        }
        for (int i10 = 1; i10 < 5; i10++) {
            int i11 = i(i7) - i10;
            if (i11 >= 0 && (r0Var2 = r0VarArr[i11]) != null) {
                return r0Var2;
            }
            int i12 = i(i7) + i10;
            if (i12 < r0VarArr.length && (r0Var = r0VarArr[i12]) != null) {
                return r0Var;
            }
        }
        return null;
    }

    public int i(int i7) {
        return i7 - ((C1350b) this.f16840b).f18470h;
    }

    @Override // a5.g
    public List j(long j) {
        C0776b c0776b;
        int e2 = D.e((long[]) this.f16841c, j, false);
        return (e2 == -1 || (c0776b = ((C0776b[]) this.f16840b)[e2]) == C0776b.f12708F) ? Collections.emptyList() : Collections.singletonList(c0776b);
    }

    @Override // a5.g
    public int o() {
        return ((long[]) this.f16841c).length;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        u uVar = RecaptchaActivity.f15850P;
        Intent intent = new Intent("android.intent.action.VIEW");
        RecaptchaActivity recaptchaActivity = (RecaptchaActivity) this.f16840b;
        ResolveInfo resolveActivity = recaptchaActivity.getPackageManager().resolveActivity(intent, 0);
        String str = (String) this.f16841c;
        if (resolveActivity == null) {
            Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            zzaem.zzb(recaptchaActivity, str);
            return;
        }
        List<ResolveInfo> queryIntentServices = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            Intent intent2 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
            intent2.putExtra("com.android.browser.application_id", str);
            intent2.addFlags(1073741824);
            intent2.addFlags(268435456);
            recaptchaActivity.startActivity(intent2);
            return;
        }
        Intent intent3 = (Intent) new P3.p(7).b().f22101b;
        intent3.addFlags(1073741824);
        intent3.addFlags(268435456);
        intent3.setData((Uri) task.getResult());
        AbstractC1449a.startActivity(recaptchaActivity, intent3, null);
    }

    @Override // gb.q
    public void onError(Throwable th) {
        Object apply;
        switch (this.f16839a) {
            case 7:
                ((q) this.f16841c).onError(th);
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
            case 12:
            default:
                tb.f fVar = (tb.f) this.f16841c;
                InterfaceC1394e interfaceC1394e = fVar.f24538b;
                q qVar = (q) this.f16840b;
                if (interfaceC1394e != null) {
                    try {
                        apply = interfaceC1394e.apply(th);
                    } catch (Throwable th2) {
                        u0.L(th2);
                        qVar.onError(new C1360b(th, th2));
                        return;
                    }
                } else {
                    apply = fVar.f24539c;
                }
                if (apply != null) {
                    qVar.onSuccess(apply);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                qVar.onError(nullPointerException);
                return;
            case 9:
                ((q) this.f16840b).onError(th);
                return;
            case 10:
                ((gb.g) this.f16841c).onError(th);
                return;
            case 13:
                try {
                    ((tb.b) this.f16841c).getClass();
                    ha.f.f17908b.accept(th);
                } catch (Throwable th3) {
                    u0.L(th3);
                    th = new C1360b(th, th3);
                }
                ((q) this.f16840b).onError(th);
                return;
        }
    }

    @Override // gb.q
    public void onSuccess(Object obj) {
        switch (this.f16839a) {
            case 7:
                ((q) this.f16841c).onSuccess(obj);
                return;
            case 10:
                ((gb.g) this.f16841c).onSuccess(obj);
                return;
            case 13:
                ((q) this.f16840b).onSuccess(obj);
                return;
            default:
                ((q) this.f16840b).onSuccess(obj);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean booleanValue = bool.booleanValue();
        v7.l lVar = (v7.l) this.f16841c;
        if (booleanValue) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean booleanValue2 = bool.booleanValue();
            G g = lVar.f25129b;
            if (!booleanValue2) {
                g.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            }
            ((TaskCompletionSource) g.f14935f).trySetResult(null);
            return ((Task) this.f16840b).onSuccessTask(lVar.f25132e.f25819a, new C1290a(this, 24));
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        Iterator it = B7.d.e(((File) lVar.g.f2212c).listFiles(v7.l.f25126r)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        B7.d dVar = ((B7.b) lVar.f25137m.f21464b).f2206b;
        B7.b.a(B7.d.e(((File) dVar.f2214e).listFiles()));
        B7.b.a(B7.d.e(((File) dVar.f2215f).listFiles()));
        B7.b.a(B7.d.e(((File) dVar.g).listFiles()));
        lVar.f25141q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f16839a) {
            case 4:
                Formatter formatter = new Formatter();
                try {
                    int i7 = 0;
                    for (r0 r0Var : (r0[]) this.f16841c) {
                        if (r0Var == null) {
                            formatter.format("%3d:    |   %n", Integer.valueOf(i7));
                            i7++;
                        } else {
                            formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i7), Integer.valueOf(r0Var.f4797f), Integer.valueOf(r0Var.f4796e));
                            i7++;
                        }
                    }
                    String formatter2 = formatter.toString();
                    formatter.close();
                    return formatter2;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            formatter.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((InterfaceC1479x) this.f16840b).getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
