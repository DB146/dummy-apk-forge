package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0990f {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private volatile O5.a zzB;
    private F5.b zzC;
    private boolean zzD;
    private volatile N zzE;
    U zza;
    final Handler zzb;
    protected InterfaceC0988d zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final AbstractC0996l zzn;
    private final F5.f zzo;
    private final Object zzp;
    private final Object zzq;
    private InterfaceC0999o zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private K zzu;
    private int zzv;
    private final InterfaceC0986b zzw;
    private final InterfaceC0987c zzx;
    private final int zzy;
    private final String zzz;
    private static final F5.d[] zze = new F5.d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    public AbstractC0990f(Context context, Looper looper, S s3, F5.f fVar, int i7, InterfaceC0986b interfaceC0986b, InterfaceC0987c interfaceC0987c, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        G.h(context, "Context must not be null");
        this.zzl = context;
        G.h(looper, "Looper must not be null");
        this.zzm = looper;
        G.h(s3, "Supervisor must not be null");
        this.zzn = s3;
        G.h(fVar, "API availability must not be null");
        this.zzo = fVar;
        this.zzb = new I(this, looper);
        this.zzy = i7;
        this.zzw = interfaceC0986b;
        this.zzx = interfaceC0987c;
        this.zzz = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC0990f(Context context, Looper looper, InterfaceC0986b interfaceC0986b, InterfaceC0987c interfaceC0987c, int i7) {
        this(context, looper, r3, r4, i7, interfaceC0986b, interfaceC0987c, null);
        S a9 = AbstractC0996l.a(context);
        F5.f fVar = F5.f.f4100b;
        G.g(interfaceC0986b);
        G.g(interfaceC0987c);
    }

    public static void zzj(AbstractC0990f abstractC0990f, N n6) {
        abstractC0990f.zzE = n6;
        if (abstractC0990f.usesClientTelemetry()) {
            C0993i c0993i = n6.f15036d;
            r b2 = r.b();
            C1002s c1002s = c0993i == null ? null : c0993i.f15067a;
            synchronized (b2) {
                if (c1002s == null) {
                    c1002s = r.f15105c;
                } else {
                    C1002s c1002s2 = (C1002s) b2.f15106a;
                    if (c1002s2 != null) {
                        if (c1002s2.f15107a < c1002s.f15107a) {
                        }
                    }
                }
                b2.f15106a = c1002s;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(AbstractC0990f abstractC0990f, int i7) {
        int i10;
        int i11;
        synchronized (abstractC0990f.zzp) {
            i10 = abstractC0990f.zzv;
        }
        if (i10 == 3) {
            abstractC0990f.zzD = true;
            i11 = 5;
        } else {
            i11 = 4;
        }
        Handler handler = abstractC0990f.zzb;
        handler.sendMessage(handler.obtainMessage(i11, abstractC0990f.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(AbstractC0990f abstractC0990f, int i7, int i10, IInterface iInterface) {
        synchronized (abstractC0990f.zzp) {
            try {
                if (abstractC0990f.zzv != i7) {
                    return false;
                }
                abstractC0990f.a(i10, iInterface);
                return true;
            } finally {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "set" is null
        	at java.base/java.util.BitSet.or(BitSet.java:943)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:759)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:838)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:711)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public static /* bridge */ /* synthetic */ boolean zzo(com.google.android.gms.common.internal.AbstractC0990f r2) {
        /*
            boolean r0 = r2.zzD
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.getServiceDescriptor()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.getLocalStartServiceAction()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.getServiceDescriptor()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC0990f.zzo(com.google.android.gms.common.internal.f):boolean");
    }

    public final void a(int i7, IInterface iInterface) {
        U u3;
        G.b((i7 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i7;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i7 == 1) {
                    K k = this.zzu;
                    if (k != null) {
                        AbstractC0996l abstractC0996l = this.zzn;
                        String str = this.zza.f15054a;
                        G.g(str);
                        String str2 = this.zza.f15055b;
                        zze();
                        abstractC0996l.c(str, str2, k, this.zza.f15056c);
                        this.zzu = null;
                    }
                } else if (i7 == 2 || i7 == 3) {
                    K k7 = this.zzu;
                    if (k7 != null && (u3 = this.zza) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + u3.f15054a + " on " + u3.f15055b);
                        AbstractC0996l abstractC0996l2 = this.zzn;
                        String str3 = this.zza.f15054a;
                        G.g(str3);
                        String str4 = this.zza.f15055b;
                        zze();
                        abstractC0996l2.c(str3, str4, k7, this.zza.f15056c);
                        this.zzd.incrementAndGet();
                    }
                    K k10 = new K(this, this.zzd.get());
                    this.zzu = k10;
                    U u10 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new U(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup()) : new U(getContext().getPackageName(), getLocalStartServiceAction(), false);
                    this.zza = u10;
                    if (u10.f15056c && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f15054a)));
                    }
                    AbstractC0996l abstractC0996l3 = this.zzn;
                    String str5 = this.zza.f15054a;
                    G.g(str5);
                    F5.b b2 = abstractC0996l3.b(new O(str5, this.zza.f15055b, this.zza.f15056c), k10, zze(), getBindServiceExecutor());
                    if (!(b2.f4088b == 0)) {
                        U u11 = this.zza;
                        Log.w("GmsClient", "unable to connect to service: " + u11.f15054a + " on " + u11.f15055b);
                        int i10 = b2.f4088b;
                        if (i10 == -1) {
                            i10 = 16;
                        }
                        if (b2.f4089c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, b2.f4089c);
                        }
                        zzl(i10, bundle, this.zzd.get());
                    }
                } else if (i7 == 4) {
                    G.g(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int d10 = this.zzo.d(this.zzl, getMinApkVersion());
        if (d10 == 0) {
            connect(new r(this));
        } else {
            a(1, null);
            triggerNotAvailable(new r(this), d10, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(InterfaceC0988d interfaceC0988d) {
        G.h(interfaceC0988d, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC0988d;
        a(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            try {
                int size = this.zzt.size();
                for (int i7 = 0; i7 < size; i7++) {
                    A a9 = (A) this.zzt.get(i7);
                    synchronized (a9) {
                        a9.f15015a = null;
                    }
                }
                this.zzt.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        a(1, null);
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i7;
        IInterface iInterface;
        InterfaceC0999o interfaceC0999o;
        synchronized (this.zzp) {
            i7 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            interfaceC0999o = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i7 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i7 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i7 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i7 == 4) {
            printWriter.print("CONNECTED");
        } else if (i7 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC0999o == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC0999o.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.zzh;
            append.println(j + " " + simpleDateFormat.format(new Date(j)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i10 = this.zzf;
            if (i10 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i10 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i10 != 3) {
                printWriter.append((CharSequence) String.valueOf(i10));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j10 = this.zzg;
            append2.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) h3.H.v(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j11 = this.zzj;
            append3.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public F5.d[] getApiFeatures() {
        return zze;
    }

    public O5.a getAttributionSourceWrapper() {
        return null;
    }

    public final F5.d[] getAvailableFeatures() {
        N n6 = this.zzE;
        if (n6 == null) {
            return null;
        }
        return n6.f15034b;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        U u3;
        if (!isConnected() || (u3 = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return u3.f15055b;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return F5.f.f4099a;
    }

    public void getRemoteService(InterfaceC0997m interfaceC0997m, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = Build.VERSION.SDK_INT < 31 ? this.zzA : this.zzA;
        int i7 = this.zzy;
        int i10 = F5.f.f4099a;
        Scope[] scopeArr = C0994j.f15073C;
        Bundle bundle = new Bundle();
        F5.d[] dVarArr = C0994j.f15074D;
        C0994j c0994j = new C0994j(6, i7, i10, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c0994j.f15080d = this.zzl.getPackageName();
        c0994j.f15083u = getServiceRequestExtraArgs;
        if (set != null) {
            c0994j.f15082f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            c0994j.f15084v = account;
            if (interfaceC0997m != null) {
                c0994j.f15081e = interfaceC0997m.asBinder();
            }
        } else if (requiresAccount()) {
            c0994j.f15084v = getAccount();
        }
        c0994j.f15085w = zze;
        c0994j.f15086x = getApiFeatures();
        if (usesClientTelemetry()) {
            c0994j.f15075A = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    InterfaceC0999o interfaceC0999o = this.zzr;
                    if (interfaceC0999o != null) {
                        ((C) interfaceC0999o).h(new J(this, this.zzd.get()), c0994j);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            triggerConnectionSuspended(3);
        } catch (RemoteException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            e = e12;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                IInterface iInterface2 = this.zzs;
                G.h(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                InterfaceC0999o interfaceC0999o = this.zzr;
                if (interfaceC0999o == null) {
                    return null;
                }
                return interfaceC0999o.asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public C0993i getTelemetryConfiguration() {
        N n6 = this.zzE;
        if (n6 == null) {
            return null;
        }
        return n6.f15036d;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z8;
        synchronized (this.zzp) {
            z8 = this.zzv == 4;
        }
        return z8;
    }

    public boolean isConnecting() {
        boolean z8;
        synchronized (this.zzp) {
            int i7 = this.zzv;
            z8 = true;
            if (i7 != 2 && i7 != 3) {
                z8 = false;
            }
        }
        return z8;
    }

    public void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(F5.b bVar) {
        this.zzi = bVar.f4088b;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i7) {
        this.zzf = i7;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i7, IBinder iBinder, Bundle bundle, int i10) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i10, -1, new L(this, i7, iBinder, bundle)));
    }

    public void onUserSignOut(InterfaceC0989e interfaceC0989e) {
        R7.b bVar = (R7.b) interfaceC0989e;
        ((com.google.android.gms.common.api.internal.E) bVar.f8929b).f14927p.f14987B.post(new B0.C(bVar, 28));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionSourceWrapper(O5.a aVar) {
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i7) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i7));
    }

    public void triggerNotAvailable(InterfaceC0988d interfaceC0988d, int i7, PendingIntent pendingIntent) {
        G.h(interfaceC0988d, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC0988d;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i7, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzl(int i7, Bundle bundle, int i10) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i10, -1, new M(this, i7, bundle)));
    }
}
