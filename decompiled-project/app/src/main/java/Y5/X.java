package Y5;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11585a = 1;

    /* renamed from: b, reason: collision with root package name */
    public long f11586b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11587c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11588d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11589e;

    public /* synthetic */ X(C0603c c0603c) {
        Objects.requireNonNull(c0603c);
        this.f11589e = c0603c;
    }

    public X(String str, String str2, Bundle bundle, long j) {
        this.f11587c = str;
        this.f11588d = str2;
        this.f11589e = bundle;
        this.f11586b = j;
    }

    public static X a(C0648s c0648s) {
        Bundle D10 = c0648s.f11930b.D();
        long j = c0648s.f11932d;
        return new X(c0648s.f11929a, c0648s.f11931c, D10, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x010a, code lost:
    
        if (r4 == null) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01dd  */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzhs b(zzhs zzhsVar, String str) {
        ?? r72;
        Cursor cursor;
        Pair pair;
        Object obj;
        String zzd = zzhsVar.zzd();
        List zza = zzhsVar.zza();
        C0603c c0603c = (C0603c) this.f11589e;
        I1 i12 = c0603c.f12021b;
        i12.i0();
        zzhw R10 = C0598a0.R(zzhsVar, "_eid");
        Long l10 = (Long) (R10 == null ? null : C0598a0.Y(R10));
        if (l10 != null) {
            boolean equals = zzd.equals("_ep");
            C0646q0 c0646q0 = (C0646q0) c0603c.f3094a;
            if (equals) {
                i12.i0();
                zzhw R11 = C0598a0.R(zzhsVar, "_en");
                String str2 = (String) (R11 == null ? null : C0598a0.Y(R11));
                if (TextUtils.isEmpty(str2)) {
                    W w10 = c0646q0.f11912f;
                    C0646q0.l(w10);
                    w10.f11578u.b(l10, "Extra parameter without an event name. eventId");
                    return null;
                }
                zzhs zzhsVar2 = (zzhs) this.f11587c;
                I1 i13 = c0603c.f12021b;
                if (zzhsVar2 == null || ((Long) this.f11588d) == null || l10.longValue() != ((Long) this.f11588d).longValue()) {
                    C0633m c0633m = i12.f11405c;
                    I1.S(c0633m);
                    C0646q0 c0646q02 = (C0646q0) c0633m.f3094a;
                    c0633m.J();
                    c0633m.K();
                    try {
                        try {
                            cursor = c0633m.A0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l10.toString()});
                            try {
                                if (cursor.moveToFirst()) {
                                    try {
                                        pair = Pair.create((zzhs) ((zzhr) C0598a0.w0(zzhs.zzk(), cursor.getBlob(0))).zzbc(), Long.valueOf(cursor.getLong(1)));
                                        cursor.close();
                                    } catch (IOException e2) {
                                        W w11 = c0646q02.f11912f;
                                        C0646q0.l(w11);
                                        w11.f11577f.d("Failed to merge main event. appId, eventId", W.R(str), l10, e2);
                                        cursor.close();
                                        pair = null;
                                        if (pair != null) {
                                        }
                                        W w12 = c0646q0.f11912f;
                                        C0646q0.l(w12);
                                        w12.f11578u.c("Extra parameter without existing main event. eventName, eventId", str2, l10);
                                        return null;
                                    }
                                } else {
                                    W w13 = c0646q02.f11912f;
                                    C0646q0.l(w13);
                                    w13.f11573B.a("Main event not found");
                                    cursor.close();
                                    pair = null;
                                }
                            } catch (SQLiteException e10) {
                                e = e10;
                                W w14 = c0646q02.f11912f;
                                C0646q0.l(w14);
                                w14.f11577f.b(e, "Error selecting main event");
                            }
                        } catch (Throwable th) {
                            th = th;
                            r72 = i12;
                            if (r72 != 0) {
                                r72.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e11) {
                        e = e11;
                        cursor = null;
                    } catch (Throwable th2) {
                        th = th2;
                        r72 = 0;
                        if (r72 != 0) {
                        }
                        throw th;
                    }
                    if (pair != null || (obj = pair.first) == null) {
                        W w122 = c0646q0.f11912f;
                        C0646q0.l(w122);
                        w122.f11578u.c("Extra parameter without existing main event. eventName, eventId", str2, l10);
                        return null;
                    }
                    this.f11587c = (zzhs) obj;
                    this.f11586b = ((Long) pair.second).longValue();
                    i13.i0();
                    this.f11588d = (Long) C0598a0.S((zzhs) this.f11587c, "_eid");
                }
                long j = this.f11586b - 1;
                this.f11586b = j;
                if (j <= 0) {
                    C0633m c0633m2 = i13.f11405c;
                    I1.S(c0633m2);
                    c0633m2.J();
                    C0646q0 c0646q03 = (C0646q0) c0633m2.f3094a;
                    W w15 = c0646q03.f11912f;
                    C0646q0.l(w15);
                    w15.f11573B.b(str, "Clearing complex main event info. appId");
                    try {
                        c0633m2.A0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e12) {
                        W w16 = c0646q03.f11912f;
                        C0646q0.l(w16);
                        w16.f11577f.b(e12, "Error clearing complex main event");
                    }
                } else {
                    C0633m c0633m3 = i13.f11405c;
                    I1.S(c0633m3);
                    c0633m3.c0(str, l10, this.f11586b, (zzhs) this.f11587c);
                }
                ArrayList arrayList = new ArrayList();
                for (zzhw zzhwVar : ((zzhs) this.f11587c).zza()) {
                    i13.i0();
                    if (C0598a0.R(zzhsVar, zzhwVar.zzb()) == null) {
                        arrayList.add(zzhwVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    W w17 = c0646q0.f11912f;
                    C0646q0.l(w17);
                    w17.f11578u.b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(zza);
                    zza = arrayList;
                }
                zzd = str2;
            } else {
                this.f11588d = l10;
                this.f11587c = zzhsVar;
                i12.i0();
                zzhw R12 = C0598a0.R(zzhsVar, "_epc");
                Object Y2 = R12 == null ? null : C0598a0.Y(R12);
                long longValue = ((Long) (Y2 != null ? Y2 : 0L)).longValue();
                this.f11586b = longValue;
                if (longValue <= 0) {
                    W w18 = c0646q0.f11912f;
                    C0646q0.l(w18);
                    w18.f11578u.b(zzd, "Complex event with zero extra param count. eventName");
                } else {
                    C0633m c0633m4 = i12.f11405c;
                    I1.S(c0633m4);
                    c0633m4.c0(str, l10, this.f11586b, zzhsVar);
                }
            }
        }
        zzhr zzhrVar = (zzhr) zzhsVar.zzcl();
        zzhrVar.zzl(zzd);
        zzhrVar.zzi();
        zzhrVar.zzh(zza);
        return (zzhs) zzhrVar.zzbc();
    }

    public C0648s c() {
        r rVar = new r(new Bundle((Bundle) this.f11589e));
        return new C0648s((String) this.f11587c, rVar, (String) this.f11588d, this.f11586b);
    }

    public String toString() {
        switch (this.f11585a) {
            case 0:
                String obj = ((Bundle) this.f11589e).toString();
                String str = (String) this.f11588d;
                int length = String.valueOf(str).length();
                String str2 = (String) this.f11587c;
                StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + obj.length());
                h3.o.v(sb2, "origin=", str, ",name=", str2);
                return h3.o.p(sb2, ",params=", obj);
            default:
                return super.toString();
        }
    }
}
