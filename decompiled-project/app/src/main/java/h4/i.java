package h4;

import P4.Z;
import a4.C0761l;
import a4.C0762m;
import a4.C0763n;
import a4.C0764o;
import a4.C0765p;
import a4.C0766q;
import a4.C0767r;
import a4.C0768s;
import a4.C0769t;
import a4.C0771v;
import a4.EnumC0746G;
import a4.EnumC0747H;
import a4.EnumC0749J;
import a4.z;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import b4.C0837h;
import b4.C0838i;
import b4.C0840k;
import b4.n;
import c4.C0899a;
import c4.C0904f;
import c4.InterfaceC0906h;
import e4.C1085a;
import i4.C1346b;
import j4.InterfaceC1376b;
import j4.InterfaceC1377c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import k4.InterfaceC1421a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17748a;

    /* renamed from: b, reason: collision with root package name */
    public final C0904f f17749b;

    /* renamed from: c, reason: collision with root package name */
    public final i4.d f17750c;

    /* renamed from: d, reason: collision with root package name */
    public final d f17751d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f17752e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1377c f17753f;
    public final InterfaceC1421a g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1421a f17754h;

    /* renamed from: i, reason: collision with root package name */
    public final i4.c f17755i;

    public i(Context context, C0904f c0904f, i4.d dVar, d dVar2, Executor executor, InterfaceC1377c interfaceC1377c, InterfaceC1421a interfaceC1421a, InterfaceC1421a interfaceC1421a2, i4.c cVar) {
        this.f17748a = context;
        this.f17749b = c0904f;
        this.f17750c = dVar;
        this.f17751d = dVar2;
        this.f17752e = executor;
        this.f17753f = interfaceC1377c;
        this.g = interfaceC1421a;
        this.f17754h = interfaceC1421a2;
        this.f17755i = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0431 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v37, types: [Y.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [D7.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23, types: [D7.d, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0838i c0838i, int i7) {
        InterfaceC0906h interfaceC0906h;
        C0899a c0899a;
        String str;
        int i10;
        Z a9;
        C0899a c0899a2;
        String str2;
        Integer num;
        String str3;
        D7.d dVar;
        int i11;
        int i12;
        final i iVar = this;
        final C0838i c0838i2 = c0838i;
        final int i13 = 1;
        final int i14 = 0;
        InterfaceC0906h a10 = iVar.f17749b.a(c0838i2.f13859a);
        long j = 0;
        while (true) {
            InterfaceC1376b interfaceC1376b = new InterfaceC1376b(iVar) { // from class: h4.g

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f17743b;

                {
                    this.f17743b = iVar;
                }

                @Override // j4.InterfaceC1376b
                public final Object e() {
                    Boolean bool;
                    switch (i14) {
                        case 0:
                            C0838i c0838i3 = c0838i2;
                            i4.g gVar = (i4.g) this.f17743b.f17750c;
                            SQLiteDatabase l10 = gVar.l();
                            l10.beginTransaction();
                            try {
                                Long n6 = i4.g.n(l10, c0838i3);
                                if (n6 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = gVar.l().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{n6.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                l10.setTransactionSuccessful();
                                return bool;
                            } finally {
                                l10.endTransaction();
                            }
                        default:
                            i4.g gVar2 = (i4.g) this.f17743b.f17750c;
                            gVar2.getClass();
                            return (Iterable) gVar2.F(new F8.a(20, gVar2, c0838i2));
                    }
                }
            };
            i4.g gVar = (i4.g) iVar.f17753f;
            if (!((Boolean) gVar.T(interfaceC1376b)).booleanValue()) {
                gVar.T(new h(iVar, c0838i2, j));
                return;
            }
            Iterable iterable = (Iterable) gVar.T(new InterfaceC1376b(iVar) { // from class: h4.g

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f17743b;

                {
                    this.f17743b = iVar;
                }

                @Override // j4.InterfaceC1376b
                public final Object e() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            C0838i c0838i3 = c0838i2;
                            i4.g gVar2 = (i4.g) this.f17743b.f17750c;
                            SQLiteDatabase l10 = gVar2.l();
                            l10.beginTransaction();
                            try {
                                Long n6 = i4.g.n(l10, c0838i3);
                                if (n6 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = gVar2.l().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{n6.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                l10.setTransactionSuccessful();
                                return bool;
                            } finally {
                                l10.endTransaction();
                            }
                        default:
                            i4.g gVar22 = (i4.g) this.f17743b.f17750c;
                            gVar22.getClass();
                            return (Iterable) gVar22.F(new F8.a(20, gVar22, c0838i2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            byte[] bArr = c0838i2.f13860b;
            if (a10 == null) {
                android.support.v4.media.session.b.l(c0838i2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                c0899a = new C0899a(3, -1L);
                interfaceC0906h = a10;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C1346b) it.next()).f18408c);
                }
                String str4 = "proto";
                if ((bArr != null ? 1 : i14) != 0) {
                    i4.c cVar = iVar.f17755i;
                    Objects.requireNonNull(cVar);
                    C1085a c1085a = (C1085a) gVar.T(new Q9.a(cVar, 11));
                    ?? obj = new Object();
                    obj.f11059f = new HashMap();
                    obj.f11057d = Long.valueOf(iVar.g.b());
                    obj.f11058e = Long.valueOf(iVar.f17754h.b());
                    obj.f11054a = "GDT_CLIENT_METRICS";
                    Y3.c cVar2 = new Y3.c("proto");
                    c1085a.getClass();
                    Q7.h hVar = n.f13872a;
                    hVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        hVar.s(c1085a, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    obj.f11056c = new C0840k(cVar2, byteArrayOutputStream.toByteArray());
                    arrayList.add(((Z3.b) a10).a(obj.d()));
                }
                Z3.b bVar = (Z3.b) a10;
                HashMap hashMap = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C0837h c0837h = (C0837h) it2.next();
                    String str5 = c0837h.f13851a;
                    if (hashMap.containsKey(str5)) {
                        ((List) hashMap.get(str5)).add(c0837h);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(c0837h);
                        hashMap.put(str5, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = hashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    C0837h c0837h2 = (C0837h) ((List) entry.getValue()).get(0);
                    EnumC0749J enumC0749J = EnumC0749J.f12612a;
                    long b2 = bVar.f12148f.b();
                    long b10 = bVar.f12147e.b();
                    C0763n c0763n = new C0763n(new C0761l(Integer.valueOf(c0837h2.b("sdk-version")), c0837h2.a("model"), c0837h2.a("hardware"), c0837h2.a("device"), c0837h2.a("product"), c0837h2.a("os-uild"), c0837h2.a("manufacturer"), c0837h2.a("fingerprint"), c0837h2.a("locale"), c0837h2.a("country"), c0837h2.a("mcc_mnc"), c0837h2.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = ((List) entry.getValue()).iterator();
                    while (it4.hasNext()) {
                        Iterator it5 = it3;
                        C0837h c0837h3 = (C0837h) it4.next();
                        Iterator it6 = it4;
                        C0840k c0840k = c0837h3.f13853c;
                        InterfaceC0906h interfaceC0906h2 = a10;
                        Y3.c cVar3 = c0840k.f13868a;
                        boolean equals = cVar3.equals(new Y3.c(str4));
                        byte[] bArr2 = c0840k.f13869b;
                        if (equals) {
                            ?? obj2 = new Object();
                            obj2.f3273e = bArr2;
                            str3 = str4;
                            dVar = obj2;
                        } else {
                            str3 = str4;
                            if (cVar3.equals(new Y3.c("json"))) {
                                String str6 = new String(bArr2, Charset.forName("UTF-8"));
                                ?? obj3 = new Object();
                                obj3.f3274f = str6;
                                dVar = obj3;
                            } else {
                                String w10 = android.support.v4.media.session.b.w("CctTransportBackend");
                                if (Log.isLoggable(w10, 5)) {
                                    Log.w(w10, "Received event of unsupported encoding " + cVar3 + ". Skipping...");
                                }
                                it4 = it6;
                                it3 = it5;
                                a10 = interfaceC0906h2;
                                str4 = str3;
                            }
                        }
                        dVar.f3269a = Long.valueOf(c0837h3.f13854d);
                        dVar.f3272d = Long.valueOf(c0837h3.f13855e);
                        String str7 = (String) c0837h3.f13856f.get("tz-offset");
                        dVar.g = Long.valueOf(str7 == null ? 0L : Long.valueOf(str7).longValue());
                        dVar.f3275h = new C0771v((EnumC0747H) EnumC0747H.f12610a.get(c0837h3.b("net-type")), (EnumC0746G) EnumC0746G.f12608a.get(c0837h3.b("mobile-subtype")));
                        Integer num2 = c0837h3.f13852b;
                        if (num2 != null) {
                            dVar.f3270b = num2;
                        }
                        Integer num3 = c0837h3.g;
                        if (num3 != null) {
                            C0767r c0767r = new C0767r(new C0766q(num3));
                            z zVar = z.f12692a;
                            dVar.f3271c = new C0764o(c0767r);
                        }
                        byte[] bArr3 = c0837h3.j;
                        byte[] bArr4 = c0837h3.f13858i;
                        if (bArr4 != null || bArr3 != null) {
                            if (bArr4 == null) {
                                bArr4 = null;
                            }
                            if (bArr3 == null) {
                                bArr3 = null;
                            }
                            dVar.f3276i = new C0765p(bArr4, bArr3);
                        }
                        String str8 = ((Long) dVar.f3269a) == null ? " eventTimeMs" : "";
                        if (((Long) dVar.f3272d) == null) {
                            str8 = str8.concat(" eventUptimeMs");
                        }
                        if (((Long) dVar.g) == null) {
                            str8 = X.c.h(str8, " timezoneOffsetSeconds");
                        }
                        if (!str8.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str8));
                        }
                        arrayList4.add(new C0768s(((Long) dVar.f3269a).longValue(), (Integer) dVar.f3270b, (C0764o) dVar.f3271c, ((Long) dVar.f3272d).longValue(), (byte[]) dVar.f3273e, (String) dVar.f3274f, ((Long) dVar.g).longValue(), (C0771v) dVar.f3275h, (C0765p) dVar.f3276i));
                        it4 = it6;
                        it3 = it5;
                        a10 = interfaceC0906h2;
                        str4 = str3;
                    }
                    arrayList3.add(new C0769t(b2, b10, c0763n, num, str2, arrayList4));
                    it3 = it3;
                    a10 = a10;
                    str4 = str4;
                }
                interfaceC0906h = a10;
                C0762m c0762m = new C0762m(arrayList3);
                URL url = bVar.f12146d;
                if (bArr != null) {
                    try {
                        Z3.a a11 = Z3.a.a(bArr);
                        str = a11.f12142b;
                        if (str == null) {
                            str = null;
                        }
                        String str9 = a11.f12141a;
                        if (str9 != null) {
                            url = Z3.b.b(str9);
                        }
                    } catch (IllegalArgumentException unused3) {
                        c0899a = new C0899a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    try {
                        Q7.h hVar2 = new Q7.h(url, c0762m, str, 17);
                        Q9.a aVar = new Q9.a(bVar, 4);
                        int i15 = 5;
                        do {
                            a9 = aVar.a(hVar2);
                            URL url2 = (URL) a9.f7977c;
                            if (url2 != null) {
                                android.support.v4.media.session.b.l(url2, "CctTransportBackend", "Following redirect to: %s");
                                try {
                                    hVar2 = new Q7.h(url2, (C0762m) hVar2.f8696c, (String) hVar2.f8697d, 17);
                                } catch (IOException e2) {
                                    e = e2;
                                    android.support.v4.media.session.b.m(e, "CctTransportBackend", "Could not make request to the backend");
                                    i10 = 2;
                                    c0899a = new C0899a(2, -1L);
                                    i11 = c0899a.f14331a;
                                    if (i11 != i10) {
                                    }
                                }
                            } else {
                                hVar2 = null;
                            }
                            if (hVar2 == null) {
                                break;
                            } else {
                                i15--;
                            }
                        } while (i15 >= 1);
                        int i16 = a9.f7975a;
                        if (i16 == 200) {
                            c0899a = new C0899a(1, a9.f7976b);
                        } else {
                            if (i16 >= 500 || i16 == 404) {
                                c0899a2 = new C0899a(2, -1L);
                            } else if (i16 == 400) {
                                try {
                                    c0899a2 = new C0899a(4, -1L);
                                } catch (IOException e10) {
                                    e = e10;
                                    android.support.v4.media.session.b.m(e, "CctTransportBackend", "Could not make request to the backend");
                                    i10 = 2;
                                    c0899a = new C0899a(2, -1L);
                                    i11 = c0899a.f14331a;
                                    if (i11 != i10) {
                                    }
                                }
                            } else {
                                c0899a2 = new C0899a(3, -1L);
                            }
                            c0899a = c0899a2;
                        }
                        i10 = 2;
                    } catch (IOException e11) {
                        e = e11;
                    }
                } catch (IOException e12) {
                    e = e12;
                }
                i11 = c0899a.f14331a;
                if (i11 != i10) {
                    gVar.T(new J7.d(this, iterable, c0838i, j));
                    this.f17751d.a(c0838i, i7 + 1, true);
                    return;
                }
                gVar.T(new F8.a(18, this, iterable));
                if (i11 == 1) {
                    j = Math.max(j, c0899a.f14332b);
                    if (bArr != null) {
                        gVar.T(new Q9.a(this, 13));
                    }
                } else if (i11 == 4) {
                    HashMap hashMap2 = new HashMap();
                    Iterator it7 = iterable.iterator();
                    while (it7.hasNext()) {
                        String str10 = ((C1346b) it7.next()).f18408c.f13851a;
                        if (hashMap2.containsKey(str10)) {
                            hashMap2.put(str10, Integer.valueOf(((Integer) hashMap2.get(str10)).intValue() + 1));
                        } else {
                            hashMap2.put(str10, 1);
                        }
                    }
                    i12 = 1;
                    gVar.T(new F8.a(19, this, hashMap2));
                    iVar = this;
                    c0838i2 = c0838i;
                    i13 = i12;
                    a10 = interfaceC0906h;
                    i14 = 0;
                }
                i12 = 1;
                iVar = this;
                c0838i2 = c0838i;
                i13 = i12;
                a10 = interfaceC0906h;
                i14 = 0;
            }
            i10 = 2;
            i11 = c0899a.f14331a;
            if (i11 != i10) {
            }
        }
    }
}
