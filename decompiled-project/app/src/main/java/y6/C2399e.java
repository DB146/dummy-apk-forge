package y6;

import A0.G0;
import G3.y;
import I2.AbstractC0315d;
import I2.B;
import I2.E;
import W1.G;
import Y5.F;
import Y5.InterfaceC0612f;
import Y5.InterfaceC0650t;
import android.content.Context;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzqi;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: y6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2399e implements E3.a, E7.a, G3.t, N0.o, P3.f, Q5.c, U2.c, X3.a, InterfaceC0612f, InterfaceC0650t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27010a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C2399e f26999b = new C2399e(17);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C2399e f27000c = new C2399e(18);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C2399e f27001d = new C2399e(19);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C2399e f27002e = new C2399e(20);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C2399e f27003f = new C2399e(21);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C2399e f27004u = new C2399e(22);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C2399e f27005v = new C2399e(23);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C2399e f27006w = new C2399e(24);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C2399e f27007x = new C2399e(25);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C2399e f27008y = new C2399e(26);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C2399e f27009z = new C2399e(27);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C2399e f26997A = new C2399e(28);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C2399e f26998B = new C2399e(29);

    public /* synthetic */ C2399e(int i7) {
        this.f27010a = i7;
    }

    @Override // Y5.InterfaceC0612f
    public /* synthetic */ String a(String str, String str2) {
        return null;
    }

    @Override // U2.c
    public U2.d b(U2.b bVar) {
        return new V2.h((Context) bVar.f9508c, (String) bVar.f9509d, (A4.c) bVar.f9510e, bVar.f9506a, bVar.f9507b);
    }

    @Override // P3.f
    public void c(G g) {
    }

    @Override // E3.a
    public void d(A3.h hVar, G0 g02) {
    }

    @Override // E3.a
    public File e(A3.h hVar) {
        return null;
    }

    @Override // E7.a
    public StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        int i7;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i13 = i11 - intValue;
                if (i11 + i13 <= stackTraceElementArr.length) {
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (stackTraceElementArr[intValue + i14].equals(stackTraceElementArr[i11 + i14])) {
                        }
                    }
                    int intValue2 = i11 - num.intValue();
                    if (i10 < 10) {
                        System.arraycopy(stackTraceElementArr, i11, stackTraceElementArr2, i12, intValue2);
                        i12 += intValue2;
                        i10++;
                    }
                    i7 = (intValue2 - 1) + i11;
                    hashMap.put(stackTraceElement, Integer.valueOf(i11));
                    i11 = i7 + 1;
                }
            }
            stackTraceElementArr2[i12] = stackTraceElementArr[i11];
            i12++;
            i10 = 1;
            i7 = i11;
            hashMap.put(stackTraceElement, Integer.valueOf(i11));
            i11 = i7 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i12];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i12);
        return i12 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    public RoomDataBase g(Context context) {
        kotlin.jvm.internal.l.e(context, "context");
        RoomDataBase roomDataBase = RoomDataBase.f16137y;
        if (roomDataBase == null) {
            synchronized (this) {
                B d10 = AbstractC0315d.d(context, RoomDataBase.class, "TV");
                d10.a((S9.e) RoomDataBase.f16125m.getValue(), (S9.f) RoomDataBase.f16126n.getValue(), (S9.g) RoomDataBase.f16127o.getValue(), (S9.h) RoomDataBase.f16128p.getValue(), (S9.i) RoomDataBase.f16129q.getValue(), (S9.j) RoomDataBase.f16130r.getValue(), (S9.k) RoomDataBase.f16131s.getValue(), (S9.l) RoomDataBase.f16132t.getValue(), (S9.m) RoomDataBase.f16133u.getValue(), (S9.b) RoomDataBase.f16134v.getValue(), (S9.c) RoomDataBase.f16135w.getValue(), (S9.d) RoomDataBase.f16136x.getValue());
                d10.f5010d.add(new Object());
                d10.f5019p = false;
                d10.f5020q = true;
                E b2 = d10.b();
                RoomDataBase.f16137y = (RoomDataBase) b2;
                roomDataBase = (RoomDataBase) b2;
            }
        }
        return roomDataBase;
    }

    @Override // Q5.c
    public E3.h h(Context context, String str, Q5.b bVar) {
        E3.h hVar = new E3.h();
        int d10 = bVar.d(context, str, true);
        hVar.f3538b = d10;
        if (d10 != 0) {
            hVar.f3539c = 1;
        } else {
            int c10 = bVar.c(context, str);
            hVar.f3537a = c10;
            if (c10 != 0) {
                hVar.f3539c = -1;
            }
        }
        return hVar;
    }

    @Override // X3.a
    public Object i() {
        return new ArrayList();
    }

    @Override // G3.t
    public G3.s m(y yVar) {
        return new G3.B(yVar.a(G3.i.class, InputStream.class), 1);
    }

    @Override // Y5.InterfaceC0650t
    public /* synthetic */ Object zza() {
        switch (this.f27010a) {
            case 18:
                List list = F.f11304a;
                return Long.valueOf(zzoy.zzb());
            case 19:
                List list2 = F.f11304a;
                return zzoy.zzl();
            case 20:
                List list3 = F.f11304a;
                return zzoy.zzau();
            case 21:
                List list4 = F.f11304a;
                return Long.valueOf(zzoy.zzU());
            case 22:
                List list5 = F.f11304a;
                return Long.valueOf(zzoy.zzS());
            case 23:
                List list6 = F.f11304a;
                return Long.valueOf(zzoy.zzav());
            case 24:
                List list7 = F.f11304a;
                return Long.valueOf(zzoy.zzV());
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                List list8 = F.f11304a;
                return Long.valueOf(zzoy.zzap());
            case 26:
                List list9 = F.f11304a;
                return Boolean.valueOf(zzqi.zza());
            case 27:
                List list10 = F.f11304a;
                return Double.valueOf(zzqi.zzc());
            case 28:
                List list11 = F.f11304a;
                return Long.valueOf(zzoy.zzae());
            default:
                List list12 = F.f11304a;
                return zzoy.zzaa();
        }
    }
}
