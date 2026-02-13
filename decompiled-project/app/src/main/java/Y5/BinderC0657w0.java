package Y5;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbn;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: Y5.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0657w0 extends zzbm implements I {

    /* renamed from: a, reason: collision with root package name */
    public final I1 f11980a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f11981b;

    /* renamed from: c, reason: collision with root package name */
    public String f11982c;

    public BinderC0657w0(I1 i12) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        com.google.android.gms.common.internal.G.g(i12);
        this.f11980a = i12;
        this.f11982c = null;
    }

    @Override // Y5.I
    public final void A(O1 o12) {
        com.google.android.gms.common.internal.G.d(o12.f11506a);
        com.google.android.gms.common.internal.G.g(o12.f11494G);
        h(new RunnableC0647r0(this, o12, 5, false));
    }

    @Override // Y5.I
    public final C0621i C(O1 o12) {
        F(o12);
        String str = o12.f11506a;
        com.google.android.gms.common.internal.G.d(str);
        I1 i12 = this.f11980a;
        try {
            return (C0621i) i12.c().R(new L7.r(this, o12)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            W b2 = i12.b();
            b2.f11577f.c("Failed to get consent. appId", W.R(str), e2);
            return new C0621i(null);
        }
    }

    @Override // Y5.I
    public final void D(O1 o12, B1 b12, M m10) {
        F(o12);
        String str = o12.f11506a;
        com.google.android.gms.common.internal.G.g(str);
        this.f11980a.c().S(new L7.i(this, str, b12, m10, 1, false));
    }

    public final void F(O1 o12) {
        com.google.android.gms.common.internal.G.g(o12);
        String str = o12.f11506a;
        com.google.android.gms.common.internal.G.d(str);
        G(str, false);
        this.f11980a.j0().N(o12.f11507b);
    }

    public final void G(String str, boolean z8) {
        boolean isEmpty = TextUtils.isEmpty(str);
        I1 i12 = this.f11980a;
        if (isEmpty) {
            i12.b().f11577f.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z8) {
            try {
                if (this.f11981b == null) {
                    boolean z10 = true;
                    if (!"com.google.android.gms".equals(this.f11982c) && !M5.c.g(i12.f11414z.f11907a, Binder.getCallingUid()) && !F5.i.b(i12.f11414z.f11907a).c(Binder.getCallingUid())) {
                        z10 = false;
                    }
                    this.f11981b = Boolean.valueOf(z10);
                }
                if (this.f11981b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e2) {
                i12.b().f11577f.b(W.R(str), "Measurement Service called with invalid calling package. appId");
                throw e2;
            }
        }
        if (this.f11982c == null) {
            Context context = i12.f11414z.f11907a;
            int callingUid = Binder.getCallingUid();
            int i7 = F5.h.f4105e;
            if (M5.c.j(callingUid, context, str)) {
                this.f11982c = str;
            }
        }
        if (str.equals(this.f11982c)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void H(Runnable runnable) {
        I1 i12 = this.f11980a;
        if (i12.c().P()) {
            runnable.run();
        } else {
            i12.c().S(runnable);
        }
    }

    @Override // Y5.I
    public final List a(String str, String str2, String str3, boolean z8) {
        G(str, true);
        I1 i12 = this.f11980a;
        try {
            List<L1> list = (List) i12.c().Q(new CallableC0651t0(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (L1 l12 : list) {
                if (!z8 && M1.h0(l12.f11443c)) {
                }
                arrayList.add(new K1(l12));
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            W b2 = i12.b();
            b2.f11577f.c("Failed to get user properties as. appId", W.R(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e10) {
            e = e10;
            W b22 = i12.b();
            b22.f11577f.c("Failed to get user properties as. appId", W.R(str), e);
            return Collections.emptyList();
        }
    }

    @Override // Y5.I
    public final void b(O1 o12) {
        F(o12);
        H(new RunnableC0647r0(this, o12, 0));
    }

    @Override // Y5.I
    public final List e(String str, String str2, boolean z8, O1 o12) {
        F(o12);
        String str3 = o12.f11506a;
        com.google.android.gms.common.internal.G.g(str3);
        I1 i12 = this.f11980a;
        try {
            List<L1> list = (List) i12.c().Q(new CallableC0651t0(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (L1 l12 : list) {
                if (!z8 && M1.h0(l12.f11443c)) {
                }
                arrayList.add(new K1(l12));
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            W b2 = i12.b();
            b2.f11577f.c("Failed to query user properties. appId", W.R(str3), e);
            return Collections.emptyList();
        } catch (ExecutionException e10) {
            e = e10;
            W b22 = i12.b();
            b22.f11577f.c("Failed to query user properties. appId", W.R(str3), e);
            return Collections.emptyList();
        }
    }

    @Override // Y5.I
    public final void f(K1 k12, O1 o12) {
        com.google.android.gms.common.internal.G.g(k12);
        F(o12);
        H(new C7.c(this, k12, o12));
    }

    public final void h(Runnable runnable) {
        I1 i12 = this.f11980a;
        if (i12.c().P()) {
            runnable.run();
        } else {
            i12.c().U(runnable);
        }
    }

    @Override // Y5.I
    public final void i(O1 o12) {
        String str = o12.f11506a;
        com.google.android.gms.common.internal.G.d(str);
        G(str, false);
        H(new RunnableC0647r0(this, o12, 3));
    }

    @Override // Y5.I
    public final void j(O1 o12) {
        F(o12);
        H(new RunnableC0647r0(this, o12, 1));
    }

    @Override // Y5.I
    public final void k(long j, String str, String str2, String str3) {
        H(new RunnableC0649s0(this, str2, str3, str, j));
    }

    @Override // Y5.I
    public final void l(O1 o12, Bundle bundle) {
        F(o12);
        String str = o12.f11506a;
        com.google.android.gms.common.internal.G.g(str);
        H(new L7.i(this, bundle, str, o12, 3, false));
    }

    @Override // Y5.I
    public final byte[] m(C0648s c0648s, String str) {
        com.google.android.gms.common.internal.G.d(str);
        com.google.android.gms.common.internal.G.g(c0648s);
        G(str, true);
        I1 i12 = this.f11980a;
        W b2 = i12.b();
        C0646q0 c0646q0 = i12.f11414z;
        Q q10 = c0646q0.f11916x;
        String str2 = c0648s.f11929a;
        b2.f11572A.b(q10.a(str2), "Log and bundle. event");
        ((M5.b) i12.e()).getClass();
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) i12.c().R(new L7.q(this, c0648s, str)).get();
            if (bArr == null) {
                i12.b().f11577f.b(W.R(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((M5.b) i12.e()).getClass();
            i12.b().f11572A.d("Log and bundle processed. event, size, time_ms", c0646q0.f11916x.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e2) {
            e = e2;
            W b10 = i12.b();
            b10.f11577f.d("Failed to log and bundle. appId, event, error", W.R(str), c0646q0.f11916x.a(str2), e);
            return null;
        } catch (ExecutionException e10) {
            e = e10;
            W b102 = i12.b();
            b102.f11577f.d("Failed to log and bundle. appId, event, error", W.R(str), c0646q0.f11916x.a(str2), e);
            return null;
        }
    }

    @Override // Y5.I
    public final void n(O1 o12) {
        com.google.android.gms.common.internal.G.d(o12.f11506a);
        com.google.android.gms.common.internal.G.g(o12.f11494G);
        h(new RunnableC0647r0(this, o12, 6, false));
    }

    @Override // Y5.I
    public final String p(O1 o12) {
        F(o12);
        I1 i12 = this.f11980a;
        try {
            return (String) i12.c().Q(new L7.r(i12, o12)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            W b2 = i12.b();
            b2.f11577f.c("Failed to get app instance id. appId", W.R(o12.f11506a), e2);
            return null;
        }
    }

    @Override // Y5.I
    public final List q(String str, String str2, O1 o12) {
        F(o12);
        String str3 = o12.f11506a;
        com.google.android.gms.common.internal.G.g(str3);
        I1 i12 = this.f11980a;
        try {
            return (List) i12.c().Q(new CallableC0651t0(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e2) {
            i12.b().f11577f.b(e2, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

    @Override // Y5.I
    public final void s(O1 o12, C0606d c0606d) {
        F(o12);
        H(new C7.c(this, o12, c0606d, 6, false));
    }

    @Override // Y5.I
    public final List t(String str, String str2, String str3) {
        G(str, true);
        I1 i12 = this.f11980a;
        try {
            return (List) i12.c().Q(new CallableC0651t0(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e2) {
            i12.b().f11577f.b(e2, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

    @Override // Y5.I
    public final void v(C0609e c0609e, O1 o12) {
        com.google.android.gms.common.internal.G.g(c0609e);
        com.google.android.gms.common.internal.G.g(c0609e.f11713c);
        F(o12);
        C0609e c0609e2 = new C0609e(c0609e);
        c0609e2.f11711a = o12.f11506a;
        H(new C7.c(this, c0609e2, o12));
    }

    @Override // Y5.I
    public final void w(O1 o12) {
        com.google.android.gms.common.internal.G.d(o12.f11506a);
        com.google.android.gms.common.internal.G.g(o12.f11494G);
        h(new RunnableC0647r0(this, o12, 4));
    }

    @Override // Y5.I
    public final void x(O1 o12, Bundle bundle, K k) {
        F(o12);
        String str = o12.f11506a;
        com.google.android.gms.common.internal.G.g(str);
        this.f11980a.c().S(new RunnableC0655v0(this, o12, bundle, k, str));
    }

    @Override // Y5.I
    public final void y(O1 o12) {
        F(o12);
        H(new RunnableC0647r0(this, o12, 2));
    }

    @Override // Y5.I
    public final void z(C0648s c0648s, O1 o12) {
        com.google.android.gms.common.internal.G.g(c0648s);
        F(o12);
        H(new C7.c(this, c0648s, o12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.google.android.gms.internal.measurement.zzbl] */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.google.android.gms.internal.measurement.zzbl] */
    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) {
        List emptyList;
        I1 i12 = this.f11980a;
        ArrayList arrayList = null;
        K k = null;
        M m10 = null;
        switch (i7) {
            case 1:
                C0648s c0648s = (C0648s) zzbn.zzb(parcel, C0648s.CREATOR);
                O1 o12 = (O1) zzbn.zzb(parcel, O1.CREATOR);
                zzbn.zzf(parcel);
                z(c0648s, o12);
                parcel2.writeNoException();
                return true;
            case 2:
                K1 k12 = (K1) zzbn.zzb(parcel, K1.CREATOR);
                O1 o13 = (O1) zzbn.zzb(parcel, O1.CREATOR);
                zzbn.zzf(parcel);
                f(k12, o13);
                parcel2.writeNoException();
                return true;
            case 3:
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                O1 o14 = (O1) zzbn.zzb(parcel, O1.CREATOR);
                zzbn.zzf(parcel);
                b(o14);
                parcel2.writeNoException();
                return true;
            case 5:
                C0648s c0648s2 = (C0648s) zzbn.zzb(parcel, C0648s.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                zzbn.zzf(parcel);
                com.google.android.gms.common.internal.G.g(c0648s2);
                com.google.android.gms.common.internal.G.d(readString);
                G(readString, true);
                H(new C7.c(this, c0648s2, readString, 4));
                parcel2.writeNoException();
                return true;
            case 6:
                O1 o15 = (O1) zzbn.zzb(parcel, O1.CREATOR);
                zzbn.zzf(parcel);
                y(o15);
                parcel2.writeNoException();
                return true;
            case 7:
                O1 o16 = (O1) zzbn.zzb(parcel, O1.CREATOR);
                boolean zza = zzbn.zza(parcel);
                zzbn.zzf(parcel);
                F(o16);
                String str = o16.f11506a;
                com.google.android.gms.common.internal.G.g(str);
                try {
                    List<L1> list = (List) i12.c().Q(new L7.r(3, this, str)).get();
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (L1 l12 : list) {
                        if (!zza && M1.h0(l12.f11443c)) {
                        }
                        arrayList2.add(new K1(l12));
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e2) {
                    e = e2;
                    i12.b().f11577f.c("Failed to get user properties. appId", W.R(str), e);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e10) {
                    e = e10;
                    i12.b().f11577f.c("Failed to get user properties. appId", W.R(str), e);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                C0648s c0648s3 = (C0648s) zzbn.zzb(parcel, C0648s.CREATOR);
                String readString2 = parcel.readString();
                zzbn.zzf(parcel);
                byte[] m11 = m(c0648s3, readString2);
                parcel2.writeNoException();
                parcel2.writeByteArray(m11);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                zzbn.zzf(parcel);
                k(readLong, readString3, readString4, readString5);
                parcel2.writeNoException();
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                O1 o17 = (O1) zzbn.zzb(parcel, O1.CREATOR);
                zzbn.zzf(parcel);
                String p10 = p(o17);
                parcel2.writeNoException();
                parcel2.writeString(p10);
                return true;
            case 12:
                C0609e c0609e = (C0609e) zzbn.zzb(parcel, C0609e.CREATOR);
                O1 o18 = (O1) zzbn.zzb(parcel, O1.CREATOR);
                zzbn.zzf(parcel);
                v(c0609e, o18);
                parcel2.writeNoException();
                return true;
            case 13:
                C0609e c0609e2 = (C0609e) zzbn.zzb(parcel, C0609e.CREATOR);
                zzbn.zzf(parcel);
                com.google.android.gms.common.internal.G.g(c0609e2);
                com.google.android.gms.common.internal.G.g(c0609e2.f11713c);
                com.google.android.gms.common.internal.G.d(c0609e2.f11711a);
                G(c0609e2.f11711a, true);
                H(new E5.k(14, this, new C0609e(c0609e2), false));
                parcel2.writeNoException();
                return true;
            case 14:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                boolean zza2 = zzbn.zza(parcel);
                O1 o19 = (O1) zzbn.zzb(parcel, O1.CREATOR);
                zzbn.zzf(parcel);
                List e11 = e(readString6, readString7, zza2, o19);
                parcel2.writeNoException();
                parcel2.writeTypedList(e11);
                return true;
            case 15:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                boolean zza3 = zzbn.zza(parcel);
                zzbn.zzf(parcel);
                List a9 = a(readString8, readString9, readString10, zza3);
                parcel2.writeNoException();
                parcel2.writeTypedList(a9);
                return true;
            case 16:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                O1 o110 = (O1) zzbn.zzb(parcel, O1.CREATOR);
                zzbn.zzf(parcel);
                List q10 = q(readString11, readString12, o110);
                parcel2.writeNoException();
                parcel2.writeTypedList(q10);
                return true;
            case 17:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                zzbn.zzf(parcel);
                List t5 = t(readString13, readString14, readString15);
                parcel2.writeNoException();
                parcel2.writeTypedList(t5);
                return true;
            case 18:
                O1 o111 = (O1) zzbn.zzb(parcel, O1.CREATOR);
                zzbn.zzf(parcel);
                i(o111);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
                O1 o112 = (O1) zzbn.zzb(parcel, O1.CREATOR);
                zzbn.zzf(parcel);
                l(o112, bundle);
                parcel2.writeNoException();
                return true;
            case 20:
                O1 o113 = (O1) zzbn.zzb(parcel, O1.CREATOR);
                zzbn.zzf(parcel);
                w(o113);
                parcel2.writeNoException();
                return true;
            case 21:
                O1 o114 = (O1) zzbn.zzb(parcel, O1.CREATOR);
                zzbn.zzf(parcel);
                C0621i C2 = C(o114);
                parcel2.writeNoException();
                if (C2 == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    C2.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                O1 o115 = (O1) zzbn.zzb(parcel, O1.CREATOR);
                Bundle bundle2 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
                zzbn.zzf(parcel);
                F(o115);
                String str2 = o115.f11506a;
                com.google.android.gms.common.internal.G.g(str2);
                if (i12.d0().T(null, F.f11301Y0)) {
                    try {
                        emptyList = (List) i12.c().R(new CallableC0653u0(this, o115, bundle2, 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e12) {
                        i12.b().f11577f.c("Failed to get trigger URIs. appId", W.R(str2), e12);
                        emptyList = Collections.emptyList();
                    }
                } else {
                    try {
                        emptyList = (List) i12.c().Q(new CallableC0653u0(this, o115, bundle2, 1)).get();
                    } catch (InterruptedException | ExecutionException e13) {
                        i12.b().f11577f.c("Failed to get trigger URIs. appId", W.R(str2), e13);
                        emptyList = Collections.emptyList();
                    }
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(emptyList);
                return true;
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                O1 o116 = (O1) zzbn.zzb(parcel, O1.CREATOR);
                zzbn.zzf(parcel);
                n(o116);
                parcel2.writeNoException();
                return true;
            case 26:
                O1 o117 = (O1) zzbn.zzb(parcel, O1.CREATOR);
                zzbn.zzf(parcel);
                A(o117);
                parcel2.writeNoException();
                return true;
            case 27:
                O1 o118 = (O1) zzbn.zzb(parcel, O1.CREATOR);
                zzbn.zzf(parcel);
                j(o118);
                parcel2.writeNoException();
                return true;
            case 29:
                O1 o119 = (O1) zzbn.zzb(parcel, O1.CREATOR);
                B1 b12 = (B1) zzbn.zzb(parcel, B1.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    m10 = queryLocalInterface instanceof M ? (M) queryLocalInterface : new zzbl(readStrongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                }
                zzbn.zzf(parcel);
                D(o119, b12, m10);
                parcel2.writeNoException();
                return true;
            case 30:
                O1 o120 = (O1) zzbn.zzb(parcel, O1.CREATOR);
                C0606d c0606d = (C0606d) zzbn.zzb(parcel, C0606d.CREATOR);
                zzbn.zzf(parcel);
                s(o120, c0606d);
                parcel2.writeNoException();
                return true;
            case 31:
                O1 o121 = (O1) zzbn.zzb(parcel, O1.CREATOR);
                Bundle bundle3 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    k = queryLocalInterface2 instanceof K ? (K) queryLocalInterface2 : new zzbl(readStrongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                }
                zzbn.zzf(parcel);
                x(o121, bundle3, k);
                parcel2.writeNoException();
                return true;
        }
    }
}
