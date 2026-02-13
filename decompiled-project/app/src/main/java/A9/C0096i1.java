package A9;

import Y5.C0598a0;
import Y5.C0627k;
import Y5.C0633m;
import Y5.C0646q0;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import v0.EnumC2125b;

/* renamed from: A9.i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0096i1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1227a;

    /* renamed from: b, reason: collision with root package name */
    public long f1228b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1229c;

    public C0096i1() {
        EnumC2125b enumC2125b = EnumC2125b.f24927a;
        this.f1227a = new T7.h();
        this.f1229c = new T7.h();
    }

    public C0096i1(C0633m c0633m, String str) {
        Objects.requireNonNull(c0633m);
        this.f1229c = c0633m;
        com.google.android.gms.common.internal.G.d(str);
        this.f1227a = str;
        this.f1228b = -1L;
    }

    public C0096i1(C0633m c0633m, String str, long j) {
        Objects.requireNonNull(c0633m);
        this.f1229c = c0633m;
        com.google.android.gms.common.internal.G.d(str);
        this.f1227a = str;
        this.f1228b = c0633m.g0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    public C0096i1(String str) {
        this(str, -1L);
    }

    public C0096i1(String str, long j) {
        this.f1228b = j;
        this.f1227a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List a() {
        ArrayList arrayList;
        C0633m c0633m = (C0633m) this.f1229c;
        ArrayList arrayList2 = new ArrayList();
        String valueOf = String.valueOf(this.f1228b);
        String str = (String) this.f1227a;
        Cursor cursor = null;
        try {
            try {
                cursor = c0633m.A0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{str, valueOf}, null, null, "rowid", "1000");
            } catch (SQLiteException e2) {
                Y5.W w10 = ((C0646q0) c0633m.f3094a).f11912f;
                C0646q0.l(w10);
                w10.f11577f.c("Data loss. Error querying raw events batch. appId", Y5.W.R(str), e2);
                arrayList = arrayList2;
            }
            if (!cursor.moveToFirst()) {
                arrayList = Collections.emptyList();
                return arrayList;
            }
            do {
                long j = cursor.getLong(0);
                long j10 = cursor.getLong(3);
                boolean z8 = cursor.getLong(5) == 1;
                byte[] blob = cursor.getBlob(4);
                if (j > this.f1228b) {
                    this.f1228b = j;
                }
                try {
                    zzhr zzhrVar = (zzhr) C0598a0.w0(zzhs.zzk(), blob);
                    String string = cursor.getString(1);
                    if (string == null) {
                        string = "";
                    }
                    zzhrVar.zzl(string);
                    zzhrVar.zzo(cursor.getLong(2));
                    arrayList2.add(new C0627k(j, j10, z8, (zzhs) zzhrVar.zzbc()));
                } catch (IOException e10) {
                    Y5.W w11 = ((C0646q0) c0633m.f3094a).f11912f;
                    C0646q0.l(w11);
                    w11.f11577f.c("Data loss. Failed to merge raw event. appId", Y5.W.R(str), e10);
                }
            } while (cursor.moveToNext());
            return arrayList;
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }
}
