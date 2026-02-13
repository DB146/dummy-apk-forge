package ha;

import Eb.o;
import N6.F;
import N6.H;
import N6.t0;
import N6.y0;
import P4.m0;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import b4.C0838i;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.kt.apps.core.utils.blurry.BlurFactor;
import h7.C1255a;
import h7.C1256b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jb.InterfaceC1391b;
import k0.C1403d;
import k0.InterfaceC1408i;
import k5.v;
import kotlin.jvm.internal.l;
import l2.X;
import l4.AbstractC1485a;
import m4.C0;
import m4.C1558a0;
import m4.C1562c0;
import m4.C1581m;
import m4.F0;
import m4.H0;
import m4.InterfaceC1567f;
import m4.InterfaceC1569g;
import m4.K;
import m4.L;
import m4.M;
import m4.O;
import m4.P;
import m4.Q;
import m4.S;
import m4.T;
import m4.U;
import m4.V;
import m4.W;
import m4.Z;
import m4.p0;
import m4.v0;
import n5.AbstractC1705a;
import n5.D;
import n5.x;
import o5.C1807b;
import r4.C1936h;

/* renamed from: ha.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1265a implements InterfaceC1391b, i4.e, InterfaceC1408i, InterfaceC1567f, p7.c, SuccessContinuation, M6.i, n5.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17898a;

    public /* synthetic */ C1265a(int i7) {
        this.f17898a = i7;
    }

    @Override // k0.InterfaceC1408i
    public double a(double d10) {
        switch (this.f17898a) {
            case 2:
                double d11 = d10 < 0.0d ? -d10 : d10;
                return Math.copySign(d11 >= 0.0031308049535603718d ? (Math.pow(d11, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d11 / 0.07739938080495357d, d10);
            case 3:
                double d12 = d10 < 0.0d ? -d10 : d10;
                return Math.copySign(d12 >= 0.04045d ? Math.pow((0.9478672985781991d * d12) + 0.05213270142180095d, 2.4d) : 0.07739938080495357d * d12, d10);
            case 4:
                float[] fArr = C1403d.f18692a;
                return C1403d.b(C1403d.f18694c, d10);
            case 5:
                float[] fArr2 = C1403d.f18692a;
                return C1403d.a(C1403d.f18694c, d10);
            case 6:
                float[] fArr3 = C1403d.f18692a;
                return C1403d.d(C1403d.f18695d, d10);
            case 7:
                float[] fArr4 = C1403d.f18692a;
                return C1403d.c(C1403d.f18695d, d10);
            default:
                return d10;
        }
    }

    @Override // i4.e
    public Object apply(Object obj) {
        switch (this.f17898a) {
            case 1:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        Q7.h a9 = C0838i.a();
                        a9.O(rawQuery.getString(1));
                        a9.f8697d = AbstractC1485a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        a9.f8696c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(a9.n());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            default:
                return new n4.f((x) obj);
        }
    }

    @Override // jb.InterfaceC1391b
    public Object apply(Object obj, Object obj2) {
        List t1 = (List) obj;
        List t22 = (List) obj2;
        l.e(t1, "t1");
        l.e(t22, "t2");
        ArrayList u02 = o.u0(t1);
        u02.addAll(t22);
        return u02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v40, types: [m4.N, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v74, types: [java.lang.Object, m4.b0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [m4.Y, java.lang.Object] */
    @Override // m4.InterfaceC1567f
    public InterfaceC1569g c(Bundle bundle) {
        y0 b2;
        t0 x2;
        t0 x10;
        Bundle bundle2;
        Bundle bundle3;
        r5 = true;
        boolean z8 = true;
        int i7 = 0;
        switch (this.f17898a) {
            case 9:
                Bundle bundle4 = bundle.getBundle(v.f18965c);
                bundle4.getClass();
                m0 m0Var = (m0) m0.f8105v.c(bundle4);
                int[] intArray = bundle.getIntArray(v.f18966d);
                intArray.getClass();
                return new v(m0Var, intArray.length == 0 ? Collections.emptyList() : new Q6.a(0, intArray.length, intArray));
            case 10:
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
            case 12:
            case 13:
            case 14:
            default:
                AbstractC1705a.h(bundle.getInt(C0.f19878a, -1) == 2);
                int i10 = bundle.getInt(F0.f19896e, 5);
                float f4 = bundle.getFloat(F0.f19897f, -1.0f);
                return f4 == -1.0f ? new F0(i10) : new F0(i10, f4);
            case 15:
                K k = new K();
                if (bundle != null) {
                    ClassLoader classLoader = AbstractC1705a.class.getClassLoader();
                    int i11 = D.f21141a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(L.f20035X);
                L l10 = L.f20034W;
                String str = l10.f20085a;
                if (string == null) {
                    string = str;
                }
                k.f19976a = string;
                String string2 = bundle.getString(L.f20036Y);
                if (string2 == null) {
                    string2 = l10.f20086b;
                }
                k.f19977b = string2;
                String string3 = bundle.getString(L.f20037Z);
                if (string3 == null) {
                    string3 = l10.f20087c;
                }
                k.f19978c = string3;
                k.f19979d = bundle.getInt(L.f20038a0, l10.f20088d);
                k.f19980e = bundle.getInt(L.f20039b0, l10.f20089e);
                k.f19981f = bundle.getInt(L.f20040c0, l10.f20090f);
                k.g = bundle.getInt(L.f20041d0, l10.f20091u);
                String string4 = bundle.getString(L.f20042e0);
                if (string4 == null) {
                    string4 = l10.f20093w;
                }
                k.f19982h = string4;
                F4.c cVar = (F4.c) bundle.getParcelable(L.f20043f0);
                if (cVar == null) {
                    cVar = l10.f20094x;
                }
                k.f19983i = cVar;
                String string5 = bundle.getString(L.f20044g0);
                if (string5 == null) {
                    string5 = l10.f20095y;
                }
                k.j = string5;
                String string6 = bundle.getString(L.f20045h0);
                if (string6 == null) {
                    string6 = l10.f20096z;
                }
                k.k = string6;
                k.f19984l = bundle.getInt(L.f20046i0, l10.f20064A);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(L.f20047j0 + "_" + Integer.toString(i7, 36));
                    if (byteArray == null) {
                        k.f19985m = arrayList;
                        k.f19986n = (C1936h) bundle.getParcelable(L.f20048k0);
                        k.f19987o = bundle.getLong(L.f20049l0, l10.f20067D);
                        k.f19988p = bundle.getInt(L.f20050m0, l10.f20068E);
                        k.f19989q = bundle.getInt(L.f20051n0, l10.f20069F);
                        k.f19990r = bundle.getFloat(L.f20052o0, l10.f20070G);
                        k.f19991s = bundle.getInt(L.f20053p0, l10.f20071H);
                        k.f19992t = bundle.getFloat(L.f20054q0, l10.f20072I);
                        k.f19993u = bundle.getByteArray(L.f20055r0);
                        k.f19994v = bundle.getInt(L.f20056s0, l10.f20074K);
                        Bundle bundle5 = bundle.getBundle(L.f20057t0);
                        if (bundle5 != null) {
                            k.f19995w = (C1807b) C1807b.f21940y.c(bundle5);
                        }
                        k.f19996x = bundle.getInt(L.f20058u0, l10.f20075M);
                        k.f19997y = bundle.getInt(L.f20059v0, l10.f20076N);
                        k.f19998z = bundle.getInt(L.f20060w0, l10.f20077O);
                        k.f19970A = bundle.getInt(L.f20061x0, l10.f20078P);
                        k.f19971B = bundle.getInt(L.f20062y0, l10.f20079Q);
                        k.f19972C = bundle.getInt(L.f20063z0, l10.f20080R);
                        k.f19973D = bundle.getInt(L.f20032B0, l10.f20081S);
                        k.f19974E = bundle.getInt(L.C0, l10.f20082T);
                        k.f19975F = bundle.getInt(L.f20031A0, l10.f20083U);
                        return new L(k);
                    }
                    arrayList.add(byteArray);
                    i7++;
                }
            case 16:
                AbstractC1705a.h(bundle.getInt(C0.f19878a, -1) == 0);
                return bundle.getBoolean(M.f20098e, false) ? new M(bundle.getBoolean(M.f20099f, false)) : new M();
            case 17:
                String string7 = bundle.getString(C1558a0.f20218v, "");
                string7.getClass();
                Bundle bundle6 = bundle.getBundle(C1558a0.f20219w);
                U u3 = bundle6 == null ? U.f20157f : (U) U.f20163z.c(bundle6);
                Bundle bundle7 = bundle.getBundle(C1558a0.f20220x);
                C1562c0 c1562c0 = bundle7 == null ? C1562c0.f20268W : (C1562c0) C1562c0.f20267E0.c(bundle7);
                Bundle bundle8 = bundle.getBundle(C1558a0.f20221y);
                S s3 = bundle8 == null ? S.f20139A : (S) Q.f20133z.c(bundle8);
                Bundle bundle9 = bundle.getBundle(C1558a0.f20222z);
                W w10 = bundle9 == null ? W.f20184c : (W) W.f20188u.c(bundle9);
                Bundle bundle10 = bundle.getBundle(C1558a0.f20215A);
                return new C1558a0(string7, s3, bundle10 != null ? (V) V.f20171C.c(bundle10) : null, u3, c1562c0, w10);
            case 18:
                Uri uri = (Uri) bundle.getParcelable(O.f20115b);
                uri.getClass();
                ?? obj = new Object();
                obj.f20112a = uri;
                return new O(obj);
            case 19:
                P p10 = new P();
                S s10 = Q.f20127f;
                long j = bundle.getLong(Q.f20128u, s10.f20134a);
                AbstractC1705a.h(j >= 0);
                p10.f20122a = j;
                long j10 = bundle.getLong(Q.f20129v, s10.f20135b);
                if (j10 != Long.MIN_VALUE && j10 < 0) {
                    z8 = false;
                }
                AbstractC1705a.h(z8);
                p10.f20123b = j10;
                p10.f20124c = bundle.getBoolean(Q.f20130w, s10.f20136c);
                p10.f20125d = bundle.getBoolean(Q.f20131x, s10.f20137d);
                p10.f20126e = bundle.getBoolean(Q.f20132y, s10.f20138e);
                return new Q(p10);
            case 20:
                String string8 = bundle.getString(T.f20145w);
                string8.getClass();
                UUID fromString = UUID.fromString(string8);
                Uri uri2 = (Uri) bundle.getParcelable(T.f20146x);
                Bundle bundle11 = Bundle.EMPTY;
                Bundle bundle12 = bundle.getBundle(T.f20147y);
                if (bundle12 == null) {
                    bundle12 = bundle11;
                }
                if (bundle12 == bundle11) {
                    b2 = y0.f7368u;
                } else {
                    HashMap hashMap = new HashMap();
                    if (bundle12 != bundle11) {
                        for (String str2 : bundle12.keySet()) {
                            String string9 = bundle12.getString(str2);
                            if (string9 != null) {
                                hashMap.put(str2, string9);
                            }
                        }
                    }
                    b2 = y0.b(hashMap);
                }
                boolean z10 = bundle.getBoolean(T.f20148z, false);
                boolean z11 = bundle.getBoolean(T.f20140A, false);
                boolean z12 = bundle.getBoolean(T.f20141B, false);
                ArrayList<Integer> arrayList2 = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(T.f20142C);
                if (integerArrayList != null) {
                    arrayList2 = integerArrayList;
                }
                H F10 = H.F(arrayList2);
                byte[] byteArray2 = bundle.getByteArray(T.f20143D);
                S2.b bVar = new S2.b(fromString);
                bVar.f8987e = uri2;
                bVar.f8988f = y0.b(b2);
                bVar.f8983a = z10;
                bVar.f8985c = z12;
                bVar.f8984b = z11;
                bVar.g = H.F(F10);
                bVar.f8989h = byteArray2 != null ? Arrays.copyOf(byteArray2, byteArray2.length) : null;
                return new T(bVar);
            case 21:
                return new U(bundle.getLong(U.f20158u, -9223372036854775807L), bundle.getLong(U.f20159v, -9223372036854775807L), bundle.getLong(U.f20160w, -9223372036854775807L), bundle.getFloat(U.f20161x, -3.4028235E38f), bundle.getFloat(U.f20162y, -3.4028235E38f));
            case 22:
                Bundle bundle13 = bundle.getBundle(V.f20174x);
                T t5 = bundle13 == null ? null : (T) T.f20144E.c(bundle13);
                Bundle bundle14 = bundle.getBundle(V.f20175y);
                O o10 = bundle14 != null ? (O) O.f20116c.c(bundle14) : null;
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(V.f20176z);
                if (parcelableArrayList == null) {
                    F f10 = H.f7232b;
                    x2 = t0.f7341e;
                } else {
                    x2 = AbstractC1705a.x(new C1265a(23), parcelableArrayList);
                }
                t0 t0Var = x2;
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(V.f20170B);
                if (parcelableArrayList2 == null) {
                    F f11 = H.f7232b;
                    x10 = t0.f7341e;
                } else {
                    x10 = AbstractC1705a.x(Z.f20199C, parcelableArrayList2);
                }
                t0 t0Var2 = x10;
                Uri uri3 = (Uri) bundle.getParcelable(V.f20172v);
                uri3.getClass();
                return new V(uri3, bundle.getString(V.f20173w), t5, o10, t0Var, bundle.getString(V.f20169A), t0Var2);
            case 23:
                return new O4.b(bundle.getInt(O4.b.f7469d, 0), bundle.getInt(O4.b.f7470e, 0), bundle.getInt(O4.b.f7471f, 0));
            case 24:
                X x11 = new X(r5 ? 1 : 0);
                x11.f19194b = (Uri) bundle.getParcelable(W.f20185d);
                x11.f19195c = bundle.getString(W.f20186e);
                x11.f19196d = bundle.getBundle(W.f20187f);
                return new W(x11);
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                Uri uri4 = (Uri) bundle.getParcelable(Z.f20200v);
                uri4.getClass();
                String string10 = bundle.getString(Z.f20201w);
                String string11 = bundle.getString(Z.f20202x);
                int i12 = bundle.getInt(Z.f20203y, 0);
                int i13 = bundle.getInt(Z.f20204z, 0);
                String string12 = bundle.getString(Z.f20197A);
                String string13 = bundle.getString(Z.f20198B);
                ?? obj2 = new Object();
                obj2.f20194d = uri4;
                obj2.f20191a = string10;
                obj2.f20195e = string11;
                obj2.f20192b = i12;
                obj2.f20193c = i13;
                obj2.f20196f = string12;
                obj2.g = string13;
                return new Z(obj2);
            case 26:
                ?? obj3 = new Object();
                obj3.f20239a = bundle.getCharSequence(C1562c0.f20269X);
                obj3.f20240b = bundle.getCharSequence(C1562c0.f20270Y);
                obj3.f20241c = bundle.getCharSequence(C1562c0.f20271Z);
                obj3.f20242d = bundle.getCharSequence(C1562c0.f20272a0);
                obj3.f20243e = bundle.getCharSequence(C1562c0.f20273b0);
                obj3.f20244f = bundle.getCharSequence(C1562c0.f20274c0);
                obj3.g = bundle.getCharSequence(C1562c0.f20275d0);
                byte[] byteArray3 = bundle.getByteArray(C1562c0.f20278g0);
                String str3 = C1562c0.f20297z0;
                Integer valueOf = bundle.containsKey(str3) ? Integer.valueOf(bundle.getInt(str3)) : null;
                obj3.j = byteArray3 != null ? (byte[]) byteArray3.clone() : null;
                obj3.k = valueOf;
                obj3.f20247l = (Uri) bundle.getParcelable(C1562c0.f20279h0);
                obj3.f20259x = bundle.getCharSequence(C1562c0.f20290s0);
                obj3.f20260y = bundle.getCharSequence(C1562c0.f20291t0);
                obj3.f20261z = bundle.getCharSequence(C1562c0.f20292u0);
                obj3.f20234C = bundle.getCharSequence(C1562c0.f20295x0);
                obj3.f20235D = bundle.getCharSequence(C1562c0.f20296y0);
                obj3.f20236E = bundle.getCharSequence(C1562c0.f20264A0);
                obj3.f20238G = bundle.getBundle(C1562c0.f20266D0);
                String str4 = C1562c0.f20276e0;
                if (bundle.containsKey(str4) && (bundle3 = bundle.getBundle(str4)) != null) {
                    obj3.f20245h = (C0) C0.f19879b.c(bundle3);
                }
                String str5 = C1562c0.f20277f0;
                if (bundle.containsKey(str5) && (bundle2 = bundle.getBundle(str5)) != null) {
                    obj3.f20246i = (C0) C0.f19879b.c(bundle2);
                }
                String str6 = C1562c0.f20280i0;
                if (bundle.containsKey(str6)) {
                    obj3.f20248m = Integer.valueOf(bundle.getInt(str6));
                }
                String str7 = C1562c0.f20281j0;
                if (bundle.containsKey(str7)) {
                    obj3.f20249n = Integer.valueOf(bundle.getInt(str7));
                }
                String str8 = C1562c0.f20282k0;
                if (bundle.containsKey(str8)) {
                    obj3.f20250o = Integer.valueOf(bundle.getInt(str8));
                }
                String str9 = C1562c0.C0;
                if (bundle.containsKey(str9)) {
                    obj3.f20251p = Boolean.valueOf(bundle.getBoolean(str9));
                }
                String str10 = C1562c0.f20283l0;
                if (bundle.containsKey(str10)) {
                    obj3.f20252q = Boolean.valueOf(bundle.getBoolean(str10));
                }
                String str11 = C1562c0.f20284m0;
                if (bundle.containsKey(str11)) {
                    obj3.f20253r = Integer.valueOf(bundle.getInt(str11));
                }
                String str12 = C1562c0.f20285n0;
                if (bundle.containsKey(str12)) {
                    obj3.f20254s = Integer.valueOf(bundle.getInt(str12));
                }
                String str13 = C1562c0.f20286o0;
                if (bundle.containsKey(str13)) {
                    obj3.f20255t = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = C1562c0.f20287p0;
                if (bundle.containsKey(str14)) {
                    obj3.f20256u = Integer.valueOf(bundle.getInt(str14));
                }
                String str15 = C1562c0.f20288q0;
                if (bundle.containsKey(str15)) {
                    obj3.f20257v = Integer.valueOf(bundle.getInt(str15));
                }
                String str16 = C1562c0.f20289r0;
                if (bundle.containsKey(str16)) {
                    obj3.f20258w = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = C1562c0.f20293v0;
                if (bundle.containsKey(str17)) {
                    obj3.f20232A = Integer.valueOf(bundle.getInt(str17));
                }
                String str18 = C1562c0.f20294w0;
                if (bundle.containsKey(str18)) {
                    obj3.f20233B = Integer.valueOf(bundle.getInt(str18));
                }
                String str19 = C1562c0.f20265B0;
                if (bundle.containsKey(str19)) {
                    obj3.f20237F = Integer.valueOf(bundle.getInt(str19));
                }
                return new C1562c0(obj3);
            case 27:
                AbstractC1705a.h(bundle.getInt(C0.f19878a, -1) == 1);
                float f12 = bundle.getFloat(p0.f20471d, -1.0f);
                return f12 == -1.0f ? new p0() : new p0(f12);
            case 28:
                int i14 = bundle.getInt(C0.f19878a, -1);
                if (i14 == 0) {
                    return (C0) M.f20100u.c(bundle);
                }
                if (i14 == 1) {
                    return (C0) p0.f20472e.c(bundle);
                }
                if (i14 == 2) {
                    return (C0) F0.f19898u.c(bundle);
                }
                if (i14 == 3) {
                    return (C0) H0.f19913u.c(bundle);
                }
                throw new IllegalArgumentException(h3.o.l(i14, "Unknown RatingType: "));
        }
    }

    @Override // p7.c
    public Object g(T6.a aVar) {
        return FirebaseInstallationsRegistrar.a(aVar);
    }

    @Override // n5.i
    public void invoke(Object obj) {
        v0 v0Var = (v0) obj;
        switch (this.f17898a) {
            case 13:
                v0Var.i(new C1581m(2, new Db.d("Player release timed out.", 11), 1003));
                return;
            default:
                v0Var.o();
                return;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        long c10;
        C1255a c1255a = (C1255a) obj;
        G.g(c1255a);
        try {
            c10 = (long) (Double.parseDouble(c1255a.f17827b.replace("s", "")) * 1000.0d);
        } catch (NumberFormatException unused) {
            Map D10 = tc.b.D(c1255a.f17826a);
            c10 = 1000 * (C1256b.c("exp", D10) - C1256b.c("iat", D10));
        }
        return Tasks.forResult(new C1256b(c10, System.currentTimeMillis(), c1255a.f17826a));
    }
}
