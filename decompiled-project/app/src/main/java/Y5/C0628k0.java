package Y5;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfd;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfg;
import com.google.android.gms.internal.measurement.zzfh;
import com.google.android.gms.internal.measurement.zzfm;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzgt;
import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzja;
import com.google.android.gms.internal.measurement.zzmq;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import u.C2052e;

/* renamed from: Y5.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0628k0 extends D1 implements InterfaceC0612f {

    /* renamed from: A, reason: collision with root package name */
    public final C2052e f11796A;

    /* renamed from: B, reason: collision with root package name */
    public final C2052e f11797B;

    /* renamed from: d, reason: collision with root package name */
    public final C2052e f11798d;

    /* renamed from: e, reason: collision with root package name */
    public final C2052e f11799e;

    /* renamed from: f, reason: collision with root package name */
    public final C2052e f11800f;

    /* renamed from: u, reason: collision with root package name */
    public final C2052e f11801u;

    /* renamed from: v, reason: collision with root package name */
    public final C2052e f11802v;

    /* renamed from: w, reason: collision with root package name */
    public final C2052e f11803w;

    /* renamed from: x, reason: collision with root package name */
    public final C0622i0 f11804x;

    /* renamed from: y, reason: collision with root package name */
    public final R7.b f11805y;

    /* renamed from: z, reason: collision with root package name */
    public final C2052e f11806z;

    /* JADX WARN: Type inference failed for: r2v1, types: [u.T, u.e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [u.T, u.e] */
    /* JADX WARN: Type inference failed for: r2v3, types: [u.T, u.e] */
    /* JADX WARN: Type inference failed for: r2v4, types: [u.T, u.e] */
    /* JADX WARN: Type inference failed for: r2v5, types: [u.T, u.e] */
    /* JADX WARN: Type inference failed for: r2v6, types: [u.T, u.e] */
    /* JADX WARN: Type inference failed for: r2v7, types: [u.T, u.e] */
    /* JADX WARN: Type inference failed for: r2v8, types: [u.T, u.e] */
    /* JADX WARN: Type inference failed for: r2v9, types: [u.T, u.e] */
    public C0628k0(I1 i12) {
        super(i12);
        this.f11798d = new u.T(0);
        this.f11799e = new u.T(0);
        this.f11800f = new u.T(0);
        this.f11801u = new u.T(0);
        this.f11802v = new u.T(0);
        this.f11806z = new u.T(0);
        this.f11796A = new u.T(0);
        this.f11797B = new u.T(0);
        this.f11803w = new u.T(0);
        this.f11804x = new C0622i0(this);
        this.f11805y = new R7.b(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [u.T, u.e] */
    public static final C2052e T(zzgl zzglVar) {
        ?? t5 = new u.T(0);
        if (zzglVar != null) {
            for (zzgt zzgtVar : zzglVar.zze()) {
                t5.put(zzgtVar.zza(), zzgtVar.zzb());
            }
        }
        return t5;
    }

    public static final B0 U(int i7) {
        int i10 = i7 - 1;
        if (i10 == 1) {
            return B0.AD_STORAGE;
        }
        if (i10 == 2) {
            return B0.ANALYTICS_STORAGE;
        }
        if (i10 == 3) {
            return B0.AD_USER_DATA;
        }
        if (i10 != 4) {
            return null;
        }
        return B0.AD_PERSONALIZATION;
    }

    @Override // Y5.D1
    public final void M() {
    }

    public final EnumC0663z0 N(String str, B0 b02) {
        J();
        P(str);
        zzgf e02 = e0(str);
        EnumC0663z0 enumC0663z0 = EnumC0663z0.UNINITIALIZED;
        if (e02 == null) {
            return enumC0663z0;
        }
        for (zzfu zzfuVar : e02.zzf()) {
            if (U(zzfuVar.zzb()) == b02) {
                int zzc = zzfuVar.zzc() - 1;
                return zzc != 1 ? zzc != 2 ? enumC0663z0 : EnumC0663z0.DENIED : EnumC0663z0.GRANTED;
            }
        }
        return enumC0663z0;
    }

    public final boolean O(String str) {
        J();
        P(str);
        zzgf e02 = e0(str);
        if (e02 == null) {
            return false;
        }
        for (zzfu zzfuVar : e02.zza()) {
            if (zzfuVar.zzb() == 3 && zzfuVar.zzd() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void P(String str) {
        K();
        J();
        com.google.android.gms.common.internal.G.d(str);
        C2052e c2052e = this.f11802v;
        if (c2052e.get(str) == null) {
            C0633m c0633m = this.f12021b.f11405c;
            I1.S(c0633m);
            Q7.h R02 = c0633m.R0(str);
            C2052e c2052e2 = this.f11797B;
            C2052e c2052e3 = this.f11796A;
            C2052e c2052e4 = this.f11806z;
            C2052e c2052e5 = this.f11798d;
            if (R02 != null) {
                zzgk zzgkVar = (zzgk) S(str, (byte[]) R02.f8695b).zzcl();
                Q(str, zzgkVar);
                c2052e5.put(str, T((zzgl) zzgkVar.zzbc()));
                c2052e.put(str, (zzgl) zzgkVar.zzbc());
                R(str, (zzgl) zzgkVar.zzbc());
                c2052e4.put(str, zzgkVar.zzh());
                c2052e3.put(str, (String) R02.f8696c);
                c2052e2.put(str, (String) R02.f8697d);
                return;
            }
            c2052e5.put(str, null);
            this.f11800f.put(str, null);
            this.f11799e.put(str, null);
            this.f11801u.put(str, null);
            c2052e.put(str, null);
            c2052e4.put(str, null);
            c2052e3.put(str, null);
            c2052e2.put(str, null);
            this.f11803w.put(str, null);
        }
    }

    public final void Q(String str, zzgk zzgkVar) {
        HashSet hashSet = new HashSet();
        u.T t5 = new u.T(0);
        u.T t10 = new u.T(0);
        u.T t11 = new u.T(0);
        Iterator it = zzgkVar.zzg().iterator();
        while (it.hasNext()) {
            hashSet.add(((zzgh) it.next()).zza());
        }
        for (int i7 = 0; i7 < zzgkVar.zza(); i7++) {
            zzgi zzgiVar = (zzgi) zzgkVar.zzb(i7).zzcl();
            boolean isEmpty = zzgiVar.zza().isEmpty();
            C0646q0 c0646q0 = (C0646q0) this.f3094a;
            if (isEmpty) {
                W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                w10.f11580w.a("EventConfig contained null event name");
            } else {
                String zza = zzgiVar.zza();
                String g = D0.g(zzgiVar.zza(), D0.f11235a, D0.f11237c);
                if (!TextUtils.isEmpty(g)) {
                    zzgiVar.zzb(g);
                    zzgkVar.zzc(i7, zzgiVar);
                }
                if (zzgiVar.zzc() && zzgiVar.zzd()) {
                    t5.put(zza, Boolean.TRUE);
                }
                if (zzgiVar.zze() && zzgiVar.zzf()) {
                    t10.put(zzgiVar.zza(), Boolean.TRUE);
                }
                if (zzgiVar.zzg()) {
                    if (zzgiVar.zzh() < 2 || zzgiVar.zzh() > 65535) {
                        W w11 = c0646q0.f11912f;
                        C0646q0.l(w11);
                        w11.f11580w.c("Invalid sampling rate. Event name, sample rate", zzgiVar.zza(), Integer.valueOf(zzgiVar.zzh()));
                    } else {
                        t11.put(zzgiVar.zza(), Integer.valueOf(zzgiVar.zzh()));
                    }
                }
            }
        }
        this.f11799e.put(str, hashSet);
        this.f11800f.put(str, t5);
        this.f11801u.put(str, t10);
        this.f11803w.put(str, t11);
    }

    public final void R(String str, zzgl zzglVar) {
        int zzj = zzglVar.zzj();
        C0622i0 c0622i0 = this.f11804x;
        if (zzj == 0) {
            c0622i0.remove(str);
            return;
        }
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        W w10 = c0646q0.f11912f;
        C0646q0.l(w10);
        w10.f11573B.b(Integer.valueOf(zzglVar.zzj()), "EES programs found");
        zzja zzjaVar = (zzja) zzglVar.zzi().get(0);
        try {
            zzc zzcVar = new zzc();
            zzcVar.zza("internal.remoteConfig", new CallableC0625j0(this, str, 2));
            zzcVar.zza("internal.appMetadata", new CallableC0625j0(this, str, 0));
            zzcVar.zza("internal.logger", new L7.q(this, 1));
            zzcVar.zzf(zzjaVar);
            c0622i0.put(str, zzcVar);
            C0646q0.l(w10);
            U u3 = w10.f11573B;
            u3.c("EES program loaded for appId, activities", str, Integer.valueOf(zzjaVar.zzb().zzb()));
            for (zziy zziyVar : zzjaVar.zzb().zza()) {
                C0646q0.l(w10);
                u3.b(zziyVar.zza(), "EES program activity");
            }
        } catch (zzd unused) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11577f.b(str, "Failed to load EES program. appId");
        }
    }

    public final zzgl S(String str, byte[] bArr) {
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (bArr == null) {
            return zzgl.zzs();
        }
        try {
            zzgl zzglVar = (zzgl) ((zzgk) C0598a0.w0(zzgl.zzr(), bArr)).zzbc();
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11573B.c("Parsed config. version, gmp_app_id", zzglVar.zza() ? Long.valueOf(zzglVar.zzb()) : null, zzglVar.zzc() ? zzglVar.zzd() : null);
            return zzglVar;
        } catch (zzmq e2) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11580w.c("Unable to merge remote config. appId", W.R(str), e2);
            return zzgl.zzs();
        } catch (RuntimeException e10) {
            W w12 = c0646q0.f11912f;
            C0646q0.l(w12);
            w12.f11580w.c("Unable to merge remote config. appId", W.R(str), e10);
            return zzgl.zzs();
        }
    }

    public final zzgl V(String str) {
        K();
        J();
        com.google.android.gms.common.internal.G.d(str);
        P(str);
        return (zzgl) this.f11802v.get(str);
    }

    public final String W(String str) {
        J();
        P(str);
        return (String) this.f11806z.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0317, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0318, code lost:
    
        r1 = r5.f11912f;
        Y5.C0646q0.l(r1);
        r1.f11577f.c("Error storing event filter. appId", Y5.W.R(r27), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0402, code lost:
    
        r9.K();
        r9.J();
        com.google.android.gms.common.internal.G.d(r27);
        r0 = r9.A0();
        r3 = r21;
        r0.delete("property_filters", r3, new java.lang.String[]{r27, java.lang.String.valueOf(r6)});
        r0.delete("event_filters", r3, new java.lang.String[]{r27, java.lang.String.valueOf(r6)});
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0429, code lost:
    
        r3 = r22;
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02e8, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02cc, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0277, code lost:
    
        r0 = r5.f11912f;
        Y5.C0646q0.l(r0);
        r0 = r0.f11580w;
        r4 = Y5.W.R(r27);
        r5 = java.lang.Integer.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x028c, code lost:
    
        if (r8.zza() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x028e, code lost:
    
        r7 = java.lang.Integer.valueOf(r8.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0298, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r4, r5, java.lang.String.valueOf(r7));
        r24 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0297, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x032a, code lost:
    
        r24 = r1;
        r0 = r0.zzc().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0338, code lost:
    
        if (r0.hasNext() == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x033a, code lost:
    
        r1 = (com.google.android.gms.internal.measurement.zzfn) r0.next();
        r9.K();
        r9.J();
        com.google.android.gms.common.internal.G.d(r27);
        com.google.android.gms.common.internal.G.g(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0354, code lost:
    
        if (r1.zzc().isEmpty() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0380, code lost:
    
        r7 = r1.zzcc();
        r8 = new android.content.ContentValues();
        r8.put(r3, r27);
        r23 = r0;
        r8.put("audience_id", java.lang.Integer.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0399, code lost:
    
        if (r1.zza() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x039b, code lost:
    
        r0 = java.lang.Integer.valueOf(r1.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03a5, code lost:
    
        r8.put("filter_id", r0);
        r25 = r3;
        r8.put("property_name", r1.zzc());
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03b7, code lost:
    
        if (r1.zzg() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03b9, code lost:
    
        r0 = java.lang.Boolean.valueOf(r1.zzh());
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03c3, code lost:
    
        r8.put("session_scoped", r0);
        r8.put("data", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03d7, code lost:
    
        if (r9.A0().insertWithOnConflict("property_filters", null, r8, 5) != (-1)) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03ec, code lost:
    
        r0 = r23;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03d9, code lost:
    
        r0 = r5.f11912f;
        Y5.C0646q0.l(r0);
        r0.f11577f.b(Y5.W.R(r27), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03ea, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03f2, code lost:
    
        r1 = r5.f11912f;
        Y5.C0646q0.l(r1);
        r1.f11577f.c("Error storing property filter. appId", Y5.W.R(r27), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03c2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03a4, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0356, code lost:
    
        r0 = r5.f11912f;
        Y5.C0646q0.l(r0);
        r0 = r0.f11580w;
        r4 = Y5.W.R(r27);
        r5 = java.lang.Integer.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x036b, code lost:
    
        if (r1.zza() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x036d, code lost:
    
        r1 = java.lang.Integer.valueOf(r1.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0377, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r4, r5, java.lang.String.valueOf(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0376, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0211, code lost:
    
        r7 = r0.zzc().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x021d, code lost:
    
        if (r7.hasNext() == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0229, code lost:
    
        if (((com.google.android.gms.internal.measurement.zzfn) r7.next()).zza() != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x022b, code lost:
    
        r0 = r5.f11912f;
        Y5.C0646q0.l(r0);
        r0.f11580w.c("Property filter with no ID. Audience definition ignored. appId, audienceId", Y5.W.R(r27), java.lang.Integer.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0241, code lost:
    
        r7 = r0.zzf().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x024d, code lost:
    
        r22 = r3;
        r3 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0259, code lost:
    
        if (r7.hasNext() == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x025b, code lost:
    
        r8 = (com.google.android.gms.internal.measurement.zzff) r7.next();
        r9.K();
        r9.J();
        com.google.android.gms.common.internal.G.d(r27);
        com.google.android.gms.common.internal.G.g(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0275, code lost:
    
        if (r8.zzc().isEmpty() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02a3, code lost:
    
        r23 = r7;
        r7 = r8.zzcc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02a9, code lost:
    
        r24 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02ab, code lost:
    
        r1 = new android.content.ContentValues();
        r1.put("app_id", r27);
        r1.put("audience_id", java.lang.Integer.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02be, code lost:
    
        if (r8.zza() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02c0, code lost:
    
        r3 = java.lang.Integer.valueOf(r8.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02cd, code lost:
    
        r1.put("filter_id", r3);
        r1.put("event_name", r8.zzc());
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02dd, code lost:
    
        if (r8.zzk() == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02df, code lost:
    
        r3 = java.lang.Boolean.valueOf(r8.zzm());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02e9, code lost:
    
        r1.put("session_scoped", r3);
        r1.put("data", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02fd, code lost:
    
        if (r9.A0().insertWithOnConflict("event_filters", null, r1, 5) != (-1)) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02ff, code lost:
    
        r1 = r5.f11912f;
        Y5.C0646q0.l(r1);
        r1.f11577f.b(Y5.W.R(r27), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x030f, code lost:
    
        r3 = r22;
        r7 = r23;
        r1 = r24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(String str, String str2, String str3, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        Iterator it;
        C0646q0 c0646q0;
        byte[] bArr2;
        zzgk zzgkVar;
        C2052e c2052e;
        boolean z8;
        K();
        J();
        com.google.android.gms.common.internal.G.d(str);
        zzgk zzgkVar2 = (zzgk) S(str, bArr).zzcl();
        Q(str, zzgkVar2);
        R(str, (zzgl) zzgkVar2.zzbc());
        zzgl zzglVar = (zzgl) zzgkVar2.zzbc();
        C2052e c2052e2 = this.f11802v;
        c2052e2.put(str, zzglVar);
        this.f11806z.put(str, zzgkVar2.zzh());
        this.f11796A.put(str, str2);
        this.f11797B.put(str, str3);
        this.f11798d.put(str, T((zzgl) zzgkVar2.zzbc()));
        I1 i12 = this.f12021b;
        C0633m c0633m = i12.f11405c;
        I1.S(c0633m);
        ArrayList arrayList = new ArrayList(zzgkVar2.zzd());
        String str4 = "app_id=? and audience_id=?";
        int i7 = 0;
        while (i7 < arrayList.size()) {
            zzfc zzfcVar = (zzfc) ((zzfd) arrayList.get(i7)).zzcl();
            if (zzfcVar.zzd() != 0) {
                c2052e = c2052e2;
                int i10 = 0;
                while (i10 < zzfcVar.zzd()) {
                    zzfe zzfeVar = (zzfe) zzfcVar.zze(i10).zzcl();
                    zzfe zzfeVar2 = (zzfe) zzfeVar.clone();
                    I1 i13 = i12;
                    String g = D0.g(zzfeVar.zza(), D0.f11235a, D0.f11237c);
                    if (g != null) {
                        zzfeVar2.zzb(g);
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i11 = 0;
                    while (i11 < zzfeVar.zzc()) {
                        zzfh zzd = zzfeVar.zzd(i11);
                        zzfe zzfeVar3 = zzfeVar;
                        zzgk zzgkVar3 = zzgkVar2;
                        String str5 = str4;
                        String g2 = D0.g(zzd.zzh(), D0.f11239e, D0.f11240f);
                        if (g2 != null) {
                            zzfg zzfgVar = (zzfg) zzd.zzcl();
                            zzfgVar.zza(g2);
                            zzfeVar2.zze(i11, (zzfh) zzfgVar.zzbc());
                            z8 = true;
                        }
                        i11++;
                        zzfeVar = zzfeVar3;
                        zzgkVar2 = zzgkVar3;
                        str4 = str5;
                    }
                    zzgk zzgkVar4 = zzgkVar2;
                    String str6 = str4;
                    if (z8) {
                        zzfcVar.zzf(i10, zzfeVar2);
                        arrayList.set(i7, (zzfd) zzfcVar.zzbc());
                    }
                    i10++;
                    i12 = i13;
                    zzgkVar2 = zzgkVar4;
                    str4 = str6;
                }
                zzgkVar = zzgkVar2;
            } else {
                zzgkVar = zzgkVar2;
                c2052e = c2052e2;
            }
            I1 i14 = i12;
            String str7 = str4;
            if (zzfcVar.zza() != 0) {
                for (int i15 = 0; i15 < zzfcVar.zza(); i15++) {
                    zzfn zzb = zzfcVar.zzb(i15);
                    String g10 = D0.g(zzb.zzc(), D0.f11242i, D0.j);
                    if (g10 != null) {
                        zzfm zzfmVar = (zzfm) zzb.zzcl();
                        zzfmVar.zza(g10);
                        zzfcVar.zzc(i15, zzfmVar);
                        arrayList.set(i7, (zzfd) zzfcVar.zzbc());
                    }
                }
            }
            i7++;
            c2052e2 = c2052e;
            i12 = i14;
            zzgkVar2 = zzgkVar;
            str4 = str7;
        }
        zzgk zzgkVar5 = zzgkVar2;
        C2052e c2052e3 = c2052e2;
        I1 i16 = i12;
        String str8 = str4;
        c0633m.K();
        c0633m.J();
        com.google.android.gms.common.internal.G.d(str);
        SQLiteDatabase A02 = c0633m.A0();
        A02.beginTransaction();
        try {
            c0633m.K();
            c0633m.J();
            com.google.android.gms.common.internal.G.d(str);
            SQLiteDatabase A03 = c0633m.A0();
            A03.delete("property_filters", "app_id=?", new String[]{str});
            A03.delete("event_filters", "app_id=?", new String[]{str});
            it = arrayList.iterator();
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = A02;
        }
        while (true) {
            boolean hasNext = it.hasNext();
            c0646q0 = (C0646q0) c0633m.f3094a;
            if (!hasNext) {
                break;
            }
            zzfd zzfdVar = (zzfd) it.next();
            c0633m.K();
            c0633m.J();
            com.google.android.gms.common.internal.G.d(str);
            com.google.android.gms.common.internal.G.g(zzfdVar);
            if (zzfdVar.zza()) {
                int zzb2 = zzfdVar.zzb();
                Iterator it2 = zzfdVar.zzf().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((zzff) it2.next()).zza()) {
                        W w10 = c0646q0.f11912f;
                        C0646q0.l(w10);
                        w10.f11580w.c("Event filter with no ID. Audience definition ignored. appId, audienceId", W.R(str), Integer.valueOf(zzb2));
                        break;
                    }
                }
            } else {
                W w11 = c0646q0.f11912f;
                C0646q0.l(w11);
                w11.f11580w.b(W.R(str), "Audience with no ID. appId");
            }
            th = th;
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase = A02;
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            zzfd zzfdVar2 = (zzfd) it3.next();
            arrayList2.add(zzfdVar2.zza() ? Integer.valueOf(zzfdVar2.zzb()) : null);
        }
        com.google.android.gms.common.internal.G.d(str);
        c0633m.K();
        c0633m.J();
        SQLiteDatabase A04 = c0633m.A0();
        try {
            long f02 = c0633m.f0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, c0646q0.f11910d.R(str, F.f11292U)));
            if (f02 > max) {
                ArrayList arrayList3 = new ArrayList();
                int i17 = 0;
                while (true) {
                    if (i17 >= arrayList2.size()) {
                        String join = TextUtils.join(",", arrayList3);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(join).length() + 2);
                        sb2.append("(");
                        sb2.append(join);
                        sb2.append(")");
                        String sb3 = sb2.toString();
                        StringBuilder sb4 = new StringBuilder(sb3.length() + 140);
                        sb4.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                        sb4.append(sb3);
                        sb4.append(" order by rowid desc limit -1 offset ?)");
                        A04.delete("audience_filter_values", sb4.toString(), new String[]{str, Integer.toString(max)});
                        break;
                    }
                    Integer num = (Integer) arrayList2.get(i17);
                    if (num == null) {
                        break;
                    }
                    arrayList3.add(Integer.toString(num.intValue()));
                    i17++;
                }
            }
        } catch (SQLiteException e2) {
            W w12 = c0646q0.f11912f;
            C0646q0.l(w12);
            w12.f11577f.c("Database error querying filters. appId", W.R(str), e2);
        }
        sQLiteDatabase.setTransactionSuccessful();
        sQLiteDatabase.endTransaction();
        try {
            zzgkVar5.zze();
            bArr2 = ((zzgl) zzgkVar5.zzbc()).zzcc();
        } catch (RuntimeException e10) {
            W w13 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w13);
            w13.f11580w.c("Unable to serialize reduced-size config. Storing full config instead. appId", W.R(str), e10);
            bArr2 = bArr;
        }
        C0633m c0633m2 = i16.f11405c;
        I1.S(c0633m2);
        C0646q0 c0646q02 = (C0646q0) c0633m2.f3094a;
        com.google.android.gms.common.internal.G.d(str);
        c0633m2.J();
        c0633m2.K();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr2);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (c0633m2.A0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                W w14 = c0646q02.f11912f;
                C0646q0.l(w14);
                w14.f11577f.b(W.R(str), "Failed to update remote config (got 0). appId");
            }
        } catch (SQLiteException e11) {
            W w15 = c0646q02.f11912f;
            C0646q0.l(w15);
            w15.f11577f.c("Error storing remote config. appId", W.R(str), e11);
        }
        zzgkVar5.zzf();
        c2052e3.put(str, (zzgl) zzgkVar5.zzbc());
    }

    public final boolean Y(String str, String str2) {
        Boolean bool;
        J();
        P(str);
        if ("1".equals(a(str, "measurement.upload.blacklist_internal")) && M1.h0(str2)) {
            return true;
        }
        if ("1".equals(a(str, "measurement.upload.blacklist_public")) && M1.H0(str2)) {
            return true;
        }
        Map map = (Map) this.f11800f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean Z(String str, String str2) {
        Boolean bool;
        J();
        P(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f11801u.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // Y5.InterfaceC0612f
    public final String a(String str, String str2) {
        J();
        P(str);
        Map map = (Map) this.f11798d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final int a0(String str, String str2) {
        Integer num;
        J();
        P(str);
        Map map = (Map) this.f11803w.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean b0(String str) {
        J();
        P(str);
        C2052e c2052e = this.f11799e;
        if (c2052e.get(str) != null) {
            return ((Set) c2052e.get(str)).contains("os_version") || ((Set) c2052e.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean c0(String str) {
        J();
        P(str);
        C2052e c2052e = this.f11799e;
        return c2052e.get(str) != null && ((Set) c2052e.get(str)).contains("app_instance_id");
    }

    public final boolean d0(String str, B0 b02) {
        J();
        P(str);
        zzgf e02 = e0(str);
        if (e02 == null) {
            return false;
        }
        Iterator it = e02.zza().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfu zzfuVar = (zzfu) it.next();
            if (b02 == U(zzfuVar.zzb())) {
                if (zzfuVar.zzc() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final zzgf e0(String str) {
        J();
        P(str);
        zzgl V7 = V(str);
        if (V7 == null || !V7.zzn()) {
            return null;
        }
        return V7.zzo();
    }
}
